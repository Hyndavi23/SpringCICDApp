package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String employees() {
        return """
            <html>
            <head>
                <title>Employee Details</title>
                <style>
                    body {
                        font-family: Arial, sans-serif;
                        margin: 40px;
                        background-color: #f5f5f5;
                    }

                    h1 {
                        text-align: center;
                    }

                    table {
                        width: 80%;
                        margin: 30px auto;
                        border-collapse: collapse;
                        background-color: white;
                    }

                    th, td {
                        border: 1px solid #333;
                        padding: 12px;
                        text-align: center;
                    }

                    th {
                        background-color: #333;
                        color: white;
                    }
                </style>
            </head>

            <body>

                <h1>Employee Details</h1>

                <table>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Department</th>
                        <th>Salary</th>
                    </tr>

                    <tr>
                        <td>101</td>
                        <td>Hyndavi</td>
                        <td>Development</td>
                        <td>50000</td>
                    </tr>

                    <tr>
                        <td>102</td>
                        <td>Rahul</td>
                        <td>Testing</td>
                        <td>55000</td>
                    </tr>

                    <tr>
                        <td>103</td>
                        <td>Priya</td>
                        <td>HR</td>
                        <td>48000</td>
                    </tr>

                    <tr>
                        <td>104</td>
                        <td>Arjun</td>
                        <td>DevOps</td>
                        <td>60000</td>
                    </tr>

                </table>

            </body>
            </html>
            """;
    }
}