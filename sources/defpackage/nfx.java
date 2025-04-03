package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfx extends ngd {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String[] d;
    private final ngd[] e;

    public nfx(String str, boolean z, boolean z2, String[] strArr, ngd[] ngdVarArr) {
        super("CTOC");
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = strArr;
        this.e = ngdVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nfx nfxVar = (nfx) obj;
            if (this.b == nfxVar.b && this.c == nfxVar.c) {
                String str = this.a;
                String str2 = nfxVar.a;
                int i = lvf.a;
                if (Objects.equals(str, str2) && Arrays.equals(this.d, nfxVar.d) && Arrays.equals(this.e, nfxVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.b ? 1 : 0) + 527) * 31) + (this.c ? 1 : 0)) * 31) + this.a.hashCode();
    }
}
