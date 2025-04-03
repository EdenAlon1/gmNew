package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrp implements jtg {
    public final int a;

    public jrp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jrp) && this.a == ((jrp) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ')';
    }
}
