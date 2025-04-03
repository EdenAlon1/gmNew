package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlbx extends dlaf {
    public final ewev a;
    public final byte[] b;
    public final eyee c;
    public final boolean d;
    public final String e;

    public dlbx(ewev ewevVar, byte[] bArr) {
        ewevVar.getClass();
        this.a = ewevVar;
        this.b = bArr;
        this.c = null;
        this.d = true;
        this.e = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlbx)) {
            return false;
        }
        dlbx dlbxVar = (dlbx) obj;
        if (!ffkj.e(this.a, dlbxVar.a) || !ffkj.e(this.b, dlbxVar.b)) {
            return false;
        }
        eyee eyeeVar = dlbxVar.c;
        if (!ffkj.e(null, null)) {
            return false;
        }
        boolean z = dlbxVar.d;
        String str = dlbxVar.e;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        byte[] bArr = this.b;
        return (((hashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 961) + 1231) * 31;
    }
}
