package defpackage;

import android.content.ComponentName;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfwd {
    public final String a;
    public final String b;
    public final ComponentName c;
    public final int d;
    public final boolean e;

    public dfwd(ComponentName componentName, int i) {
        this.a = null;
        this.b = null;
        dfwv.n(componentName);
        this.c = componentName;
        this.d = i;
        this.e = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfwd)) {
            return false;
        }
        dfwd dfwdVar = (dfwd) obj;
        return dfwq.a(this.a, dfwdVar.a) && dfwq.a(this.b, dfwdVar.b) && dfwq.a(this.c, dfwdVar.c) && this.d == dfwdVar.d && this.e == dfwdVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        dfwv.n(this.c);
        return this.c.flattenToString();
    }

    public dfwd(String str, String str2, int i, boolean z) {
        dfwv.l(str);
        this.a = str;
        dfwv.l(str2);
        this.b = str2;
        this.c = null;
        this.d = i;
        this.e = z;
    }
}
