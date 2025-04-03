package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ sxx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxv(sxx sxxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = sxxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sxv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            sxx sxxVar = this.b;
            sxu sxuVar = new sxu(sxxVar.c);
            sxr sxrVar = new sxr(sxxVar);
            this.a = 1;
            if (sxuVar.a(sxrVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new sxv(this.b, ffguVar);
    }
}
