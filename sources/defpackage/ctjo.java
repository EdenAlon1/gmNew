package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ctko b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjo(ffgu ffguVar, ctko ctkoVar, String str) {
        super(2, ffguVar);
        this.b = ctkoVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (defpackage.ctjf.a(r1, r2, r3, r4, false, -1.0f, r9, 96) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r10 != r0) goto L9;
     */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) {
        /*
            r9 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r9.a
            r2 = 1
            if (r1 == 0) goto L11
            if (r1 == r2) goto Ld
            defpackage.ffci.b(r10)
            goto L4b
        Ld:
            defpackage.ffci.b(r10)
            goto L30
        L11:
            defpackage.ffci.b(r10)
            java.lang.Object r10 = r9.d
            ffsk r10 = (defpackage.ffsk) r10
            ctko r10 = r9.b
            java.lang.String r1 = r9.c
            ffhd r3 = r10.c
            ffhd r3 = defpackage.ekxi.a(r3)
            ctjp r4 = new ctjp
            r5 = 0
            r4.<init>(r5, r10, r1)
            r9.a = r2
            java.lang.Object r10 = defpackage.ffra.a(r3, r4, r9)
            if (r10 == r0) goto L4e
        L30:
            r2 = r10
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            if (r2 == 0) goto L4b
            ctko r1 = r9.b
            eoqz r3 = defpackage.eoqz.P2P_SUGGESTION_CALENDAR_EVENT_SAVED
            fbqp r4 = defpackage.fbqp.CONVERSATION_VIEW
            r10 = 2
            r9.a = r10
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8 = 96
            r5 = 0
            r7 = r9
            java.lang.Object r10 = defpackage.ctjf.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L4b
            goto L4e
        L4b:
            ffcu r10 = defpackage.ffcu.a
            return r10
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctjo.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjo ctjoVar = new ctjo(ffguVar, this.b, this.c);
        ctjoVar.d = obj;
        return ctjoVar;
    }
}
