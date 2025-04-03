package defpackage;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iat {
    public static final BlendMode a(int i) {
        BlendMode blendMode;
        BlendMode blendMode2;
        BlendMode blendMode3;
        BlendMode blendMode4;
        BlendMode blendMode5;
        BlendMode blendMode6;
        BlendMode blendMode7;
        BlendMode blendMode8;
        BlendMode blendMode9;
        BlendMode blendMode10;
        BlendMode blendMode11;
        BlendMode blendMode12;
        BlendMode blendMode13;
        BlendMode blendMode14;
        BlendMode blendMode15;
        BlendMode blendMode16;
        BlendMode blendMode17;
        BlendMode blendMode18;
        BlendMode blendMode19;
        BlendMode blendMode20;
        BlendMode blendMode21;
        BlendMode blendMode22;
        BlendMode blendMode23;
        BlendMode blendMode24;
        BlendMode blendMode25;
        BlendMode blendMode26;
        BlendMode blendMode27;
        BlendMode blendMode28;
        BlendMode blendMode29;
        BlendMode blendMode30;
        if (ibk.b(i, 0)) {
            blendMode30 = BlendMode.CLEAR;
            return blendMode30;
        }
        if (ibk.b(i, 1)) {
            blendMode29 = BlendMode.SRC;
            return blendMode29;
        }
        if (ibk.b(i, 2)) {
            blendMode28 = BlendMode.DST;
            return blendMode28;
        }
        if (ibk.b(i, 3)) {
            blendMode27 = BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (ibk.b(i, 4)) {
            blendMode26 = BlendMode.DST_OVER;
            return blendMode26;
        }
        if (ibk.b(i, 5)) {
            blendMode25 = BlendMode.SRC_IN;
            return blendMode25;
        }
        if (ibk.b(i, 6)) {
            blendMode24 = BlendMode.DST_IN;
            return blendMode24;
        }
        if (ibk.b(i, 7)) {
            blendMode23 = BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (ibk.b(i, 8)) {
            blendMode22 = BlendMode.DST_OUT;
            return blendMode22;
        }
        if (ibk.b(i, 9)) {
            blendMode21 = BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (ibk.b(i, 10)) {
            blendMode20 = BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (ibk.b(i, 11)) {
            blendMode19 = BlendMode.XOR;
            return blendMode19;
        }
        if (ibk.b(i, 12)) {
            blendMode18 = BlendMode.PLUS;
            return blendMode18;
        }
        if (ibk.b(i, 13)) {
            blendMode17 = BlendMode.MODULATE;
            return blendMode17;
        }
        if (ibk.b(i, 14)) {
            blendMode16 = BlendMode.SCREEN;
            return blendMode16;
        }
        if (ibk.b(i, 15)) {
            blendMode15 = BlendMode.OVERLAY;
            return blendMode15;
        }
        if (ibk.b(i, 16)) {
            blendMode14 = BlendMode.DARKEN;
            return blendMode14;
        }
        if (ibk.b(i, 17)) {
            blendMode13 = BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (ibk.b(i, 18)) {
            blendMode12 = BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (ibk.b(i, 19)) {
            blendMode11 = BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (ibk.b(i, 20)) {
            blendMode10 = BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (ibk.b(i, 21)) {
            blendMode9 = BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (ibk.b(i, 22)) {
            blendMode8 = BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (ibk.b(i, 23)) {
            blendMode7 = BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (ibk.b(i, 24)) {
            blendMode6 = BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (ibk.b(i, 25)) {
            blendMode5 = BlendMode.HUE;
            return blendMode5;
        }
        if (ibk.b(i, 26)) {
            blendMode4 = BlendMode.SATURATION;
            return blendMode4;
        }
        if (ibk.b(i, 27)) {
            blendMode3 = BlendMode.COLOR;
            return blendMode3;
        }
        if (ibk.b(i, 28)) {
            blendMode2 = BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = BlendMode.SRC_OVER;
        return blendMode;
    }

    public static final PorterDuff.Mode b(int i) {
        return ibk.b(i, 0) ? PorterDuff.Mode.CLEAR : ibk.b(i, 1) ? PorterDuff.Mode.SRC : ibk.b(i, 2) ? PorterDuff.Mode.DST : ibk.b(i, 3) ? PorterDuff.Mode.SRC_OVER : ibk.b(i, 4) ? PorterDuff.Mode.DST_OVER : ibk.b(i, 5) ? PorterDuff.Mode.SRC_IN : ibk.b(i, 6) ? PorterDuff.Mode.DST_IN : ibk.b(i, 7) ? PorterDuff.Mode.SRC_OUT : ibk.b(i, 8) ? PorterDuff.Mode.DST_OUT : ibk.b(i, 9) ? PorterDuff.Mode.SRC_ATOP : ibk.b(i, 10) ? PorterDuff.Mode.DST_ATOP : ibk.b(i, 11) ? PorterDuff.Mode.XOR : ibk.b(i, 12) ? PorterDuff.Mode.ADD : ibk.b(i, 14) ? PorterDuff.Mode.SCREEN : ibk.b(i, 15) ? PorterDuff.Mode.OVERLAY : ibk.b(i, 16) ? PorterDuff.Mode.DARKEN : ibk.b(i, 17) ? PorterDuff.Mode.LIGHTEN : ibk.b(i, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}
