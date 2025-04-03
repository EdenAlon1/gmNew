package com.google.android.libraries.inputmethod.emoji.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.apps.messaging.R;
import defpackage.dvbk;
import defpackage.enrr;
import defpackage.enru;
import defpackage.vx;
import defpackage.wc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EmojiPickerBodyRecyclerView extends dvbk {
    public static final enru ac = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView");
    public wc ad;
    public int ae;

    public EmojiPickerBodyRecyclerView(Context context) {
        super(context);
    }

    public final void a(boolean z) {
        vx vxVar = this.o;
        if (vxVar instanceof EmojiPickerLayoutManager) {
            ((EmojiPickerLayoutManager) vxVar).J = z;
        } else {
            ((enrr) ((enrr) ac.j()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "setScrollable", 102, "EmojiPickerBodyRecyclerView.java")).t("Called setScrollable() with %s, but this only works when the LayoutManager of this RecyclerView is an EmojiPickerLayoutManager", vxVar == null ? "null" : vxVar.getClass().getName());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.F == 1) {
            motionEvent.setAction(3);
        }
        return onTouchEvent;
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setTag(R.id.default_focus_in_navigation_mode, true);
    }

    public EmojiPickerBodyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
