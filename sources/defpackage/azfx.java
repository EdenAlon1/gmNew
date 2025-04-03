package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azfx {
    public final azcr a;
    private final int b;

    public azfx(azcr azcrVar, byte[] bArr) {
        azcrVar.getClass();
        this.a = azcrVar;
        this.b = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azfx)) {
            return false;
        }
        azfx azfxVar = (azfx) obj;
        if (!ffkj.e(this.a, azfxVar.a)) {
            return false;
        }
        int i = azfxVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 2;
    }

    public final String toString() {
        return "GroupMember(destinationToken=" + this.a + ", role=MEMBER)";
    }

    public /* synthetic */ azfx(azcr azcrVar) {
        this(azcrVar, null);
    }
}
