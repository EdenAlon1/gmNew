package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fejw {
    public String a = "unknown-authority";
    public fdxd b = fdxd.a;
    public String c;
    public fdzl d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof fejw)) {
            return false;
        }
        fejw fejwVar = (fejw) obj;
        return this.a.equals(fejwVar.a) && this.b.equals(fejwVar.b) && emxb.a(this.c, fejwVar.c) && emxb.a(this.d, fejwVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
