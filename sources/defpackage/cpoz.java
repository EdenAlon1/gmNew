package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpoz extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ cppa c;
    final /* synthetic */ cpoy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpoz(cppa cppaVar, cpoy cpoyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = cppaVar;
        this.d = cpoyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpoz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00b2, code lost:
    
        if (r11 != 2) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b8, code lost:
    
        return defpackage.ceyt.k();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00be, code lost:
    
        throw new defpackage.ffcd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c3, code lost:
    
        return defpackage.ceyt.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c8, code lost:
    
        return defpackage.ceyt.i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        r11 = (defpackage.cpio) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r11 != r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        if (r11 == r0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000d, code lost:
    
        if (r1 != 2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0067, code lost:
    
        r11 = (defpackage.cpio) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00aa, code lost:
    
        r11 = r11.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00ae, code lost:
    
        if (r11 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00b0, code lost:
    
        if (r11 == 1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L17
            if (r1 == r2) goto L11
            defpackage.ffci.b(r11)
            if (r1 == r3) goto L67
            goto La8
        L11:
            java.lang.Object r1 = r10.a
            defpackage.ffci.b(r11)
            goto L3e
        L17:
            defpackage.ffci.b(r11)
            cppa r11 = r10.c
            ffbr r1 = r11.b
            java.lang.Object r1 = r1.b()
            cpsu r1 = (defpackage.cpsu) r1
            cpoy r4 = r10.d
            awui r4 = r4.b
            if (r4 != 0) goto L2c
            awui r4 = defpackage.awui.a
        L2c:
            cpip r11 = r11.a
            r4.getClass()
            r10.a = r11
            r10.b = r2
            java.lang.Object r1 = defpackage.cpsu.d(r1, r4, r10)
            if (r1 == r0) goto Lc9
            r9 = r1
            r1 = r11
            r11 = r9
        L3e:
            esrx r11 = (defpackage.esrx) r11
            cpiu r11 = r1.a(r11)
            cpoy r1 = r10.d
            eygr r1 = r1.c
            r1.getClass()
            boolean r4 = r1.isEmpty()
            r5 = 0
            if (r4 == 0) goto L6a
            cpoy r1 = r10.d
            awui r1 = r1.b
            if (r1 != 0) goto L5a
            awui r1 = defpackage.awui.a
        L5a:
            r1.getClass()
            r10.a = r5
            r10.b = r3
            java.lang.Object r11 = r11.c(r1, r10)
            if (r11 == r0) goto Lc9
        L67:
            cpio r11 = (defpackage.cpio) r11
            goto Laa
        L6a:
            cpoy r4 = r10.d
            awui r4 = r4.b
            if (r4 != 0) goto L72
            awui r4 = defpackage.awui.a
        L72:
            r4.getClass()
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.ffdx.n(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L84:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L9c
            java.lang.Object r7 = r1.next()
            fcek r7 = (defpackage.fcek) r7
            esqu r8 = new esqu
            r7.getClass()
            r8.<init>(r7, r5, r3)
            r6.add(r8)
            goto L84
        L9c:
            r10.a = r5
            r1 = 3
            r10.b = r1
            java.lang.Object r11 = r11.d(r4, r6, r10)
            if (r11 != r0) goto La8
            goto Lc9
        La8:
            cpio r11 = (defpackage.cpio) r11
        Laa:
            int r11 = r11.ordinal()
            if (r11 == 0) goto Lc4
            if (r11 == r2) goto Lbf
            if (r11 != r3) goto Lb9
            ceyt r11 = defpackage.ceyt.k()
            return r11
        Lb9:
            ffcd r11 = new ffcd
            r11.<init>()
            throw r11
        Lbf:
            ceyt r11 = defpackage.ceyt.m()
            return r11
        Lc4:
            ceyt r11 = defpackage.ceyt.i()
            return r11
        Lc9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpoz.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpoz(this.c, this.d, ffguVar);
    }
}
