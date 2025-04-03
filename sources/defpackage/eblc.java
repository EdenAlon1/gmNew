package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eblc extends ebld {
    public final boolean a = true;
    public final emxc b;

    public eblc(boolean z, emxc emxcVar) {
        this.b = emxcVar;
    }

    @Override // defpackage.ebgx
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.ebgx
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebld) {
            ebld ebldVar = (ebld) obj;
            ebldVar.b();
            if (this.b.equals(ebldVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 375623332;
    }

    public final String toString() {
        return "UseWithoutAnAccountActionImpl{showForUnicorn=true, availabilityChecker=" + String.valueOf(this.b) + "}";
    }
}
