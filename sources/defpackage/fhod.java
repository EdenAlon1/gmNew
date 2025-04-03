package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhod implements Serializable {
    private static final long serialVersionUID = 1;
    public final List a = new LinkedList();
    public final List b = new ArrayList();

    public final void a(String str) {
        this.a.add(str);
    }

    public final boolean b(String str) {
        fhoj fhojVar;
        String a = fhop.a(str);
        Iterator it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                fhojVar = null;
                break;
            }
            fhojVar = (fhoj) it.next();
            if (a.equals(fhojVar.a) || a.equals(fhojVar.b)) {
                break;
            }
        }
        return this.b.contains(fhojVar);
    }
}
