package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gdh extends ffkk implements ffix {
    final /* synthetic */ gdi a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdh(gdi gdiVar) {
        super(0);
        this.a = gdiVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (((gkt) isv.a(this.a, gkw.a)) == null) {
            gdi gdiVar = this.a;
            isw iswVar = gdiVar.d;
            if (iswVar != null) {
                gdiVar.L(iswVar);
            }
            gdiVar.d = null;
        } else {
            gdi gdiVar2 = this.a;
            if (gdiVar2.d == null) {
                gdf gdfVar = new gdf(gdiVar2);
                gdg gdgVar = new gdg(gdiVar2);
                dwn dwnVar = gdiVar2.e;
                boolean z = gdiVar2.a;
                float f = gdiVar2.b;
                dbu dbuVar = frx.a;
                isw a = fsd.a(dwnVar, z, f, gdfVar, gdgVar);
                gdiVar2.M(a);
                gdiVar2.d = a;
            }
        }
        return ffcu.a;
    }
}
