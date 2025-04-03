package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aila {
    public final int a = 3;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aila)) {
            return false;
        }
        int i = ((aila) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return "HomeArguments(eventSource=MULTI_SHARE)";
    }
}
