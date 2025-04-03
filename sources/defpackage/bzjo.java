package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzjo extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ List g;
    final /* synthetic */ bzjx h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzjo(List list, bzjx bzjxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = list;
        this.h = bzjxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzjo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:6:0x005f, B:7:0x0036, B:9:0x003c, B:14:0x0067, B:16:0x006c, B:19:0x0094, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:29:0x008c, B:32:0x0090, B:39:0x0024), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:5:0x0010, B:6:0x005f, B:7:0x0036, B:9:0x003c, B:14:0x0067, B:16:0x006c, B:19:0x0094, B:23:0x0073, B:24:0x0077, B:26:0x007d, B:29:0x008c, B:32:0x0090, B:39:0x0024), top: B:2:0x0004 }] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005e -> B:6:0x005f). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r7) {
        /*
            r6 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.f
            if (r1 == 0) goto L17
            java.lang.Object r1 = r6.e
            java.lang.Object r2 = r6.d
            java.lang.Object r3 = r6.c
            java.lang.Object r4 = r6.b
            java.lang.Object r5 = r6.a
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L5f
        L14:
            r7 = move-exception
            goto L9e
        L17:
            defpackage.ffci.b(r7)
            java.util.List r7 = r6.g
            bzjx r1 = r6.h
            java.lang.String r2 = "GaiaDevicePairingManagerImpl#deleteDesktopsByIds"
            ekzz r4 = defpackage.eleg.f(r2)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L14
            r3 = 10
            int r3 = defpackage.ffdx.n(r7, r3)     // Catch: java.lang.Throwable -> L14
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L14
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L14
            r5 = r1
            r1 = r2
            r2 = r7
        L36:
            boolean r7 = r2.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L67
            java.lang.Object r7 = r2.next()     // Catch: java.lang.Throwable -> L14
            bzge r7 = (defpackage.bzge) r7     // Catch: java.lang.Throwable -> L14
            r3 = r5
            bzjx r3 = (defpackage.bzjx) r3     // Catch: java.lang.Throwable -> L14
            chvu r3 = r3.e     // Catch: java.lang.Throwable -> L14
            elfl r7 = r3.b(r7)     // Catch: java.lang.Throwable -> L14
            r6.a = r5     // Catch: java.lang.Throwable -> L14
            r6.b = r4     // Catch: java.lang.Throwable -> L14
            r6.c = r1     // Catch: java.lang.Throwable -> L14
            r6.d = r2     // Catch: java.lang.Throwable -> L14
            r6.e = r1     // Catch: java.lang.Throwable -> L14
            r3 = 1
            r6.f = r3     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = defpackage.fgfz.c(r7, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 == r0) goto L66
            r3 = r1
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L14
            r1.add(r7)     // Catch: java.lang.Throwable -> L14
            r1 = r3
            goto L36
        L66:
            return r0
        L67:
            boolean r7 = r1 instanceof java.util.Collection     // Catch: java.lang.Throwable -> L14
            r0 = 0
            if (r7 == 0) goto L73
            boolean r7 = r1.isEmpty()     // Catch: java.lang.Throwable -> L14
            if (r7 == 0) goto L73
            goto L94
        L73:
            java.util.Iterator r7 = r1.iterator()     // Catch: java.lang.Throwable -> L14
        L77:
            boolean r1 = r7.hasNext()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L94
            java.lang.Object r1 = r7.next()     // Catch: java.lang.Throwable -> L14
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L14
            r1.getClass()     // Catch: java.lang.Throwable -> L14
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L77
            int r0 = r0 + 1
            if (r0 >= 0) goto L77
            defpackage.ffdx.k()     // Catch: java.lang.Throwable -> L14
            goto L77
        L94:
            java.lang.Integer r7 = new java.lang.Integer     // Catch: java.lang.Throwable -> L14
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L14
            r0 = 0
            defpackage.ffig.a(r4, r0)
            return r7
        L9e:
            throw r7     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            defpackage.ffig.a(r4, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzjo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bzjo(this.g, this.h, ffguVar);
    }
}
