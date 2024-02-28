-- File: nmap_command_script.lua
-- Description: Lua script to execute a command passed from Nmap

-- Lấy command từ tham số dòng lệnh
local command = arg[1]

if not command then
    print("No command provided.")
    os.exit(1)
end

-- Thực thi command bằng os.execute
local result = os.execute(command)

-- In kết quả
print("Result of command:")
print(result)
