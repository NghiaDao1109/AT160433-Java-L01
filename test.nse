-- File: custom_command_script.nse
-- Description: NSE script to execute custom command on the target machine

-- Categories: intrusive, safe

-- Prerequisites:
-- - This script requires the `stdnse` library to be loaded.

-- Usage:
-- nmap --script custom_command_script --script-args command=<command_to_execute> <target>

-- Version: 1.0

-- Author: Your Name <your.email@example.com>

-- License: Same as Nmap--See https://nmap.org/book/man-legal.html

local stdnse = require "stdnse"

-- Declare the script's dependencies
dependency = { "target", "port"}

-- Set the description
description = [[
This script executes a custom command on the target machine.
]]

-- Set the categories
categories = {"intrusive", "safe"}

-- The action function is the entry point for script execution
action = function(host, port)

  -- Retrieve the command from script arguments
  local command = stdnse.get_script_args('command')

  -- Execute the command
  local handle = io.popen(command)
  local result = handle:read("*a")
  handle:close()

  -- Print out the result
  stdnse.print_debug("Command: " .. command .. "\nResult:\n" .. result)
end
