package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdzo {
    public final String a;
    public final fdzn b;
    public final long c;
    public final feab d;
    public final feab e;

    public fdzo(String str, fdzn fdznVar, long j, feab feabVar) {
        this.a = str;
        fdznVar.getClass();
        this.b = fdznVar;
        this.c = j;
        this.d = null;
        this.e = feabVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fdzo) {
            fdzo fdzoVar = (fdzo) obj;
            if (emxb.a(this.a, fdzoVar.a) && emxb.a(this.b, fdzoVar.b) && this.c == fdzoVar.c) {
                feab feabVar = fdzoVar.d;
                if (emxb.a(null, null) && emxb.a(this.e, fdzoVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Long.valueOf(this.c), null, this.e});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("description", this.a);
        b.b("severity", this.b);
        b.g("timestampNanos", this.c);
        b.b("channelRef", null);
        b.b("subchannelRef", this.e);
        return b.toString();
    }
}
