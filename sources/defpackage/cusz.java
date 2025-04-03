package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cusz extends ffhv implements ffjm {
    final /* synthetic */ List a;
    final /* synthetic */ List b;
    final /* synthetic */ cutc c;
    final /* synthetic */ cujo d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cusz(ffgu ffguVar, List list, List list2, cutc cutcVar, cujo cujoVar, int i) {
        super(2, ffguVar);
        this.a = list;
        this.b = list2;
        this.c = cutcVar;
        this.d = cujoVar;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cusz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffsk ffskVar = (ffsk) this.f;
        for (String str : this.a) {
            List list = this.b;
            ffhe ffheVar = ffhe.a;
            list.add(ffra.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new cutb(null, this.c, str, this.d, this.e)));
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cusz cuszVar = new cusz(ffguVar, this.a, this.b, this.c, this.d, this.e);
        cuszVar.f = obj;
        return cuszVar;
    }
}
