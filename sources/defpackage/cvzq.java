package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzq {
    private final boolean a;

    public cvzq() {
        this((char[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvzq)) {
            return false;
        }
        boolean z = ((cvzq) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1237;
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=false)";
    }

    public cvzq(byte[] bArr) {
        this.a = false;
    }

    public /* synthetic */ cvzq(char[] cArr) {
        this((byte[]) null);
    }
}
