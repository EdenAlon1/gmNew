package com.google.android.apps.messaging.popup.federatedlearning;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.adtc;
import defpackage.ajin;
import defpackage.ajip;
import defpackage.akvg;
import defpackage.elbx;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class FederatedLearningPopupView extends ajip {
    public akvg a;
    public adtc b;
    public elbx c;
    public ajin d;

    public FederatedLearningPopupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0043, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) == false) goto L6;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFinishInflate() {
        /*
            r7 = this;
            super.onFinishInflate()
            android.content.Context r0 = r7.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131428306(0x7f0b03d2, float:1.8478253E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r7.getContext()
            java.lang.String r2 = defpackage.crmi.a(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 2132084345(0x7f150679, float:1.9808858E38)
            java.lang.String r0 = r0.getString(r4, r3)
            cfup r3 = defpackage.ctjd.F
            java.lang.Object r3 = r3.e()
            java.lang.String r3 = (java.lang.String) r3
            cfup r4 = defpackage.ctjd.E
            java.lang.Object r4 = r4.e()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L52
        L45:
            android.content.Context r5 = r7.getContext()
            ajik r6 = new ajik
            r6.<init>()
            android.text.SpannableStringBuilder r0 = defpackage.ddyi.e(r5, r0, r2, r6)
        L52:
            r1.setText(r0)
            defpackage.egyl.b(r1)
            defpackage.egyl.c(r1)
            r0 = 2131428304(0x7f0b03d0, float:1.8478249E38)
            android.view.View r0 = r7.findViewById(r0)
            elbx r1 = r7.c
            ajil r2 = new ajil
            r2.<init>()
            elay r3 = new elay
            java.lang.String r4 = "FederatedLearningPopupView#positiveButton.onClick"
            r3.<init>(r1, r4, r2)
            r0.setOnClickListener(r3)
            r0 = 2131428303(0x7f0b03cf, float:1.8478247E38)
            android.view.View r0 = r7.findViewById(r0)
            elbx r1 = r7.c
            ajim r2 = new ajim
            r2.<init>()
            elay r3 = new elay
            java.lang.String r4 = "FederatedLearningPopupView#negativeButton.onClick"
            r3.<init>(r1, r4, r2)
            r0.setOnClickListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.popup.federatedlearning.FederatedLearningPopupView.onFinishInflate():void");
    }
}
