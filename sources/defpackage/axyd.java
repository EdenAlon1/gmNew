package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axyd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ axyy c;
    Object d;
    Object e;
    Object f;
    Object g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axyd(ffgu ffguVar, List list, axyy axyyVar) {
        super(2, ffguVar);
        this.b = list;
        this.c = axyyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axyd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00be A[Catch: all -> 0x0013, LOOP:0: B:8:0x00b8->B:10:0x00be, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0013, blocks: (B:6:0x000e, B:7:0x00ad, B:8:0x00b8, B:10:0x00be), top: B:5:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062 A[Catch: all -> 0x00d1, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:28:0x005c, B:30:0x0062, B:34:0x0099, B:45:0x0037), top: B:44:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0099 A[Catch: all -> 0x00d1, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00d1, blocks: (B:28:0x005c, B:30:0x0062, B:34:0x0099, B:45:0x0037), top: B:44:0x0037 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0090 -> B:25:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L16
            java.lang.Object r0 = r11.h
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L13
            goto Lad
        L13:
            r12 = move-exception
            goto Ld3
        L16:
            java.lang.Object r1 = r11.g
            java.lang.Object r4 = r11.f
            java.lang.Object r5 = r11.e
            java.lang.Object r6 = r11.d
            java.lang.Object r7 = r11.h
            ffsk r7 = (defpackage.ffsk) r7
            defpackage.ffci.b(r12)     // Catch: java.lang.Throwable -> L26
            goto L92
        L26:
            r12 = move-exception
            r0 = r6
            goto Ld3
        L2a:
            defpackage.ffci.b(r12)
            java.lang.Object r12 = r11.h
            ffsk r12 = (defpackage.ffsk) r12
            java.lang.String r1 = "Cp2DataService#queryContactsByContactIds"
            ekzz r1 = defpackage.eleg.f(r1)
            java.util.List r4 = r11.b     // Catch: java.lang.Throwable -> Ld1
            cfup r5 = defpackage.axum.i     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r5 = r5.e()     // Catch: java.lang.Throwable -> Ld1
            r5.getClass()     // Catch: java.lang.Throwable -> Ld1
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> Ld1
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> Ld1
            java.util.List r4 = defpackage.ffdx.W(r4, r5)     // Catch: java.lang.Throwable -> Ld1
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ld1
            r6 = 10
            int r6 = defpackage.ffdx.n(r4, r6)     // Catch: java.lang.Throwable -> Ld1
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Ld1
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Ld1
            r7 = r12
        L5c:
            boolean r12 = r4.hasNext()     // Catch: java.lang.Throwable -> Ld1
            if (r12 == 0) goto L99
            java.lang.Object r12 = r4.next()     // Catch: java.lang.Throwable -> Ld1
            java.util.List r12 = (java.util.List) r12     // Catch: java.lang.Throwable -> Ld1
            axyy r6 = r11.c     // Catch: java.lang.Throwable -> Ld1
            axye r8 = new axye     // Catch: java.lang.Throwable -> Ld1
            r8.<init>(r6, r12)     // Catch: java.lang.Throwable -> Ld1
            r11.h = r7     // Catch: java.lang.Throwable -> Ld1
            r11.d = r1     // Catch: java.lang.Throwable -> Ld1
            r11.e = r5     // Catch: java.lang.Throwable -> Ld1
            r11.f = r4     // Catch: java.lang.Throwable -> Ld1
            r11.g = r5     // Catch: java.lang.Throwable -> Ld1
            r11.a = r2     // Catch: java.lang.Throwable -> Ld1
            java.lang.String[] r12 = defpackage.axyy.a     // Catch: java.lang.Throwable -> Ld1
            ffhe r12 = defpackage.ffhe.a     // Catch: java.lang.Throwable -> Ld1
            ffsm r9 = defpackage.ffsm.a     // Catch: java.lang.Throwable -> Ld1
            ffhd r12 = defpackage.ekxi.a(r12)     // Catch: java.lang.Throwable -> Ld1
            axyu r10 = new axyu     // Catch: java.lang.Throwable -> Ld1
            r10.<init>(r3, r6, r8)     // Catch: java.lang.Throwable -> Ld1
            ffss r12 = defpackage.ffra.b(r7, r12, r9, r10)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == r0) goto Ld0
            r6 = r1
            r1 = r5
        L92:
            ffss r12 = (defpackage.ffss) r12     // Catch: java.lang.Throwable -> L26
            r1.add(r12)     // Catch: java.lang.Throwable -> L26
            r1 = r6
            goto L5c
        L99:
            r11.h = r1     // Catch: java.lang.Throwable -> Ld1
            r11.d = r3     // Catch: java.lang.Throwable -> Ld1
            r11.e = r3     // Catch: java.lang.Throwable -> Ld1
            r11.f = r3     // Catch: java.lang.Throwable -> Ld1
            r11.g = r3     // Catch: java.lang.Throwable -> Ld1
            r12 = 2
            r11.a = r12     // Catch: java.lang.Throwable -> Ld1
            java.lang.Object r12 = defpackage.ffqv.a(r5, r11)     // Catch: java.lang.Throwable -> Ld1
            if (r12 == r0) goto Ld0
            r0 = r1
        Lad:
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L13
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L13
        Lb8:
            boolean r2 = r12.hasNext()     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r12.next()     // Catch: java.lang.Throwable -> L13
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L13
            java.util.List r2 = defpackage.ffdx.ak(r2)     // Catch: java.lang.Throwable -> L13
            defpackage.ffdx.w(r1, r2)     // Catch: java.lang.Throwable -> L13
            goto Lb8
        Lcc:
            defpackage.ffig.a(r0, r3)
            return r1
        Ld0:
            return r0
        Ld1:
            r12 = move-exception
            r0 = r1
        Ld3:
            throw r12     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            r1 = move-exception
            defpackage.ffig.a(r0, r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axyd.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axyd axydVar = new axyd(ffguVar, this.b, this.c);
        axydVar.h = obj;
        return axydVar;
    }
}
