```mermaid
graph TD
    A[Capstone Project] --> B(Documentation - GitHub Pages);
    A --> C(Server-Side Implementation - Backend);
    A --> D(Client-Side Implementation - Android App);

    B --> B1["Project Description (index.html/md)"];
    B --> B2["Intended Users & User Stories (users.html/md)"];
    B --> B3["UML Class Diagram (uml.png/svg, uml.pdf)"];
    B --> B4["Entity-Relationship Diagram (erd.png/svg, erd.pdf)"];
    B --> B5["Data Definition Language (ddl.sql, ddl.html/md)"];

    C --> C1["Entity Classes (model.entity)"];
    C --> C2["Repository Interfaces (model.dao)"];
    C --> C3["OAuth 2.0 Resource Server (Security Config)"];
    C --> C4["REST Controllers (controller)"];
    C --> C5["Application Logic Services (service)"];

    D --> D1["OAuth 2.0 Client (Google Sign-In)"];
    D --> D2["Network Communication (Retrofit/Volley)"];
    D --> D3["ID Token Logging (Logcat)"];

    C1 --> C2;
    C4 --> C5;
    C5 --> C2;
    D2 --> C4;

    style A fill:#f9f,stroke:#333,stroke-width:2px;
    style B fill:#ccf,stroke:#333;
    style C fill:#cfc,stroke:#333;
    style D fill:#ffc,stroke:#333;
    style B1,B2,B3,B4,B5 fill:#eef,stroke:#333;
    style C1,C2,C3,C4,C5 fill:#efe,stroke:#333;
    style D1,D2,D3 fill:#ffe,stroke:#333;

    subgraph "Backend Data Flow"
    C4 -->|Requests| C5;
    C5 -->|Data Access| C2;
    C2 -->|Database| C1;
    end

    subgraph "Client-Server Interaction"
    D2 -->|API Calls with Bearer Token| C4;
    end
