package defpackage;

import androidx.compose.foundation.layout.AspectRatioElement;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnah implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ qgk b;
    final /* synthetic */ boolean c;
    final /* synthetic */ dnaw d;
    final /* synthetic */ hho e;
    final /* synthetic */ int f;
    final /* synthetic */ hho g;

    public dnah(hvi hviVar, qgk qgkVar, boolean z, dnaw dnawVar, hho hhoVar, int i, hho hhoVar2) {
        this.a = hviVar;
        this.b = qgkVar;
        this.c = z;
        this.d = dnawVar;
        this.e = hhoVar;
        this.f = i;
        this.g = hhoVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hvi a;
        boolean I;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            a = this.a.a(new AspectRatioElement(1.0f));
            hvi a2 = jfw.a(a, "LottieAnimation");
            boolean z = false;
            if (this.b == null ? this.c : dnak.a(this.g)) {
                I = ffpc.I(this.d.a, "unit_test", false);
                if (!I) {
                    z = true;
                }
            }
            qgf.b((qci) this.e.a(), a2, z, false, this.b, 0.0f, this.f, null, null, null, null, false, hfdVar, 0, 0, 262048);
        }
        return ffcu.a;
    }
}
