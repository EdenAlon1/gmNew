package com.google.android.libraries.messaging.lighter.ui.conversationheader;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.kkt;
import defpackage.kkw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationHeaderScrollingViewBehavior extends kkt<View> {
    public ConversationHeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.kkt
    public final boolean k(View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // defpackage.kkt
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2) {
        kkw kkwVar = (kkw) view.getLayoutParams();
        if (kkwVar.topMargin != view2.getBottom()) {
            kkwVar.setMargins(kkwVar.leftMargin, view2.getBottom(), kkwVar.rightMargin, kkwVar.bottomMargin);
            view.setLayoutParams(kkwVar);
        }
    }
}
