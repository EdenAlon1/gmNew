package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cwi extends ffkk implements ffji {
    final /* synthetic */ cwb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwi(cwb cwbVar) {
        super(1);
        this.a = cwbVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        ifoVar.p();
        cwb cwbVar = this.a;
        hss hssVar = cwbVar.h;
        if (hssVar.a() > 1) {
            ffdx.q(hssVar, new cvs());
        }
        hss hssVar2 = cwbVar.h;
        int a = hssVar2.a();
        for (int i = 0; i < a; i++) {
            ((cum) hssVar2.get(i)).b(ifoVar);
        }
        return ffcu.a;
    }
}
