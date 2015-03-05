
import if6ae.entity.Inscricao;
import if6ae.entity.Minicurso;
import if6ae.jpa.InscricaoJpa;
import if6ae.jpa.InscricaoMinicursoJpa;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utfpr.faces.support.PageBean;

/**
 *
 * @author Wilson
 */
@ManagedBean
@SessionScoped
public class listaBean extends PageBean {
    
    private List<Inscricao> incricoes;
    private List<Minicurso> minicursos;

    public List<Inscricao> getIncricoes() {
        return incricoes;
    }

    public void setIncricoes(ArrayList<Inscricao> incricoes) {
        this.incricoes = incricoes;
    }

    public List<Minicurso> getMinicursos() {
        return minicursos;
    }

    public void setMinicursos(List<Minicurso> minicursos) {
        this.minicursos = minicursos;
    }
    
    
    



    public List<Inscricao> getIdiomas() {
        List<Inscricao> incricoes;
        try {
            InscricaoJpa ctl = new InscricaoJpa();
            incricoes = ctl.findAll();
            
            this.incricoes = ctl.findAll();
        } catch (Exception e) {
            incricoes = new ArrayList<>(0);
            log("Lista de idiomas", e);
        }
        return incricoes;
    }

    
    public List<Minicurso> getTodosMinicursos() {
        List<Minicurso> minicursos;
        try {
            InscricaoMinicursoJpa ctl = new InscricaoMinicursoJpa();
            minicursos = ctl.findAll();
            
            this.minicursos = ctl.findAll();
        } catch (Exception e) {
            minicursos = new ArrayList<>(0);
            log("Lista de idiomas", e);
        }
        return minicursos;
    }
}
