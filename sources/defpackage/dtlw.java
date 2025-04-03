package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtlw extends ffhv implements ffji {
    int a;
    final /* synthetic */ dtma b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dtlw(dtma dtmaVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = dtmaVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        dtma dtmaVar = this.b;
        ffhd hT = dtmaVar.b.hT();
        dtlv dtlvVar = new dtlv(dtmaVar, null);
        this.a = 1;
        Object a = ffra.a(hT, dtlvVar, this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new dtlw(this.b, (ffgu) obj).b(ffcu.a);
    }
}
