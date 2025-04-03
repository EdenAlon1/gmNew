package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfrz {
    public final dfqt a;
    private final int b;
    private final dfqp c;
    private final String d;

    public dfrz(dfqt dfqtVar, dfqp dfqpVar, String str) {
        this.a = dfqtVar;
        this.c = dfqpVar;
        this.d = str;
        this.b = Arrays.hashCode(new Object[]{dfqtVar, dfqpVar, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfrz)) {
            return false;
        }
        dfrz dfrzVar = (dfrz) obj;
        return dfwq.a(this.a, dfrzVar.a) && dfwq.a(this.c, dfrzVar.c) && dfwq.a(this.d, dfrzVar.d);
    }

    public final int hashCode() {
        return this.b;
    }
}
