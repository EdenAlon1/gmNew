package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class euw {
    public static final euw a = new euw(0, null, 0, 0, 127);
    public final int b;
    public final int c;
    public final int d;
    private final Boolean e;
    private final jvm f;
    private final Boolean g;
    private final jws h;

    public /* synthetic */ euw(int i, Boolean bool, int i2, int i3, int i4) {
        this.b = 1 == (i4 & 1) ? -1 : i;
        this.e = (i4 & 2) != 0 ? null : bool;
        this.c = (i4 & 4) != 0 ? 0 : i2;
        this.d = (i4 & 8) != 0 ? -1 : i3;
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final juw a(boolean z) {
        int i;
        boolean z2;
        jva jvaVar = new jva(this.b);
        if (true == jva.b(jvaVar.a, -1)) {
            jvaVar = null;
        }
        int i2 = jvaVar != null ? jvaVar.a : 0;
        Boolean bool = this.e;
        if (bool != null) {
            bool.booleanValue();
            i = -1;
            z2 = false;
        } else {
            i = -1;
            z2 = true;
        }
        jvb jvbVar = new jvb(this.c);
        if (true == jvb.b(jvbVar.a, 0)) {
            jvbVar = null;
        }
        int i3 = jvbVar != null ? jvbVar.a : 1;
        juu juuVar = new juu(this.d);
        juu juuVar2 = true != juu.b(juuVar.a, i) ? juuVar : null;
        return new juw(z, i2, z2, i3, juuVar2 != null ? juuVar2.a : 1, jws.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euw)) {
            return false;
        }
        euw euwVar = (euw) obj;
        if (!jva.b(this.b, euwVar.b) || !ffkj.e(this.e, euwVar.e) || !jvb.b(this.c, euwVar.c) || !juu.b(this.d, euwVar.d)) {
            return false;
        }
        jvm jvmVar = euwVar.f;
        if (!ffkj.e(null, null)) {
            return false;
        }
        Boolean bool = euwVar.g;
        if (!ffkj.e(null, null)) {
            return false;
        }
        jws jwsVar = euwVar.h;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        Boolean bool = this.e;
        return ((((((this.b * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.c) * 31) + this.d) * 29791;
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) jva.a(this.b)) + ", autoCorrectEnabled=" + this.e + ", keyboardType=" + ((Object) jvb.a(this.c)) + ", imeAction=" + ((Object) juu.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }
}
