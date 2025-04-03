package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ gvi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzx(gvi gviVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = gviVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gzx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object a;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            gvi gviVar = this.b;
            this.a = 1;
            a = gviVar.a(dhy.a, this);
            if (a == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new gzx(this.b, ffguVar);
    }
}
