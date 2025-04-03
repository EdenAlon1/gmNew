package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dups {
    public static boolean a(Future future) {
        if (future == null || !future.isDone() || future.isCancelled()) {
            return false;
        }
        try {
            erqt.q(future);
            return true;
        } catch (ExecutionException unused) {
            return false;
        }
    }
}
