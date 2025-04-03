package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cemo implements cdwr {
    private final csal a;
    private final byzp b;
    private final bbfb c;

    public cemo(csal csalVar, byzp byzpVar, bbfb bbfbVar) {
        byzpVar.getClass();
        bbfbVar.getClass();
        this.a = csalVar;
        this.b = byzpVar;
        this.c = bbfbVar;
    }

    @Override // defpackage.cdws
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return ((cemd) obj).b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008b, code lost:
    
        if (defpackage.fgfz.c(r7, r0) != r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.cemp r7, defpackage.cemd r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.cemn
            if (r0 == 0) goto L13
            r0 = r9
            cemn r0 = (defpackage.cemn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cemn r0 = new cemn
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.ffci.b(r9)
            goto L8e
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            cemo r7 = r0.d
            defpackage.ffci.b(r9)
            goto L50
        L38:
            defpackage.ffci.b(r9)
            crty r7 = r7.eR()
            java.lang.String r8 = r8.c
            elfl r7 = r7.q(r8)
            r0.d = r6
            r0.c = r4
            java.lang.Object r9 = defpackage.fgfz.c(r7, r0)
            if (r9 == r1) goto L93
            r7 = r6
        L50:
            eszz r9 = (defpackage.eszz) r9
            csal r8 = r7.a
            csbe r8 = r8.a(r9)
            com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable$BindData r2 = r8.a()
            java.util.List r8 = r8.c()
            byzp r4 = r7.b
            com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r8 = r4.c(r2, r8)
            csgg r2 = defpackage.csgg.CMS_RESTORE_IN_PROGRESS
            r8.br(r2)
            bbfb r7 = r7.c
            eyja r9 = r9.n
            if (r9 != 0) goto L73
            eyja r9 = defpackage.eyja.a
        L73:
            long r4 = defpackage.eykm.b(r9)
            com.google.android.apps.messaging.shared.datamodel.action.common.Action r7 = r7.g(r8, r4)
            elfl r7 = r7.q()
            r7.getClass()
            r8 = 0
            r0.d = r8
            r0.c = r3
            java.lang.Object r7 = defpackage.fgfz.c(r7, r0)
            if (r7 != r1) goto L8e
            goto L93
        L8e:
            ceyt r7 = defpackage.ceyt.i()
            return r7
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cemo.b(cemp, cemd, ffgu):java.lang.Object");
    }

    @Override // defpackage.cdwr
    public final /* bridge */ /* synthetic */ Object d(Object obj, ceuw ceuwVar, Object obj2, ffgu ffguVar) {
        return b((cemp) obj, (cemd) obj2, ffguVar);
    }
}
