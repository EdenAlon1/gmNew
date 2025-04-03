package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aawt {
    public final boolean a;
    public final aaxf b;
    public final aaxg c;
    public final boolean d;

    public aawt() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aawt)) {
            return false;
        }
        aawt aawtVar = (aawt) obj;
        return this.a == aawtVar.a && this.b == aawtVar.b && ffkj.e(this.c, aawtVar.c) && this.d == aawtVar.d;
    }

    public final int hashCode() {
        int a = (aaws.a(this.a) * 31) + this.b.hashCode();
        aaxg aaxgVar = this.c;
        return (((a * 31) + (aaxgVar == null ? 0 : aaxgVar.hashCode())) * 31) + aaws.a(this.d);
    }

    public final String toString() {
        return "MessageSelectionData(isSelected=" + this.a + ", selectionMode=" + this.b + ", offset=" + this.c + ", isOnFirstSelection=" + this.d + ")";
    }

    public aawt(boolean z, aaxf aaxfVar, aaxg aaxgVar, boolean z2) {
        aaxfVar.getClass();
        this.a = z;
        this.b = aaxfVar;
        this.c = aaxgVar;
        this.d = z2;
    }

    public /* synthetic */ aawt(byte[] bArr) {
        this(false, aaxf.a, null, false);
    }
}
