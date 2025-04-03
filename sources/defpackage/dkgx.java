package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkgx implements eein {
    private final dkha a;

    public dkgx(dkha dkhaVar) {
        this.a = dkhaVar;
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        c(eeifVar);
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        if (eeifVar.g()) {
            eenj eenjVar = eeifVar.b;
            eenjVar.getClass();
            this.a.K((eelx) eenjVar.a);
        }
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        eenj eenjVar = eeifVar.a;
        if (eenjVar != null) {
            dkha dkhaVar = this.a;
            Iterator it = dkhaVar.g.iterator();
            while (it.hasNext()) {
                dkhd dkhdVar = (dkhd) it.next();
                try {
                    if (dkhdVar instanceof dkhe) {
                        ((dkhe) dkhdVar).u();
                    }
                } catch (Exception e) {
                    dkty.j(e, dkha.f, "timeout: Call to listener failed with error: ", new Object[0]);
                }
            }
        }
    }
}
