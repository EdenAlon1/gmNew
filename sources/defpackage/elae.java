package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elae {
    public static final elab c = new elab();
    private final elae a;
    public final cpn d;
    public boolean e = false;

    public elae(elae elaeVar, cpn cpnVar) {
        if (elaeVar != null) {
            emxf.a(elaeVar.e);
        }
        this.a = elaeVar;
        this.d = cpnVar;
    }

    public static elac b() {
        return elad.a.c();
    }

    static elae d(Set set) {
        if (set.isEmpty()) {
            return elad.a;
        }
        if (set.size() == 1) {
            return (elae) set.iterator().next();
        }
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            elae elaeVar = (elae) it.next();
            do {
                i += elaeVar.d.d;
                elaeVar = elaeVar.a;
            } while (elaeVar != null);
        }
        if (i == 0) {
            return elad.a;
        }
        cpn cpnVar = new cpn(i);
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            elae elaeVar2 = (elae) it2.next();
            do {
                int i2 = 0;
                while (true) {
                    cpn cpnVar2 = elaeVar2.d;
                    if (i2 >= cpnVar2.d) {
                        break;
                    }
                    emxf.f(cpnVar.put((elab) cpnVar2.d(i2), elaeVar2.d.g(i2)) == null, "Duplicate bindings: %s", elaeVar2.d.d(i2));
                    i2++;
                }
                elaeVar2 = elaeVar2.a;
            } while (elaeVar2 != null);
        }
        return new elad(null, cpnVar).f();
    }

    static elae e(elae elaeVar, elae elaeVar2) {
        return elaeVar.i() ? elaeVar2 : elaeVar2.i() ? elaeVar : d(enip.r(elaeVar, elaeVar2));
    }

    public static elaa j(elab elabVar, elae elaeVar) {
        Object g = elaeVar.g(elabVar);
        if (g == null) {
            return elaa.d(true != elaeVar.d.containsKey(c) ? 3 : 2);
        }
        return new elaa(1, g, false);
    }

    public final elac c() {
        return new elad(this, new cpn());
    }

    public final elae f() {
        if (this.e) {
            throw new IllegalStateException("Already frozen");
        }
        this.e = true;
        elae elaeVar = this.a;
        return (elaeVar == null || !this.d.isEmpty()) ? this : elaeVar;
    }

    public final Object g(elab elabVar) {
        elae elaeVar;
        emxf.l(this.e);
        Object obj = this.d.get(elabVar);
        return (obj != null || (elaeVar = this.a) == null) ? obj : elaeVar.g(elabVar);
    }

    final boolean h(elab elabVar) {
        if (this.d.containsKey(elabVar)) {
            return true;
        }
        elae elaeVar = this.a;
        return elaeVar != null && elaeVar.h(elabVar);
    }

    public final boolean i() {
        return this == elad.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpanExtras<");
        for (elae elaeVar = this; elaeVar != null; elaeVar = elaeVar.a) {
            for (int i = 0; i < elaeVar.d.d; i++) {
                sb.append(this.d.g(i));
                sb.append("], ");
            }
        }
        sb.append(">");
        return sb.toString();
    }
}
