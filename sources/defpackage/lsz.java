package defpackage;

import android.graphics.Bitmap;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lsz {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public final float A;
    public final int B;
    public final float C;
    public final float D;
    public final boolean E;
    public final int F;
    public final int G;
    public final float H;
    public final int I;
    public final float J;
    public final CharSequence t;
    public final Layout.Alignment u;
    public final Layout.Alignment v;
    public final Bitmap w;
    public final float x;
    public final int y;
    public final int z;

    static {
        lsy lsyVar = new lsy();
        lsyVar.a = "";
        lsyVar.a();
        a = lvf.N(0);
        b = lvf.N(17);
        c = lvf.N(1);
        d = lvf.N(2);
        e = lvf.N(3);
        f = lvf.N(18);
        g = lvf.N(4);
        h = lvf.N(5);
        i = lvf.N(6);
        j = lvf.N(7);
        k = lvf.N(8);
        l = lvf.N(9);
        m = lvf.N(10);
        n = lvf.N(11);
        o = lvf.N(12);
        p = lvf.N(13);
        q = lvf.N(14);
        r = lvf.N(15);
        s = lvf.N(16);
    }

    public lsz(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f2, int i2, int i3, float f3, int i4, int i5, float f4, float f5, float f6, boolean z, int i6, int i7, float f7) {
        if (charSequence == null) {
            lti.f(bitmap);
        } else {
            lti.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.t = SpannedString.valueOf(charSequence);
        } else {
            this.t = charSequence != null ? charSequence.toString() : null;
        }
        this.u = alignment;
        this.v = alignment2;
        this.w = bitmap;
        this.x = f2;
        this.y = i2;
        this.z = i3;
        this.A = f3;
        this.B = i4;
        this.C = f5;
        this.D = f6;
        this.E = z;
        this.F = i6;
        this.G = i5;
        this.H = f4;
        this.I = i7;
        this.J = f7;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            lsz lszVar = (lsz) obj;
            if (TextUtils.equals(this.t, lszVar.t) && this.u == lszVar.u && this.v == lszVar.v && ((bitmap = this.w) != null ? !((bitmap2 = lszVar.w) == null || !bitmap.sameAs(bitmap2)) : lszVar.w == null) && this.x == lszVar.x && this.y == lszVar.y && this.z == lszVar.z && this.A == lszVar.A && this.B == lszVar.B && this.C == lszVar.C && this.D == lszVar.D && this.E == lszVar.E && this.F == lszVar.F && this.G == lszVar.G && this.H == lszVar.H && this.I == lszVar.I && this.J == lszVar.J) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.t, this.u, this.v, this.w, Float.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.z), Float.valueOf(this.A), Integer.valueOf(this.B), Float.valueOf(this.C), Float.valueOf(this.D), Boolean.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Float.valueOf(this.H), Integer.valueOf(this.I), Float.valueOf(this.J)});
    }
}
