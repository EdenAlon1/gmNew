package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlr {
    public final int a;

    public xlr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlr) && this.a == ((xlr) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DirectSendIconData(legacyLocationSendIconType=" + this.a + ")";
    }
}
