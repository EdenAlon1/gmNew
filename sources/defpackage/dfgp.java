package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfgp implements dfqp {
    public final String a;
    private final String b = null;
    private final String c = null;
    private final String d = null;
    private final int e = 0;
    private final String g = null;
    private final boolean f = false;

    public dfgp(dfgo dfgoVar) {
        this.a = dfgoVar.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dfgp)) {
            return false;
        }
        dfgp dfgpVar = (dfgp) obj;
        if (dfwq.a(this.a, dfgpVar.a)) {
            String str = dfgpVar.b;
            if (dfwq.a(null, null)) {
                String str2 = dfgpVar.c;
                if (dfwq.a(null, null)) {
                    String str3 = dfgpVar.d;
                    if (dfwq.a(null, null)) {
                        int i = dfgpVar.e;
                        if (dfwq.a(0, 0)) {
                            String str4 = dfgpVar.g;
                            if (dfwq.a(null, null)) {
                                boolean z = dfgpVar.f;
                                if (dfwq.a(false, false)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, null, null, null, 0, null, false});
    }
}
