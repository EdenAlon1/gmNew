package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class qgt implements qgw {
    public final String a;

    public final boolean equals(Object obj) {
        return (obj instanceof qgt) && ffkj.e(this.a, ((qgt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "JsonString(jsonString=" + this.a + ")";
    }
}
