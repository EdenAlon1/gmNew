package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhgp implements dfqp {
    public final int a;
    private final String b = null;

    public dhgp(dhgo dhgoVar) {
        this.a = dhgoVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dhgp)) {
            return false;
        }
        dhgp dhgpVar = (dhgp) obj;
        if (this.a == dhgpVar.a) {
            String str = dhgpVar.b;
            if (dfwq.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
