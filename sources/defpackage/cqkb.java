package defpackage;

import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqkb {
    public static final cfup a = cfvl.f(cfvl.b, "forward_sync_max_merged_spot_syncs", 20);
    public static final ffbz b = ffca.a(new ffix() { // from class: cqka
        @Override // defpackage.ffix
        public final Object invoke() {
            cfup cfupVar = cqkb.a;
            return new cqkc(new ffjm() { // from class: cqjy
                /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
                
                    if (defpackage.cqjo.c((defpackage.cqgj) r0, r7) != false) goto L24;
                 */
                @Override // defpackage.ffjm
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object a(java.lang.Object r7, java.lang.Object r8) {
                    /*
                        r6 = this;
                        cqgj r7 = (defpackage.cqgj) r7
                        java.util.Collection r8 = (java.util.Collection) r8
                        cfup r0 = defpackage.cqkb.a
                        r7.getClass()
                        r8.getClass()
                        boolean r0 = defpackage.cqjg.g(r7)
                        r1 = 0
                        if (r0 == 0) goto L5a
                        boolean r0 = defpackage.cqjg.d(r8)
                        if (r0 == 0) goto L5a
                        boolean r0 = defpackage.cqjg.c(r8)
                        r2 = 1
                        if (r0 == 0) goto L59
                        java.util.Iterator r8 = r8.iterator()
                        r0 = 0
                        r3 = r1
                    L26:
                        boolean r4 = r8.hasNext()
                        if (r4 == 0) goto L46
                        java.lang.Object r4 = r8.next()
                        r5 = r4
                        cqgj r5 = (defpackage.cqgj) r5
                        boolean r5 = defpackage.cqjg.f(r5)
                        if (r5 == 0) goto L26
                        if (r3 != 0) goto L3e
                        r3 = r2
                        r0 = r4
                        goto L26
                    L3e:
                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                        java.lang.String r8 = "Collection contains more than one matching element."
                        r7.<init>(r8)
                        throw r7
                    L46:
                        if (r3 == 0) goto L51
                        cqgj r0 = (defpackage.cqgj) r0
                        boolean r7 = defpackage.cqjo.c(r0, r7)
                        if (r7 == 0) goto L59
                        goto L5a
                    L51:
                        java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
                        java.lang.String r8 = "Collection contains no element matching the predicate."
                        r7.<init>(r8)
                        throw r7
                    L59:
                        r1 = r2
                    L5a:
                        java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cqjy.a(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, new ffjm() { // from class: cqjz
                @Override // defpackage.ffjm
                public final Object a(Object obj, Object obj2) {
                    cqgj cqgjVar = (cqgj) obj;
                    Collection collection = (Collection) obj2;
                    cfup cfupVar2 = cqkb.a;
                    cqgjVar.getClass();
                    collection.getClass();
                    boolean z = false;
                    Object obj3 = null;
                    for (Object obj4 : collection) {
                        if (cqjg.g((cqgj) obj4)) {
                            if (z) {
                                throw new IllegalArgumentException("Collection contains more than one matching element.");
                            }
                            z = true;
                            obj3 = obj4;
                        }
                    }
                    if (!z) {
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    cqgj cqgjVar2 = (cqgj) obj3;
                    cqge cqgeVar = (cqge) cqgjVar2.toBuilder();
                    cqgeVar.getClass();
                    DesugarCollections.unmodifiableList(((cqgj) cqgeVar.instance).h).getClass();
                    cqgeVar.copyOnWrite();
                    cqgj cqgjVar3 = (cqgj) cqgeVar.instance;
                    cqgjVar3.a();
                    cqgjVar3.h.add(cqgjVar);
                    cqgc cqgcVar = (cqgc) cqgs.b(cqgeVar).toBuilder();
                    cqgcVar.getClass();
                    eyja eyjaVar = ((cqgd) cqgcVar.instance).e;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    eyjaVar.getClass();
                    eyja eyjaVar2 = (cqgjVar.c == 5 ? (cqgd) cqgjVar.d : cqgd.a).d;
                    if (eyjaVar2 == null) {
                        eyjaVar2 = eyja.a;
                    }
                    eyjaVar2.getClass();
                    cqgr.c(cqjh.a(eyjaVar, eyjaVar2), cqgcVar);
                    eyja eyjaVar3 = ((cqgd) cqgcVar.instance).f;
                    if (eyjaVar3 == null) {
                        eyjaVar3 = eyja.a;
                    }
                    eyjaVar3.getClass();
                    eyja eyjaVar4 = (cqgjVar.c == 5 ? (cqgd) cqgjVar.d : cqgd.a).d;
                    if (eyjaVar4 == null) {
                        eyjaVar4 = eyja.a;
                    }
                    eyjaVar4.getClass();
                    eyja eyjaVar5 = eykm.a;
                    eykl eyklVar = eykl.a;
                    eyklVar.getClass();
                    if (eyklVar.compare(eyjaVar3, eyjaVar4) < 0) {
                        eyjaVar3 = eyjaVar4;
                    }
                    cqgr.d(eyjaVar3, cqgcVar);
                    cqgs.f(cqgr.a(cqgcVar), cqgeVar);
                    cqgj c = cqgs.c(cqgeVar);
                    List ae = ffdx.ae(ffdx.ac(collection, cqgjVar2), c);
                    eyee eyeeVar = c.e;
                    eyeeVar.getClass();
                    return new cqjk(ae, 7, ffdx.b(new cqji(cqgjVar, eyeeVar)), ((long) c.h.size()) >= ((Number) cqkb.a.e()).longValue() ? eqqh.TOO_MANY_SPOT_SYNCS : null);
                }
            });
        }
    });
}
