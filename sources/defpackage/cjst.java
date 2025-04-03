package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjst implements cjso {
    public static final cjsq a = new cjsq();
    public final ffbr b;
    public final eisx c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final aulk g;
    public final ffbr h;
    private final ffhd i;

    public cjst(ffhd ffhdVar, ffbr ffbrVar, eisx eisxVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, aulk aulkVar, ffbr ffbrVar5) {
        ffhdVar.getClass();
        ffbrVar.getClass();
        eisxVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        aulkVar.getClass();
        ffbrVar5.getClass();
        this.i = ffhdVar;
        this.b = ffbrVar;
        this.c = eisxVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = aulkVar;
        this.h = ffbrVar5;
    }

    @Override // defpackage.cjso
    public final Object a(alxg alxgVar, engw engwVar, Map map, ffgu ffguVar) {
        return ffra.a(ekxi.a(this.i), new cjsr(null, engwVar, this, alxgVar, map), ffguVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        if (r12 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006f, code lost:
    
        if (r12 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r8, defpackage.aqux r9, defpackage.cjtw r10, defpackage.aqpf r11, defpackage.ffgu r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.cjss
            if (r0 == 0) goto L13
            r0 = r12
            cjss r0 = (defpackage.cjss) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            cjss r0 = new cjss
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r12 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            defpackage.ffci.b(r12)
            goto L8f
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            cjtw r8 = r0.f
            java.lang.Object r9 = r0.b
            java.lang.Object r10 = r0.a
            defpackage.ffci.b(r12)
            r6 = r10
            r10 = r8
            r8 = r6
            goto L72
        L40:
            defpackage.ffci.b(r12)
            aqki r12 = r8.k()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r9.g()
            int r12 = r12.e(r2)
            r2 = 5
            if (r12 == r2) goto La0
            r2 = 3
            if (r12 != r2) goto L56
            goto La0
        L56:
            if (r11 != 0) goto L75
            aqge r11 = r8.E(r4)
            elfl r11 = r11.b()
            r11.getClass()
            r0.a = r8
            r0.b = r9
            r0.f = r10
            r0.e = r5
            java.lang.Object r12 = defpackage.fgfz.c(r11, r0)
            if (r12 != r1) goto L72
            goto L9f
        L72:
            r11 = r12
            aqpf r11 = (defpackage.aqpf) r11
        L75:
            aqki r8 = r8.k()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r9 = r9.g()
            r11.getClass()
            r12 = 0
            r0.a = r12
            r0.b = r12
            r0.f = r12
            r0.e = r4
            java.lang.Object r12 = r8.d(r9, r10, r11)
            if (r12 == r1) goto L9f
        L8f:
            aqkn r12 = (defpackage.aqkn) r12
            aqkn r8 = defpackage.aqkn.b
            if (r12 == r8) goto L99
            aqkn r8 = defpackage.aqkn.f
            if (r12 != r8) goto L9a
        L99:
            r3 = r5
        L9a:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L9f:
            return r1
        La0:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjst.b(com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient, aqux, cjtw, aqpf, ffgu):java.lang.Object");
    }
}
