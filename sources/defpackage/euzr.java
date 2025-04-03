package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euzr extends evag {
    public final enip a;

    public euzr(enip enipVar) {
        this.a = enipVar;
    }

    @Override // defpackage.evag
    public final enip a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evag) {
            return this.a.equals(((evag) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "GrpcServiceConfig{grpcMethodConfigs=" + this.a.toString() + "}";
    }
}
