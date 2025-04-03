package defpackage;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwgu {
    public static final void a(final cwgs cwgsVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1199880923);
        if (i3 == 0) {
            i2 = (true != b.D(cwgsVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
        } else {
            hkx a = hkf.a(cwgsVar.a, b);
            if (b(a).length() > 0) {
                Toast.makeText((Context) b.e(AndroidCompositionLocals_androidKt.b), b(a), 0).show();
                cwgsVar.b.invoke();
            }
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: cwgt
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    cwgu.a(cwgs.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }

    private static final String b(hkx hkxVar) {
        return (String) hkxVar.a();
    }
}
