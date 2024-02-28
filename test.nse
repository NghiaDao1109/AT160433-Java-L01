-- File: test.nse
-- Description: NSE script to execute OS command using os.execute

local stdnse = require "stdnse"

description = [[
Simple NSE script to execute OS command on the target machine using os.execute.
]]

categories = {"intrusive", "safe"}

-- Declare script dependencies
dependency = {"target"}

-- Action function, entry point of the script
action = function(host)

  -- Command to execute
  local command = "whoami"

  -- Execute the command
  local status = os.execute(command)

  -- Check if the command execution was successful
  if status == true then
    return stdnse.format_output(true, "Command executed successfully")
  else
    return stdnse.format_output(false, "Failed to execute command")
  end
end
