package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajuc {
    public static final void a(ffix ffixVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        final ffix ffixVar2;
        ffixVar.getClass();
        hfd b = hfdVar.b(-1354387204);
        if ((i & 6) == 0) {
            i2 = (true != b.F(ffixVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i3 & 19) == 18 && b.I()) {
            b.s();
            ffixVar2 = ffixVar;
        } else {
            hviVar = hvi.e;
            ffixVar2 = ffixVar;
            gem.b(ffixVar2, ebs.k(dee.a(hviVar, gft.a(b).a, eqm.a), jif.a(R.dimen.reply_icon_size, b)), false, null, null, ajtu.a, b, (i3 & 14) | 1572864, 60);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: ajub
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    ffix ffixVar3 = ffix.this;
                    int i4 = i;
                    ajuc.a(ffixVar3, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
