package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crqk {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final cugj e;
    public final boolean f;
    public final byyt g;
    public final int h;
    public final int i;
    public final int j;

    public crqk(boolean z, String str, boolean z2, boolean z3, cugj cugjVar, int i, int i2, int i3, boolean z4, byyt byytVar) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
        this.e = cugjVar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.f = z4;
        this.g = byytVar;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (z3 && z4) {
            throw new IllegalArgumentException("We should not have any flows that result in an externally triggered update to be undone, \nas we don't currently have any semantic meaning attached to external updates (ex: we \nreceive updates to the system block list by receiving the whole list, not by receiving an\nintent to block/unblock/undo). As such, it's unclear what it would mean to undo one of\nthese changes, so calling undo in that case would be a bug");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof crqk)) {
            return false;
        }
        crqk crqkVar = (crqk) obj;
        return this.a == crqkVar.a && ffkj.e(this.b, crqkVar.b) && this.c == crqkVar.c && this.d == crqkVar.d && ffkj.e(this.e, crqkVar.e) && this.h == crqkVar.h && this.i == crqkVar.i && this.j == crqkVar.j && this.f == crqkVar.f && this.g == crqkVar.g;
    }

    public final int hashCode() {
        int a = (crqi.a(this.a) * 31) + this.b.hashCode();
        cugj cugjVar = this.e;
        int a2 = ((((((((((a * 31) + crqi.a(this.c)) * 31) + crqi.a(this.d)) * 31) + (cugjVar == null ? 0 : cugjVar.hashCode())) * 31) + this.h) * 31) + this.i) * 31;
        int i = this.j;
        erfb.c(i);
        int a3 = (((a2 + i) * 31) + crqi.a(this.f)) * 31;
        byyt byytVar = this.g;
        return a3 + (byytVar != null ? byytVar.hashCode() : 0);
    }

    public final String toString() {
        return "BlockRequest(blockStatus=" + this.a + ", normalizedDestination=" + this.b + ", allowConversationArchiving=" + this.c + ", updateTriggeredExternally=" + this.d + ", metadata=" + this.e + ", scope=" + ((Object) erfd.c(this.h)) + ", entryPoint=" + ((Object) erfc.b(this.i)) + ", dialog=" + ((Object) erfb.b(this.j)) + ", isUndo=" + this.f + ", archiveStatusForUndo=" + this.g + ")";
    }
}
