package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hte {
    public final ffji a;
    public boolean c;
    public hta f;
    private hru j;
    public final AtomicReference b = new AtomicReference(null);
    private final ffjm g = new htb(this);
    private final ffji h = new htc(this);
    public final hne d = new hne(new hta[16]);
    public final Object e = new Object();
    private long i = -1;

    public hte(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    public static final void g() {
        hfp.h("Unexpected notification");
        throw new ffbx();
    }

    public final void a() {
        synchronized (this.e) {
            hne hneVar = this.d;
            Object[] objArr = hneVar.a;
            int i = hneVar.b;
            for (int i2 = 0; i2 < i; i2++) {
                hta htaVar = (hta) objArr[i2];
                htaVar.e.d();
                htaVar.f.d();
                htaVar.k.d();
                htaVar.l.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007f A[Catch: all -> 0x009e, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x0079, B:11:0x007f, B:13:0x008c, B:15:0x0084, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:24:0x0046, B:26:0x0051, B:28:0x005b, B:30:0x0067, B:37:0x0072, B:40:0x0092), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            java.lang.Object r2 = r1.e
            monitor-enter(r2)
            hne r3 = r1.d     // Catch: java.lang.Throwable -> L9e
            int r4 = r3.b     // Catch: java.lang.Throwable -> L9e
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L92
            java.lang.Object[] r8 = r3.a     // Catch: java.lang.Throwable -> L9e
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L9e
            hta r8 = (defpackage.hta) r8     // Catch: java.lang.Throwable -> L9e
            cop r9 = r8.f     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r9 = r9.b(r0)     // Catch: java.lang.Throwable -> L9e
            cog r9 = (defpackage.cog) r9     // Catch: java.lang.Throwable -> L9e
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L79
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L9e
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L9e
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L9e
            int r12 = r9.length     // Catch: java.lang.Throwable -> L9e
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L9e
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L9e
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L70
            int r5 = r13 - r12
            r6 = 0
        L46:
            int r1 = ~r5     // Catch: java.lang.Throwable -> L9e
            int r1 = r1 >>> 31
            r17 = r1
            r18 = 8
            int r1 = 8 - r17
            if (r6 >= r1) goto L6c
            r19 = 255(0xff, double:1.26E-321)
            long r19 = r14 & r19
            r21 = 128(0x80, double:6.32E-322)
            int r1 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r1 >= 0) goto L67
            int r1 = r13 << 3
            int r1 = r1 + r6
            r17 = r1
            r1 = r10[r17]     // Catch: java.lang.Throwable -> L9e
            r17 = r11[r17]     // Catch: java.lang.Throwable -> L9e
            r8.b(r0, r1)     // Catch: java.lang.Throwable -> L9e
        L67:
            long r14 = r14 >> r18
            int r6 = r6 + 1
            goto L46
        L6c:
            r6 = r18
            if (r1 != r6) goto L79
        L70:
            if (r13 == r12) goto L79
            int r13 = r13 + 1
            r1 = r23
            r6 = r16
            goto L2e
        L79:
            boolean r1 = r8.c()     // Catch: java.lang.Throwable -> L9e
            if (r1 != 0) goto L82
            int r7 = r7 + 1
            goto L8c
        L82:
            if (r7 <= 0) goto L8c
            java.lang.Object[] r1 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L9e
            r1[r6] = r5     // Catch: java.lang.Throwable -> L9e
        L8c:
            int r6 = r16 + 1
            r1 = r23
            goto Ld
        L92:
            java.lang.Object[] r0 = r3.a     // Catch: java.lang.Throwable -> L9e
            int r1 = r4 - r7
            r5 = 0
            defpackage.ffdo.d(r0, r5, r1, r4)     // Catch: java.lang.Throwable -> L9e
            r3.b = r1     // Catch: java.lang.Throwable -> L9e
            monitor-exit(r2)
            return
        L9e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hte.b(java.lang.Object):void");
    }

    public final void c(Object obj, ffji ffjiVar, ffix ffixVar) {
        Object obj2;
        hta htaVar;
        long j;
        Object obj3;
        int i;
        int i2;
        int i3;
        synchronized (this.e) {
            hne hneVar = this.d;
            Object[] objArr = hneVar.a;
            int i4 = hneVar.b;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i5];
                if (((hta) obj2).a == ffjiVar) {
                    break;
                } else {
                    i5++;
                }
            }
            htaVar = (hta) obj2;
            if (htaVar == null) {
                ffjiVar.getClass();
                fflf.e(ffjiVar, 1);
                htaVar = new hta(ffjiVar);
                this.d.n(htaVar);
            }
        }
        hta htaVar2 = this.f;
        long j2 = this.i;
        if (j2 != -1 && j2 != hqk.a()) {
            hih.a("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j2 + "), currentThread={id=" + hqk.a() + ", name=" + Thread.currentThread().getName() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
        }
        try {
            this.f = htaVar;
            this.i = hqk.a();
            ffji ffjiVar2 = this.h;
            Object obj4 = htaVar.b;
            cog cogVar = htaVar.c;
            int i6 = htaVar.d;
            htaVar.b = obj;
            htaVar.c = (cog) htaVar.f.f(obj);
            if (htaVar.d == -1) {
                htaVar.d = hsy.a(hsj.b().v());
            }
            hgm hgmVar = htaVar.i;
            hne a = hkg.a();
            try {
                a.n(hgmVar);
                hrv.d(ffjiVar2, ffixVar);
                a.c(a.b - 1);
                Object obj5 = htaVar.b;
                obj5.getClass();
                int i7 = htaVar.d;
                cog cogVar2 = htaVar.c;
                if (cogVar2 != null) {
                    try {
                        long[] jArr = cogVar2.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j3 = jArr[i8];
                                j = j2;
                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = ~(i8 - length);
                                    int i10 = 0;
                                    while (true) {
                                        i = 8 - (i9 >>> 31);
                                        if (i10 >= i) {
                                            break;
                                        }
                                        if ((j3 & 255) < 128) {
                                            int i11 = (i8 << 3) + i10;
                                            i2 = i9;
                                            try {
                                                Object obj6 = cogVar2.b[i11];
                                                i3 = i10;
                                                if (cogVar2.c[i11] != i7) {
                                                    htaVar.b(obj5, obj6);
                                                    cogVar2.b(i11);
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                j2 = j;
                                                this.f = htaVar2;
                                                this.i = j2;
                                                throw th;
                                            }
                                        } else {
                                            i2 = i9;
                                            i3 = i10;
                                        }
                                        j3 >>= 8;
                                        i10 = i3 + 1;
                                        i9 = i2;
                                    }
                                    if (i != 8) {
                                        break;
                                    }
                                }
                                if (i8 == length) {
                                    break;
                                }
                                i8++;
                                j2 = j;
                            }
                            obj3 = obj4;
                            htaVar.b = obj3;
                            htaVar.c = cogVar;
                            htaVar.d = i6;
                            this.f = htaVar2;
                            this.i = j;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        this.f = htaVar2;
                        this.i = j2;
                        throw th;
                    }
                }
                j = j2;
                obj3 = obj4;
                htaVar.b = obj3;
                htaVar.c = cogVar;
                htaVar.d = i6;
                this.f = htaVar2;
                this.i = j;
            } catch (Throwable th3) {
                a.c(a.b - 1);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void d() {
        this.j = hrv.i(this.g);
    }

    public final void e() {
        hru hruVar = this.j;
        if (hruVar != null) {
            hruVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0291 A[Catch: all -> 0x0677, TryCatch #2 {all -> 0x0677, blocks: (B:32:0x00b9, B:34:0x00bf, B:40:0x02f9, B:41:0x00cf, B:43:0x00d5, B:45:0x00db, B:47:0x00df, B:50:0x00f4, B:52:0x0104, B:54:0x010f, B:56:0x0115, B:58:0x0130, B:59:0x0132, B:61:0x0140, B:63:0x0146, B:65:0x014a, B:68:0x015b, B:70:0x016b, B:72:0x0176, B:74:0x017c, B:76:0x018c, B:85:0x01c8, B:87:0x0198, B:91:0x01a1, B:94:0x01b2, B:102:0x028b, B:104:0x0291, B:106:0x0295, B:109:0x02a2, B:111:0x02ae, B:113:0x02bb, B:115:0x02c1, B:117:0x02cb, B:127:0x02da, B:129:0x02dd, B:100:0x01ea, B:134:0x01fa, B:136:0x0214, B:137:0x0216, B:139:0x0222, B:141:0x0228, B:143:0x022c, B:146:0x0239, B:148:0x0245, B:150:0x0252, B:152:0x0258, B:154:0x0262, B:161:0x026e, B:163:0x0271, B:164:0x0277, B:180:0x0587, B:182:0x058d, B:184:0x0593, B:186:0x05ad, B:188:0x05b1, B:191:0x05be, B:193:0x05ca, B:195:0x05d7, B:197:0x05dd, B:199:0x05ea, B:200:0x05fe, B:202:0x0606, B:211:0x0621, B:215:0x064c, B:218:0x0628, B:220:0x0636, B:221:0x0641, B:226:0x0654, B:178:0x0335, B:239:0x0359, B:240:0x036b, B:242:0x0371, B:244:0x0379, B:248:0x0385, B:250:0x038b, B:252:0x0391, B:254:0x0395, B:257:0x03a2, B:259:0x03ae, B:261:0x03bb, B:263:0x03c1, B:265:0x03da, B:266:0x03dc, B:268:0x03ee, B:270:0x03f4, B:272:0x03f8, B:275:0x0407, B:277:0x0417, B:279:0x0424, B:281:0x042a, B:283:0x043a, B:292:0x0476, B:294:0x044a, B:298:0x0451, B:302:0x0460, B:311:0x052b, B:313:0x0531, B:316:0x0535, B:319:0x0542, B:321:0x054e, B:323:0x055b, B:325:0x0561, B:327:0x056b, B:334:0x0577, B:340:0x057a, B:308:0x049d, B:346:0x04aa, B:348:0x04ba, B:349:0x04bc, B:351:0x04c8, B:353:0x04ce, B:355:0x04d2, B:358:0x04df, B:360:0x04eb, B:362:0x04f8, B:364:0x04fe, B:366:0x0508, B:373:0x0514, B:375:0x0517, B:376:0x051f), top: B:31:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0531 A[Catch: all -> 0x0677, TryCatch #2 {all -> 0x0677, blocks: (B:32:0x00b9, B:34:0x00bf, B:40:0x02f9, B:41:0x00cf, B:43:0x00d5, B:45:0x00db, B:47:0x00df, B:50:0x00f4, B:52:0x0104, B:54:0x010f, B:56:0x0115, B:58:0x0130, B:59:0x0132, B:61:0x0140, B:63:0x0146, B:65:0x014a, B:68:0x015b, B:70:0x016b, B:72:0x0176, B:74:0x017c, B:76:0x018c, B:85:0x01c8, B:87:0x0198, B:91:0x01a1, B:94:0x01b2, B:102:0x028b, B:104:0x0291, B:106:0x0295, B:109:0x02a2, B:111:0x02ae, B:113:0x02bb, B:115:0x02c1, B:117:0x02cb, B:127:0x02da, B:129:0x02dd, B:100:0x01ea, B:134:0x01fa, B:136:0x0214, B:137:0x0216, B:139:0x0222, B:141:0x0228, B:143:0x022c, B:146:0x0239, B:148:0x0245, B:150:0x0252, B:152:0x0258, B:154:0x0262, B:161:0x026e, B:163:0x0271, B:164:0x0277, B:180:0x0587, B:182:0x058d, B:184:0x0593, B:186:0x05ad, B:188:0x05b1, B:191:0x05be, B:193:0x05ca, B:195:0x05d7, B:197:0x05dd, B:199:0x05ea, B:200:0x05fe, B:202:0x0606, B:211:0x0621, B:215:0x064c, B:218:0x0628, B:220:0x0636, B:221:0x0641, B:226:0x0654, B:178:0x0335, B:239:0x0359, B:240:0x036b, B:242:0x0371, B:244:0x0379, B:248:0x0385, B:250:0x038b, B:252:0x0391, B:254:0x0395, B:257:0x03a2, B:259:0x03ae, B:261:0x03bb, B:263:0x03c1, B:265:0x03da, B:266:0x03dc, B:268:0x03ee, B:270:0x03f4, B:272:0x03f8, B:275:0x0407, B:277:0x0417, B:279:0x0424, B:281:0x042a, B:283:0x043a, B:292:0x0476, B:294:0x044a, B:298:0x0451, B:302:0x0460, B:311:0x052b, B:313:0x0531, B:316:0x0535, B:319:0x0542, B:321:0x054e, B:323:0x055b, B:325:0x0561, B:327:0x056b, B:334:0x0577, B:340:0x057a, B:308:0x049d, B:346:0x04aa, B:348:0x04ba, B:349:0x04bc, B:351:0x04c8, B:353:0x04ce, B:355:0x04d2, B:358:0x04df, B:360:0x04eb, B:362:0x04f8, B:364:0x04fe, B:366:0x0508, B:373:0x0514, B:375:0x0517, B:376:0x051f), top: B:31:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0583 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0686 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f() {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hte.f():boolean");
    }
}
