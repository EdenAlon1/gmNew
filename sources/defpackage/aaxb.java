package defpackage;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxb implements aawu {
    public final fgcm a;
    private final aspz b;
    private final ffsk c;
    private final eisx d;
    private final ffbr e;
    private Boolean f;

    public aaxb(aspz aspzVar, ffsk ffskVar, ffhd ffhdVar, eisx eisxVar, ffbr ffbrVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        eisxVar.getClass();
        ffbrVar.getClass();
        this.b = aspzVar;
        this.c = ffskVar;
        this.d = eisxVar;
        this.e = ffbrVar;
        this.a = fgdm.a(new aaxe(ffel.a, 14));
    }

    private static final engw g(List list, List list2, boolean z) {
        List am = ffdx.am(list);
        final ArrayList arrayList = new ArrayList(ffdx.n(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((alxr) it.next()).b());
        }
        boolean v = ffdx.v(am, new ffji() { // from class: aawx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar = (alxr) obj;
                alxrVar.getClass();
                return Boolean.valueOf(arrayList.contains(alxrVar.b()));
            }
        });
        boolean z2 = true;
        if ((!z || am.isEmpty()) && v) {
            z2 = false;
        }
        if (z) {
            am.clear();
        }
        if (z2) {
            am.addAll(list2);
        }
        return engq.a(am);
    }

    @Override // defpackage.aawu
    public final /* synthetic */ ffxx a() {
        return this.a;
    }

    @Override // defpackage.aawu
    public final void b() {
        this.a.f(new aaxe(ffel.a, 14));
    }

    @Override // defpackage.aawu
    public final void c(List list) {
        List list2 = ((aaxe) this.a.c()).a;
        axol.k(this.c, null, new aawz(this, g(list2, list, false), list2.isEmpty(), null), 3);
    }

    @Override // defpackage.aawu
    public final void d(final alxr alxrVar, boolean z, aaxg aaxgVar) {
        engw a;
        alxrVar.getClass();
        List list = ((aaxe) this.a.c()).a;
        boolean z2 = z || list.isEmpty();
        if (this.b.a()) {
            a = g(list, alxrVar instanceof aaca ? ((aaca) alxrVar).a : ffdx.b(alxrVar), z);
        } else {
            List am = ffdx.am(list);
            final ffji ffjiVar = new ffji() { // from class: aawv
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    alxr alxrVar2 = (alxr) obj;
                    alxrVar2.getClass();
                    return Boolean.valueOf(ffkj.e(alxrVar2.b(), alxr.this.b()));
                }
            };
            boolean z3 = (z && !am.isEmpty()) || !Collection.EL.removeIf(am, new Predicate() { // from class: aaww
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo439negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) ffji.this.invoke(obj)).booleanValue();
                }
            });
            if (z) {
                am.clear();
            }
            if (z3) {
                am.add(alxrVar);
            }
            a = engq.a(am);
        }
        axol.k(this.c, null, new aaxa(this, a, z, aaxgVar, z2, null), 3);
    }

    @Override // defpackage.aawu
    public final boolean e() {
        return !((aaxe) this.a.c()).a.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aawy
            if (r0 == 0) goto L13
            r0 = r5
            aawy r0 = (defpackage.aawy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aawy r0 = new aawy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            aaxb r1 = r0.e
            aaxb r0 = r0.d
            defpackage.ffci.b(r5)
            goto L52
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            defpackage.ffci.b(r5)
            java.lang.Boolean r5 = r4.f
            if (r5 != 0) goto L5e
            ffbr r5 = r4.e
            java.lang.Object r5 = r5.b()
            cutv r5 = (defpackage.cutv) r5
            eisx r2 = r4.d
            r0.d = r4
            r0.e = r4
            r0.c = r3
            java.lang.Object r5 = r5.c(r2, r0)
            if (r5 == r1) goto L5d
            r0 = r4
            r1 = r0
        L52:
            cutr r5 = (defpackage.cutr) r5
            boolean r5 = r5.a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r1.f = r5
            goto L5f
        L5d:
            return r1
        L5e:
            r0 = r4
        L5f:
            java.lang.Boolean r5 = r0.f
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aaxb.f(ffgu):java.lang.Object");
    }
}
