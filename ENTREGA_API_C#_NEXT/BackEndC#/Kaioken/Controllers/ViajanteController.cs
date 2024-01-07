using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using Kaioken.Data;
using Kaioken.Model;
using Microsoft.AspNetCore.Mvc;
using Microsoft.EntityFrameworkCore;

namespace Kaioken.Controllers
{

    [ApiController]
    [Route("api/[controller]")]
    public class ViajanteController : ControllerBase
    {
        private readonly DataContext _dataContext;

        public ViajanteController(DataContext dataContext){
            _dataContext = dataContext;
        }
        [HttpGet]
        public async Task<ActionResult<IEnumerable<Viajante>>> GetKaioken()
        {
            return await _dataContext.Kaioken.ToListAsync();
        }

        [HttpGet("{id}")]
        public async Task<ActionResult<Viajante>> GetViajanteById(int id)
        {
            var viajante = await _dataContext.Kaioken.FindAsync(id);
            if (viajante == null)
            {
                return NotFound();
            }
            return Ok(viajante);
        }        
    }
}