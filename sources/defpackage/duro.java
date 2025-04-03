package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.CustomImageView;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duro implements duvr {
    final /* synthetic */ durt a;

    public duro(durt durtVar) {
        this.a = durtVar;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [duqz, dura] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view instanceof EmojiView)) {
            ((enrr) ((enrr) durt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$1", "onClick", 76, "EmojiListController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        duwz.a(view.getContext()).d(view);
        EmojiView emojiView = (EmojiView) view;
        durt durtVar = this.a;
        duqy.b(durtVar.i, duvf.a(((duvi) emojiView.c).a));
        durt durtVar2 = this.a;
        durtVar2.f.a(emojiView.c);
    }

    @Override // android.view.View.OnHoverListener
    public final boolean onHover(View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (!(view instanceof EmojiView)) {
            if (view instanceof CustomImageView) {
                this.a.f.d(view);
                return true;
            }
            ((enrr) ((enrr) durt.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$1", "onLongClick", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "EmojiListController.java")).t("Long Clicked view is not EmojiView or CustomImageView: %s", view);
            return false;
        }
        EmojiView emojiView = (EmojiView) view;
        engw engwVar = emojiView.b;
        if (engwVar.isEmpty()) {
            this.a.f.d(view);
            return true;
        }
        final durt durtVar = this.a;
        ((enrr) ((enrr) durt.a.e()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController", "showEmojiVariantsPopupView", 228, "EmojiListController.java")).q("Show emoji variants popup view.");
        if (emojiView.getParent() != null) {
            duma.a(durtVar.b).b(R.string.open_popup_content_desc);
            durtVar.d.b();
            RecyclerView recyclerView = durtVar.e;
            int[] iArr = new int[2];
            if (recyclerView != null) {
                recyclerView.getLocationInWindow(iArr);
                iArr[1] = iArr[0] + durtVar.e.getWidth();
            } else {
                iArr[0] = 0;
                iArr[1] = durtVar.b.getResources().getDisplayMetrics().widthPixels;
            }
            int width = emojiView.getWidth();
            int height = emojiView.getHeight();
            View view2 = (View) emojiView.getParent();
            ((dutr) durtVar.d).c(emojiView, view2, engwVar, new PopupWindow.OnDismissListener() { // from class: durm
                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    duma.a(durt.this.b).b(R.string.close_popup_content_desc);
                }
            }, durtVar.h, width, height, iArr[0], iArr[1], emojiView.c, null);
        }
        this.a.f.d(view);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return false;
    }
}
