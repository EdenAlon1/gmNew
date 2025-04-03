package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axsy extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    long e;
    int f;
    final /* synthetic */ ffxx g;
    final /* synthetic */ long h;
    final /* synthetic */ ffxy i;
    final /* synthetic */ ffjn j;
    private /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axsy(ffxx ffxxVar, long j, ffxy ffxyVar, ffjn ffjnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.g = ffxxVar;
        this.h = j;
        this.i = ffxyVar;
        this.j = ffjnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0080 -> B:4:0x0082). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r14) {
        /*
            r13 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r13.f
            if (r1 == 0) goto L1b
            long r1 = r13.e
            java.lang.Object r3 = r13.d
            java.lang.Object r4 = r13.c
            java.lang.Object r5 = r13.b
            java.lang.Object r6 = r13.a
            java.lang.Object r7 = r13.k
            ffkz r7 = (defpackage.ffkz) r7
            defpackage.ffci.b(r14)
            r10 = r3
            r9 = r4
            r8 = r7
            goto L82
        L1b:
            defpackage.ffci.b(r14)
            java.lang.Object r14 = r13.k
            ffsk r14 = (defpackage.ffsk) r14
            ffkz r1 = new ffkz
            r1.<init>()
            ffkx r2 = new ffkx
            r2.<init>()
            ffxx r3 = r13.g
            r4 = 0
            ffxx r3 = defpackage.ffxz.a(r3, r4)
            ffxg r14 = defpackage.ffyi.b(r3, r14)
            long r3 = r13.h
            ffxy r5 = r13.i
            ffjn r6 = r13.j
            r8 = r1
            r9 = r5
            r10 = r6
            r5 = r14
            r6 = r2
            r1 = r3
        L43:
            fgiw r14 = new fgiw
            ffhd r3 = r13.u()
            r14.<init>(r3)
            fgis r3 = r5.C()
            axsw r7 = new axsw
            r11 = r6
            ffkx r11 = (defpackage.ffkx) r11
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            r14.a(r3, r7)
            boolean r3 = r11.a
            if (r3 != 0) goto L6d
            int r3 = r8.a
            if (r3 > 0) goto L6d
            axsx r3 = new axsx
            r4 = 0
            r3.<init>(r10, r9, r11, r4)
            defpackage.fgiq.b(r14, r1, r3)
        L6d:
            r13.k = r8
            r13.a = r6
            r13.b = r5
            r13.c = r9
            r13.d = r10
            r13.e = r1
            r3 = 1
            r13.f = r3
            java.lang.Object r14 = defpackage.fgiw.d(r14, r13)
            if (r14 == r0) goto L8e
        L82:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L8b
            goto L43
        L8b:
            ffcu r14 = defpackage.ffcu.a
            return r14
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axsy.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axsy axsyVar = new axsy(this.g, this.h, this.i, this.j, ffguVar);
        axsyVar.k = obj;
        return axsyVar;
    }
}
