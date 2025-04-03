package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpf {
    public final jlm a;
    public final jpo b;
    public final List c;
    public final int d;
    public final boolean e;
    public final int f;
    public final jzn g;
    public final kah h;
    public final jse i;
    public final long j;

    public jpf(jlm jlmVar, jpo jpoVar, List list, int i, boolean z, int i2, jzn jznVar, kah kahVar, jse jseVar, long j) {
        this.a = jlmVar;
        this.b = jpoVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = jznVar;
        this.h = kahVar;
        this.i = jseVar;
        this.j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpf)) {
            return false;
        }
        jpf jpfVar = (jpf) obj;
        return ffkj.e(this.a, jpfVar.a) && ffkj.e(this.b, jpfVar.b) && ffkj.e(this.c, jpfVar.c) && this.d == jpfVar.d && this.e == jpfVar.e && jyw.a(this.f, jpfVar.f) && ffkj.e(this.g, jpfVar.g) && this.h == jpfVar.h && ffkj.e(this.i, jpfVar.i) && jzk.g(this.j, jpfVar.j);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        boolean z = this.e;
        return (((((((((((((hashCode * 31) + this.d) * 31) + (true != z ? 1237 : 1231)) * 31) + this.f) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + jzi.a(this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutInput(text=");
        sb.append((Object) this.a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", placeholders=");
        sb.append(this.c);
        sb.append(", maxLines=");
        sb.append(this.d);
        sb.append(", softWrap=");
        sb.append(this.e);
        sb.append(", overflow=");
        int i = this.f;
        sb.append((Object) (jyw.a(i, 1) ? "Clip" : jyw.a(i, 2) ? "Ellipsis" : jyw.a(i, 5) ? "MiddleEllipsis" : jyw.a(i, 3) ? "Visible" : jyw.a(i, 4) ? "StartEllipsis" : "Invalid"));
        sb.append(", density=");
        sb.append(this.g);
        sb.append(", layoutDirection=");
        sb.append(this.h);
        sb.append(", fontFamilyResolver=");
        sb.append(this.i);
        sb.append(", constraints=");
        sb.append((Object) jzk.e(this.j));
        sb.append(')');
        return sb.toString();
    }
}
