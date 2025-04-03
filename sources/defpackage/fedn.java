package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fedn extends RuntimeException {
    private static final long serialVersionUID = 1950934672280720624L;
    public final Status a;
    public final febo b;

    public fedn(Status status) {
        this(status, null);
    }

    public fedn(Status status, febo feboVar) {
        super(Status.e(status), status.t);
        this.a = status;
        this.b = feboVar;
    }
}
