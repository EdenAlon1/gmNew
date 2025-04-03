package defpackage;

import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafo {
    public static Object a(StatusOr statusOr) {
        if (statusOr.hasValue) {
            return statusOr.value;
        }
        throw new fedn(statusOr.status);
    }

    public static void b(Status status) {
        if (!status.f()) {
            throw new fedn(status);
        }
    }
}
