package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkge implements eein {
    final /* synthetic */ dkgf a;

    public dkge(dkgf dkgfVar) {
        this.a = dkgfVar;
    }

    private final void d(int i, String str) {
        this.a.a();
        dklq dklqVar = this.a.j;
        dklqVar.getClass();
        dklqVar.a(i, str);
    }

    @Override // defpackage.eein
    public final void a(eeif eeifVar) {
        this.a.a();
        dklq dklqVar = this.a.j;
        dklqVar.getClass();
        dklqVar.a(400, "Aborted");
    }

    @Override // defpackage.eein
    public final void b(eeif eeifVar) {
        if (eeifVar.g()) {
            int a = eeifVar.a();
            eenl b = eeifVar.b();
            if (b == null) {
                dkty.g("SIP response is null.", new Object[0]);
                return;
            }
            if (a != 200) {
                if (a == 412) {
                    String A = b.A();
                    dkty.g("Invalid entity-tag found in Publish request: %s", this.a.g);
                    this.a.a();
                    dklq dklqVar = this.a.j;
                    dklqVar.getClass();
                    dklqVar.a(412, A);
                    return;
                }
                if (a != 423) {
                    d(a, b.A());
                    return;
                }
                dkty.c("Interval in Publish request is too small: %s", Integer.valueOf(this.a.e));
                eenl b2 = eeifVar.b();
                if (b2 == null) {
                    dkty.g("SIP response is null.", new Object[0]);
                    return;
                }
                int a2 = dkut.a(b2);
                if (a2 >= 0) {
                    this.a.f = a2;
                    dkty.c("Setting Publish min expires to %s.", Integer.valueOf(a2));
                } else {
                    this.a.f = 0;
                    dkty.c("min expires value not set in headers.", new Object[0]);
                }
                this.a.a();
                String c = eeifVar.c();
                if (c != null) {
                    d(423, c);
                    return;
                }
                return;
            }
            dkty.k("PublicationImpl.methodDelivered(): publication to %s successful.", this.a.c);
            String j = b.j("SIP-ETag");
            if (j == null) {
                dkty.k("Getting 2xx PUBLISH response without SIP-ETag header!", new Object[0]);
                this.a.g = null;
            } else {
                this.a.g = j;
            }
            dkty.k("etag value is %s", this.a.g);
            eekr eekrVar = (eekr) b.a.d("Expires");
            int b3 = eekrVar != null ? eekrVar.b() : 0;
            dkty.k("Expires value is %s", Integer.valueOf(b3));
            if (b3 <= 0) {
                this.a.a();
                dkty.k("publication state is inactive", new Object[0]);
                dklq dklqVar2 = this.a.j;
                if (dklqVar2 != null) {
                    dkls dklsVar = dklqVar2.a;
                    Iterator it = dklsVar.g.iterator();
                    while (it.hasNext()) {
                        ((dklu) it.next()).d();
                    }
                    dklsVar.j = null;
                    return;
                }
                return;
            }
            dkgf dkgfVar = this.a;
            dkgfVar.e = b3;
            dkgfVar.i = 2;
            dkty.k("publication state is active", new Object[0]);
            dklq dklqVar3 = this.a.j;
            if (dklqVar3 != null) {
                dkls dklsVar2 = dklqVar3.a;
                dkwz dkwzVar = dklsVar2.k;
                Iterator it2 = dklsVar2.g.iterator();
                while (it2.hasNext()) {
                    ((dklu) it2.next()).b(j, dkwzVar);
                }
            }
        }
    }

    @Override // defpackage.eein
    public final void c(eeif eeifVar) {
        dkty.c("Capabilities publication timed out.", new Object[0]);
        this.a.i = 3;
    }
}
