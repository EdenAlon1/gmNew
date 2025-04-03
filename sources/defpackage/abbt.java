package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abbt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmrm b;
    final /* synthetic */ alye c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ apyv e;
    final /* synthetic */ cmrx f;
    final /* synthetic */ fjay g;
    final /* synthetic */ abbu h;
    final /* synthetic */ apxz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abbt(cmrm cmrmVar, alye alyeVar, MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar, abbu abbuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmrmVar;
        this.c = alyeVar;
        this.d = messageId;
        this.e = apyvVar;
        this.f = cmrxVar;
        this.g = fjayVar;
        this.i = apxzVar;
        this.h = abbuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((abbt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0044, code lost:
    
        if (r1 == 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0046, code lost:
    
        if (r1 != 2) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        r0 = defpackage.drav.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0060, code lost:
    
        r12.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        java.util.Objects.toString(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        throw new java.lang.IllegalArgumentException("Reaction surface not supported as emotify entry point: ".concat(r0.toString()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        r0 = defpackage.drav.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r12 = r9.h;
        r12.a.c(r9.b, r9.f, r9.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        if (r12 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (defpackage.alyf.a(r4, r5, r6, r7, r8, r9) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000c, code lost:
    
        if (r1 != 1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if ((r9.e instanceof defpackage.apyb) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        r12 = r9.h.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003c, code lost:
    
        if (r12 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        r0 = r9.f;
        r1 = r0.ordinal();
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.a
            r2 = 2
            r3 = 1
            defpackage.ffci.b(r12)
            if (r1 == 0) goto L10
            r9 = r11
            if (r1 == r3) goto L32
            goto L7e
        L10:
            cmrm r12 = r11.b
            cmrm r1 = defpackage.cmrm.REMOVE_REACTION
            if (r12 != r1) goto L64
            alye r4 = r11.c
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r11.d
            apyv r6 = r11.e
            cmrx r7 = r11.f
            fjay r8 = r11.g
            r8.getClass()
            apxz r9 = r11.i
            r11.a = r3
            r10 = r11
            java.lang.Object r12 = defpackage.alyf.b(r4, r5, r6, r7, r8, r9, r10)
            r9 = r10
            if (r12 == r0) goto L7d
        L32:
            apyv r12 = r9.e
            boolean r12 = r12 instanceof defpackage.apyb
            if (r12 == 0) goto L7e
            abbu r12 = r9.h
            drau r12 = r12.b
            if (r12 == 0) goto L7e
            cmrx r0 = r9.f
            int r1 = r0.ordinal()
            if (r1 == r3) goto L5e
            if (r1 != r2) goto L4b
            drav r0 = defpackage.drav.b
            goto L60
        L4b:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.util.Objects.toString(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Reaction surface not supported as emotify entry point: "
            java.lang.String r0 = r1.concat(r0)
            r12.<init>(r0)
            throw r12
        L5e:
            drav r0 = defpackage.drav.a
        L60:
            r12.b(r0)
            goto L7e
        L64:
            r9 = r11
            alye r4 = r9.c
            r4.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r5 = r9.d
            apyv r6 = r9.e
            cmrx r7 = r9.f
            fjay r8 = r9.g
            r8.getClass()
            r9.a = r2
            java.lang.Object r12 = defpackage.alyf.a(r4, r5, r6, r7, r8, r9)
            if (r12 != r0) goto L7e
        L7d:
            return r0
        L7e:
            abbu r12 = r9.h
            cmrm r0 = r9.b
            cmrx r1 = r9.f
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r9.d
            abbv r12 = r12.a
            r12.c(r0, r1, r2)
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abbt.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new abbt(this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.h, ffguVar);
    }
}
