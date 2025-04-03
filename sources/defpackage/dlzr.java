package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes4.dex */
public final class dlzr {
    public final int a;

    public static void a(int i) {
        if (i < 0 || i >= 101) {
            throw new IllegalArgumentException(a.B(i, " is an invalid Amplitude. Should be between 0 and 100."));
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dlzr) && this.a == ((dlzr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "Amplitude(value=" + this.a + ")";
    }
}
