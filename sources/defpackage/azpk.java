package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azpk implements azoq {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/core/myidentity/MyIdentityCoroutineAccessor");
    private final azpx b;
    private final azpo c;
    private final ffbr d;
    private final akjb e;

    public azpk(azpx azpxVar, azpo azpoVar, akjb akjbVar, ffbr ffbrVar) {
        azpxVar.getClass();
        azpoVar.getClass();
        akjbVar.getClass();
        ffbrVar.getClass();
        this.b = azpxVar;
        this.c = azpoVar;
        this.e = akjbVar;
        this.d = ffbrVar;
    }

    private final aoku h(azop azopVar) {
        return this.e.a(this.c.a(azopVar)).a();
    }

    private final azop i(Iterable iterable, final awui awuiVar) {
        aoku h;
        Optional e;
        Boolean bool;
        Object obj = null;
        if (ersy.a("bugle.enable_my_identity_phone_number_verified_handler", "bugle")) {
            String str = awuiVar.d;
            str.getClass();
            Iterator it = ffdx.ah(iterable, new azpc()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                azop azopVar = (azop) next;
                if (azopVar.a() == azon.a) {
                    Optional d = azopVar.d();
                    d.getClass();
                    if (ffkj.e(fflm.b(d), str)) {
                        obj = next;
                        break;
                    }
                }
            }
            return (azop) obj;
        }
        Iterator it2 = iterable.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            azop azopVar2 = (azop) next2;
            if (azopVar2.a() == azon.a && (h = h(azopVar2)) != null && (e = h.e()) != null) {
                final ffji ffjiVar = new ffji() { // from class: azpa
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(ffkj.e((awui) obj2, awui.this));
                    }
                };
                Optional map = e.map(new Function() { // from class: azpb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                if (map != null && (bool = (Boolean) fflm.b(map)) != null && bool.booleanValue()) {
                    obj = next2;
                    break;
                }
            }
        }
        return (azop) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.azoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.awui r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.azpd
            if (r0 == 0) goto L13
            r0 = r7
            azpd r0 = (defpackage.azpd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azpd r0 = new azpd
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            azpk r6 = r0.e
            ekzz r1 = r0.f
            awui r0 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L63
        L2e:
            r6 = move-exception
            goto L70
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            defpackage.ffci.b(r7)
            int r7 = r6.c
            awuh r7 = defpackage.awuh.b(r7)
            if (r7 != 0) goto L45
            awuh r7 = defpackage.awuh.UNKNOWN_TYPE
        L45:
            awuh r2 = defpackage.awuh.PHONE
            if (r7 != r2) goto L76
            java.lang.String r7 = "MyIdentityCoroutineAccessor#getActiveMyIdentityByChatEndpoint"
            ekzz r7 = defpackage.eleg.f(r7)
            azpx r2 = r5.b     // Catch: java.lang.Throwable -> L6e
            r0.d = r6     // Catch: java.lang.Throwable -> L6e
            r0.f = r7     // Catch: java.lang.Throwable -> L6e
            r0.e = r5     // Catch: java.lang.Throwable -> L6e
            r0.c = r4     // Catch: java.lang.Throwable -> L6e
            java.lang.Object r0 = r2.d(r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 == r1) goto L6d
            r1 = r7
            r7 = r0
            r0 = r6
            r6 = r5
        L63:
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L2e
            azop r6 = r6.i(r7, r0)     // Catch: java.lang.Throwable -> L2e
            defpackage.ffig.a(r1, r3)
            return r6
        L6d:
            return r1
        L6e:
            r6 = move-exception
            r1 = r7
        L70:
            throw r6     // Catch: java.lang.Throwable -> L71
        L71:
            r7 = move-exception
            defpackage.ffig.a(r1, r6)
            throw r7
        L76:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.a(awui, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x004f, B:13:0x005a, B:15:0x0060, B:18:0x0076), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.Collection] */
    @Override // defpackage.azoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.azpf
            if (r0 == 0) goto L13
            r0 = r8
            azpf r0 = (defpackage.azpf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azpf r0 = new azpf
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            ekzz r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L81
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "MyIdentityCoroutineAccessor#getAllActiveMyIdentities"
            ekzz r8 = defpackage.eleg.f(r8)
            azpx r2 = r6.b     // Catch: java.lang.Throwable -> L7f
            r0.e = r8     // Catch: java.lang.Throwable -> L7f
            r0.a = r7     // Catch: java.lang.Throwable -> L7f
            r0.d = r3     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r2.d(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == r1) goto L7e
            r5 = r0
            r0 = r8
            r8 = r5
        L4f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2b
            r1.<init>()     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2b
        L5a:
            boolean r2 = r8.hasNext()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r8.next()     // Catch: java.lang.Throwable -> L2b
            r3 = r2
            azop r3 = (defpackage.azop) r3     // Catch: java.lang.Throwable -> L2b
            enip r3 = r3.j()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L5a
            r1.add(r2)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L7a:
            r7 = 0
            defpackage.ffig.a(r0, r7)
        L7e:
            return r1
        L7f:
            r7 = move-exception
            r0 = r8
        L81:
            throw r7     // Catch: java.lang.Throwable -> L82
        L82:
            r8 = move-exception
            defpackage.ffig.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.b(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.azoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.azsu r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.azpg
            if (r0 == 0) goto L13
            r0 = r6
            azpg r0 = (defpackage.azpg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            azpg r0 = new azpg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            azpk r5 = r0.d
            defpackage.ffci.b(r6)
            goto L42
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            azpx r6 = r4.b
            r0.d = r4
            r0.c = r3
            java.lang.Object r6 = r6.f(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            r5 = r4
        L42:
            azop r6 = (defpackage.azop) r6
            aoku r5 = r5.h(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.c(azsu, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0096 A[Catch: all -> 0x0038, TryCatch #3 {all -> 0x0038, blocks: (B:12:0x0034, B:13:0x008c, B:19:0x0096, B:20:0x00ad), top: B:11:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a A[Catch: all -> 0x00b4, TRY_LEAVE, TryCatch #0 {all -> 0x00b4, blocks: (B:36:0x0076, B:38:0x007a), top: B:35:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.Closeable] */
    @Override // defpackage.azoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.awui r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.d(awui, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x007d, B:14:0x0083, B:16:0x0089, B:20:0x00a1, B:26:0x00a8, B:27:0x00b3), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a8 A[Catch: all -> 0x0031, TryCatch #0 {all -> 0x0031, blocks: (B:12:0x002d, B:13:0x007d, B:14:0x0083, B:16:0x0089, B:20:0x00a1, B:26:0x00a8, B:27:0x00b3), top: B:11:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[Catch: all -> 0x0048, TRY_LEAVE, TryCatch #1 {all -> 0x0048, blocks: (B:43:0x0044, B:44:0x0068, B:46:0x006c), top: B:42:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // defpackage.azoq
    @defpackage.ffbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(int r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.azpi
            if (r0 == 0) goto L13
            r0 = r8
            azpi r0 = (defpackage.azpi) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            azpi r0 = new azpi
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r7 = r0.b
            java.lang.Object r0 = r0.a
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L31
            goto L7d
        L31:
            r7 = move-exception
            goto Lbb
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            int r7 = r0.b
            ekzz r2 = r0.f
            java.lang.Object r4 = r0.a
            azpk r4 = (defpackage.azpk) r4
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L48
            goto L68
        L48:
            r7 = move-exception
            r0 = r2
            goto Lbb
        L4c:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "MyIdentityCoroutineAccessor#getMyIdentityBySubId"
            ekzz r8 = defpackage.eleg.f(r8)
            r0.a = r6     // Catch: java.lang.Throwable -> Lb9
            r0.f = r8     // Catch: java.lang.Throwable -> Lb9
            r0.b = r7     // Catch: java.lang.Throwable -> Lb9
            r0.e = r4     // Catch: java.lang.Throwable -> Lb9
            java.lang.Object r2 = r6.g(r7, r0)     // Catch: java.lang.Throwable -> Lb9
            if (r2 != r1) goto L64
            goto Lb4
        L64:
            r4 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L68:
            azop r8 = (defpackage.azop) r8     // Catch: java.lang.Throwable -> L48
            if (r8 != 0) goto Lb5
            azpx r8 = r4.b     // Catch: java.lang.Throwable -> L48
            r0.a = r2     // Catch: java.lang.Throwable -> L48
            r0.f = r5     // Catch: java.lang.Throwable -> L48
            r0.b = r7     // Catch: java.lang.Throwable -> L48
            r0.e = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r8 = r8.e(r0)     // Catch: java.lang.Throwable -> L48
            if (r8 == r1) goto Lb4
            r0 = r2
        L7d:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L31
        L83:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto La0
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L31
            r2 = r1
            azop r2 = (defpackage.azop) r2     // Catch: java.lang.Throwable -> L31
            enip r2 = r2.j()     // Catch: java.lang.Throwable -> L31
            java.lang.Integer r3 = new java.lang.Integer     // Catch: java.lang.Throwable -> L31
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L31
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L83
            goto La1
        La0:
            r1 = r5
        La1:
            r8 = r1
            azop r8 = (defpackage.azop) r8     // Catch: java.lang.Throwable -> L31
            if (r8 == 0) goto La8
            r2 = r0
            goto Lb5
        La8:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = "No MyIdentity found for the subId: "
            java.lang.String r7 = defpackage.a.h(r7, r1)     // Catch: java.lang.Throwable -> L31
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L31
            throw r8     // Catch: java.lang.Throwable -> L31
        Lb4:
            return r1
        Lb5:
            defpackage.ffig.a(r2, r5)
            return r8
        Lb9:
            r7 = move-exception
            r0 = r8
        Lbb:
            throw r7     // Catch: java.lang.Throwable -> Lbc
        Lbc:
            r8 = move-exception
            defpackage.ffig.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.e(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.azoq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.f(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005c A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x004f, B:13:0x0055, B:15:0x005c, B:19:0x0074), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(int r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.azpe
            if (r0 == 0) goto L13
            r0 = r8
            azpe r0 = (defpackage.azpe) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            azpe r0 = new azpe
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r7 = r0.a
            ekzz r0 = r0.e
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2b
            goto L4f
        L2b:
            r7 = move-exception
            goto L7c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r8)
            java.lang.String r8 = "MyIdentityCoroutineAccessor#getActiveMyIdentityBySubId"
            ekzz r8 = defpackage.eleg.f(r8)
            azpx r2 = r6.b     // Catch: java.lang.Throwable -> L7a
            r0.e = r8     // Catch: java.lang.Throwable -> L7a
            r0.a = r7     // Catch: java.lang.Throwable -> L7a
            r0.d = r3     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.d(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 == r1) goto L79
            r5 = r0
            r0 = r8
            r8 = r5
        L4f:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Throwable -> L2b
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L2b
        L55:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L2b
            r2 = 0
            if (r1 == 0) goto L73
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L2b
            r3 = r1
            azop r3 = (defpackage.azop) r3     // Catch: java.lang.Throwable -> L2b
            enip r3 = r3.j()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> L2b
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L2b
            boolean r3 = r3.contains(r4)     // Catch: java.lang.Throwable -> L2b
            if (r3 == 0) goto L55
            goto L74
        L73:
            r1 = r2
        L74:
            azop r1 = (defpackage.azop) r1     // Catch: java.lang.Throwable -> L2b
            defpackage.ffig.a(r0, r2)
        L79:
            return r1
        L7a:
            r7 = move-exception
            r0 = r8
        L7c:
            throw r7     // Catch: java.lang.Throwable -> L7d
        L7d:
            r8 = move-exception
            defpackage.ffig.a(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azpk.g(int, ffgu):java.lang.Object");
    }
}
