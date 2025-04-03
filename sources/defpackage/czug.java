package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.time.DateTimeException;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czug implements cpfo {
    public static final cfup a = cfvl.f(cfvl.b, "p2p_share_recent_image_suggestion_expiration_age_millis", TimeUnit.MINUTES.toMillis(2));
    private final ffbr b;
    private final fazb c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ctud g;
    private final cqoh h;
    private final cskc i;

    public czug(@asgu ffbr ffbrVar, fazb fazbVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ctud ctudVar, cqoh cqohVar) {
        ffbrVar.getClass();
        fazbVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ctudVar.getClass();
        cqohVar.getClass();
        this.b = ffbrVar;
        this.c = fazbVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ctudVar;
        this.h = cqohVar;
        this.i = cskc.g("Bugle", "SmartSuggestionRule");
    }

    private final boolean f() {
        return ((cttn) this.f.b()).d();
    }

    private final boolean g(SmartSuggestionItemSuggestionData smartSuggestionItemSuggestionData) {
        fbxa fbxaVar = smartSuggestionItemSuggestionData.c;
        if (fbxaVar.c == 19) {
            fbsh fbshVar = (fbsh) fbxaVar.d;
            fbshVar.getClass();
            fcfy fcfyVar = fbshVar.d;
            if (fcfyVar == null) {
                fcfyVar = fcfy.a;
            }
            faun faunVar = fcfyVar.c;
            if (faunVar == null) {
                faunVar = faun.a;
            }
            faunVar.getClass();
            fcfy fcfyVar2 = fbshVar.d;
            if (fcfyVar2 == null) {
                fcfyVar2 = fcfy.a;
            }
            fava favaVar = fcfyVar2.d;
            if (favaVar == null) {
                favaVar = fava.a;
            }
            favaVar.getClass();
            try {
                LocalDateTime of = LocalDateTime.of(faunVar.b, faunVar.c + 1, faunVar.d, favaVar.b, favaVar.c);
                if (((Boolean) ((cfup) czur.a.get()).e()).booleanValue() || ((Boolean) ((cfup) ctjd.bJ.get()).e()).booleanValue()) {
                    return true;
                }
                return of.isAfter(this.h.f().atZone(ZoneId.systemDefault()).L());
            } catch (DateTimeException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.cpfo
    public final boolean a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return suggestionData instanceof SmartSuggestionData;
    }

    @Override // defpackage.cpfo
    public final Object b(SuggestionData suggestionData, cpff cpffVar, int i, ffgu ffguVar) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            return e((SmartSuggestionItemSuggestionData) suggestionData, cpffVar, i, ffguVar);
        }
        this.i.n("Non smart suggestion passed to SmartSuggestionRule");
        throw new IllegalStateException("Non smart suggestion passed to SmartSuggestionRule");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cpff r9, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData r10, defpackage.ffgu r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czug.c(cpff, com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.cpff r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.czuf
            if (r0 == 0) goto L13
            r0 = r7
            czuf r0 = (defpackage.czuf) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            czuf r0 = new czuf
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.a
            czug r2 = r0.e
            defpackage.ffci.b(r7)
            goto L4a
        L3a:
            defpackage.ffci.b(r7)
            r0.e = r5
            r0.a = r6
            r0.d = r4
            java.lang.Object r7 = r6.c(r0)
            if (r7 == r1) goto L81
            r2 = r5
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r4 = 0
            if (r7 == 0) goto L58
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L58:
            ffbr r7 = r2.e
            java.lang.Object r7 = r7.b()
            ctml r7 = (defpackage.ctml) r7
            boolean r7 = r7.e()
            if (r7 != 0) goto L72
            cskc r6 = r2.i
            java.lang.String r7 = "Duo suggestions not enabled"
            r6.q(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        L72:
            r7 = 0
            r0.e = r7
            r0.a = r7
            r0.d = r3
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L80
            goto L81
        L80:
            return r6
        L81:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czug.d(cpff, ffgu):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0383, code lost:
    
        if (((java.lang.Boolean) defpackage.cful.c.e()).booleanValue() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0169, code lost:
    
        if (r14 != r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01d8, code lost:
    
        if (r2 < r13.h.f().toEpochMilli()) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0230, code lost:
    
        if (((defpackage.ctml) r13.e.b()).m(defpackage.fbri.SELFIE_GIF) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x024c, code lost:
    
        if (r13.f() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0272, code lost:
    
        if (r12.c.c == 26) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0290, code lost:
    
        if (r13.g(r12) != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x02fb, code lost:
    
        if (((java.lang.Boolean) ((defpackage.cfup) defpackage.ctjd.bL.get()).e()).booleanValue() != false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0345, code lost:
    
        if (((defpackage.ctot) r13.d.b()).a(r12.o(), r12.u()) != null) goto L173;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0399 A[PHI: r7
      0x0399: PHI (r7v3 boolean) = 
      (r7v0 boolean)
      (r7v4 boolean)
      (r7v5 boolean)
      (r7v6 boolean)
      (r7v0 boolean)
      (r7v7 boolean)
      (r7v8 boolean)
      (r7v0 boolean)
      (r7v9 boolean)
      (r7v0 boolean)
      (r7v0 boolean)
      (r7v0 boolean)
      (r7v0 boolean)
      (r7v0 boolean)
      (r7v10 boolean)
      (r7v11 boolean)
     binds: [B:39:0x01f1, B:104:0x0398, B:103:0x0393, B:102:0x0386, B:101:0x0383, B:97:0x035a, B:95:0x0348, B:94:0x0345, B:84:0x02ff, B:75:0x02fb, B:63:0x0290, B:57:0x0272, B:49:0x024c, B:45:0x0230, B:41:0x0204, B:40:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r11, defpackage.cpff r12, int r13, defpackage.ffgu r14) {
        /*
            Method dump skipped, instructions count: 1016
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czug.e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData, cpff, int, ffgu):java.lang.Object");
    }
}
