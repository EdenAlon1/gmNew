package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class okv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffwm b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public okv(ffwm ffwmVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffwmVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((okv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                oku okuVar = new oku(this.b, this.c, null);
                this.a = 1;
                if (ffsl.a(okuVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.b.e(null);
        } catch (Throwable th) {
            this.b.e(th);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new okv(this.b, this.c, ffguVar);
    }
}
