package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mhc {
    public final long a;
    public final float b;
    public final long c;

    public mhc(mhb mhbVar) {
        this.a = mhbVar.a;
        this.b = mhbVar.b;
        this.c = mhbVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhc)) {
            return false;
        }
        mhc mhcVar = (mhc) obj;
        return this.a == mhcVar.a && this.b == mhcVar.b && this.c == mhcVar.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
