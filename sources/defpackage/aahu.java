package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aahu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cmrm b;
    final /* synthetic */ alye c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ apyv e;
    final /* synthetic */ cmrx f;
    final /* synthetic */ fjay g;
    final /* synthetic */ aahw h;
    final /* synthetic */ apxz i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aahu(cmrm cmrmVar, alye alyeVar, MessageId messageId, apyv apyvVar, cmrx cmrxVar, fjay fjayVar, apxz apxzVar, aahw aahwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cmrmVar;
        this.c = alyeVar;
        this.d = messageId;
        this.e = apyvVar;
        this.f = cmrxVar;
        this.g = fjayVar;
        this.i = apxzVar;
        this.h = aahwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aahu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0057, code lost:
    
        r11 = r6.h;
        r11.i.c(r6.b, r6.f, r6.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0066, code lost:
    
        return defpackage.ffcu.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r11 != r0) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (defpackage.alyf.a(r1, r2, r3, r4, r5, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000b, code lost:
    
        if (r1 != 1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if ((r6.e instanceof defpackage.apyb) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0033, code lost:
    
        r11 = r6.h.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (r11 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        r11.b(defpackage.drav.a);
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Le
            r6 = r10
            if (r1 == r2) goto L2d
            goto L57
        Le:
            cmrm r11 = r10.b
            cmrm r1 = defpackage.cmrm.REMOVE_REACTION
            if (r11 != r1) goto L3f
            alye r3 = r10.c
            r3.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r4 = r10.d
            apyv r5 = r10.e
            cmrx r6 = r10.f
            fjay r7 = r10.g
            apxz r8 = r10.i
            r10.a = r2
            r9 = r10
            java.lang.Object r11 = defpackage.alyf.b(r3, r4, r5, r6, r7, r8, r9)
            r6 = r9
            if (r11 == r0) goto L56
        L2d:
            apyv r11 = r6.e
            boolean r11 = r11 instanceof defpackage.apyb
            if (r11 == 0) goto L57
            aahw r11 = r6.h
            drau r11 = r11.t
            if (r11 == 0) goto L57
            drav r0 = defpackage.drav.a
            r11.b(r0)
            goto L57
        L3f:
            r6 = r10
            alye r1 = r6.c
            r1.getClass()
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r6.d
            apyv r3 = r6.e
            cmrx r4 = r6.f
            fjay r5 = r6.g
            r11 = 2
            r6.a = r11
            java.lang.Object r11 = defpackage.alyf.a(r1, r2, r3, r4, r5, r6)
            if (r11 != r0) goto L57
        L56:
            return r0
        L57:
            aahw r11 = r6.h
            cmrm r0 = r6.b
            cmrx r1 = r6.f
            com.google.android.apps.messaging.shared.api.messaging.MessageId r2 = r6.d
            abbv r11 = r11.i
            r11.c(r0, r1, r2)
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aahu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aahu(this.b, this.c, this.d, this.e, this.f, this.g, this.i, this.h, ffguVar);
    }
}
