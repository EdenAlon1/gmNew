package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class air {
    public final int b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public final agj e;
    public final arm f;
    public final boolean g;
    public long h = k;
    final List i = new ArrayList();
    public final ais j = new aip(this);
    private static final long k = TimeUnit.SECONDS.toNanos(1);
    public static final long a = TimeUnit.SECONDS.toNanos(5);

    public air(int i, Executor executor, ScheduledExecutorService scheduledExecutorService, agj agjVar, boolean z, arm armVar) {
        this.b = i;
        this.c = executor;
        this.d = scheduledExecutorService;
        this.e = agjVar;
        this.g = z;
        this.f = armVar;
    }

    public final ListenableFuture a(final int i) {
        ListenableFuture b = bkj.b(null);
        if (this.i.isEmpty()) {
            return b;
        }
        return bkj.g(bkj.g(bjv.a(this.j.c() ? ajr.b(this.e, null) : bkj.b(null)), new bjq() { // from class: ail
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                air airVar = air.this;
                TotalCaptureResult totalCaptureResult = (TotalCaptureResult) obj;
                boolean z = airVar.e.k;
                if (ajr.e(i, totalCaptureResult)) {
                    airVar.h = air.a;
                }
                return airVar.j.a(totalCaptureResult);
            }
        }, this.c), new bjq() { // from class: aim
            @Override // defpackage.bjq
            public final ListenableFuture a(Object obj) {
                if (!Boolean.TRUE.equals((Boolean) obj)) {
                    return bkj.b(null);
                }
                air airVar = air.this;
                return ajr.c(airVar.h, airVar.d, airVar.e, new aiu() { // from class: ain
                    @Override // defpackage.aiu
                    public final boolean a(TotalCaptureResult totalCaptureResult) {
                        long j = air.a;
                        return ajr.d(totalCaptureResult, false);
                    }
                });
            }
        }, this.c);
    }

    final void b(ais aisVar) {
        this.i.add(aisVar);
    }

    public final void c() {
        this.j.b();
    }
}
