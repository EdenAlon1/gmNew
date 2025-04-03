package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajun {
    public static final void a(ffix ffixVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        int i3 = i & 6;
        hfd b = hfdVar.b(1778943622);
        if (i3 == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            ffixVar2 = ffixVar;
            gem.b(ffixVar2, ebs.h(eba.j(hvi.e, 0.0f, 0.0f, jif.a(R.dimen.snippet_dismiss_end_padding, b), 0.0f, 11), jif.a(R.dimen.snippet_dismiss_button_size, b)), false, null, null, ajul.a, b, (i2 & 14) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajum
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i4 = i;
                    ajun.a(ffix.this, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
