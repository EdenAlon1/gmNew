package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yzf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yzm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzf(yzm yzmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yzmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yzf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0039, code lost:
    
        if (defpackage.fgfz.c(r4, r3) == r0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003e, code lost:
    
        return defpackage.ffcu.a;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r4) {
        /*
            r3 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r3.a
            r2 = 1
            defpackage.ffci.b(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L19
            goto L3c
        Ld:
            yzm r4 = r3.b
            r3.a = r2
            ffxx r4 = r4.h
            java.lang.Object r4 = defpackage.fgbj.a(r4, r3)
            if (r4 == r0) goto L3f
        L19:
            yzm r1 = r3.b
            ffbr r1 = r1.f
            alxj r4 = (defpackage.alxj) r4
            java.lang.Object r1 = r1.b()
            amyk r1 = (defpackage.amyk) r1
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r4 = r4.c()
            r4.getClass()
            avji r2 = defpackage.avji.HIDE
            elfl r4 = r1.H(r4, r2)
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = defpackage.fgfz.c(r4, r3)
            if (r4 != r0) goto L3c
            goto L3f
        L3c:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzf.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yzf(this.b, ffguVar);
    }
}
