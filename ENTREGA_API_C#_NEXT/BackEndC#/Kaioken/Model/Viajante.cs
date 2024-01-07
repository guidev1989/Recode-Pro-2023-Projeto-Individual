using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations.Schema;
using System.Linq;
using System.Threading.Tasks;

namespace Kaioken.Model
{
    [Table("viajantes")]
    public class Viajante
    {
        [Column("id")]
        public int Id {get; set;}

        [Column("name")]
        public string Name {get; set;} = string.Empty;

        [Column("cpf")]
        public string CPF {get; set;} = string.Empty;

        [Column("telefone")]    
        public string Telefone {get; set;} = string.Empty;

        [Column("email")]
        public string Email {get; set;} = string.Empty;

        
    }
}