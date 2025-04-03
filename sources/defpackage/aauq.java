package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aauq extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ dnmw b;
    final /* synthetic */ aaus c;
    final /* synthetic */ ffsk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aauq(dnmw dnmwVar, aaus aausVar, ffsk ffskVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dnmwVar;
        this.c = aausVar;
        this.d = ffskVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aauq) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a && zsr.q(((zsn) this.b).c)) {
            aaus aausVar = this.c;
            dnmw dnmwVar = this.b;
            synchronized (aausVar.c) {
                if (aausVar.d.add(((zsn) dnmwVar).f) && ((ajge) aausVar.b.b()).a() > 0) {
                    ((ajge) aausVar.b.b()).b();
                }
            }
        }
        ffsl.e(this.d, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aauq aauqVar = new aauq(this.b, this.c, this.d, ffguVar);
        aauqVar.a = ((Boolean) obj).booleanValue();
        return aauqVar;
    }
}
