package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feak {
    public static final feak a = new feak(null, Status.b, false);
    public final fean b;
    public final Status c;
    public final boolean d;
    private final fdxs e = null;

    private feak(fean feanVar, Status status, boolean z) {
        this.b = feanVar;
        status.getClass();
        this.c = status;
        this.d = z;
    }

    public static feak a(Status status) {
        emxf.b(!status.f(), "drop status shouldn't be OK");
        return new feak(null, status, true);
    }

    public static feak b(Status status) {
        emxf.b(!status.f(), "error status shouldn't be OK");
        return new feak(null, status, false);
    }

    public static feak c(fean feanVar) {
        return new feak(feanVar, Status.b, false);
    }

    public final boolean d() {
        return (this.b == null && this.c.f()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof feak)) {
            return false;
        }
        feak feakVar = (feak) obj;
        if (emxb.a(this.b, feakVar.b) && emxb.a(this.c, feakVar.c)) {
            fdxs fdxsVar = feakVar.e;
            if (emxb.a(null, null) && this.d == feakVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, null, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("subchannel", this.b);
        b.b("streamTracerFactory", null);
        b.b("status", this.c);
        b.h("drop", this.d);
        b.b("authority-override", null);
        return b.toString();
    }
}
