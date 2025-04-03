package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmsf extends ffhv implements ffjn {
    int a;
    final /* synthetic */ fflb b;
    final /* synthetic */ hho c;
    final /* synthetic */ hho d;
    final /* synthetic */ hho e;
    final /* synthetic */ dmsk f;
    final /* synthetic */ iir g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmsf(fflb fflbVar, hho hhoVar, hho hhoVar2, hho hhoVar3, dmsk dmskVar, iir iirVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = fflbVar;
        this.c = hhoVar;
        this.d = hhoVar2;
        this.e = hhoVar3;
        this.f = dmskVar;
        this.g = iirVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((iak) obj2).a;
        dmsf dmsfVar = new dmsf(this.b, this.c, this.d, this.e, this.f, this.g, (ffgu) obj3);
        dmsfVar.h = (dqt) obj;
        return dmsfVar.b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0029, code lost:
    
        r4 = (java.lang.Boolean) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0015, code lost:
    
        if (r4.b(r3) != r0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r4 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x006e, code lost:
    
        return r0;
     */
    /* JADX WARN: Type inference failed for: r4v1, types: [dqt, java.lang.Object] */
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
            if (r1 == r2) goto L17
            goto L29
        Ld:
            java.lang.Object r4 = r3.h
            r3.a = r2
            java.lang.Object r4 = r4.b(r3)
            if (r4 == r0) goto L6e
        L17:
            fflb r4 = r3.b
            java.lang.Object r4 = r4.a
            ffss r4 = (defpackage.ffss) r4
            if (r4 == 0) goto L2b
            r1 = 2
            r3.a = r1
            java.lang.Object r4 = r4.c(r3)
            if (r4 != r0) goto L29
            goto L6e
        L29:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
        L2b:
            hho r4 = r3.c
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 != 0) goto L62
            hho r4 = r3.d
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L62
            hho r4 = r3.e
            java.lang.Object r4 = r4.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L62
            dmsk r4 = r3.f
            ffix r4 = r4.e
            r4.invoke()
            iir r4 = r3.g
            r4.a(r0)
        L62:
            hho r4 = r3.e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.b(r0)
            ffcu r4 = defpackage.ffcu.a
            return r4
        L6e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dmsf.b(java.lang.Object):java.lang.Object");
    }
}
