package defpackage;

import android.os.Handler;
import android.os.Looper;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyxi {
    public final Handler a = new Handler(Looper.getMainLooper());

    public static boolean a(Status status) {
        if (status == null) {
            return false;
        }
        Status.Code code = Status.Code.OK;
        int ordinal = status.getCode().ordinal();
        return ordinal == 1 || ordinal == 4 || ordinal == 8 || ordinal == 10 || ordinal == 13 || ordinal == 14;
    }
}
