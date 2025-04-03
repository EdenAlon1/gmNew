package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class qgu implements qgw {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof qgu) && this.a == ((qgu) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "RawRes(resId=" + this.a + ")";
    }
}
