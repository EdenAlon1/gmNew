package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhx {
    public final String a;
    public final Bitmap b;

    public bzhx(String str, Bitmap bitmap) {
        str.getClass();
        this.a = str;
        this.b = bitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bzhx)) {
            return false;
        }
        bzhx bzhxVar = (bzhx) obj;
        return ffkj.e(this.a, bzhxVar.a) && ffkj.e(this.b, bzhxVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Bitmap bitmap = this.b;
        return hashCode + (bitmap == null ? 0 : bitmap.hashCode());
    }

    public final String toString() {
        return "GaiaAccountInfo(accountName=" + this.a + ", accountAvatar=" + this.b + ")";
    }
}
