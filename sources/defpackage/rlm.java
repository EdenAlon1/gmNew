package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rlm extends rmn implements rml {
    public List a = new ArrayList();
    public Boolean b;
    public Matrix c;
    public String d;
    public int e;

    protected rlm() {
    }

    @Override // defpackage.rml
    public final void b(rmp rmpVar) {
        if (!(rmpVar instanceof rmf)) {
            throw new SAXException(a.b(rmpVar, "Gradient elements cannot contain ", " elements."));
        }
        this.a.add(rmpVar);
    }

    @Override // defpackage.rml
    public final List n() {
        return this.a;
    }
}
