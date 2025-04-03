package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egij extends egix {
    public final emxc a;
    public final int b;

    public egij(int i, emxc emxcVar) {
        if (i == 0) {
            throw new NullPointerException("Null entryPoint");
        }
        this.b = i;
        this.a = emxcVar;
    }

    @Override // defpackage.egix
    public final emxc a() {
        return this.a;
    }

    @Override // defpackage.egix
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egix) {
            egix egixVar = (egix) obj;
            if (this.b == egixVar.b() && this.a.equals(egixVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        int i = this.b;
        emxc emxcVar = this.a;
        return "ProfilePhotoMetadata{entryPoint=" + Integer.toString(i - 1) + ", illustrationId=" + emxcVar.toString() + "}";
    }
}
