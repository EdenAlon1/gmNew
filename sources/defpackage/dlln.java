package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlln {
    public static ListenableFuture a(Callable callable) {
        errj errjVar = new errj(callable);
        new Thread(errjVar).start();
        return errjVar;
    }
}
