package com.google.android.apps.messaging.popup.spam;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.ajiq;
import defpackage.ajiw;
import defpackage.cfup;
import defpackage.cfvl;
import defpackage.ffbr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SpamPopupView extends ajiq {
    public static final cfup a = cfvl.h(cfvl.b, "spam_promo_popup_learn_more_url", "https://support.google.com/messages?p=spamdetection");
    static final cfup b = cfvl.h(cfvl.b, "spam_promo_popup_learn_more_help_and_feedback_topic", "spamdetection");
    public ffbr c;
    public ffbr d;
    public ajiw e;

    public SpamPopupView(Context context, AttributeSet attributeSet) {
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
            r1 = 2131430493(0x7f0b0c5d, float:1.8482689E38)
            android.view.View r1 = r7.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.Context r2 = r7.getContext()
            java.lang.String r2 = defpackage.crmi.a(r2)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            r4 = 2132087652(0x7f151364, float:1.9815565E38)
            java.lang.String r0 = r0.getString(r4, r3)
            cfup r3 = com.google.android.apps.messaging.popup.spam.SpamPopupView.b
            java.lang.Object r3 = r3.e()
            java.lang.String r3 = (java.lang.String) r3
            cfup r4 = com.google.android.apps.messaging.popup.spam.SpamPopupView.a
            java.lang.Object r4 = r4.e()
            java.lang.String r4 = (java.lang.String) r4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L52
        L45:
            android.content.Context r5 = r7.getContext()
            ajit r6 = new ajit
            r6.<init>()
            android.text.SpannableStringBuilder r0 = defpackage.ddyi.e(r5, r0, r2, r6)
        L52:
            r1.setText(r0)
            defpackage.egyl.b(r1)
            defpackage.egyl.c(r1)
            r0 = 2131427906(0x7f0b0242, float:1.8477441E38)
            android.view.View r0 = r7.findViewById(r0)
            ajiu r1 = new ajiu
            r1.<init>()
            r0.setOnClickListener(r1)
            r0 = 2131427905(0x7f0b0241, float:1.847744E38)
            android.view.View r0 = r7.findViewById(r0)
            ajiv r1 = new ajiv
            r1.<init>()
            r0.setOnClickListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.popup.spam.SpamPopupView.onFinishInflate():void");
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), (int) (getResources().getDisplayMetrics().heightPixels * 0.5d)), Integer.MIN_VALUE));
    }
}
