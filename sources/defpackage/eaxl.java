package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxl implements eaxb {
    public final engw a;
    private boolean d;
    private Object e;
    private final eawz c = new eawz();
    public final Map b = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public eaxl(engw engwVar, lkr lkrVar) {
        this.a = engwVar;
        int i = ((enou) engwVar).c;
        for (int i2 = 0; i2 < i; i2++) {
            final eawx eawxVar = (eawx) engwVar.get(i2);
            eawxVar.a.f(lkrVar, new llh() { // from class: eaxk
                @Override // defpackage.llh
                public final void a(Object obj) {
                    emxc emxcVar = (emxc) obj;
                    efbd.c();
                    boolean g = emxcVar.g();
                    eaxl eaxlVar = eaxl.this;
                    eawx eawxVar2 = eawxVar;
                    if (g) {
                        eaxlVar.b.put(eawxVar2, (eaww) emxcVar.c());
                    } else {
                        eaxlVar.b.remove(eawxVar2);
                    }
                    eaxlVar.b();
                }
            });
        }
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eaxb
    public final eawz a(Object obj) {
        if (obj != this.e) {
            efbd.c();
            this.e = obj;
            this.d = true;
            engw engwVar = this.a;
            for (int i = 0; i < ((enou) engwVar).c; i++) {
                ((eawx) engwVar.get(i)).a(obj);
            }
            this.d = false;
            b();
        }
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        efbd.c();
        if (this.d) {
            return;
        }
        engw engwVar = this.a;
        eaww eawwVar = null;
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            eaww eawwVar2 = (eaww) this.b.get((eawx) engwVar.get(i));
            if (eawwVar2 != null && (eawwVar == null || eawwVar2.compareTo(eawwVar) > 0)) {
                eawwVar = eawwVar2;
            }
        }
        emxc i2 = emxc.i(eawwVar);
        if (!i2.g()) {
            this.c.c(null);
        } else {
            this.c.c((eaww) i2.c());
        }
    }
}
