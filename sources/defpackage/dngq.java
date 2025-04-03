package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dngq {
    private final boolean a;

    public dngq() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dngq)) {
            return false;
        }
        boolean z = ((dngq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableCoolRanchPhase3=false)";
    }

    public dngq(byte[] bArr) {
        this.a = false;
    }

    public /* synthetic */ dngq(char[] cArr) {
        this((byte[]) null);
    }
}
