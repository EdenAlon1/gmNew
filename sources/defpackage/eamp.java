package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eamp implements eama {
    private static final entd d = entd.c("GnpSdk");
    public final eaov a;
    public final dlpw b;
    public final ffbr c;
    private final ffhd e;
    private final ffhd f;
    private final ears g;
    private final Context h;
    private final emxc i;
    private final eaqc j;
    private final eanl k;
    private final eanl l;

    public eamp(eaov eaovVar, eaqc eaqcVar, eanl eanlVar, eanl eanlVar2, ffhd ffhdVar, ffhd ffhdVar2, ears earsVar, Context context, dlpw dlpwVar, emxc emxcVar, ffbr ffbrVar) {
        eaovVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        earsVar.getClass();
        context.getClass();
        dlpwVar.getClass();
        ffbrVar.getClass();
        this.a = eaovVar;
        this.j = eaqcVar;
        this.k = eanlVar;
        this.l = eanlVar2;
        this.e = ffhdVar;
        this.f = ffhdVar2;
        this.g = earsVar;
        this.h = context;
        this.b = dlpwVar;
        this.i = emxcVar;
        this.c = ffbrVar;
    }

    private static final Map f(List list, List list2) {
        return ffew.k(ffdx.an(list, list2));
    }

    @Override // defpackage.eama
    public final Object a(List list, Map map, exus exusVar, String str, int i, eamb eambVar, eagp eagpVar, exyd exydVar, String str2, ffgu ffguVar) {
        return ffra.a(this.f, new eaml(this, list, map, exusVar, eagpVar, exydVar, i, eambVar, str, str2, null), ffguVar);
    }

    @Override // defpackage.eama
    public final Object b(List list, Map map, String str, exuk exukVar, ffgu ffguVar) {
        return ffra.a(this.e, new eamn(list, this, str, exukVar, map, null), ffguVar);
    }

    public final eanl c(eagp eagpVar) {
        if (eagpVar.a()) {
            return this.k;
        }
        if (eagpVar.b()) {
            return this.l;
        }
        throw new IllegalStateException("targetType is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x03bc, code lost:
    
        if (defpackage.ffcu.a != r7) goto L122;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.util.List r25, java.util.Map r26, defpackage.exus r27, defpackage.eagp r28, long r29, defpackage.ffgu r31) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eamp.d(java.util.List, java.util.Map, exus, eagp, long, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.eagp r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.eamo
            if (r0 == 0) goto L13
            r0 = r6
            eamo r0 = (defpackage.eamo) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            eamo r0 = new eamo
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r0 = r0.c
            if (r0 == 0) goto L3a
            r5 = 1
            if (r0 != r5) goto L32
            defpackage.ffci.b(r6)     // Catch: java.lang.Exception -> L25
            goto L40
        L25:
            r5 = move-exception
            entd r6 = defpackage.eamp.d
            ensk r6 = r6.j()
            java.lang.String r0 = "Failed to report registration results"
            defpackage.a.K(r6, r0, r5)
            goto L40
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            defpackage.ffci.b(r6)
            r5.a()
        L40:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eamp.e(eagp, ffgu):java.lang.Object");
    }
}
