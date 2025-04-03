package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccvl implements Serializable {
    public final String a;
    public final ccvt b;
    public final int c;

    public ccvl(String str, int i, ccvt ccvtVar) {
        str.getClass();
        this.a = str;
        this.c = i;
        this.b = ccvtVar;
    }

    public static /* synthetic */ ccvl a(ccvl ccvlVar, String str, ccvt ccvtVar, int i) {
        if ((i & 1) != 0) {
            str = ccvlVar.a;
        }
        int i2 = (i & 2) != 0 ? ccvlVar.c : 0;
        if ((i & 4) != 0) {
            ccvtVar = ccvlVar.b;
        }
        str.getClass();
        if (i2 == 0) {
            throw null;
        }
        ccvtVar.getClass();
        return new ccvl(str, i2, ccvtVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ccvl)) {
            return false;
        }
        ccvl ccvlVar = (ccvl) obj;
        return ffkj.e(this.a, ccvlVar.a) && this.c == ccvlVar.c && ffkj.e(this.b, ccvlVar.b);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "CmsHandlerLoggingContext(bugleRowId=" + this.a + ", backupType=" + ((Object) csfx.a(this.c)) + ", workHandlerContext=" + this.b + ")";
    }
}
