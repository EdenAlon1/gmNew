package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aze {
    public awt b;
    awt c;
    awt d;
    public baa e;
    public azd f;
    bad a = null;
    public azq g = null;

    public static bev b(avs avsVar, int i, int i2, int i3) {
        return avsVar != null ? avsVar.a() : avt.a(i, i2, i3, 4);
    }

    public final int a() {
        int c;
        biw.b();
        ksw.d(this.b != null, "The ImageReader is not initialized.");
        awt awtVar = this.b;
        synchronized (awtVar.a) {
            c = awtVar.d.c() - awtVar.b;
        }
        return c;
    }

    final void c(bad badVar) {
        biw.b();
        ksw.d(badVar.i.size() == 1, "only one capture stage is supported.");
        ksw.d(a() > 0, "Too many acquire images. Close image to be able to process next.");
        this.a = badVar;
        bkj.i(badVar.j, new azb(this, badVar), bjb.a());
    }

    final void d(bak bakVar) {
        biw.b();
        bad badVar = this.a;
        if (badVar != null) {
            if (badVar.a == bakVar.a()) {
                bad badVar2 = this.a;
                avl b = bakVar.b();
                biw.b();
                bag bagVar = badVar2.l;
                if (bagVar.f) {
                    return;
                }
                bax baxVar = bagVar.a;
                biw.b();
                boolean z = false;
                if (baxVar.a > 0) {
                    baxVar.a = 0;
                    z = true;
                }
                if (!z) {
                    bagVar.f(b);
                }
                bagVar.d();
                bagVar.d.c(b);
                if (z) {
                    bagVar.b.c(bagVar.a);
                }
            }
        }
    }

    public final void e(bev bevVar) {
        bevVar.j(new beu() { // from class: ayv
            /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
            
                if (r7.b.n() != false) goto L23;
             */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0092 A[Catch: IllegalStateException -> 0x00d4, TryCatch #0 {IllegalStateException -> 0x00d4, blocks: (B:3:0x0004, B:5:0x000b, B:8:0x0014, B:11:0x0028, B:13:0x003c, B:15:0x0058, B:17:0x0063, B:19:0x0067, B:20:0x0070, B:22:0x0074, B:24:0x007e, B:28:0x0087, B:30:0x0092, B:31:0x00a0, B:35:0x00aa, B:37:0x00ae, B:38:0x00b1, B:40:0x007c, B:41:0x00b7, B:43:0x00c0, B:45:0x00c4), top: B:2:0x0004 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00aa A[Catch: IllegalStateException -> 0x00d4, TryCatch #0 {IllegalStateException -> 0x00d4, blocks: (B:3:0x0004, B:5:0x000b, B:8:0x0014, B:11:0x0028, B:13:0x003c, B:15:0x0058, B:17:0x0063, B:19:0x0067, B:20:0x0070, B:22:0x0074, B:24:0x007e, B:28:0x0087, B:30:0x0092, B:31:0x00a0, B:35:0x00aa, B:37:0x00ae, B:38:0x00b1, B:40:0x007c, B:41:0x00b7, B:43:0x00c0, B:45:0x00c4), top: B:2:0x0004 }] */
            @Override // defpackage.beu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.bev r7) {
                /*
                    r6 = this;
                    java.lang.String r0 = "Failed to acquire latest image"
                    aze r1 = defpackage.aze.this
                    avr r7 = r7.f()     // Catch: java.lang.IllegalStateException -> Ld4
                    r2 = 0
                    if (r7 == 0) goto Lc0
                    defpackage.biw.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    bad r3 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r4 = "CaptureNode"
                    if (r3 != 0) goto L28
                    java.lang.String r2 = "Discarding ImageProxy which was inadvertently acquired: "
                    java.util.Objects.toString(r7)     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r3 = r7.toString()     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r2 = r2.concat(r3)     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.avw.f(r4, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.close()     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                L28:
                    avm r3 = r7.e()     // Catch: java.lang.IllegalStateException -> Ld4
                    bgw r3 = r3.c()     // Catch: java.lang.IllegalStateException -> Ld4
                    bad r5 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.String r5 = r5.h     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.Object r3 = r3.c(r5)     // Catch: java.lang.IllegalStateException -> Ld4
                    java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 == 0) goto Lb7
                    defpackage.biw.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    baa r3 = r1.e     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.getClass()     // Catch: java.lang.IllegalStateException -> Ld4
                    ayi r3 = (defpackage.ayi) r3     // Catch: java.lang.IllegalStateException -> Ld4
                    bmx r3 = r3.a     // Catch: java.lang.IllegalStateException -> Ld4
                    bad r4 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    ayj r5 = new ayj     // Catch: java.lang.IllegalStateException -> Ld4
                    r5.<init>(r4, r7)     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.accept(r5)     // Catch: java.lang.IllegalStateException -> Ld4
                    bad r3 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    azd r4 = r1.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 == 0) goto L7c
                    ayd r4 = (defpackage.ayd) r4     // Catch: java.lang.IllegalStateException -> Ld4
                    java.util.List r4 = r4.c     // Catch: java.lang.IllegalStateException -> Ld4
                    int r4 = r4.size()     // Catch: java.lang.IllegalStateException -> Ld4
                    r5 = 1
                    if (r4 <= r5) goto L7c
                    bad r4 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 == 0) goto L70
                    bax r4 = r4.b     // Catch: java.lang.IllegalStateException -> Ld4
                    int r7 = r7.a()     // Catch: java.lang.IllegalStateException -> Ld4
                    r4.o(r7)     // Catch: java.lang.IllegalStateException -> Ld4
                L70:
                    bad r7 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto L7e
                    bax r7 = r7.b     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r7 = r7.n()     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto L7e
                L7c:
                    r1.a = r2     // Catch: java.lang.IllegalStateException -> Ld4
                L7e:
                    int r7 = r3.k     // Catch: java.lang.IllegalStateException -> Ld4
                    r4 = -1
                    if (r7 == r4) goto La0
                    r4 = 100
                    if (r7 == r4) goto La0
                    r3.k = r4     // Catch: java.lang.IllegalStateException -> Ld4
                    bag r7 = r3.l     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.biw.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r4 = r7.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r4 != 0) goto La0
                    bax r7 = r7.a     // Catch: java.lang.IllegalStateException -> Ld4
                    java.util.concurrent.Executor r7 = r7.i()     // Catch: java.lang.IllegalStateException -> Ld4
                    bau r4 = new bau     // Catch: java.lang.IllegalStateException -> Ld4
                    r4.<init>()     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.execute(r4)     // Catch: java.lang.IllegalStateException -> Ld4
                La0:
                    bag r7 = r3.l     // Catch: java.lang.IllegalStateException -> Ld4
                    defpackage.biw.b()     // Catch: java.lang.IllegalStateException -> Ld4
                    boolean r3 = r7.f     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 == 0) goto Laa
                    goto Le8
                Laa:
                    boolean r3 = r7.g     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r3 != 0) goto Lb1
                    r7.e()     // Catch: java.lang.IllegalStateException -> Ld4
                Lb1:
                    kfb r7 = r7.d     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.b(r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Lb7:
                    java.lang.String r2 = "Discarding ImageProxy which was acquired for aborted request"
                    defpackage.avw.f(r4, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    r7.close()     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Lc0:
                    bad r7 = r1.a     // Catch: java.lang.IllegalStateException -> Ld4
                    if (r7 == 0) goto Le8
                    int r7 = r7.a     // Catch: java.lang.IllegalStateException -> Ld4
                    avl r3 = new avl     // Catch: java.lang.IllegalStateException -> Ld4
                    r3.<init>(r0, r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    ayk r2 = new ayk     // Catch: java.lang.IllegalStateException -> Ld4
                    r2.<init>(r7, r3)     // Catch: java.lang.IllegalStateException -> Ld4
                    r1.d(r2)     // Catch: java.lang.IllegalStateException -> Ld4
                    return
                Ld4:
                    r7 = move-exception
                    bad r2 = r1.a
                    if (r2 == 0) goto Le8
                    avl r3 = new avl
                    r3.<init>(r0, r7)
                    ayk r7 = new ayk
                    int r0 = r2.a
                    r7.<init>(r0, r3)
                    r1.d(r7)
                Le8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ayv.a(bev):void");
            }
        }, bjm.a());
    }
}
