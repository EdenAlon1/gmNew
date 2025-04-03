package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aake extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ fgcm h;
    final /* synthetic */ fgcq i;
    final /* synthetic */ alxr j;
    final /* synthetic */ aakf k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aake(fgcm fgcmVar, fgcq fgcqVar, alxr alxrVar, aakf aakfVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.h = fgcmVar;
        this.i = fgcqVar;
        this.j = alxrVar;
        this.k = aakfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aake) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003e -> B:4:0x0041). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r12) {
        /*
            r11 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r11.g
            if (r1 == 0) goto L16
            java.lang.Object r1 = r11.f
            java.lang.Object r2 = r11.e
            java.lang.Object r3 = r11.d
            java.lang.Object r4 = r11.c
            java.lang.Object r5 = r11.b
            java.lang.Object r6 = r11.a
            defpackage.ffci.b(r12)
            goto L41
        L16:
            defpackage.ffci.b(r12)
            fgcm r12 = r11.h
            fgcq r1 = r11.i
            alxr r2 = r11.j
            aakf r3 = r11.k
            r6 = r12
            r5 = r1
            r4 = r2
        L24:
            java.lang.Object r2 = r6.c()
            r1 = r2
            dofn r1 = (defpackage.dofn) r1
            r11.a = r6
            r11.b = r5
            r11.c = r4
            r11.d = r3
            r11.e = r2
            r11.f = r1
            r12 = 1
            r11.g = r12
            java.lang.Object r12 = defpackage.fgbj.a(r5, r11)
            if (r12 != r0) goto L41
            return r0
        L41:
            cazy r12 = (defpackage.cazy) r12
            r7 = 0
            if (r12 == 0) goto L49
            java.lang.String r8 = r12.a
            goto L4a
        L49:
            r8 = r7
        L4a:
            if (r12 == 0) goto L4e
            android.net.Uri r7 = r12.b
        L4e:
            if (r8 == 0) goto L77
            if (r7 == 0) goto L77
            r12 = r3
            aakf r12 = (defpackage.aakf) r12
            android.content.Context r12 = r12.a
            int r9 = defpackage.abce.a
            r4.getClass()
            dofp r9 = new dofp
            alya r10 = r4.d()
            java.lang.String r12 = defpackage.abce.b(r10, r12)
            dofv r10 = new dofv
            r10.<init>(r7)
            r9.<init>(r12, r8, r10)
            dofn r1 = (defpackage.dofn) r1
            ffix r12 = r1.b
            dofn r1 = new dofn
            r1.<init>(r9, r12)
        L77:
            boolean r12 = r6.g(r2, r1)
            if (r12 != 0) goto L7e
            goto L24
        L7e:
            ffcu r12 = defpackage.ffcu.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aake.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aake(this.h, this.i, this.j, this.k, ffguVar);
    }
}
