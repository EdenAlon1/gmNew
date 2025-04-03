package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhp {
    public final emxc a;
    private final emxc b = emux.a;

    public duhp(int i) {
        this.a = emxc.j(Integer.valueOf(i));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof duhp) {
            duhp duhpVar = (duhp) obj;
            if (this.b.equals(duhpVar.b) && this.a.equals(duhpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }

    public final String toString() {
        return ((Integer) ((emxn) this.a).a).toString();
    }
}
