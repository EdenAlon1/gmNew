package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class faxe {
    public final List a;
    public final String b;
    public final String c;
    public final String d;

    public faxe(List list, String str, String str2, String str3) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof faxe)) {
            return false;
        }
        faxe faxeVar = (faxe) obj;
        return ffkj.e(this.a, faxeVar.a) && ffkj.e(this.b, faxeVar.b) && ffkj.e(this.c, faxeVar.c) && ffkj.e(this.d, faxeVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LottieKeyPath(path=" + this.a + ", cl=" + this.b + ", clDark=" + this.c + ", type=" + this.d + ")";
    }

    public /* synthetic */ faxe(List list, String str, String str2) {
        this(list, str, null, str2);
    }
}
