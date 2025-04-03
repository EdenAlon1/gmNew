package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmni extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eyxa b;
    final /* synthetic */ eqws c;
    final /* synthetic */ cmnk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmni(eyxa eyxaVar, eqws eqwsVar, cmnk cmnkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eyxaVar;
        this.c = eqwsVar;
        this.d = cmnkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmni) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ((ensz) cmnk.a.h()).D("scheduleProvisioningForEligibleSims: operationTrigger: %s bugle trigger event: %s", this.b, this.c);
            cmnk cmnkVar = this.d;
            eyxa eyxaVar = this.b;
            eqws eqwsVar = this.c;
            this.a = 1;
            ((ensz) cmnk.a.h()).D("scheduleProvisioningForAllEligibleSims: operationTrigger: %s bugle trigger event: %s", eyxaVar, eqwsVar);
            Iterator it = cmnkVar.g().iterator();
            while (it.hasNext()) {
                cmnkVar.e((djrm) it.next(), eyxaVar, eqwsVar);
            }
            if (ffcu.a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cmni(this.b, this.c, this.d, ffguVar);
    }
}
