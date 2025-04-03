package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyd {
    public final fdyc a;
    public final Status b;

    public fdyd(fdyc fdycVar, Status status) {
        fdycVar.getClass();
        this.a = fdycVar;
        status.getClass();
        this.b = status;
    }

    public static fdyd a(fdyc fdycVar) {
        emxf.b(fdycVar != fdyc.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new fdyd(fdycVar, Status.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fdyd)) {
            return false;
        }
        fdyd fdydVar = (fdyd) obj;
        return this.a.equals(fdydVar.a) && this.b.equals(fdydVar.b);
    }

    public final int hashCode() {
        Status status = this.b;
        return status.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        Status status = this.b;
        if (status.f()) {
            return this.a.toString();
        }
        return this.a.toString() + "(" + status.toString() + ")";
    }
}
