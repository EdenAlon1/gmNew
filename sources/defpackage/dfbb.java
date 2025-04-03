package defpackage;

import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class dfbb implements dfqp {
    public static final dfbb a = new dfbb(new dfba());
    public final String b = null;
    public final boolean c;
    public final String d;

    public dfbb(dfba dfbaVar) {
        this.c = dfbaVar.a.booleanValue();
        this.d = dfbaVar.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dfbb)) {
            return false;
        }
        dfbb dfbbVar = (dfbb) obj;
        String str = dfbbVar.b;
        return dfwq.a(null, null) && this.c == dfbbVar.c && dfwq.a(this.d, dfbbVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.c), this.d});
    }
}
