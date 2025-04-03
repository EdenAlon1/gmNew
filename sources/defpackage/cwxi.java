package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwxi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwxk b;
    final /* synthetic */ eisx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwxi(cwxk cwxkVar, eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwxkVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwxi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001a, code lost:
    
        if (r4 != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0032, code lost:
    
        if (r4.f(r1, r3) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004c, code lost:
    
        return r0;
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
            if (r1 == r2) goto L1c
            goto L49
        Ld:
            cwxk r4 = r3.b
            eisx r1 = r3.c
            r1.getClass()
            r3.a = r2
            java.lang.Object r4 = r4.e(r1, r3)
            if (r4 == r0) goto L4c
        L1c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L35
            cwxk r4 = r3.b
            eisx r1 = r3.c
            r1.getClass()
            r2 = 2
            r3.a = r2
            java.lang.Object r4 = r4.f(r1, r3)
            if (r4 != r0) goto L49
            goto L4c
        L35:
            cwxk r4 = r3.b
            cwxl r4 = r4.a
            com.google.android.apps.messaging.ui.appsettings.HqmsSettingsActivity r4 = r4.a
            r0 = 2131428594(0x7f0b04f2, float:1.8478837E38)
            android.view.View r4 = r4.findViewById(r0)
            r4.getClass()
            r0 = 0
            r4.setVisibility(r0)
        L49:
            ffcu r4 = defpackage.ffcu.a
            return r4
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwxi.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwxi(this.b, this.c, ffguVar);
    }
}
