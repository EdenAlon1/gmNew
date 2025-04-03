package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yjs extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yjt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yjs(yjt yjtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = yjtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yjs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        if (r5 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0039, code lost:
    
        if (r5.d.a(com.google.android.apps.messaging.R.raw.message_sent_v2, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
    
        return r0;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r5) {
        /*
            r4 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r4.a
            r2 = 1
            defpackage.ffci.b(r5)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L3c
        Ld:
            yjt r5 = r4.b
            r4.a = r2
            ffhd r1 = r5.b
            ffhd r1 = defpackage.ekxi.a(r1)
            yjr r2 = new yjr
            r3 = 0
            r2.<init>(r3, r5)
            java.lang.Object r5 = defpackage.ffra.a(r1, r2, r4)
            if (r5 == r0) goto L3f
        L23:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L3c
            yjt r5 = r4.b
            r1 = 2
            r4.a = r1
            dtef r5 = r5.d
            r1 = 2132017210(0x7f14003a, float:1.9672692E38)
            java.lang.Object r5 = r5.a(r1, r4)
            if (r5 != r0) goto L3c
            goto L3f
        L3c:
            ffcu r5 = defpackage.ffcu.a
            return r5
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjs.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yjs(this.b, ffguVar);
    }
}
