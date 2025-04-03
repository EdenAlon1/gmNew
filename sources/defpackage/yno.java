package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class yno extends ffhv implements ffjm {
    int a;
    final /* synthetic */ you b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yno(you youVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = youVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yno) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (r5.a(r2, r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0042, code lost:
    
        if (r5.a(r3, r4) == r0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0069, code lost:
    
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
            if (r1 == 0) goto Lb
            goto L6a
        Lb:
            you r5 = r4.b
            atdr r5 = r5.i
            atdh r5 = (defpackage.atdh) r5
            ffbr r5 = r5.a
            java.lang.Object r5 = r5.b()
            ersq r5 = (defpackage.ersq) r5
            java.lang.String r1 = "bugle.enable_log_draft_data_source"
            boolean r5 = r5.a(r1)
            if (r5 == 0) goto L45
            you r5 = r4.b
            ynh r1 = new ynh
            ydb r5 = r5.d
            fgdj r5 = r5.a
            r1.<init>(r5)
            ync r5 = new ync
            r5.<init>()
            ffxx r5 = defpackage.ffyy.b(r1, r5)
            you r1 = r4.b
            ynd r3 = new ynd
            r3.<init>(r1)
            r4.a = r2
            java.lang.Object r5 = r5.a(r3, r4)
            if (r5 != r0) goto L6a
            goto L69
        L45:
            you r5 = r4.b
            ynk r1 = new ynk
            ydb r5 = r5.d
            fgdj r5 = r5.a
            r1.<init>(r5)
            ynn r5 = new ynn
            r5.<init>(r1)
            ffxx r5 = defpackage.ffyy.a(r5)
            you r1 = r4.b
            yne r2 = new yne
            r2.<init>(r1)
            r1 = 2
            r4.a = r1
            java.lang.Object r5 = r5.a(r2, r4)
            if (r5 != r0) goto L6a
        L69:
            return r0
        L6a:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yno.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yno(this.b, ffguVar);
    }
}
