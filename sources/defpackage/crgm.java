package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crgm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crgn b;
    final /* synthetic */ Map c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgm(crgn crgnVar, Map map, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crgnVar;
        this.c = map;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (defpackage.ffqv.a(r9, r12) != r0) goto L14;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r13) {
        /*
            r12 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r12.a
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r13)
            return r13
        Ld:
            java.lang.Object r1 = r12.d
            ffsk r1 = (defpackage.ffsk) r1
            defpackage.ffci.b(r13)
            goto L71
        L15:
            defpackage.ffci.b(r13)
            java.lang.Object r13 = r12.d
            r1 = r13
            ffsk r1 = (defpackage.ffsk) r1
            crgn r5 = r12.b
            java.util.Map r7 = r12.c
            java.util.Map r13 = r5.b
            r3 = r13
            enoz r3 = (defpackage.enoz) r3
            int r3 = r3.d
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r3)
            enhk r13 = (defpackage.enhk) r13
            enip r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L37:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L67
            java.lang.Object r3 = r13.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            r6 = r4
            crgf r6 = (defpackage.crgf) r6
            java.lang.Object r3 = r3.getValue()
            r8 = r3
            crgp r8 = (defpackage.crgp) r8
            ffhe r3 = defpackage.ffhe.a
            ffsm r10 = defpackage.ffsm.a
            ffhd r11 = defpackage.ekxi.a(r3)
            crgk r3 = new crgk
            r4 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            ffss r3 = defpackage.ffra.b(r1, r11, r10, r3)
            r9.add(r3)
            goto L37
        L67:
            r12.d = r1
            r12.a = r2
            java.lang.Object r13 = defpackage.ffqv.a(r9, r12)
            if (r13 == r0) goto Lda
        L71:
            crgn r13 = r12.b
            ffbr r13 = r13.d
            java.lang.Object r13 = r13.b()
            crgy r13 = (defpackage.crgy) r13
            enhk r13 = r13.a()
            java.util.Set r13 = r13.entrySet()
            r13.getClass()
            java.util.Map r4 = r12.c
            crgn r7 = r12.b
            java.util.ArrayList r8 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ffdx.n(r13, r2)
            r8.<init>(r2)
            java.util.Iterator r13 = r13.iterator()
        L99:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r13.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r2.getClass()
            java.lang.Object r3 = r2.getKey()
            r5 = r3
            djro r5 = (defpackage.djro) r5
            java.lang.Object r2 = r2.getValue()
            r6 = r2
            crgf r6 = (defpackage.crgf) r6
            ffhe r2 = defpackage.ffhe.a
            ffsm r9 = defpackage.ffsm.a
            ffhd r10 = defpackage.ekxi.a(r2)
            crgl r2 = new crgl
            r3 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            ffss r2 = defpackage.ffra.b(r1, r10, r9, r2)
            r8.add(r2)
            goto L99
        Lcc:
            r13 = 0
            r12.d = r13
            r13 = 2
            r12.a = r13
            java.lang.Object r13 = defpackage.ffqv.a(r8, r12)
            if (r13 != r0) goto Ld9
            goto Lda
        Ld9:
            return r13
        Lda:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crgm.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        crgm crgmVar = new crgm(this.b, this.c, ffguVar);
        crgmVar.d = obj;
        return crgmVar;
    }
}
