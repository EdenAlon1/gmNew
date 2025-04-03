package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jyg {
    public final int a;

    public static String a(int i) {
        return i == 1 ? "LineHeightStyle.Trim.FirstLineTop" : i == 16 ? "LineHeightStyle.Trim.LastLineBottom" : i == 17 ? "LineHeightStyle.Trim.Both" : i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jyg) && this.a == ((jyg) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
