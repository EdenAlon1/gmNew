package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpe implements wov {
    public final ffbr a;
    public final ecrj b;
    public final ffbr c;
    public final ffhd d;
    public final ffsk e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final enru n;
    private final emcz o;
    private final ffbr p;
    private final ffsk q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final auuy u;
    private final ffbr v;
    private final ffbr w;

    public wpe(emcz emczVar, ffbr ffbrVar, ecrj ecrjVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, auuy auuyVar, ffbr ffbrVar15, ffbr ffbrVar16) {
        ecrjVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        this.o = emczVar;
        this.a = ffbrVar;
        this.b = ecrjVar;
        this.p = ffbrVar2;
        this.c = ffbrVar3;
        this.q = ffskVar;
        this.d = ffhdVar;
        this.e = ffskVar2;
        this.f = ffbrVar4;
        this.r = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.s = ffbrVar8;
        this.i = ffbrVar9;
        this.j = ffbrVar10;
        this.k = ffbrVar11;
        this.l = ffbrVar12;
        this.m = ffbrVar13;
        this.t = ffbrVar14;
        this.u = auuyVar;
        this.v = ffbrVar15;
        this.w = ffbrVar16;
        this.n = enru.c("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/SmarterRepliesUiHandlerWithAccountImpl");
    }

    @Override // defpackage.wov
    public final elfl a(List list) {
        elfl c;
        c = axol.c(this.q, ffhe.a, ffsm.a, new wpc(this, list, null));
        return c;
    }

    public final esgz b(esgz esgzVar) {
        if (!((Boolean) this.s.b()).booleanValue() || esgzVar.b.size() <= 0) {
            return esgzVar;
        }
        try {
            eygr eygrVar = esgzVar.b;
            eygrVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : eygrVar) {
                fbxa fbxaVar = (fbxa) obj;
                wik wikVar = (wik) this.g.b();
                String str = (fbxaVar.c == 2 ? (fbxc) fbxaVar.d : fbxc.a).c;
                str.getClass();
                if (!wikVar.a(str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                esgy esgyVar = (esgy) esgz.a.createBuilder();
                esgyVar.getClass();
                esha.c(10, esgyVar);
                return esha.a(esgyVar);
            }
            esgy esgyVar2 = (esgy) esgz.a.createBuilder();
            esgyVar2.getClass();
            DesugarCollections.unmodifiableList(((esgz) esgyVar2.instance).b).getClass();
            esha.b(arrayList, esgyVar2);
            return esha.a(esgyVar2);
        } catch (Exception e) {
            ((enrr) ((enrr) this.n.j()).g(e).h("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/SmarterRepliesUiHandlerWithAccountImpl", "filterSensitiveOutput", 199, "SmarterRepliesUiHandlerWithAccountImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.i.b()).booleanValue()) {
                return esgzVar;
            }
            esgy esgyVar3 = (esgy) esgz.a.createBuilder();
            esgyVar3.getClass();
            esha.c(10, esgyVar3);
            return esha.a(esgyVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.fbup r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.wow
            if (r0 == 0) goto L13
            r0 = r10
            wow r0 = (defpackage.wow) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wow r0 = new wow
            r0.<init>(r8, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r6.c
            r2 = 3
            r7 = 2
            r3 = 1
            if (r1 == 0) goto L42
            if (r1 == r3) goto L3a
            if (r1 == r7) goto L36
            if (r1 != r2) goto L2e
            defpackage.ffci.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            defpackage.ffci.b(r10)
            return r10
        L3a:
            fbup r9 = r6.e
            wpe r1 = r6.d
            defpackage.ffci.b(r10)
            goto L8e
        L42:
            defpackage.ffci.b(r10)
            ffbr r10 = r8.v
            java.lang.Object r10 = r10.b()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto La2
            ffbr r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            r1 = r10
            emdd r1 = (defpackage.emdd) r1
            cfup r10 = defpackage.ctjd.bh
            java.lang.Object r10 = r10.e()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            int r10 = (int) r4
            ffbr r2 = r8.w
            java.lang.Object r2 = r2.b()
            r2.getClass()
            java.lang.Number r2 = (java.lang.Number) r2
            long r4 = r2.longValue()
            r6.d = r8
            r6.e = r9
            r6.c = r3
            r2 = r9
            r3 = r10
            java.lang.Object r10 = r1.b(r2, r3, r4, r6)
            if (r10 != r0) goto L8d
            goto Laa
        L8d:
            r1 = r8
        L8e:
            java.lang.Integer r10 = (java.lang.Integer) r10
            if (r10 != 0) goto La1
            r10 = 0
            r6.d = r10
            r6.e = r10
            r6.c = r7
            java.lang.Object r9 = r1.d(r9, r6)
            if (r9 != r0) goto La0
            goto Laa
        La0:
            return r9
        La1:
            return r10
        La2:
            r6.c = r2
            java.lang.Object r9 = r8.d(r9, r6)
            if (r9 != r0) goto Lab
        Laa:
            return r0
        Lab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.c(fbup, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fbup r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.wox
            if (r0 == 0) goto L13
            r0 = r10
            wox r0 = (defpackage.wox) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wox r0 = new wox
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r9 = r0.e
            wpe r0 = r0.d
            defpackage.ffci.b(r10)
            goto L95
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.ffci.b(r10)
            ffbr r10 = r8.t
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 < 0) goto Lc7
            ffbr r10 = r8.t
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r4 = r10.longValue()
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L6b
            ffbr r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            emdd r10 = (defpackage.emdd) r10
            java.lang.String r9 = r10.g(r9)
            goto L7d
        L6b:
            ffbr r10 = r8.f
            java.lang.Object r10 = r10.b()
            j$.util.Optional r10 = (j$.util.Optional) r10
            java.lang.Object r10 = r10.get()
            emdd r10 = (defpackage.emdd) r10
            java.lang.String r9 = r10.h(r9)
        L7d:
            ffbr r10 = r8.p
            java.lang.Object r10 = r10.b()
            wor r10 = (defpackage.wor) r10
            r0.d = r8
            r0.e = r9
            r0.c = r3
            ffji r10 = r10.h
            java.lang.Object r10 = r10.invoke(r0)
            if (r10 != r1) goto L94
            return r1
        L94:
            r0 = r8
        L95:
            org.tensorflow.lite.support.text.tokenizers.SentencePieceTokenizer r10 = (org.tensorflow.lite.support.text.tokenizers.SentencePieceTokenizer) r10
            if (r10 == 0) goto Lc5
            boolean r1 = r10.b
            if (r1 == 0) goto La1
            java.lang.String r9 = r9.toLowerCase()
        La1:
            long r1 = r10.a
            java.lang.String[] r9 = r10.nativeTokenize(r1, r9)
            java.util.List r9 = java.util.Arrays.asList(r9)
            if (r9 == 0) goto Lc5
            int r9 = r9.size()
            ffbr r10 = r0.t
            java.lang.Object r10 = r10.b()
            java.lang.Number r10 = (java.lang.Number) r10
            long r0 = r10.longValue()
            int r10 = (int) r0
            int r9 = r9 + r10
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r9)
            return r10
        Lc5:
            r9 = 0
            return r9
        Lc7:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "promptTokenCount must be non-negative"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.d(fbup, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.fbup r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.e(fbup, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (r15 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012f, code lost:
    
        if (r15 != r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.fbup r14, defpackage.ffgu r15) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.f(fbup, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0108 -> B:11:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.fbup r19, long r20, long r22, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.g(fbup, long, long, ffgu):java.lang.Object");
    }
}
