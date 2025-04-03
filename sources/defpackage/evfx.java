package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evfx {
    public final Status a;
    public final febo b;

    public evfx(Status status, febo feboVar) {
        emxf.m(!status.f(), "Error status must not be OK");
        this.a = status;
        this.b = feboVar;
    }
}
