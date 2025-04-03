package defpackage;

import android.content.Context;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class skf implements ared {
    public static final entd a = entd.c("BugleVmt");
    public final ffhd b;
    public final Context c;
    public final slw d;
    public final siz e;
    public final cbgf f;
    public final ffbr g;
    public final ffbr h;
    private final ffhd i;

    public skf(ffhd ffhdVar, ffhd ffhdVar2, Context context, slw slwVar, siz sizVar, cbgf cbgfVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffhdVar.getClass();
        ffhdVar2.getClass();
        context.getClass();
        cbgfVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.i = ffhdVar;
        this.b = ffhdVar2;
        this.c = context;
        this.d = slwVar;
        this.e = sizVar;
        this.f = cbgfVar;
        this.g = ffbrVar;
        this.h = ffbrVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.Locale r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.sjy
            if (r0 == 0) goto L13
            r0 = r8
            sjy r0 = (defpackage.sjy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            sjy r0 = new sjy
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Locale r7 = r0.d
            defpackage.ffci.b(r8)
            goto L62
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.ffci.b(r8)
            siz r8 = r6.e
            r0.d = r7
            r0.c = r3
            boolean r2 = r8.b()
            r4 = 0
            if (r2 == 0) goto L51
            ffhd r2 = r8.g
            ffhd r2 = defpackage.ekxi.a(r2)
            sir r5 = new sir
            r5.<init>(r4, r8)
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)
            goto L60
        L51:
            ffhd r2 = r8.e
            ffhd r2 = defpackage.ekxi.a(r2)
            siu r5 = new siu
            r5.<init>(r4, r8)
            java.lang.Object r8 = defpackage.ffra.a(r2, r5, r0)
        L60:
            if (r8 == r1) goto L76
        L62:
            java.util.Map r8 = (java.util.Map) r8
            boolean r0 = r8.containsKey(r7)
            if (r0 == 0) goto L6f
            java.lang.Object r7 = defpackage.ffew.e(r8, r7)
            return r7
        L6f:
            ardv r8 = new ardv
            r0 = -1
            r8.<init>(r7, r0, r3)
            return r8
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skf.a(java.util.Locale, ffgu):java.lang.Object");
    }

    @Override // defpackage.ared
    public final Object b(aree areeVar, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.i), new sjz(null, this, areeVar), ffguVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.skc
            if (r0 == 0) goto L13
            r0 = r7
            skc r0 = (defpackage.skc) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            skc r0 = new skc
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L5a
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            emyl r7 = defpackage.shw.c
            java.lang.Object r7 = r7.get()
            cfup r7 = (defpackage.cfup) r7
            java.lang.Object r7 = r7.e()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L5e
            ffhd r7 = r5.b
            ffhd r7 = defpackage.ekxi.a(r7)
            skb r2 = new skb
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 == r1) goto L5d
        L5a:
            java.util.Locale r7 = (java.util.Locale) r7
            goto L64
        L5d:
            return r1
        L5e:
            android.content.Context r6 = r5.c
            java.util.Locale r7 = defpackage.ctid.c(r6)
        L64:
            cfva r6 = defpackage.shv.c
            java.lang.Object r6 = r6.e()
            shs r6 = (defpackage.shs) r6
            eyhm r6 = r6.b
            java.util.Map r6 = j$.util.DesugarCollections.unmodifiableMap(r6)
            r6.getClass()
            java.lang.String r0 = r7.toLanguageTag()
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto La6
            java.lang.String r0 = r7.toLanguageTag()
            java.lang.Object r6 = defpackage.ffew.e(r6, r0)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Locale r6 = java.util.Locale.forLanguageTag(r6)
            entd r0 = defpackage.skf.a
            ensk r0 = r0.h()
            ensz r0 = (defpackage.ensz) r0
            java.lang.String r7 = r7.toLanguageTag()
            java.lang.String r1 = r6.toLanguageTag()
            java.lang.String r2 = "Language %s has been replaced with %s."
            r0.D(r2, r7, r1)
            r6.getClass()
            return r6
        La6:
            java.util.Locale r6 = defpackage.ni$$ExternalSyntheticApiModelOutline0.m(r7)
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.skf.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    public final Object d(ardn ardnVar, aree areeVar, Locale locale, ffgu ffguVar) {
        Object a2 = ffra.a(ekxi.a(this.b), new skd(null, this, areeVar, ardnVar, locale), ffguVar);
        return a2 == ffhh.a ? a2 : ffcu.a;
    }
}
