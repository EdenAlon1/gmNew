package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajr {
    public final Executor a;
    public int b = 1;
    private final agj c;
    private final asa d;
    private final boolean e;
    private final bfx f;
    private final ScheduledExecutorService g;
    private final boolean h;

    public ajr(agj agjVar, final apd apdVar, bfx bfxVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.c = agjVar;
        Integer num = (Integer) apdVar.c(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.h = num != null && num.intValue() == 2;
        this.a = executor;
        this.g = scheduledExecutorService;
        this.f = bfxVar;
        this.d = new asa(bfxVar);
        apdVar.getClass();
        this.e = arg.a(new arc() { // from class: aia
            @Override // defpackage.arc
            public final Object a(CameraCharacteristics.Key key) {
                return apd.this.c(key);
            }
        });
    }

    static ListenableFuture b(final agj agjVar, aiu aiuVar) {
        final aiv aivVar = new aiv(aiuVar);
        agjVar.o(aivVar);
        ListenableFuture listenableFuture = aivVar.b;
        listenableFuture.b(new Runnable() { // from class: ahz
            @Override // java.lang.Runnable
            public final void run() {
                agj.this.z(aivVar);
            }
        }, agjVar.b);
        return listenableFuture;
    }

    static ListenableFuture c(long j, ScheduledExecutorService scheduledExecutorService, agj agjVar, aiu aiuVar) {
        return bkj.k(TimeUnit.NANOSECONDS.toMillis(j), scheduledExecutorService, b(agjVar, aiuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00d2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean d(android.hardware.camera2.TotalCaptureResult r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajr.d(android.hardware.camera2.TotalCaptureResult, boolean):boolean");
    }

    static boolean e(int i, TotalCaptureResult totalCaptureResult) {
        avw.a("Camera2CapturePipeline", a.h(i, "isFlashRequired: flashMode = "));
        if (i == 0) {
            Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
            Objects.toString(num);
            avw.a("Camera2CapturePipeline", "isFlashRequired: aeState = ".concat(String.valueOf(num)));
            return num != null && num.intValue() == 4;
        }
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new AssertionError(i);
            }
        }
        return true;
    }

    final air a(int i, int i2, int i3) {
        boolean z;
        int i4;
        arm armVar = new arm(this.f);
        air airVar = new air(this.b, this.a, this.g, this.c, this.h, armVar);
        if (i == 0) {
            airVar.b(new aie(this.c));
            i = 0;
        }
        if (i2 == 3) {
            airVar.b(new ajk(this.c, this.a, this.g, new arz(this.f)));
        } else if (this.e) {
            boolean z2 = this.d.a;
            if (z2 || this.b == 3 || i3 == 1) {
                if (!z2) {
                    int i5 = this.c.i.b.get();
                    avw.a("Camera2CameraControlImp", a.h(i5, "isInVideoUsage: mVideoUsageControl value = "));
                    if (i5 <= 0) {
                        z = true;
                        i4 = i2;
                        airVar.b(new ajq(this.c, i4, this.a, this.g, z));
                        avw.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i + ", flashMode = " + i4 + ", flashType = " + i3 + ", pipeline tasks = " + airVar.i);
                        return airVar;
                    }
                }
                z = false;
                i4 = i2;
                airVar.b(new ajq(this.c, i4, this.a, this.g, z));
                avw.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i + ", flashMode = " + i4 + ", flashType = " + i3 + ", pipeline tasks = " + airVar.i);
                return airVar;
            }
            airVar.b(new aid(this.c, i2, armVar));
        }
        i4 = i2;
        avw.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i + ", flashMode = " + i4 + ", flashType = " + i3 + ", pipeline tasks = " + airVar.i);
        return airVar;
    }
}
