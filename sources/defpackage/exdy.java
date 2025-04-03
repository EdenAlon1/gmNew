package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exdy implements exdv {
    private final enyw a;

    public exdy(enyw enywVar) {
        this.a = enywVar;
    }

    @Override // defpackage.exdv
    public final boolean a(double d, double d2, double d3) {
        enxs enxsVar;
        enxs enxsVar2;
        double d4;
        enyr e = enyj.c(d, d2).e();
        boolean z = true;
        if (this.a.e(e)) {
            return true;
        }
        double d5 = eobe.a;
        if (d3 <= eobe.a) {
            return false;
        }
        enyw enywVar = this.a;
        if (enywVar.e(e)) {
            enxsVar = new enxs(eobe.a);
        } else {
            double d6 = 3.141592653589793d;
            enxs enxsVar3 = new enxs(3.141592653589793d);
            int i = 0;
            while (i < enywVar.a()) {
                enyp b = enywVar.b(i);
                enyr m = enyr.m(e);
                enxs enxsVar4 = new enxs(d6);
                int i2 = 0;
                while (i2 < b.c) {
                    enyr d7 = b.d(i2);
                    i2++;
                    boolean z2 = z;
                    enyr d8 = b.d(i2);
                    double d9 = enyd.a;
                    double d10 = d5;
                    emxf.f(enxw.d(m), "S2Point not normalized: %s", m);
                    emxf.f(enxw.d(d7), "S2Point not normalized: %s", d7);
                    emxf.f(enxw.d(d8), "S2Point not normalized: %s", d8);
                    enyr b2 = enzw.b(d7, d8);
                    if (enyr.f(d7, m, b2) <= d10 || enyr.f(d8, b2, m) <= d10) {
                        double a = enyd.a(m, d7);
                        enxsVar2 = enxsVar3;
                        double asin = Math.asin(Math.min(1.0d, Math.sqrt(Math.min(a, enyd.a(m, d8))) * 0.5d));
                        d4 = asin + asin;
                    } else {
                        d4 = Math.asin(Math.min(1.0d, Math.abs(m.a(b2)) / b2.d()));
                        enxsVar2 = enxsVar3;
                    }
                    enxsVar4 = enxs.c(enxsVar4, new enxs(d4));
                    z = z2;
                    d5 = d10;
                    enxsVar3 = enxsVar2;
                }
                enxsVar3 = enxs.c(enxsVar3, enxsVar4);
                i++;
                d6 = 3.141592653589793d;
            }
            enxsVar = enxsVar3;
        }
        boolean z3 = z;
        if (enxsVar.c * 6371010.0d < d3) {
            return z3;
        }
        return false;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v14 int, still in use, count: 2, list:
          (r14v14 int) from 0x013f: IF  (r14v14 int) >= (r10v20 int)  -> B:68:0x0141 A[HIDDEN] (LINE:320)
          (r14v14 int) from 0x0146: PHI (r14v10 int) = (r14v9 int), (r14v14 int) binds: [B:88:0x0145, B:67:0x013f] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1085)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x053b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x04f3  */
    @Override // defpackage.exdv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            Method dump skipped, instructions count: 1397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exdy.b():boolean");
    }
}
