package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmd implements wly {
    public final ecrj a;
    public final ffbr b;
    private final emcz c;
    private final ffsk d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final auuy j;
    private final enru k;
    private final cfup l;
    private String m;
    private final Map n;

    public wmd(emcz emczVar, ecrj ecrjVar, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, auuy auuyVar) {
        ecrjVar.getClass();
        ffskVar.getClass();
        this.c = emczVar;
        this.a = ecrjVar;
        this.d = ffskVar;
        this.b = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = auuyVar;
        this.k = enru.c("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteUiHandlerWithAccountImpl");
        this.l = cfvl.o(280308823);
        this.n = new LinkedHashMap();
    }

    private final esgu e(esgu esguVar) {
        if (!((Boolean) this.h.b()).booleanValue() || esguVar.b.size() <= 0) {
            return esguVar;
        }
        try {
            eygr eygrVar = esguVar.b;
            eygrVar.getClass();
            ArrayList arrayList = new ArrayList();
            for (Object obj : eygrVar) {
                wik wikVar = (wik) this.f.b();
                String str = ((esgt) obj).b;
                str.getClass();
                if (!wikVar.a(str)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                esgr createBuilder = esgu.a.createBuilder();
                createBuilder.getClass();
                esgv.c(10, createBuilder);
                return esgv.a(createBuilder);
            }
            esgr createBuilder2 = esgu.a.createBuilder();
            createBuilder2.getClass();
            DesugarCollections.unmodifiableList(((esgu) createBuilder2.instance).b).getClass();
            esgv.b(arrayList, createBuilder2);
            return esgv.a(createBuilder2);
        } catch (Exception e) {
            ((enrr) ((enrr) this.k.j()).g(e).h("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicRewriteUiHandlerWithAccountImpl", "filterSensitiveOutput", 280, "MagicRewriteUiHandlerWithAccountImpl.kt")).q("Exception running sensitive classifier");
            if (!((Boolean) this.i.b()).booleanValue()) {
                return esguVar;
            }
            esgr createBuilder3 = esgu.a.createBuilder();
            createBuilder3.getClass();
            esgv.c(10, createBuilder3);
            return esgv.a(createBuilder3);
        }
    }

    @Override // defpackage.wly
    public final elfl a(String str, esgx esgxVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new wmc(this, str, esgxVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, defpackage.esgx r9, defpackage.ffgu r10) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmd.b(java.lang.String, esgx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r0 != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x012c, code lost:
    
        if (r0 != r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r15, defpackage.esgx r16, defpackage.ffgu r17) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmd.c(java.lang.String, esgx, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, defpackage.esgx r11, boolean r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wmd.d(java.lang.String, esgx, boolean, ffgu):java.lang.Object");
    }
}
