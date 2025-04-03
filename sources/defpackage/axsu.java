package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axsu extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    long f;
    int g;
    final /* synthetic */ ffxx h;
    final /* synthetic */ int i;
    final /* synthetic */ long j;
    final /* synthetic */ ffxy k;
    final /* synthetic */ ffjm l;
    private /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsu(ffxx ffxxVar, int i, long j, ffxy ffxyVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.h = ffxxVar;
        this.i = i;
        this.j = j;
        this.k = ffxyVar;
        this.l = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0085 -> B:4:0x0087). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) {
        /*
            r14 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r14.g
            if (r1 == 0) goto L1b
            long r1 = r14.f
            int r3 = r14.e
            java.lang.Object r4 = r14.d
            java.lang.Object r5 = r14.c
            java.lang.Object r6 = r14.b
            java.lang.Object r7 = r14.a
            java.lang.Object r8 = r14.m
            ffkz r8 = (defpackage.ffkz) r8
            defpackage.ffci.b(r15)
            goto L87
        L1b:
            defpackage.ffci.b(r15)
            java.lang.Object r15 = r14.m
            ffsk r15 = (defpackage.ffsk) r15
            ffkz r1 = new ffkz
            r1.<init>()
            ffkx r2 = new ffkx
            r2.<init>()
            ffxx r3 = r14.h
            r4 = 0
            ffxx r3 = defpackage.ffxz.a(r3, r4)
            ffxg r15 = defpackage.ffyi.b(r3, r15)
            int r3 = r14.i
            long r4 = r14.j
            ffxy r6 = r14.k
            ffjm r7 = r14.l
            r8 = r1
            r12 = r6
            r6 = r15
            r13 = r7
            r7 = r2
            r1 = r4
            r5 = r12
            r4 = r13
        L47:
            fgiw r15 = new fgiw
            ffhd r9 = r14.u()
            r15.<init>(r9)
            fgis r9 = r6.C()
            axss r10 = new axss
            r11 = 0
            r10.<init>(r8, r5, r11)
            r15.a(r9, r10)
            r9 = r7
            ffkx r9 = (defpackage.ffkx) r9
            boolean r10 = r9.a
            if (r10 != 0) goto L70
            int r10 = r8.a
            if (r10 > r3) goto L70
            axst r10 = new axst
            r10.<init>(r4, r5, r9, r11)
            defpackage.fgiq.b(r15, r1, r10)
        L70:
            r14.m = r8
            r14.a = r7
            r14.b = r6
            r14.c = r5
            r14.d = r4
            r14.e = r3
            r14.f = r1
            r9 = 1
            r14.g = r9
            java.lang.Object r15 = defpackage.fgiw.d(r15, r14)
            if (r15 == r0) goto L93
        L87:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L90
            goto L47
        L90:
            ffcu r15 = defpackage.ffcu.a
            return r15
        L93:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axsu.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axsu axsuVar = new axsu(this.h, this.i, this.j, this.k, this.l, ffguVar);
        axsuVar.m = obj;
        return axsuVar;
    }
}
