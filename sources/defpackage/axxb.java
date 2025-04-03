package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axxb {
    public final Uri a;
    public final String[] b;
    public final ekrb c;
    public final ffji d;

    public axxb(Uri uri, String[] strArr, ekrb ekrbVar, ffji ffjiVar) {
        this.a = uri;
        this.b = strArr;
        this.c = ekrbVar;
        this.d = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof axxb)) {
            return false;
        }
        axxb axxbVar = (axxb) obj;
        return ffkj.e(this.a, axxbVar.a) && ffkj.e(this.b, axxbVar.b) && ffkj.e(this.c, axxbVar.c) && ffkj.e(this.d, axxbVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + Arrays.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "QueryParameters(uri=" + this.a + ", projection=" + Arrays.toString(this.b) + ", selection=" + this.c + ", parser=" + this.d + ")";
    }
}
