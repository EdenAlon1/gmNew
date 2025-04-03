package defpackage;

import android.content.Context;
import android.media.MediaActionSound;
import j$.util.Optional;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpui {
    public static final drkq a = drkq.a;
    public final ffsk b;
    public final drpd c;
    public final dpnj d;
    public final avk e;
    public final dpfr f;
    public final MediaActionSound g;
    private final Context h;
    private final Executor i;
    private final Executor j;
    private final dqhs k;
    private final ffbz l;

    public dpui(Context context, Executor executor, Executor executor2, ffsk ffskVar, Optional optional, dqhs dqhsVar, drpd drpdVar, dpnj dpnjVar) {
        this.h = context;
        this.i = executor;
        this.j = executor2;
        this.b = ffskVar;
        this.k = dqhsVar;
        this.c = drpdVar;
        this.d = dpnjVar;
        avc avcVar = new avc();
        avcVar.i(executor2);
        this.e = avcVar.b();
        this.f = (dpfr) fflm.b(optional);
        this.g = new MediaActionSound();
        this.l = ffca.a(new ffix() { // from class: dpua
            @Override // defpackage.ffix
            public final Object invoke() {
                dpui dpuiVar = dpui.this;
                return ffqy.d(dpuiVar.b, null, null, new dpue(dpuiVar, null), 3);
            }
        });
        d().z();
    }

    private final ffud d() {
        return (ffud) this.l.a();
    }

    public final dpgo a(atl atlVar, int i) {
        int i2;
        dpgl dpglVar = dpgl.a;
        Integer b = atlVar.b();
        int i3 = 3;
        if (b != null && b.intValue() == 1) {
            i2 = 3;
            i3 = 2;
        } else if (b != null && b.intValue() == 0) {
            i2 = 3;
        } else {
            i2 = 3;
            i3 = 1;
        }
        return new dpgo(dpglVar, i3, true != dskj.f(this.h) ? i2 : 2, false, Integer.valueOf(i), null, 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.atl r19, int r20, defpackage.ffgu r21) {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpui.b(atl, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffji r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.dpuh
            if (r0 == 0) goto L13
            r0 = r7
            dpuh r0 = (defpackage.dpuh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dpuh r0 = new dpuh
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dpub r6 = r0.e
            dpui r0 = r0.d
            defpackage.ffci.b(r7)
            goto L6f
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            r7 = 0
            int r2 = android.hardware.Camera.getNumberOfCameras()
            ffmj r7 = defpackage.ffmk.q(r7, r2)
            ffev r7 = r7.iterator()
        L43:
            r2 = r7
            ffmi r2 = (defpackage.ffmi) r2
            boolean r2 = r2.a
            if (r2 == 0) goto L74
            int r2 = r7.a()
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.RuntimeException -> L5a
            r4.<init>()     // Catch: java.lang.RuntimeException -> L5a
            android.hardware.Camera.getCameraInfo(r2, r4)     // Catch: java.lang.RuntimeException -> L5a
            boolean r2 = r4.canDisableShutterSound     // Catch: java.lang.RuntimeException -> L5a
            if (r2 != 0) goto L43
        L5a:
            ffud r7 = r5.d()
            r0.d = r5
            r2 = r6
            dpub r2 = (defpackage.dpub) r2
            r0.e = r2
            r0.c = r3
            java.lang.Object r7 = r7.o(r0)
            if (r7 != r1) goto L6e
            return r1
        L6e:
            r0 = r5
        L6f:
            android.media.MediaActionSound r7 = r0.g
            r6.invoke(r7)
        L74:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dpui.c(ffji, ffgu):java.lang.Object");
    }
}
