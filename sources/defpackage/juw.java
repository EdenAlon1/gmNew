package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class juw {
    public static final juw a = new juw(false, 0, true, 1, 1, jws.a);
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final int f;
    public final jws g;
    private final jvm h = null;

    public /* synthetic */ juw(boolean z, int i, boolean z2, int i2, int i3, jws jwsVar) {
        this.b = z;
        this.c = i;
        this.d = z2;
        this.e = i2;
        this.f = i3;
        this.g = jwsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juw)) {
            return false;
        }
        juw juwVar = (juw) obj;
        if (this.b != juwVar.b || !jva.b(this.c, juwVar.c) || this.d != juwVar.d || !jvb.b(this.e, juwVar.e) || !juu.b(this.f, juwVar.f)) {
            return false;
        }
        jvm jvmVar = juwVar.h;
        return ffkj.e(null, null) && ffkj.e(this.g, juwVar.g);
    }

    public final int hashCode() {
        return (((((((((juv.a(this.b) * 31) + this.c) * 31) + juv.a(this.d)) * 31) + this.e) * 31) + this.f) * 961) + this.g.hashCode();
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.b + ", capitalization=" + ((Object) jva.a(this.c)) + ", autoCorrect=" + this.d + ", keyboardType=" + ((Object) jvb.a(this.e)) + ", imeAction=" + ((Object) juu.a(this.f)) + ", platformImeOptions=null, hintLocales=" + this.g + ')';
    }
}
