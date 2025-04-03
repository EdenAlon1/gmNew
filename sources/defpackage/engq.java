package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class engq {
    public static final /* synthetic */ engw a(Collection collection) {
        collection.getClass();
        engw n = engw.n(collection);
        n.getClass();
        return n;
    }

    public static final /* synthetic */ engw b(ffnl ffnlVar) {
        engw o = engw.o(ffnlVar.a());
        o.getClass();
        return o;
    }

    public static final /* synthetic */ engw c(Object[] objArr) {
        engw p = engw.p(objArr);
        p.getClass();
        return p;
    }

    public static final /* synthetic */ enhk d(Iterable iterable) {
        enhd enhdVar = new enhd();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ffcf ffcfVar = (ffcf) it.next();
            Object obj = ffcfVar.a;
            Object obj2 = ffcfVar.b;
            obj.getClass();
            obj2.getClass();
            enhdVar.k(obj, obj2);
        }
        return enhdVar.c();
    }

    public static final /* synthetic */ enhk e(Map map) {
        map.getClass();
        enhk j = enhk.j(map);
        j.getClass();
        return j;
    }

    public static final /* synthetic */ enip f(Collection collection) {
        collection.getClass();
        enip o = enip.o(collection);
        o.getClass();
        return o;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ java.lang.Object g(defpackage.ffxx r4, defpackage.ffgu r5) {
        /*
            boolean r0 = r5 instanceof defpackage.engo
            if (r0 == 0) goto L13
            r0 = r5
            engo r0 = (defpackage.engo) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            engo r0 = new engo
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            engr r4 = r0.c
            defpackage.ffci.b(r5)
            goto L4b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.ffci.b(r5)
            int r5 = defpackage.engw.d
            engr r5 = new engr
            r5.<init>()
            engp r2 = new engp
            r2.<init>(r5)
            r0.c = r5
            r0.b = r3
            java.lang.Object r4 = r4.a(r2, r0)
            if (r4 == r1) goto L53
            r4 = r5
        L4b:
            engw r4 = r4.g()
            r4.getClass()
            return r4
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.engq.g(ffxx, ffgu):java.lang.Object");
    }
}
