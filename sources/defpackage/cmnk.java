package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnk implements cmnf {
    public static final entd a = entd.p();
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningSchedulerMediatorImpl");
    public final ffbr c;
    public final ffbr d;
    public final dkvu e;
    public final aunh f;
    private final ffsk g;
    private final ajoz h;
    private final ffbr i;

    public cmnk(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, dkvu dkvuVar, asqs asqsVar, ajoz ajozVar, ffbr ffbrVar3, aunh aunhVar) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        dkvuVar.getClass();
        asqsVar.getClass();
        ajozVar.getClass();
        ffbrVar3.getClass();
        this.g = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = dkvuVar;
        this.h = ajozVar;
        this.i = ffbrVar3;
        this.f = aunhVar;
    }

    @Override // defpackage.cmnf
    public final elfl a(djrm djrmVar, eqws eqwsVar) {
        eqwsVar.getClass();
        return ((cmne) this.d.b()).d(djrn.a(djrmVar), eqwsVar);
    }

    @Override // defpackage.cmnf
    public final /* bridge */ /* synthetic */ void b(int i, eyxa eyxaVar) {
        eyxaVar.getClass();
        if (this.e.b(i)) {
            axol.k(this.g, null, new cmng(this, i, eyxaVar, null), 3);
        }
    }

    @Override // defpackage.cmnf
    public final void c() {
        axol.m(this.g, new cmnh(this, null));
    }

    @Override // defpackage.cmnf
    public final void d(eyxa eyxaVar, eqws eqwsVar) {
        eyxaVar.getClass();
        eqwsVar.getClass();
        axol.k(this.g, null, new cmni(eyxaVar, eqwsVar, this, null), 3);
    }

    @Override // defpackage.cmnf
    public final void e(djrm djrmVar, eyxa eyxaVar, eqws eqwsVar) {
        djrmVar.getClass();
        eyxaVar.getClass();
        eqwsVar.getClass();
        axol.k(this.g, null, new cmnj(this, djrmVar, eyxaVar, eqwsVar, null), 3);
    }

    public final Object f(int i, eyxa eyxaVar, ffgu ffguVar) {
        ((ensz) a.h()).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %s", i);
        elfl a2 = this.h.a(i, eyxaVar);
        a2.getClass();
        Object c = fgfz.c(a2, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }

    public final Set g() {
        Set o = ((cort) this.c.b()).o();
        ArrayList arrayList = new ArrayList();
        for (Object obj : o) {
            if (((clwp) this.i.b()).b((djrm) obj) == 1) {
                arrayList.add(obj);
            }
        }
        return ffdx.ar(arrayList);
    }
}
