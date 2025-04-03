package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csvs {
    public static elfl a(elfl elflVar) {
        return elflVar.h(new emwl() { // from class: csvp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, erpp.a);
    }

    public static elfl b(elfl elflVar, final emyl emylVar, ScheduledExecutorService scheduledExecutorService, Duration duration) {
        return elflVar.j(duration.toMillis(), TimeUnit.MILLISECONDS, scheduledExecutorService).f(TimeoutException.class, new eroh() { // from class: csvq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return (ListenableFuture) emyl.this.get();
            }
        }, scheduledExecutorService);
    }

    @Deprecated
    public static void c(ListenableFuture listenableFuture, String str, String str2) {
        elfr.l(listenableFuture, new csvr(str, str2), erpp.a);
    }
}
