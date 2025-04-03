package defpackage;

import io.grpc.Status;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyp {
    public static Status a(fdyn fdynVar) {
        fdynVar.getClass();
        if (!fdynVar.i()) {
            return null;
        }
        Throwable c = fdynVar.c();
        if (c == null) {
            return Status.c.withDescription("io.grpc.Context was cancelled without error");
        }
        if (c instanceof TimeoutException) {
            return Status.f.withDescription(c.getMessage()).d(c);
        }
        Status c2 = Status.c(c);
        return (Status.Code.UNKNOWN.equals(c2.getCode()) && c2.t == c) ? Status.c.withDescription("Context cancelled").d(c) : c2.d(c);
    }
}
