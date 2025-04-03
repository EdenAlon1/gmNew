package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qdh {
    public final Object a;
    public final Throwable b;

    public qdh(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdh)) {
            return false;
        }
        qdh qdhVar = (qdh) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(qdhVar.a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || qdhVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public qdh(Throwable th) {
        this.b = th;
        this.a = null;
    }
}
