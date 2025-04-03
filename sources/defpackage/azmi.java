package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azmi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azml b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azmi(azml azmlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azmlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azmi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            azoz azozVar = this.b.b;
            azozVar.a = enpd.a;
            azozVar.b = enoz.a;
            azqd azqdVar = (azqd) this.b.d.b();
            this.a = 1;
            if (azqdVar.h(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azmi(this.b, ffguVar);
    }
}
