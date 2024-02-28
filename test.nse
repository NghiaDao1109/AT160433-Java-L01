-- File: system_info_script_short.nse
-- Description: Shortened NSE script to gather system information from the target machine

-- Categories: discovery, safe

-- Prerequisites:
-- - This script requires the `stdnse` library to be loaded.

-- Usage:
-- nmap --script system_info_script_short <target>

-- Version: 1.0

-- Author: Your Name <your.email@example.com>

-- License: Same as Nmap--See https://nmap.org/book/man-legal.html

local stdnse = require "stdnse"

-- Declare the script's dependencies
dependency = { "target", "port"}

-- Set the description
description = [[
This script gathers system information from the target machine.
]]

-- Set the categories
categories = {"discovery", "safe"}

-- The action function is the entry point for script execution
action = function(host, port)

  -- Run commands to gather system information
  local commands = {
    "uname -a", -- Get kernel version
    "whoami" -- Get distribution information (if available)
  }

  for _, command in ipairs(commands) do
    local handle = io.popen(command)
    local result = handle:read("*a")
    handle:close()
    stdnse.print_debug("Command: " .. command .. "\nResult:\n" .. result)
  end
end
