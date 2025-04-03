package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdxe implements cdwr {
    public static final int a;
    public final Map b;
    public final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffhd f;

    static {
        Object e = csgj.C.e();
        e.getClass();
        a = ((Number) e).intValue();
    }

    public cdxe(Map map, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffhd ffhdVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffhdVar.getClass();
        this.b = map;
        this.d = ffbrVar;
        this.c = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffhdVar;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        cccc ccccVar = ((ccca) obj).c;
        if (ccccVar == null) {
            ccccVar = cccc.a;
        }
        return ccccVar.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r4v3, types: [comc, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ccbz r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cdxa
            if (r0 == 0) goto L13
            r0 = r8
            cdxa r0 = (defpackage.cdxa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cdxa r0 = new cdxa
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L80
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            defpackage.ffci.b(r8)
            axem r8 = defpackage.axem.a
            eyfq r8 = r8.createBuilder()
            axel r8 = (defpackage.axel) r8
            r8.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r2 = r8.instance
            axem r2 = (defpackage.axem) r2
            r2.c = r3
            int r4 = r2.b
            r4 = r4 | r3
            r2.b = r4
            eyfy r8 = r8.build()
            r8.getClass()
            ffbr r2 = r6.d
            axem r8 = (defpackage.axem) r8
            java.lang.Object r2 = r2.b()
            axkm r2 = (defpackage.axkm) r2
            java.lang.String r7 = r7.name()
            emyl r4 = r2.e
            java.lang.Object r4 = r4.get()
            axis r5 = new axis
            r5.<init>()
            elfl r7 = r4.j(r5)
            axit r8 = new axit
            r8.<init>()
            errl r2 = r2.f
            elfl r7 = r7.h(r8, r2)
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 != r1) goto L80
            return r1
        L80:
            ceyt r7 = defpackage.ceyt.i()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdxe.b(ccbz, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        ccca cccaVar = (ccca) obj2;
        ccbz b = ccbz.b(cccaVar.d);
        if (b == null) {
            b = ccbz.UNSPECIFIED;
        }
        b.getClass();
        cccc ccccVar = cccaVar.c;
        if (ccccVar == null) {
            ccccVar = cccc.a;
        }
        if (ccccVar.f <= 0) {
            ((akzt) this.e.b()).e("Bugle.Cms.Backfill.MissingFieldTask.Count", b.e);
        }
        cccc ccccVar2 = cccaVar.c;
        if (ccccVar2 == null) {
            ccccVar2 = cccc.a;
        }
        int i = ccccVar2.d;
        if (i != 1) {
            if (i == 2) {
                return ffra.a(ekxi.a(this.f), new cdxb(null, cccaVar, this), ffguVar);
            }
            if (i == 3) {
                return ffra.a(ekxi.a(this.f), new cdxd(null, cccaVar, this), ffguVar);
            }
            if (i != 5) {
                return ceyt.k();
            }
        }
        return ffra.a(ekxi.a(this.f), new cdxc(null, cccaVar, this), ffguVar);
    }
}
