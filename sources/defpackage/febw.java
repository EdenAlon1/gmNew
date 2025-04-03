package defpackage;

import io.grpc.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febw {
    public final Status a;
    public final Object b;

    public febw(Object obj) {
        this.b = obj;
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            febw febwVar = (febw) obj;
            if (emxb.a(this.a, febwVar.a) && emxb.a(this.b, febwVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        if (this.b != null) {
            emwz b = emxa.b(this);
            b.b("config", this.b);
            return b.toString();
        }
        emwz b2 = emxa.b(this);
        b2.b("error", this.a);
        return b2.toString();
    }

    public febw(Status status) {
        this.b = null;
        this.a = status;
        emxf.f(!status.f(), "cannot use OK status: %s", status);
    }
}
