package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbwq extends cbxe {
    public final etdt a;
    public final byzi b;
    public final Uri c;

    public cbwq(etdt etdtVar, byzi byziVar, Uri uri) {
        this.a = etdtVar;
        this.b = byziVar;
        this.c = uri;
    }

    @Override // defpackage.cbxe
    public final Uri a() {
        return this.c;
    }

    @Override // defpackage.cbxe
    public final byzi b() {
        return this.b;
    }

    @Override // defpackage.cbxe
    public final etdt c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbxe) {
            cbxe cbxeVar = (cbxe) obj;
            if (this.a.equals(cbxeVar.c()) && this.b.equals(cbxeVar.b()) && ((uri = this.c) != null ? uri.equals(cbxeVar.a()) : cbxeVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        Uri uri = this.c;
        return (hashCode * 1000003) ^ (uri == null ? 0 : uri.hashCode());
    }

    public final String toString() {
        Uri uri = this.c;
        byzi byziVar = this.b;
        return "BrandAndVerification{brandInfo=" + this.a.toString() + ", status=" + byziVar.toString() + ", localLogoUri=" + String.valueOf(uri) + "}";
    }
}
