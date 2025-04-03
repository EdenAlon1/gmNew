package defpackage;

import android.util.ArrayMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agf extends bbt {
    final Set a = new HashSet();
    final Map b = new ArrayMap();

    @Override // defpackage.bbt
    public final void a(final int i) {
        for (final bbt bbtVar : this.a) {
            try {
                ((Executor) this.b.get(bbtVar)).execute(new Runnable() { // from class: age
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbt.this.a(i);
                    }
                });
            } catch (RejectedExecutionException e) {
                avw.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
            }
        }
    }

    @Override // defpackage.bbt
    public final void b(final int i, final bcd bcdVar) {
        for (final bbt bbtVar : this.a) {
            try {
                ((Executor) this.b.get(bbtVar)).execute(new Runnable() { // from class: agd
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbt.this.b(i, bcdVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                avw.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
            }
        }
    }

    @Override // defpackage.bbt
    public final void c(final int i, final bbx bbxVar) {
        for (final bbt bbtVar : this.a) {
            try {
                ((Executor) this.b.get(bbtVar)).execute(new Runnable() { // from class: agc
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbt.this.c(i, bbxVar);
                    }
                });
            } catch (RejectedExecutionException e) {
                avw.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
            }
        }
    }
}
