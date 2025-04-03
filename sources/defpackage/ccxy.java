package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccxy implements ccvq {
    public static final eyfh a;
    public static final esze b;
    public final crty c;
    public final ffhd d;
    public final ffhd e;

    static {
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.getClass();
        eyfi.b(eyfgVar);
        eyfgVar.a("conversation_id");
        eyfi.b(eyfgVar);
        eyfgVar.a("message_content.from_address");
        eyfi.b(eyfgVar);
        eyfgVar.a("message_content.to_addresses");
        eyfi.b(eyfgVar);
        eyfgVar.a("labels");
        a = eyfi.a(eyfgVar);
        eszd eszdVar = (eszd) esze.a.createBuilder();
        eszdVar.getClass();
        eszf.b(eszdVar);
        eszf.c(eszdVar);
        b = eszf.a(eszdVar);
    }

    public ccxy(crty crtyVar, ffhd ffhdVar, ffhd ffhdVar2) {
        crtyVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        this.c = crtyVar;
        this.d = ffhdVar;
        this.e = ffhdVar2;
    }

    @Override // defpackage.ccvq
    public final Object a(Map map, ccvl ccvlVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.d), new ccxk(null, map, this, ccvlVar), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.ccvq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, defpackage.ccvl r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ccxm
            if (r0 == 0) goto L13
            r0 = r8
            ccxm r0 = (defpackage.ccxm) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccxm r0 = new ccxm
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.d
            ffhd r8 = defpackage.ekxi.a(r8)
            ccxn r2 = new ccxn
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            ffch r8 = (defpackage.ffch) r8
            java.lang.Object r6 = r8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxy.b(java.lang.String, ccvl, ffgu):java.lang.Object");
    }

    @Override // defpackage.ccvq
    public final /* bridge */ /* synthetic */ Object c(Object obj, ccvl ccvlVar, EnumSet enumSet, ffgu ffguVar) {
        return e((eszz) obj, ccvlVar, ffguVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.Map r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ccxo
            if (r0 == 0) goto L13
            r0 = r6
            ccxo r0 = (defpackage.ccxo) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ccxo r0 = new ccxo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Object r5 = r0.a
            defpackage.ffci.b(r6)
            goto L4c
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.ffci.b(r6)
            crty r6 = r4.c
            java.util.Collection r2 = r5.values()
            engw r2 = defpackage.engq.a(r2)
            elfl r6 = r6.d(r2)
            r0.a = r5
            r0.d = r3
            java.lang.Object r6 = defpackage.fgfz.c(r6, r0)
            if (r6 == r1) goto Lc2
        L4c:
            esvo r6 = (defpackage.esvo) r6
            eygr r0 = r6.b
            r0.getClass()
            eygr r6 = r6.c
            r6.getClass()
            java.util.List r6 = defpackage.ffdx.an(r0, r6)
            java.util.Set r5 = r5.keySet()
            java.util.Iterator r0 = r6.iterator()
            java.util.Iterator r1 = r5.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r6 = defpackage.ffdx.n(r6, r3)
            int r5 = defpackage.ffdx.n(r5, r3)
            int r5 = java.lang.Math.min(r6, r5)
            r2.<init>(r5)
        L7b:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto Lbd
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto Lbd
            java.lang.Object r5 = r0.next()
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            ffcf r5 = (defpackage.ffcf) r5
            java.lang.Object r3 = r5.a
            eszz r3 = (defpackage.eszz) r3
            java.lang.Object r5 = r5.b
            fagm r5 = (defpackage.fagm) r5
            int r5 = r5.b
            if (r5 != 0) goto La2
            java.lang.String r5 = r3.c
            goto Laf
        La2:
            fedn r3 = new fedn
            io.grpc.Status r5 = io.grpc.Status.fromCodeValue(r5)
            r3.<init>(r5)
            java.lang.Object r5 = defpackage.ffci.a(r3)
        Laf:
            ffch r3 = new ffch
            r3.<init>(r5)
            ffcf r5 = new ffcf
            r5.<init>(r6, r3)
            r2.add(r5)
            goto L7b
        Lbd:
            java.util.Map r5 = defpackage.ffew.k(r2)
            return r5
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxy.d(java.util.Map, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eszz r6, defpackage.ccvl r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ccxw
            if (r0 == 0) goto L13
            r0 = r8
            ccxw r0 = (defpackage.ccxw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ccxw r0 = new ccxw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r8)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r8)
            ffhd r8 = r5.d
            ffhd r8 = defpackage.ekxi.a(r8)
            ccxx r2 = new ccxx
            r4 = 0
            r2.<init>(r4, r5, r6, r7)
            r0.c = r3
            java.lang.Object r8 = defpackage.ffra.a(r8, r2, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            ffch r8 = (defpackage.ffch) r8
            java.lang.Object r6 = r8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccxy.e(eszz, ccvl, ffgu):java.lang.Object");
    }
}
