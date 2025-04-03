package defpackage;

import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exmn {
    public static final String a = "exmn";
    public exmp b;
    public exmm c;
    public MediaMuxer d;
    public boolean e = false;
    private boolean f;
    private boolean g;

    public exmn(String str) {
        this.d = new MediaMuxer(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0015 A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:11:0x0015, B:12:0x001e, B:14:0x0022, B:20:0x0028, B:22:0x002f, B:25:0x0035, B:26:0x0038, B:28:0x003c, B:29:0x003f, B:32:0x004f, B:33:0x0056, B:34:0x0018, B:36:0x001c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004f A[Catch: all -> 0x0057, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:11:0x0015, B:12:0x001e, B:14:0x0022, B:20:0x0028, B:22:0x002f, B:25:0x0035, B:26:0x0038, B:28:0x003c, B:29:0x003f, B:32:0x004f, B:33:0x0056, B:34:0x0018, B:36:0x001c), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0018 A[Catch: all -> 0x0057, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000e, B:11:0x0015, B:12:0x001e, B:14:0x0022, B:20:0x0028, B:22:0x002f, B:25:0x0035, B:26:0x0038, B:28:0x003c, B:29:0x003f, B:32:0x004f, B:33:0x0056, B:34:0x0018, B:36:0x001c), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final synchronized void a(defpackage.exmo r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            exmp r0 = r3.b     // Catch: java.lang.Throwable -> L57
            r1 = 1
            if (r0 != 0) goto Ld
            exmm r0 = r3.c     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = r1
        Le:
            defpackage.emxf.l(r0)     // Catch: java.lang.Throwable -> L57
            exmp r0 = r3.b     // Catch: java.lang.Throwable -> L57
            if (r4 != r0) goto L18
            r3.g = r1     // Catch: java.lang.Throwable -> L57
            goto L1e
        L18:
            exmm r2 = r3.c     // Catch: java.lang.Throwable -> L57
            if (r4 != r2) goto L1e
            r3.f = r1     // Catch: java.lang.Throwable -> L57
        L1e:
            exmm r4 = r3.c     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L26
            boolean r4 = r3.f     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L2d
        L26:
            if (r0 == 0) goto L2f
            boolean r4 = r3.g     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L2d
            goto L2f
        L2d:
            monitor-exit(r3)
            return
        L2f:
            boolean r4 = r3.e     // Catch: java.lang.Throwable -> L57
            if (r4 != 0) goto L4f
            if (r0 == 0) goto L38
            r0.b()     // Catch: java.lang.Throwable -> L57
        L38:
            exmm r4 = r3.c     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L3f
            r4.b()     // Catch: java.lang.Throwable -> L57
        L3f:
            android.media.MediaMuxer r4 = r3.d     // Catch: java.lang.Throwable -> L57
            r4.start()     // Catch: java.lang.Throwable -> L57
            r3.e = r1     // Catch: java.lang.Throwable -> L57
            java.lang.String r4 = defpackage.exmn.a     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Muxer started."
            android.util.Log.d(r4, r0)     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            return
        L4f:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L57
            java.lang.String r0 = "Muxer has already been started!"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L57
            throw r4     // Catch: java.lang.Throwable -> L57
        L57:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L57
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exmn.a(exmo):void");
    }

    public final synchronized void b() {
        Log.d(a, "Stopping Mp4Encoder");
        exmp exmpVar = this.b;
        if (exmpVar != null) {
            exmpVar.d();
            this.b = null;
        }
        exmm exmmVar = this.c;
        if (exmmVar != null) {
            exmmVar.d();
            this.c = null;
        }
        try {
            MediaMuxer mediaMuxer = this.d;
            if (mediaMuxer != null) {
                mediaMuxer.stop();
                this.d.release();
            }
        } catch (IllegalStateException e) {
            Log.e(a, "Muxer was in an illegal state:".concat(String.valueOf(e.getMessage())));
        }
        this.d = null;
    }

    public final synchronized void c(byte[] bArr, long j) {
        ByteBuffer inputBuffer;
        exmm exmmVar = this.c;
        if (exmmVar != null) {
            emxf.a(exmmVar.j);
            emxf.a(!exmmVar.l);
            for (int i = 0; exmmVar.e() && i < 20; i++) {
                try {
                } catch (IllegalStateException e) {
                    Log.e(exmo.a, "Encoder was in an illegal state:".concat(String.valueOf(e.toString())));
                    return;
                }
            }
            int dequeueInputBuffer = exmmVar.g.dequeueInputBuffer(exmmVar.b);
            if (dequeueInputBuffer == -1) {
                if (exmmVar.f.e) {
                    dequeueInputBuffer = -1;
                }
            }
            if (dequeueInputBuffer != -1 && dequeueInputBuffer >= 0 && (inputBuffer = exmmVar.g.getInputBuffer(dequeueInputBuffer)) != null) {
                inputBuffer.put(bArr);
                long j2 = exmmVar.e;
                if (j < j2) {
                    j = exmmVar.d + j2;
                }
                long j3 = j;
                Log.d(exmo.a, "Track: " + exmmVar.h + " Encoding at pts: " + j3);
                exmmVar.g.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, j3, 0);
            }
        }
    }

    public final synchronized void d() {
        exmp exmpVar = this.b;
        if (exmpVar != null) {
            emxf.a(exmpVar.j);
            emxf.a(!exmpVar.l);
            emxf.a(exmpVar.o);
            exmpVar.e();
        }
    }
}
