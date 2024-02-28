-- File: nmap_command_script.lua
-- Description: Lua script to execute a command passed from Nmap

local stdnse = require "stdnse"

-- Lấy command từ tham số dòng lệnh
local command = stdnse.get_script_args('command')

if not command then
    stdnse.print_error("No command provided.")
    return
end

-- Thực thi command bằng os.execute
local result = os.execute(command)

-- In kết quả
stdnse.print_output("Result of command:")
stdnse.print_output(result)
