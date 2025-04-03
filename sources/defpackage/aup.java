package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ImageWriter;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class aup implements beu {
    public volatile int a;
    public volatile boolean c;
    public volatile boolean d;
    public awt e;
    ByteBuffer f;
    ByteBuffer g;
    ByteBuffer h;
    ByteBuffer i;
    ByteBuffer j;
    ByteBuffer k;
    public final Object l;
    protected boolean m;
    private volatile int n;
    private ImageWriter o;
    private Matrix q;
    public volatile int b = 1;
    private Rect p = new Rect();

    public aup() {
        new Rect();
        this.q = new Matrix();
        new Matrix();
        this.l = new Object();
        this.m = true;
    }

    @Override // defpackage.beu
    public final void a(bev bevVar) {
        try {
            avr b = b(bevVar);
            if (b != null) {
                e(b);
            }
        } catch (IllegalStateException e) {
            avw.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public abstract avr b(bev bevVar);

    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0052 A[Catch: all -> 0x0128, TryCatch #0 {, blocks: (B:7:0x000c, B:10:0x0013, B:13:0x0018, B:23:0x0043, B:25:0x0052, B:27:0x0056, B:28:0x0059, B:31:0x006b, B:33:0x0070, B:35:0x011a, B:40:0x0074, B:42:0x0079, B:45:0x007e, B:47:0x0082, B:49:0x0086, B:50:0x0099, B:52:0x009d, B:53:0x00ac, B:55:0x00b5, B:56:0x00c6, B:58:0x00cf, B:59:0x00e0, B:61:0x00e9, B:63:0x00ed, B:64:0x00fc, B:66:0x0105, B:67:0x0115), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.common.util.concurrent.ListenableFuture c(defpackage.avr r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aup.c(avr):com.google.common.util.concurrent.ListenableFuture");
    }

    public abstract void d();

    public abstract void e(avr avrVar);

    final void f(Matrix matrix) {
        synchronized (this.l) {
            this.q = matrix;
            new Matrix(this.q);
        }
    }

    final void g(Rect rect) {
        synchronized (this.l) {
            this.p = rect;
            new Rect(this.p);
        }
    }
}
