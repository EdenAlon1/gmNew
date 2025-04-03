package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwlg {
    public final Uri a;
    public final int b;
    public final int c;
    public final boolean d;
    private final int e;

    public dwlg(Uri uri, int i, int i2, boolean z, int i3) {
        uri.getClass();
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dwlg)) {
            return false;
        }
        dwlg dwlgVar = (dwlg) obj;
        return ffkj.e(this.a, dwlgVar.a) && this.b == dwlgVar.b && this.c == dwlgVar.c && this.d == dwlgVar.d && this.e == dwlgVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        return ((((((hashCode + this.b) * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "FontInfo(uri=" + this.a + ", ttcIndex=" + this.b + ", weight=" + this.c + ", isItalic=" + this.d + ", resultCode=" + this.e + ")";
    }
}
