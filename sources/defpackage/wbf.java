package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wbf extends wak {
    int a = 0;
    private int b;
    private int c;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.info_and_options_page_options_tab_fragment, viewGroup, false);
        this.b = z().getResources().getDimensionPixelSize(R.dimen.info_and_options_setting_item_min_height);
        this.c = z().getResources().getDimensionPixelSize(R.dimen.info_and_options_setting_item_vertical_margin);
        this.a = 0;
        e(inflate, false);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.view.View r14, boolean r15) {
        /*
            r13 = this;
            if (r14 == 0) goto Ld2
            waw r0 = r13.aj
            if (r0 == 0) goto Ld2
            vzw r0 = r0.a()
            if (r0 != 0) goto Le
            goto Ld2
        Le:
            r0 = 2131428644(0x7f0b0524, float:1.8478938E38)
            android.view.View r0 = r14.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r1 = 2131428643(0x7f0b0523, float:1.8478936E38)
            android.view.View r14 = r14.findViewById(r1)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            waw r1 = r13.aj
            vzw r1 = r1.a()
            engw r2 = r1.m()
            r3 = 1
            r4 = 0
            if (r15 == 0) goto L5e
            int r15 = r0.getChildCount()
            int r5 = r14.getChildCount()
            if (r15 == 0) goto L5e
            if (r5 != 0) goto L3b
            goto L5e
        L3b:
            int r6 = r2.size()
            r7 = r4
            r8 = r7
            r9 = r8
        L42:
            if (r7 >= r6) goto L58
            java.lang.Object r10 = r2.get(r7)
            bcul r10 = (defpackage.bcul) r10
            boolean r10 = defpackage.bcul.b(r10)
            if (r10 == 0) goto L53
            int r8 = r8 + 1
            goto L55
        L53:
            int r9 = r9 + 1
        L55:
            int r7 = r7 + 1
            goto L42
        L58:
            if (r15 != r8) goto L5e
            if (r5 != r9) goto L5e
            r15 = r3
            goto L5f
        L5e:
            r15 = r4
        L5f:
            if (r15 != 0) goto L67
            r0.removeAllViews()
            r14.removeAllViews()
        L67:
            r5 = r4
            r6 = r5
            r7 = r6
        L6a:
            int r8 = r2.size()
            if (r5 >= r8) goto Ld2
            java.lang.Object r8 = r2.get(r5)
            bcul r8 = (defpackage.bcul) r8
            boolean r8 = defpackage.bcul.b(r8)
            if (r8 == 0) goto L84
            int r8 = r7 + 1
            r9 = r8
            r8 = r6
            r6 = r7
            r7 = r9
            r9 = r0
            goto L87
        L84:
            int r8 = r6 + 1
            r9 = r14
        L87:
            if (r15 == 0) goto L90
            android.view.View r6 = r9.getChildAt(r6)
            com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView r6 = (com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView) r6
            goto La6
        L90:
            eg r6 = r13.G()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r10 = 2131624160(0x7f0e00e0, float:1.8875492E38)
            android.view.View r6 = r6.inflate(r10, r9, r4)
            com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView r6 = (com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView) r6
            int r10 = r13.a
            int r10 = r10 + r3
            r13.a = r10
        La6:
            r1.G(r6, r5)
            int r10 = r13.b
            r6.measure(r4, r4)
            int r11 = r6.getMeasuredHeight()
            if (r11 <= r10) goto Lb5
            r10 = r11
        Lb5:
            android.view.ViewGroup$LayoutParams r12 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r12 = (android.view.ViewGroup.MarginLayoutParams) r12
            r12.height = r10
            int r10 = r10 - r11
            int r11 = r13.c
            int r10 = r10 / 2
            int r11 = r11 - r10
            if (r11 <= 0) goto Lc9
            r12.topMargin = r11
            r12.bottomMargin = r11
        Lc9:
            if (r15 != 0) goto Lce
            r9.addView(r6)
        Lce:
            int r5 = r5 + 1
            r6 = r8
            goto L6a
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbf.e(android.view.View, boolean):void");
    }
}
