package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jtj implements jth {
    private static final Typeface c(String str, jsy jsyVar, int i) {
        if (jss.b(i, 0) && ffkj.e(jsyVar, jsy.e) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int b = jrq.b(jsyVar, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(b) : Typeface.create(str, b);
    }

    @Override // defpackage.jth
    public final Typeface a(jsy jsyVar, int i) {
        return c(null, jsyVar, i);
    }

    @Override // defpackage.jth
    public final Typeface b(jta jtaVar, jsy jsyVar, int i) {
        String str;
        int i2 = jsyVar.i / 100;
        String str2 = jtaVar.d;
        if (i2 < 0 || i2 >= 2) {
            if (i2 >= 2 && i2 < 4) {
                str = "-light";
            } else if (i2 != 4) {
                if (i2 == 5) {
                    str = "-medium";
                } else if ((i2 < 6 || i2 >= 8) && i2 >= 8 && i2 < 11) {
                    str = "-black";
                }
            }
            str2 = str2.concat(str);
        } else {
            str2 = str2.concat("-thin");
        }
        Typeface typeface = null;
        if (str2.length() != 0) {
            Typeface c = c(str2, jsyVar, i);
            if (!ffkj.e(c, Typeface.create(Typeface.DEFAULT, jrq.b(jsyVar, i))) && !ffkj.e(c, c(null, jsyVar, i))) {
                typeface = c;
            }
        }
        return typeface == null ? c(jtaVar.d, jsyVar, i) : typeface;
    }
}
