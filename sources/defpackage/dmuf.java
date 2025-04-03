package defpackage;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmuf implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ gul b;

    public dmuf(boolean z, gul gulVar) {
        this.a = z;
        this.b = gulVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            if (this.a) {
                hfdVar.v(1509787926);
                dwjx.a(this.b, null, null, hfdVar, 0);
                hfdVar.o();
            } else {
                hfdVar.v(1509861799);
                gul gulVar = this.b;
                hfdVar.v(-228386368);
                float f = guj.a;
                Configuration configuration = (Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a);
                int i = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                int i2 = Float.compare(dmuy.g(hfdVar), 425.0f) > 0 ? 1 : 0;
                hfdVar.o();
                dwjx.b(gulVar, null, null, (i2 ^ 1) | i, hfdVar, 0);
                hfdVar.o();
            }
        }
        return ffcu.a;
    }
}
