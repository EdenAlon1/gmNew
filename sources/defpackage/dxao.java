package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxao extends dxaw {
    public final String a;
    public final emxc b;

    public dxao(String str, emxc emxcVar) {
        this.a = str;
        this.b = emxcVar;
    }

    @Override // defpackage.dxaw
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.dxaw
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dxaw) {
            dxaw dxawVar = (dxaw) obj;
            if (this.a.equals(dxawVar.b()) && this.b.equals(dxawVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CheckContentChangeRequest{url=" + this.a + ", cachedETagOptional=" + String.valueOf(this.b) + "}";
    }
}
