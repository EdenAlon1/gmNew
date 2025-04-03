package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwnn implements ffjm {
    final /* synthetic */ ffjm a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffjm d;
    final /* synthetic */ boolean e;
    final /* synthetic */ fgdj f;

    public cwnn(ffjm ffjmVar, boolean z, ffji ffjiVar, ffjm ffjmVar2, boolean z2, fgdj fgdjVar) {
        this.a = ffjmVar;
        this.b = z;
        this.c = ffjiVar;
        this.d = ffjmVar2;
        this.e = z2;
        this.f = fgdjVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffjm ffjmVar = this.a;
            if (ffjmVar == null) {
                hik hikVar = dopp.a;
                ffjmVar = new dopd();
            }
            dopp.a(new cwnl(this.e), null, ffjmVar, null, null, null, null, new cwnm(this.f), null, this.b, this.c, auxy.a() ? dopt.a : dopt.c, this.d, hfdVar, 0, 0, 378);
        }
        return ffcu.a;
    }
}
