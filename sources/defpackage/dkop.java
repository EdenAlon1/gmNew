package defpackage;

import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkop extends InitializeAndStartRcsTransportRequest {
    private final ezjz a;

    public dkop(ezjz ezjzVar) {
        if (ezjzVar == null) {
            throw new NullPointerException("Null requestProto");
        }
        this.a = ezjzVar;
    }

    @Override // com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest
    public final ezjz a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InitializeAndStartRcsTransportRequest) {
            return this.a.equals(((InitializeAndStartRcsTransportRequest) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "InitializeAndStartRcsTransportRequest{requestProto=" + this.a.toString() + "}";
    }
}
