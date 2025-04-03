package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eww extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ hho c;
    final /* synthetic */ long d;
    final /* synthetic */ dwn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eww(hho hhoVar, long j, dwn dwnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = hhoVar;
        this.d = j;
        this.e = dwnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eww) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r1.a(r6, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        if (r1.a(r4, r5) != r0) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 == r2) goto L11
            java.lang.Object r0 = r5.a
            dwp r0 = (defpackage.dwp) r0
            defpackage.ffci.b(r6)
            goto L58
        L11:
            java.lang.Object r1 = r5.a
            hho r1 = (defpackage.hho) r1
            defpackage.ffci.b(r6)
            goto L3c
        L19:
            defpackage.ffci.b(r6)
            hho r6 = r5.c
            java.lang.Object r6 = r6.a()
            dwp r6 = (defpackage.dwp) r6
            if (r6 == 0) goto L40
            dwn r1 = r5.e
            hho r3 = r5.c
            dwo r4 = new dwo
            r4.<init>(r6)
            if (r1 == 0) goto L3b
            r5.a = r3
            r5.b = r2
            java.lang.Object r6 = r1.a(r4, r5)
            if (r6 == r0) goto L56
        L3b:
            r1 = r3
        L3c:
            r6 = 0
            r1.b(r6)
        L40:
            long r1 = r5.d
            dwp r6 = new dwp
            r6.<init>(r1)
            dwn r1 = r5.e
            if (r1 == 0) goto L57
            r5.a = r6
            r2 = 2
            r5.b = r2
            java.lang.Object r1 = r1.a(r6, r5)
            if (r1 != r0) goto L57
        L56:
            return r0
        L57:
            r0 = r6
        L58:
            hho r6 = r5.c
            r6.b(r0)
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eww.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eww(this.c, this.d, this.e, ffguVar);
    }
}
