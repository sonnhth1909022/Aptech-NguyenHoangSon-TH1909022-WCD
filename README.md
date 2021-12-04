# Aptech-NguyenHoangSon-TH1909022-WCD
Hướng dẫn sử dụng:
- Tạo 1 database mới trong phpmyadmin có tên là employeeDB
- chạy file employeeDB.sql trên phpmyadmin để có bảng và dữ liệu
- vào file persistence.xml và chỉnh sửa các cấu hình như sau:
+ jdbc.url - đổi localhost:3307 thành localhost:3306 (hoặc theo host của xampp trong máy)
+ jdbc.password - đổi theo password của mysql máy mình
- Chạy project bằng tomcat (dùng phiên bản máy mình). Ấn vào Create New Employee để tạo bản ghi mới. Sau khi ấn submit sẽ chuyển về source /home và có dữ liệu trên bảng.
