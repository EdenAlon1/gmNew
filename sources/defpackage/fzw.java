package defpackage;

import com.google.android.apps.messaging.R;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzw {
    public static final fzw a = new fzw();
    public static final ffmj b = new ffmj(1900, 2100);

    private fzw() {
    }

    public final void a(Long l, int i, gae gaeVar, hvi hviVar, long j, hfd hfdVar, int i2) {
        int i3;
        fzw fzwVar;
        String a2;
        hvi c;
        hfd hfdVar2;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(1913724796);
        if (i4 == 0) {
            i3 = (true != b2.D(l) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.B(i) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != ((i2 & 512) == 0 ? b2.D(gaeVar) : b2.F(gaeVar)) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != b2.D(hviVar) ? 1024 : 2048;
        }
        if ((i2 & 24576) == 0) {
            i3 |= true != b2.C(j) ? 8192 : 16384;
        }
        if ((196608 & i2) == 0) {
            fzwVar = this;
            i3 |= true != b2.D(fzwVar) ? 65536 : 131072;
        } else {
            fzwVar = this;
        }
        if ((74899 & i3) == 74898 && b2.I()) {
            b2.s();
            hfdVar2 = b2;
        } else {
            b2.t();
            if ((i2 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            Locale a3 = fwb.a(b2);
            a2 = gaeVar.a(l, a3, false);
            String a4 = gaeVar.a(l, a3, true);
            String str = "";
            if (a4 == null) {
                b2.v(1258860122);
                if (gdj.a(i, 0)) {
                    b2.v(1148988864);
                    a4 = hcb.b(R.string.m3c_date_picker_no_selection_description, b2);
                    ((hfm) b2).Z();
                } else if (gdj.a(i, 1)) {
                    b2.v(1148991835);
                    a4 = hcb.b(R.string.m3c_date_input_no_input_description, b2);
                    ((hfm) b2).Z();
                } else {
                    b2.v(1259081553);
                    ((hfm) b2).Z();
                    a4 = "";
                }
                ((hfm) b2).Z();
            } else {
                b2.v(1148981282);
                ((hfm) b2).Z();
            }
            if (a2 == null) {
                b2.v(1259181778);
                if (gdj.a(i, 0)) {
                    b2.v(1148999250);
                    a2 = hcb.b(R.string.m3c_date_picker_headline, b2);
                    ((hfm) b2).Z();
                } else if (gdj.a(i, 1)) {
                    b2.v(1149001777);
                    a2 = hcb.b(R.string.m3c_date_input_headline, b2);
                    ((hfm) b2).Z();
                } else {
                    b2.v(1259380145);
                    ((hfm) b2).Z();
                    a2 = "";
                }
                ((hfm) b2).Z();
            } else {
                b2.v(1148996401);
                ((hfm) b2).Z();
            }
            if (gdj.a(i, 0)) {
                b2.v(1149009437);
                str = hcb.b(R.string.m3c_date_picker_headline_description, b2);
                ((hfm) b2).Z();
            } else if (gdj.a(i, 1)) {
                b2.v(1149012316);
                str = hcb.b(R.string.m3c_date_input_headline_description, b2);
                ((hfm) b2).Z();
            } else {
                b2.v(1259717425);
                ((hfm) b2).Z();
            }
            String format = String.format(str, Arrays.copyOf(new Object[]{a4}, 1));
            format.getClass();
            boolean D = b2.D(format);
            hfm hfmVar = (hfm) b2;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new fzs(format);
                hfmVar.ad(R);
            }
            c = jjs.c(hviVar, false, (ffji) R);
            hfdVar2 = b2;
            grl.b(a2, c, j, 0L, null, null, null, 0L, null, 0L, 0, false, 1, 0, null, null, hfdVar2, (i3 >> 6) & 896, 3072, 122872);
        }
        hio L = hfdVar2.L();
        if (L != null) {
            L.d = new fzt(fzwVar, l, i, gaeVar, hviVar, j, i2);
        }
    }

    public final void b(int i, hvi hviVar, long j, hfd hfdVar, int i2) {
        int i3;
        fzw fzwVar;
        int i4 = i2 & 6;
        hfd b2 = hfdVar.b(-390880814);
        if (i4 == 0) {
            i3 = (true != b2.B(i) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != b2.D(hviVar) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != b2.C(j) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            fzwVar = this;
            i3 |= true != b2.D(fzwVar) ? 1024 : 2048;
        } else {
            fzwVar = this;
        }
        if ((i3 & 1171) == 1170 && b2.I()) {
            b2.s();
        } else {
            b2.t();
            if ((i2 & 1) != 0 && !b2.G()) {
                b2.s();
            }
            b2.l();
            if (gdj.a(i, 0)) {
                b2.v(406555952);
                grl.b(hcb.b(R.string.m3c_date_picker_title, b2), hviVar, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, b2, i3 & 1008, 0, 131064);
                ((hfm) b2).Z();
            } else if (gdj.a(i, 1)) {
                b2.v(406563215);
                grl.b(hcb.b(R.string.m3c_date_input_title, b2), hviVar, j, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, b2, i3 & 1008, 0, 131064);
                ((hfm) b2).Z();
            } else {
                b2.v(-281263165);
                ((hfm) b2).Z();
            }
        }
        hio L = b2.L();
        if (L != null) {
            L.d = new fzu(fzwVar, i, hviVar, j, i2);
        }
    }
}
