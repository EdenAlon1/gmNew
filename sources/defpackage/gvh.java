package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvh extends ffhv implements ffji {
    int a;
    final /* synthetic */ gvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvh(gvi gviVar, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = gviVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gvi gviVar = this.b;
            this.a = 1;
            ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
            ffrhVar.B();
            gviVar.a.d(true);
            gviVar.b = ffrhVar;
            if (ffrhVar.m() == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new gvh(this.b, (ffgu) obj).b(ffcu.a);
    }
}
