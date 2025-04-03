package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngh extends ngd {
    public final String a;
    public final byte[] b;

    public ngh(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ngh nghVar = (ngh) obj;
            String str = this.a;
            String str2 = nghVar.a;
            int i = lvf.a;
            if (Objects.equals(str, str2) && Arrays.equals(this.b, nghVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b);
    }

    @Override // defpackage.ngd
    public final String toString() {
        return this.f + ": owner=" + this.a;
    }
}
