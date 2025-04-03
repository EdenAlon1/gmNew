package defpackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bdd implements aya {
    public final Object a;
    public final ayb b;
    public final Map c;
    public int d;
    private final StringBuilder e = new StringBuilder();
    private int f;

    public bdd(ayb aybVar) {
        Object obj = new Object();
        this.a = obj;
        this.c = new HashMap();
        this.f = 1;
        synchronized (obj) {
            this.b = aybVar;
            this.d = this.f;
        }
    }

    public static void c(ata ataVar, bcs bcsVar) {
        if (ozg.c()) {
            ozg.b(a.i(ataVar, "CX:State[", "]"), bcsVar.ordinal());
        }
    }

    public static boolean d(bcs bcsVar) {
        return bcsVar != null && bcsVar.i;
    }

    @Override // defpackage.aya
    public final void a() {
        synchronized (this.a) {
            this.f = 1;
        }
    }

    public final void b() {
        if (avw.h("CameraStateRegistry")) {
            this.e.setLength(0);
            this.e.append("Recalculating open cameras:\n");
            this.e.append(String.format(Locale.US, "%-45s%-22s\n", "Camera", "State"));
            this.e.append("-------------------------------------------------------------------\n");
        }
        int i = 0;
        for (Map.Entry entry : this.c.entrySet()) {
            if (avw.h("CameraStateRegistry")) {
                this.e.append(String.format(Locale.US, "%-45s%-22s\n", ((ata) entry.getKey()).toString(), ((bdc) entry.getValue()).a != null ? ((bdc) entry.getValue()).a.toString() : "UNKNOWN"));
            }
            if (d(((bdc) entry.getValue()).a)) {
                i++;
            }
        }
        if (avw.h("CameraStateRegistry")) {
            this.e.append("-------------------------------------------------------------------\n");
            this.e.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i), Integer.valueOf(this.f)));
            avw.a("CameraStateRegistry", this.e.toString());
        }
        this.d = Math.max(this.f - i, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004b, B:9:0x004f, B:13:0x0065, B:15:0x006d, B:18:0x007a, B:21:0x0092, B:22:0x0095, B:26:0x005a), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092 A[Catch: all -> 0x0097, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x001a, B:7:0x004b, B:9:0x004f, B:13:0x0065, B:15:0x006d, B:18:0x007a, B:21:0x0092, B:22:0x0095, B:26:0x005a), top: B:3:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e(defpackage.ata r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.a
            monitor-enter(r0)
            java.util.Map r1 = r11.c     // Catch: java.lang.Throwable -> L97
            java.lang.Object r1 = r1.get(r12)     // Catch: java.lang.Throwable -> L97
            bdc r1 = (defpackage.bdc) r1     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            defpackage.ksw.i(r1, r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = defpackage.avw.h(r2)     // Catch: java.lang.Throwable -> L97
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L4b
            java.lang.StringBuilder r2 = r11.e     // Catch: java.lang.Throwable -> L97
            r2.setLength(r4)     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r2 = r11.e     // Catch: java.lang.Throwable -> L97
            java.util.Locale r5 = java.util.Locale.US     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            int r7 = r11.d     // Catch: java.lang.Throwable -> L97
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L97
            bcs r8 = r1.a     // Catch: java.lang.Throwable -> L97
            boolean r8 = d(r8)     // Catch: java.lang.Throwable -> L97
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L97
            bcs r9 = r1.a     // Catch: java.lang.Throwable -> L97
            r10 = 4
            java.lang.Object[] r10 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L97
            r10[r4] = r12     // Catch: java.lang.Throwable -> L97
            r10[r3] = r7     // Catch: java.lang.Throwable -> L97
            r7 = 2
            r10[r7] = r8     // Catch: java.lang.Throwable -> L97
            r7 = 3
            r10[r7] = r9     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = java.lang.String.format(r5, r6, r10)     // Catch: java.lang.Throwable -> L97
            r2.append(r5)     // Catch: java.lang.Throwable -> L97
        L4b:
            int r2 = r11.d     // Catch: java.lang.Throwable -> L97
            if (r2 > 0) goto L5a
            bcs r2 = r1.a     // Catch: java.lang.Throwable -> L97
            boolean r2 = d(r2)     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L58
            goto L5a
        L58:
            r12 = r4
            goto L65
        L5a:
            bcs r2 = defpackage.bcs.OPENING     // Catch: java.lang.Throwable -> L97
            r1.a(r2)     // Catch: java.lang.Throwable -> L97
            bcs r1 = defpackage.bcs.OPENING     // Catch: java.lang.Throwable -> L97
            c(r12, r1)     // Catch: java.lang.Throwable -> L97
            r12 = r3
        L65:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = defpackage.avw.h(r1)     // Catch: java.lang.Throwable -> L97
            if (r1 == 0) goto L90
            java.lang.StringBuilder r1 = r11.e     // Catch: java.lang.Throwable -> L97
            java.util.Locale r2 = java.util.Locale.US     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = " --> %s"
            if (r12 == 0) goto L78
            java.lang.String r6 = "SUCCESS"
            goto L7a
        L78:
            java.lang.String r6 = "FAIL"
        L7a:
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L97
            r3[r4] = r6     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = java.lang.String.format(r2, r5, r3)     // Catch: java.lang.Throwable -> L97
            r1.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r11.e     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L97
            defpackage.avw.a(r1, r2)     // Catch: java.lang.Throwable -> L97
        L90:
            if (r12 == 0) goto L95
            r11.b()     // Catch: java.lang.Throwable -> L97
        L95:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return r12
        L97:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdd.e(ata):boolean");
    }

    public final void f() {
        synchronized (this.a) {
        }
    }
}
