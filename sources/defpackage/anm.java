package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anm {
    public final agj a;
    public final llg b;
    public final llg c;
    public final boolean d;
    public final Executor e;
    public boolean f;
    public final int g;
    kfb h;
    boolean i;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
    
        if (r3.intValue() > 1) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public anm(defpackage.agj r5, final defpackage.apd r6, java.util.concurrent.Executor r7) {
        /*
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.e = r7
            r6.getClass()
            ank r7 = new ank
            r7.<init>()
            boolean r7 = defpackage.arg.a(r7)
            r4.d = r7
            boolean r0 = r6.d()
            r1 = 0
            if (r0 == 0) goto L43
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r0 < r2) goto L43
            boolean r0 = r6.d()
            r3 = 0
            if (r0 == 0) goto L38
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L38
            android.hardware.camera2.CameraCharacteristics$Key r0 = defpackage.agj$$ExternalSyntheticApiModelOutline0.m()
            java.lang.Object r0 = r6.c(r0)
            r3 = r0
            java.lang.Integer r3 = (java.lang.Integer) r3
        L38:
            if (r3 != 0) goto L3b
            goto L43
        L3b:
            int r0 = r3.intValue()
            r2 = 1
            if (r0 <= r2) goto L43
            goto L44
        L43:
            r2 = r1
        L44:
            if (r7 == 0) goto L4d
            if (r2 == 0) goto L4d
            int r6 = r6.a()
            goto L4e
        L4d:
            r6 = r1
        L4e:
            r4.g = r6
            llg r7 = new llg
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.<init>(r0)
            r4.b = r7
            llg r7 = new llg
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r6)
            r4.c = r7
            anl r6 = new anl
            r6.<init>()
            r5.o(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anm.<init>(agj, apd, java.util.concurrent.Executor):void");
    }

    public static final void c(llg llgVar, Object obj) {
        if (biw.d()) {
            llgVar.m(obj);
        } else {
            llgVar.j(obj);
        }
    }

    final void a(kfb kfbVar, int i) {
        if (!this.d) {
            if (kfbVar != null) {
                kfbVar.c(new IllegalStateException("No flash unit"));
                return;
            }
            return;
        }
        if (!this.f) {
            b(0);
            if (kfbVar != null) {
                kfbVar.c(new atb("Camera is not active."));
                return;
            }
            return;
        }
        boolean z = this.a.k;
        this.i = i != 0;
        this.a.w(i);
        b(i);
        kfb kfbVar2 = this.h;
        if (kfbVar2 != null) {
            kfbVar2.c(new atb("There is a new enableTorch being set"));
        }
        this.h = kfbVar;
    }

    public final void b(int i) {
        c(this.b, Integer.valueOf(i != 1 ? 0 : 1));
    }
}
