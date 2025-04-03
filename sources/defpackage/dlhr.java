package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlhr implements dlhj {
    private static final enru d = enru.c("com/google/android/libraries/abuse/hades/moirai/service/DispatchingClassificationService");
    public final dlhj a;
    public final dlhj b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();

    public dlhr(dlhj dlhjVar, dlhj dlhjVar2) {
        this.a = dlhjVar;
        this.b = dlhjVar2;
    }

    private final dlhj f(dlhe dlheVar) {
        if (!(dlheVar instanceof dlhd) || ((dlhd) dlheVar).f == null) {
            return this.a;
        }
        dlhj dlhjVar = this.b;
        if (dlhjVar != null) {
            return dlhjVar;
        }
        throw new IllegalStateException("VM unavailable for loading protections");
    }

    private final Object g(dlgb dlgbVar, ffgu ffguVar) {
        Object c;
        dlhj dlhjVar = (dlhj) this.c.remove(dlgbVar);
        return (dlhjVar == null || (c = dlhjVar.c(dlgbVar, ffguVar)) != ffhh.a) ? ffcu.a : c;
    }

    private final fgjb h(dlgb dlgbVar) {
        final ffji ffjiVar = new ffji() { // from class: dlhl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((dlgb) obj).getClass();
                return new fgjf();
            }
        };
        Object computeIfAbsent = ConcurrentMap.EL.computeIfAbsent(this.e, dlgbVar, new Function() { // from class: dlhm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        computeIfAbsent.getClass();
        return (fgjb) computeIfAbsent;
    }

    @Override // defpackage.dkyy
    public final Object a(ffgu ffguVar) {
        return this.a.a(ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:24:0x0063, B:26:0x006b, B:29:0x0076, B:34:0x00a7, B:35:0x00ae), top: B:23:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7 A[Catch: all -> 0x00af, TRY_ENTER, TryCatch #1 {all -> 0x00af, blocks: (B:24:0x0063, B:26:0x006b, B:29:0x0076, B:34:0x00a7, B:35:0x00ae), top: B:23:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dlhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.dlgb r13, defpackage.dlfy r14, defpackage.ffgu r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.dlhn
            if (r0 == 0) goto L13
            r0 = r15
            dlhn r0 = (defpackage.dlhn) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dlhn r0 = new dlhn
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r13 = r0.a
            fgjb r13 = (defpackage.fgjb) r13
            defpackage.ffci.b(r15)     // Catch: java.lang.Throwable -> L30
            goto La3
        L30:
            r14 = move-exception
            goto Lb2
        L33:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3b:
            java.lang.Object r13 = r0.b
            dlfy r14 = r0.g
            dlgb r2 = r0.f
            java.lang.Object r4 = r0.a
            dlhr r4 = (defpackage.dlhr) r4
            defpackage.ffci.b(r15)
            r15 = r13
            r13 = r2
            goto L63
        L4b:
            defpackage.ffci.b(r15)
            fgjb r15 = r12.h(r13)
            r0.a = r12
            r0.f = r13
            r0.g = r14
            r0.b = r15
            r0.e = r4
            java.lang.Object r2 = r15.a(r5, r0)
            if (r2 == r1) goto Lb6
            r4 = r12
        L63:
            j$.util.concurrent.ConcurrentHashMap r2 = r4.c     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r2 = r2.get(r13)     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto La7
            dlhj r2 = (defpackage.dlhj) r2     // Catch: java.lang.Throwable -> Laf
            dlhj r4 = r4.a     // Catch: java.lang.Throwable -> Laf
            if (r2 != r4) goto L74
            java.lang.String r4 = "JNI"
            goto L76
        L74:
            java.lang.String r4 = "VM"
        L76:
            enru r6 = defpackage.dlhr.d     // Catch: java.lang.Throwable -> Laf
            ensk r6 = r6.h()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = "com/google/android/libraries/abuse/hades/moirai/service/DispatchingClassificationService"
            java.lang.String r8 = "classify"
            java.lang.String r9 = "DispatchingClassificationService.kt"
            r10 = 74
            ensk r6 = r6.h(r7, r8, r10, r9)     // Catch: java.lang.Throwable -> Laf
            enrr r6 = (defpackage.enrr) r6     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = "Classification begins - using backend: %s to classify"
            r6.t(r7, r4)     // Catch: java.lang.Throwable -> Laf
            r0.a = r15     // Catch: java.lang.Throwable -> Laf
            r0.f = r5     // Catch: java.lang.Throwable -> Laf
            r0.g = r5     // Catch: java.lang.Throwable -> Laf
            r0.b = r5     // Catch: java.lang.Throwable -> Laf
            r0.e = r3     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r13 = r2.b(r13, r14, r0)     // Catch: java.lang.Throwable -> Laf
            if (r13 != r1) goto La0
            goto Lb6
        La0:
            r11 = r15
            r15 = r13
            r13 = r11
        La3:
            r13.b(r5)
            return r15
        La7:
            java.lang.String r13 = "No backend found for client."
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Laf
            r14.<init>(r13)     // Catch: java.lang.Throwable -> Laf
            throw r14     // Catch: java.lang.Throwable -> Laf
        Laf:
            r13 = move-exception
            r14 = r13
            r13 = r15
        Lb2:
            r13.b(r5)
            throw r14
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhr.b(dlgb, dlfy, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r4.g(r2, r0) != r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r7v0, types: [dlgb] */
    /* JADX WARN: Type inference failed for: r7v1, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r7v5, types: [ffcu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    @Override // defpackage.dlhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dlgb r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.dlho
            if (r0 == 0) goto L13
            r0 = r8
            dlho r0 = (defpackage.dlho) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dlho r0 = new dlho
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r7 = r0.a
            fgjb r7 = (defpackage.fgjb) r7
            defpackage.ffci.b(r8)     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L2f:
            r8 = move-exception
            goto L72
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.b
            dlgb r2 = r0.f
            java.lang.Object r4 = r0.a
            dlhr r4 = (defpackage.dlhr) r4
            defpackage.ffci.b(r8)
            goto L5d
        L45:
            defpackage.ffci.b(r8)
            fgjb r8 = r6.h(r7)
            r0.a = r6
            r0.f = r7
            r0.b = r8
            r0.e = r4
            java.lang.Object r2 = r8.a(r5, r0)
            if (r2 == r1) goto L76
            r4 = r6
            r2 = r7
            r7 = r8
        L5d:
            r0.a = r7     // Catch: java.lang.Throwable -> L2f
            r0.f = r5     // Catch: java.lang.Throwable -> L2f
            r0.b = r5     // Catch: java.lang.Throwable -> L2f
            r0.e = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r4.g(r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r1) goto L6c
            goto L76
        L6c:
            r7.b(r5)
            ffcu r7 = defpackage.ffcu.a
            return r7
        L72:
            r7.b(r5)
            throw r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhr.c(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r8 == r1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:24:0x005d, B:26:0x0067, B:28:0x0070), top: B:23:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:24:0x005d, B:26:0x0067, B:28:0x0070), top: B:23:0x005d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.dlhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dlgb r8, defpackage.ffgu r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dlhp
            if (r0 == 0) goto L13
            r0 = r9
            dlhp r0 = (defpackage.dlhp) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            dlhp r0 = new dlhp
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r8 = r0.a
            fgjb r8 = (defpackage.fgjb) r8
            defpackage.ffci.b(r9)     // Catch: java.lang.Throwable -> L2f
            goto L7f
        L2f:
            r9 = move-exception
            goto L87
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            java.lang.Object r8 = r0.b
            dlgb r2 = r0.f
            java.lang.Object r4 = r0.a
            dlhr r4 = (defpackage.dlhr) r4
            defpackage.ffci.b(r9)
            r9 = r8
            r8 = r2
            goto L5d
        L47:
            defpackage.ffci.b(r9)
            fgjb r9 = r7.h(r8)
            r0.a = r7
            r0.f = r8
            r0.b = r9
            r0.e = r4
            java.lang.Object r2 = r9.a(r5, r0)
            if (r2 == r1) goto L8b
            r4 = r7
        L5d:
            j$.util.concurrent.ConcurrentHashMap r2 = r4.c     // Catch: java.lang.Throwable -> L83
            java.lang.Object r2 = r2.get(r8)     // Catch: java.lang.Throwable -> L83
            dlhj r2 = (defpackage.dlhj) r2     // Catch: java.lang.Throwable -> L83
            if (r2 != 0) goto L70
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L83
        L6c:
            r6 = r9
            r9 = r8
            r8 = r6
            goto L7f
        L70:
            r0.a = r9     // Catch: java.lang.Throwable -> L83
            r0.f = r5     // Catch: java.lang.Throwable -> L83
            r0.b = r5     // Catch: java.lang.Throwable -> L83
            r0.e = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r2.d(r8, r0)     // Catch: java.lang.Throwable -> L83
            if (r8 != r1) goto L6c
            goto L8b
        L7f:
            r8.b(r5)
            return r9
        L83:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L87:
            r8.b(r5)
            throw r9
        L8b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhr.d(dlgb, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [dlhe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2, types: [fgjb] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v7, types: [fgjb] */
    @Override // defpackage.dlhj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.dlgb r8, defpackage.dlhe r9, defpackage.ffgu r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.dlhq
            if (r0 == 0) goto L13
            r0 = r10
            dlhq r0 = (defpackage.dlhq) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            dlhq r0 = new dlhq
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L6a
            if (r2 == r5) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r8 = r0.b
            dlhj r8 = (defpackage.dlhj) r8
            java.lang.Object r9 = r0.a
            fgjb r9 = (defpackage.fgjb) r9
            dlgb r1 = r0.h
            dlhr r0 = r0.g
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L3b
            goto Lb0
        L3b:
            r8 = move-exception
            goto Lbd
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            fgjb r9 = (defpackage.fgjb) r9
            java.lang.Object r2 = r0.a
            dlhe r2 = (defpackage.dlhe) r2
            dlgb r4 = r0.h
            dlhr r5 = r0.g
            defpackage.ffci.b(r10)     // Catch: java.lang.Throwable -> L3b
            goto L9c
        L58:
            java.lang.Object r8 = r0.b
            fgjb r8 = (defpackage.fgjb) r8
            java.lang.Object r9 = r0.a
            dlhe r9 = (defpackage.dlhe) r9
            dlgb r2 = r0.h
            dlhr r5 = r0.g
            defpackage.ffci.b(r10)
            r10 = r8
            r8 = r2
            goto L82
        L6a:
            defpackage.ffci.b(r10)
            fgjb r10 = r7.h(r8)
            r0.g = r7
            r0.h = r8
            r0.a = r9
            r0.b = r10
            r0.f = r5
            java.lang.Object r2 = r10.a(r6, r0)
            if (r2 == r1) goto Lc1
            r5 = r7
        L82:
            dlhj r2 = r5.f(r9)     // Catch: java.lang.Throwable -> Lbb
            r0.g = r5     // Catch: java.lang.Throwable -> Lbb
            r0.h = r8     // Catch: java.lang.Throwable -> Lbb
            r0.a = r9     // Catch: java.lang.Throwable -> Lbb
            r0.b = r10     // Catch: java.lang.Throwable -> Lbb
            r0.c = r2     // Catch: java.lang.Throwable -> Lbb
            r0.f = r4     // Catch: java.lang.Throwable -> Lbb
            java.lang.Object r4 = r5.g(r8, r0)     // Catch: java.lang.Throwable -> Lbb
            if (r4 == r1) goto Lc1
            r4 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L9c:
            r0.g = r5     // Catch: java.lang.Throwable -> L3b
            r0.h = r4     // Catch: java.lang.Throwable -> L3b
            r0.a = r9     // Catch: java.lang.Throwable -> L3b
            r0.b = r8     // Catch: java.lang.Throwable -> L3b
            r0.c = r6     // Catch: java.lang.Throwable -> L3b
            r0.f = r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r10 = r8.e(r4, r2, r0)     // Catch: java.lang.Throwable -> L3b
            if (r10 == r1) goto Lc1
            r1 = r4
            r0 = r5
        Lb0:
            j$.util.concurrent.ConcurrentHashMap r10 = r0.c     // Catch: java.lang.Throwable -> L3b
            r10.put(r1, r8)     // Catch: java.lang.Throwable -> L3b
            r9.b(r6)
            ffcu r8 = defpackage.ffcu.a
            return r8
        Lbb:
            r8 = move-exception
            r9 = r10
        Lbd:
            r9.b(r6)
            throw r8
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlhr.e(dlgb, dlhe, ffgu):java.lang.Object");
    }

    @Override // defpackage.dlcr
    public final Object i(dlhd dlhdVar, ffgu ffguVar) {
        return f(dlhdVar).i(dlhdVar, ffguVar);
    }
}
