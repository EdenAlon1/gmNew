package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccyv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffdn b;
    final /* synthetic */ ffjn c;
    final /* synthetic */ Map d;
    Object e;
    Object f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccyv(ffgu ffguVar, ffdn ffdnVar, ffjn ffjnVar, Map map) {
        super(2, ffguVar);
        this.b = ffdnVar;
        this.c = ffjnVar;
        this.d = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccyv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0043 -> B:6:0x0044). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.a
            if (r1 == 0) goto L12
            java.lang.Object r1 = r5.f
            java.lang.Object r2 = r5.e
            java.lang.Object r3 = r5.g
            java.util.Map r3 = (java.util.Map) r3
            defpackage.ffci.b(r6)     // Catch: java.util.NoSuchElementException -> L4e
            goto L44
        L12:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.g
            ffsk r6 = (defpackage.ffsk) r6
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            r1 = r6
        L1f:
            ffdn r6 = r5.b     // Catch: java.util.NoSuchElementException -> L4d
            monitor-enter(r6)     // Catch: java.util.NoSuchElementException -> L4d
            ffdn r2 = r5.b     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r2 = r2.removeFirst()     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r6)     // Catch: java.util.NoSuchElementException -> L4d
            ffjn r6 = r5.c     // Catch: java.util.NoSuchElementException -> L4d
            java.util.Map r3 = r5.d     // Catch: java.util.NoSuchElementException -> L4d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.util.NoSuchElementException -> L4d
            r3.getClass()     // Catch: java.util.NoSuchElementException -> L4d
            r5.g = r1     // Catch: java.util.NoSuchElementException -> L4d
            r5.e = r2     // Catch: java.util.NoSuchElementException -> L4d
            r5.f = r1     // Catch: java.util.NoSuchElementException -> L4d
            r4 = 1
            r5.a = r4     // Catch: java.util.NoSuchElementException -> L4d
            java.lang.Object r6 = r6.a(r2, r3, r5)     // Catch: java.util.NoSuchElementException -> L4d
            if (r6 == r0) goto L49
            r3 = r1
        L44:
            r1.put(r2, r6)     // Catch: java.util.NoSuchElementException -> L4e
            r1 = r3
            goto L1f
        L49:
            return r0
        L4a:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.util.NoSuchElementException -> L4d
            throw r0     // Catch: java.util.NoSuchElementException -> L4d
        L4d:
            r3 = r1
        L4e:
            java.util.Map r6 = defpackage.ffew.l(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccyv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ccyv ccyvVar = new ccyv(ffguVar, this.b, this.c, this.d);
        ccyvVar.g = obj;
        return ccyvVar;
    }
}
