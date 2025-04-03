package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvt implements Serializable {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public ccvt(String str, int i, int i2, int i3) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccvt)) {
            return false;
        }
        ccvt ccvtVar = (ccvt) obj;
        if (!ffkj.e(this.a, ccvtVar.a) || this.b != ccvtVar.b || this.c != ccvtVar.c) {
            return false;
        }
        boolean z = ccvtVar.d;
        return this.e == ccvtVar.e;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + 1231) * 31) + this.e;
    }

    public final String toString() {
        return "WorkHandlerExecutionContext(workHandlerId=" + this.a + ", workHandlerFlags=" + this.b + ", attemptCount=" + this.c + ", canRetry=true, tableType=" + this.e + ")";
    }
}
