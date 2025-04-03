package defpackage;

import android.text.Spannable;
import android.text.style.ClickableSpan;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailg implements aihs {
    public final Spannable a;
    public final ClickableSpan b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;

    public ailg(Spannable spannable, ClickableSpan clickableSpan, int i, int i2, float f, float f2) {
        clickableSpan.getClass();
        this.a = spannable;
        this.b = clickableSpan;
        this.c = i;
        this.d = i2;
        this.e = f;
        this.f = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ailg)) {
            return false;
        }
        ailg ailgVar = (ailg) obj;
        return ffkj.e(this.a, ailgVar.a) && ffkj.e(this.b, ailgVar.b) && this.c == ailgVar.c && this.d == ailgVar.d && Float.compare(this.e, ailgVar.e) == 0 && Float.compare(this.f, ailgVar.f) == 0;
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f);
    }

    public final String toString() {
        return "LinkifySpanViewer{" + cskt.b(this.b.toString()) + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + "}";
    }
}
