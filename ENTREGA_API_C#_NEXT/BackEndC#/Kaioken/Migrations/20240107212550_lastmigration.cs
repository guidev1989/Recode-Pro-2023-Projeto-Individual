using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

#pragma warning disable CA1814 // Prefer jagged arrays over multidimensional

namespace Kaioken.Migrations
{
    /// <inheritdoc />
    public partial class Lastmigration : Migration
    {
        /// <inheritdoc />
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.InsertData(
                table: "viajantes",
                columns: new[] { "id", "cpf", "email", "name", "telefone" },
                values: new object[,]
                {
                    { 1, "12345678900", "gabriel@email.com", "Gabriel", "11987170171" },
                    { 2, "12345678901", "bruna@email.com", "Bruna", "11987170172" },
                    { 3, "12345678902", "guilherme@email.com", "Guilherme", "11987170173" },
                    { 4, "12345678903", "beatriz@email.com", "Beatriz", "11987170174" }
                });
        }

        /// <inheritdoc />
        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DeleteData(
                table: "viajantes",
                keyColumn: "id",
                keyValue: 1);

            migrationBuilder.DeleteData(
                table: "viajantes",
                keyColumn: "id",
                keyValue: 2);

            migrationBuilder.DeleteData(
                table: "viajantes",
                keyColumn: "id",
                keyValue: 3);

            migrationBuilder.DeleteData(
                table: "viajantes",
                keyColumn: "id",
                keyValue: 4);
        }
    }
}
