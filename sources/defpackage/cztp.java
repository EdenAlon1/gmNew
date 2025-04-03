package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cztp implements czto {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        r1 = r0;
     */
    @Override // defpackage.czto
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.cztm r5, defpackage.ea r6) {
        /*
            r4 = this;
            r5.getClass()
            r6.getClass()
            java.util.List r5 = r5.a
            engw r5 = (defpackage.engw) r5
            enqv r5 = r5.iterator()
        Le:
            boolean r0 = r5.hasNext()
            r1 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r5.next()
            r2 = r0
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            boolean r3 = r2 instanceof com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData
            if (r3 == 0) goto L24
            r3 = r2
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r3 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData) r3
            goto L25
        L24:
            r3 = r1
        L25:
            if (r3 == 0) goto L2b
            fbri r1 = r3.l()
        L2b:
            fbri r3 = defpackage.fbri.CALENDAR
            if (r1 == r3) goto L47
            boolean r1 = r2 instanceof defpackage.aoas
            if (r1 == 0) goto Le
            emyl r1 = defpackage.ctjd.by
            java.lang.Object r1 = r1.get()
            cfup r1 = (defpackage.cfup) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto Le
        L47:
            r1 = r0
        L48:
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r1
            emyl r5 = defpackage.ctjd.by
            java.lang.Object r5 = r5.get()
            cfup r5 = (defpackage.cfup) r5
            java.lang.Object r5 = r5.e()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.String r0 = "android.intent.action.VIEW"
            if (r5 == 0) goto L6f
            boolean r5 = r1 instanceof defpackage.aoas
            if (r5 == 0) goto L6f
            aoas r1 = (defpackage.aoas) r1
            java.lang.Long r5 = r1.d()
            android.content.Intent r5 = defpackage.czts.b(r0, r5)
            goto L8e
        L6f:
            boolean r5 = r1 instanceof com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData
            if (r5 == 0) goto L92
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData r1 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData) r1
            fbxa r5 = r1.c
            int r1 = r5.c
            r2 = 19
            if (r1 != r2) goto L82
            java.lang.Object r5 = r5.d
            fbsh r5 = (defpackage.fbsh) r5
            goto L84
        L82:
            fbsh r5 = defpackage.fbsh.a
        L84:
            fcfy r5 = r5.d
            if (r5 != 0) goto L8a
            fcfy r5 = defpackage.fcfy.a
        L8a:
            android.content.Intent r5 = defpackage.czts.c(r5, r0)
        L8e:
            r6.aD(r5)
            return
        L92:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Unhandled calendar suggestion type"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cztp.a(cztm, ea):void");
    }
}
