package defpackage;

import android.view.View;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dutq implements View.OnClickListener {
    final /* synthetic */ dutr a;

    public dutq(dutr dutrVar) {
        this.a = dutrVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!(view instanceof EmojiView)) {
            ((enrr) ((enrr) dutr.a.i()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController$1", "onClick", 82, "EmojiPickerPopupViewController.java")).t("Clicked view is not EmojiView: %s", view);
            return;
        }
        duwz.a(view.getContext()).d(view);
        View.OnClickListener onClickListener = this.a.c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this.a.b();
    }
}
