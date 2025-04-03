package io.grpc;

import defpackage.febo;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class StatusException extends Exception {
    private static final long serialVersionUID = -660954903976144640L;
    public final Status a;
    public final febo b;

    public StatusException(Status status) {
        this(status, null);
    }

    public StatusException(Status status, febo feboVar) {
        super(Status.e(status), status.t);
        this.a = status;
        this.b = feboVar;
    }
}
