package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes4.dex */
public final class djrq {
    public final int a;

    public static String a(int i) {
        return a.f(i, "SubscriptionId(idValue=", ")");
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof djrq) && this.a == ((djrq) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
