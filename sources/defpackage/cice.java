package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cice implements cifa {
    public static final entd a = entd.c("BugleGDitto");
    public final Optional b;
    public final cgvp c;
    public final ffbr d;
    private final Context e;
    private final ffsk f;
    private final ffsk g;
    private final bzgd h;
    private final cibf i;
    private final ffbr j;
    private final ffbr k;
    private final Optional l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;

    /* compiled from: PG */
    public interface a {
        cgxh dd();
    }

    public cice(Context context, ffsk ffskVar, ffsk ffskVar2, bzgd bzgdVar, cibf cibfVar, Optional optional, ffbr ffbrVar, cgvp cgvpVar, ffbr ffbrVar2, Optional optional2, cgvn cgvnVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        bzgdVar.getClass();
        cibfVar.getClass();
        cgvpVar.getClass();
        ffbrVar2.getClass();
        optional2.getClass();
        cgvnVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.e = context;
        this.f = ffskVar;
        this.g = ffskVar2;
        this.h = bzgdVar;
        this.i = cibfVar;
        this.b = optional;
        this.j = ffbrVar;
        this.c = cgvpVar;
        this.k = ffbrVar2;
        this.l = optional2;
        this.d = ffbrVar3;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.p = ffbrVar7;
    }

    static /* synthetic */ Optional m(cice ciceVar, String str, String str2, eslj esljVar, fagh faghVar, esaa esaaVar) {
        ffbr ffbrVar = ciceVar.k;
        ((bzea) ffbrVar.b()).t(ciceVar.e(esaaVar), 2, str2, str, esljVar, faghVar);
        esli esliVar = (esli) eslk.a.createBuilder();
        esliVar.getClass();
        esll.f(str, esliVar);
        esll.d(esljVar, esliVar);
        esll.g(faghVar, esliVar);
        return Optional.of(esll.a(esliVar));
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return ciez.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        return elfo.c();
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        if (((cgcu) this.j.b()).a()) {
            eslh eslhVar = (eslh) eyfy.parseFrom(eslh.a, eyeeVar, eyfc.a());
            eslhVar.getClass();
            return eslhVar;
        }
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.O, "CreateGaiaPairingDelegate");
        enszVar.q("Gaia Pairing is disabled. Skipping parseRequest in delegate.");
        eslg eslgVar = (eslg) eslh.a.createBuilder();
        eslgVar.getClass();
        eyfy build = eslgVar.build();
        build.getClass();
        return (eslh) build;
    }

    @Override // defpackage.cifa
    public final /* bridge */ /* synthetic */ elfl d(ciff ciffVar, eyhs eyhsVar) {
        elfl c;
        elfl c2;
        eslh eslhVar = (eslh) eyhsVar;
        eslhVar.getClass();
        if (((cgcu) this.j.b()).a()) {
            c = axol.c(this.f, ffhe.a, ffsm.a, new cicm(ciffVar, this, eslhVar, null));
            return c;
        }
        ensz enszVar = (ensz) a.j();
        enszVar.Y(csux.O, "CreateGaiaPairingDelegate");
        enszVar.q("Gaia Pairing is disabled. Skipping handleRequestInternal in delegate.");
        c2 = axol.c(this.g, ffhe.a, ffsm.a, new cick(null));
        return c2;
    }

    public final ezlj e(esaa esaaVar) {
        int ordinal = esaaVar.ordinal();
        return ordinal != 42 ? ordinal != 43 ? ezlj.UNKNOWN_EVENT_TYPE : ezlj.CREATE_GAIA_PAIRING_CLIENT_FINISHED : ezlj.CREATE_GAIA_PAIRING_CLIENT_INIT;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.faom r8, java.lang.String r9, java.lang.String r10, defpackage.esaa r11, int r12, int r13, defpackage.ffgu r14) {
        /*
            r7 = this;
            boolean r0 = r14 instanceof defpackage.cicf
            if (r0 == 0) goto L13
            r0 = r14
            cicf r0 = (defpackage.cicf) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cicf r0 = new cicf
            r0.<init>(r7, r14)
        L18:
            java.lang.Object r14 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L35
            int r13 = r0.b
            int r12 = r0.a
            byte[] r8 = r0.j
            esaa r11 = r0.i
            java.lang.String r10 = r0.h
            java.lang.String r9 = r0.g
            cice r0 = r0.f
            defpackage.ffci.b(r14)
            goto L6b
        L35:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3d:
            defpackage.ffci.b(r14)
            ffbr r14 = r7.d
            java.lang.Object r14 = r14.b()
            cgvm r14 = (defpackage.cgvm) r14
            byte[] r8 = r14.k(r8)
            ffbr r14 = r7.d
            java.lang.Object r14 = r14.b()
            cgvm r14 = (defpackage.cgvm) r14
            r0.f = r7
            r0.g = r9
            r0.h = r10
            r0.i = r11
            r0.j = r8
            r0.a = r12
            r0.b = r13
            r0.e = r3
            java.lang.Object r14 = r14.f(r0)
            if (r14 == r1) goto Ld3
            r0 = r7
        L6b:
            r1 = r9
            r2 = r10
            r3 = r14
            eslj r3 = (defpackage.eslj) r3
            if (r3 == 0) goto L87
            ezlj r4 = r0.e(r11)
            ffbr r8 = r0.d
            java.lang.Object r8 = r8.b()
            r0 = r8
            cgvm r0 = (defpackage.cgvm) r0
            r5 = 0
            r6 = 48
            j$.util.Optional r8 = defpackage.cgvm.r(r0, r1, r2, r3, r4, r5, r6)
            return r8
        L87:
            ffbr r9 = r0.d
            java.lang.Object r9 = r9.b()
            cgvm r9 = (defpackage.cgvm) r9
            ezlj r3 = r0.e(r11)
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r12)
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r13)
            r6 = 32
            r0 = r9
            defpackage.cgvm.m(r0, r1, r2, r3, r4, r5, r6)
            eslk r9 = defpackage.eslk.a
            eyfq r9 = r9.createBuilder()
            esli r9 = (defpackage.esli) r9
            r9.getClass()
            faom r10 = defpackage.faom.a
            eyfy r8 = defpackage.eyfy.parseFrom(r10, r8)
            faom r8 = (defpackage.faom) r8
            defpackage.esll.h(r8, r9)
            defpackage.esll.i(r9)
            defpackage.esll.f(r1, r9)
            fagh r8 = defpackage.fagh.OK
            defpackage.esll.g(r8, r9)
            defpackage.esll.c(r12, r9)
            defpackage.esll.b(r13, r9)
            eslk r8 = defpackage.esll.a(r9)
            j$.util.Optional r8 = j$.util.Optional.of(r8)
            return r8
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.f(faom, java.lang.String, java.lang.String, esaa, int, int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(byte[] r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.g(byte[], ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x023f, code lost:
    
        if (r0.a(null, r10) != r3) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.ciff r21, defpackage.eslh r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.h(ciff, eslh, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v9, types: [bzme, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.ciff r6, defpackage.ffgu r7) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.i(ciff, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x033d, code lost:
    
        if (r3 != r5) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x019a, code lost:
    
        if (r7 <= 0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.cgvo r19, defpackage.ciff r20, defpackage.eslh r21, defpackage.esaa r22, java.lang.String r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.j(cgvo, ciff, eslh, esaa, java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.eslh r18, defpackage.esaa r19, java.lang.String r20, defpackage.faom r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.k(eslh, esaa, java.lang.String, faom, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x010d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.eslh r21, defpackage.esaa r22, java.lang.String r23, defpackage.faom r24, defpackage.ciff r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cice.l(eslh, esaa, java.lang.String, faom, ciff, ffgu):java.lang.Object");
    }
}
