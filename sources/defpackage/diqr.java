package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class diqr extends diqw {
    public final boolean a;
    public final boolean b;

    public diqr(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.diqw
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.diqw
    @Deprecated
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof diqw) {
            diqw diqwVar = (diqw) obj;
            if (this.a == diqwVar.a() && this.b == diqwVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237);
    }

    public final String toString() {
        return "FileUploadConfigurations{cleanupFileTransferAfterUploadCompletes=" + this.a + ", isFileTransferViaSmsSupported=" + this.b + "}";
    }
}
