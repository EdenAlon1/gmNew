package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmtd {
    private final boolean a;

    public dmtd() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmtd)) {
            return false;
        }
        boolean z = ((dmtd) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=false)";
    }

    public dmtd(byte[] bArr) {
        this.a = false;
    }

    public /* synthetic */ dmtd(char[] cArr) {
        this((byte[]) null);
    }
}
