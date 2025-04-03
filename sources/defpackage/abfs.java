package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abfs {
    public static final void a(final abfq abfqVar, final hvi hviVar, hfd hfdVar, final int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(2126218824);
        if (i3 == 0) {
            i2 = (true != b.D(abfqVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 19) == 18 && b.I()) {
            b.s();
        } else {
            dmff.a(new dmfm(jii.a(R.string.premium_sms_options_title, b), new doas(jii.a(R.string.premium_sms_options_open_settings_button, b), abfqVar.d), new doas(jii.a(R.string.premium_sms_options_resend_button, b), abfqVar.e), abfqVar.b, abfqVar.c, (doat) null, dmeb.b, abfqVar.a, 736), hviVar, b, i2 & 112, 0);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new ffjm() { // from class: abfr
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    abfq abfqVar2 = abfq.this;
                    int i4 = i;
                    abfs.a(abfqVar2, hviVar, (hfd) obj, hip.a(i4 | 1));
                    return ffcu.a;
                }
            };
        }
    }
}
