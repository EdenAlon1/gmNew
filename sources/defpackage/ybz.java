package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ycc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ybz(ycc yccVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yccVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ybz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ycc yccVar = this.b;
            elfl f = yccVar.d.f(yccVar.b);
            f.getClass();
            this.a = 1;
            if (fgfz.c(f, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ybz(this.b, ffguVar);
    }
}
