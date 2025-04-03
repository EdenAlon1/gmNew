package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxd {
    public final int a;
    public nzr b = null;
    public Bundle c = null;

    public nxd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nxd)) {
            return false;
        }
        nxd nxdVar = (nxd) obj;
        if (this.a != nxdVar.a || !ffkj.e(this.b, nxdVar.b)) {
            return false;
        }
        Bundle bundle = this.c;
        Bundle bundle2 = nxdVar.c;
        if (ffkj.e(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !ows.b(bundle, bundle2)) ? false : true;
    }

    public final int hashCode() {
        nzr nzrVar = this.b;
        int hashCode = nzrVar != null ? nzrVar.hashCode() : 0;
        int i = this.a;
        Bundle bundle = this.c;
        int i2 = (i * 31) + hashCode;
        return bundle != null ? (i2 * 31) + ows.a(bundle) : i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(this.a));
        sb.append(")");
        if (this.b != null) {
            sb.append(" navOptions=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
