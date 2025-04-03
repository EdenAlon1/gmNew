package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class few extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cxj b;
    final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public few(cxj cxjVar, long j, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cxjVar;
        this.c = j;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((few) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cxj cxjVar = this.b;
            iak iakVar = new iak(this.c);
            dac dacVar = fez.d;
            this.a = 1;
            if (cxj.j(cxjVar, iakVar, dacVar, null, this, 12) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new few(this.b, this.c, ffguVar);
    }
}
