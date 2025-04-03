package defpackage;

import android.net.Uri;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class bsv implements AutoCloseable {
    public final bht d = bht.a();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicReference f = new AtomicReference(null);
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference(new ksp() { // from class: bsr
        @Override // defpackage.ksp
        public final void accept(Object obj) {
        }
    });
    private final AtomicBoolean a = new AtomicBoolean(false);
    public final bfi i = new bfi(false);

    public static bsv g(bri briVar, long j) {
        bqr bqrVar = new bqr(briVar.b, briVar.e, briVar.d, briVar.f, j);
        ((bsv) bqrVar).a.set(false);
        return bqrVar;
    }

    private final void l(ksp kspVar, Uri uri) {
        if (kspVar == null) {
            throw new AssertionError(a.i(this, "Recording ", " has already been finalized"));
        }
        this.d.b();
        kspVar.accept(uri);
    }

    public abstract long a();

    public abstract brg b();

    public abstract ksp c();

    @Override // java.lang.AutoCloseable
    public final void close() {
        h(Uri.EMPTY);
    }

    public abstract Executor d();

    public abstract boolean e();

    public abstract void f();

    protected final void finalize() {
        try {
            this.d.d();
            ksp kspVar = (ksp) this.h.getAndSet(null);
            if (kspVar != null) {
                l(kspVar, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    final void h(Uri uri) {
        if (this.e.get()) {
            l((ksp) this.h.getAndSet(null), uri);
        }
    }

    final void i(bur burVar) {
        j(burVar, true);
    }

    final void j(final bur burVar, boolean z) {
        String str;
        if (!Objects.equals(burVar.c, b())) {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + burVar.c + ", Expected: " + b() + "]");
        }
        if (z) {
            boolean z2 = burVar instanceof bum;
            String concat = "Sending VideoRecordEvent ".concat(String.valueOf(burVar.getClass().getSimpleName()));
            if (z2) {
                bum bumVar = (bum) burVar;
                if (bumVar.a()) {
                    switch (bumVar.a) {
                        case 0:
                            str = "ERROR_NONE";
                            break;
                        case 1:
                            str = "ERROR_UNKNOWN";
                            break;
                        case 2:
                            str = "ERROR_FILE_SIZE_LIMIT_REACHED";
                            break;
                        case 3:
                            str = "ERROR_INSUFFICIENT_STORAGE";
                            break;
                        case 4:
                            str = "ERROR_SOURCE_INACTIVE";
                            break;
                        case 5:
                            str = "ERROR_INVALID_OUTPUT_OPTIONS";
                            break;
                        case 6:
                            str = "ERROR_ENCODING_FAILED";
                            break;
                        case 7:
                            str = "ERROR_RECORDER_ERROR";
                            break;
                        case 8:
                            str = "ERROR_NO_VALID_DATA";
                            break;
                        case 9:
                            str = "ERROR_DURATION_LIMIT_REACHED";
                            break;
                        default:
                            str = "ERROR_RECORDING_GARBAGE_COLLECTED";
                            break;
                    }
                    concat = concat.concat(String.valueOf(String.format(" [error: %s]", str)));
                }
            }
            avw.a("Recorder", concat);
        }
        if ((burVar instanceof bup) || (burVar instanceof buo)) {
            this.i.e(true);
        } else if ((burVar instanceof bun) || (burVar instanceof bum)) {
            this.i.e(false);
        }
        if (d() == null || c() == null) {
            return;
        }
        try {
            d().execute(new Runnable() { // from class: bsq
                @Override // java.lang.Runnable
                public final void run() {
                    bsv.this.c().accept(burVar);
                }
            });
        } catch (RejectedExecutionException e) {
            avw.d("Recorder", "The callback executor is invalid.", e);
        }
    }

    final boolean k() {
        return this.a.get();
    }
}
