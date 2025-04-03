package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aoao extends ffhv implements ffjm {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ aoaq c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoao(String str, aoaq aoaqVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = str;
        this.c = aoaqVar;
        this.d = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aoao) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0021, code lost:
    
        if (r11 != r0) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000a, code lost:
    
        if (r1 != 1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r2 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        if (((j$.util.Optional) r10.c.c.b()).isPresent() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        r1 = (defpackage.ctjh) ((j$.util.Optional) r10.c.c.b()).get();
        r5 = r10.d;
        r3 = defpackage.eoqz.P2P_SUGGESTION_CLICK;
        r4 = defpackage.fbqp.CONVERSATION_VIEW;
        r10.a = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x005e, code lost:
    
        if (r1.j(r2, r3, r4, r5, 0.0f, false, false, r10) != r0) goto L17;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) {
        /*
            r10 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r10.a
            r2 = 1
            defpackage.ffci.b(r11)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L23
            goto L61
        Ld:
            java.lang.String r11 = r10.b
            if (r11 == 0) goto L61
            aoaq r1 = r10.c
            aoan r3 = new aoan
            r4 = 0
            r3.<init>(r1, r11, r4)
            r10.a = r2
            ffhd r11 = r1.a
            java.lang.Object r11 = defpackage.ffra.a(r11, r3, r10)
            if (r11 == r0) goto L60
        L23:
            r2 = r11
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            if (r2 == 0) goto L61
            aoaq r11 = r10.c
            ffbr r11 = r11.c
            java.lang.Object r11 = r11.b()
            j$.util.Optional r11 = (j$.util.Optional) r11
            boolean r11 = r11.isPresent()
            if (r11 == 0) goto L61
            aoaq r11 = r10.c
            ffbr r11 = r11.c
            java.lang.Object r11 = r11.b()
            j$.util.Optional r11 = (j$.util.Optional) r11
            java.lang.Object r11 = r11.get()
            r1 = r11
            ctjh r1 = (defpackage.ctjh) r1
            boolean r5 = r10.d
            eoqz r3 = defpackage.eoqz.P2P_SUGGESTION_CLICK
            fbqp r4 = defpackage.fbqp.CONVERSATION_VIEW
            r11 = 0
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r11)
            r11 = 2
            r10.a = r11
            r6 = 0
            r8 = r7
            r9 = r10
            java.lang.Object r11 = r1.j(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r11 != r0) goto L61
        L60:
            return r0
        L61:
            ffcu r11 = defpackage.ffcu.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoao.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aoao(this.b, this.c, this.d, ffguVar);
    }
}
