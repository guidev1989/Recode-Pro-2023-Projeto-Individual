using Microsoft.EntityFrameworkCore;
using Kaioken.Model;

namespace Kaioken.Data
{
    public class DataContext : DbContext 
    {
public DataContext(DbContextOptions<DataContext> options) : base(options){}
        
      public DbSet<Viajante> Kaioken {get; set;}

      protected override void OnModelCreating(ModelBuilder modelBuilder)
      {
        base.OnModelCreating(modelBuilder);

        modelBuilder.Entity<Viajante>().HasData(
            new Viajante { Id = 1, Name = "Gabriel", CPF = "12345678900", Telefone = "11987170171", Email = "gabriel@email.com"},
            new Viajante { Id = 2, Name = "Bruna", CPF = "12345678901", Telefone = "11987170172", Email = "bruna@email.com"},
            new Viajante { Id = 3, Name = "Guilherme", CPF = "12345678902", Telefone = "11987170173", Email = "guilherme@email.com"},
            new Viajante { Id = 4, Name = "Beatriz", CPF = "12345678903", Telefone = "11987170174", Email = "beatriz@email.com"}
        );
      }

    }
}