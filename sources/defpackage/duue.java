package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class duue extends vk {
    private static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter");
    public final Context s;

    public duue(Context context) {
        this.s = context;
    }

    public static final void K(int i, int i2, View view) {
        if (i <= 0) {
            return;
        }
        int round = Math.round(i / i2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(round, view.getHeight());
        } else {
            layoutParams.width = round;
        }
        view.setLayoutParams(layoutParams);
    }

    static final int L(ViewGroup viewGroup) {
        ((enrr) ((enrr) a.f()).h("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "getParentWidth", 61, "ItemListHolderAdapter.java")).L("Calculating parent width. parentClass: %s, holderTargetWidth: %d, parentWidth: %d, parentPadding: (%d, %d)", viewGroup.getClass().getName(), -1, Integer.valueOf(viewGroup.getMeasuredWidth()), Integer.valueOf(viewGroup.getPaddingLeft()), Integer.valueOf(viewGroup.getPaddingRight()));
        return (viewGroup.getMeasuredWidth() - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
    }

    final void J(View view, dutv dutvVar) {
        ImageView imageView = (ImageView) view.findViewById(R.id.variant_availability_indicator);
        if (imageView == null) {
            ((enrr) ((enrr) a.j()).h("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "updateVisibilityOfVariantAvailabilityIndicator", 47, "ItemListHolderAdapter.java")).q("Unable to find variant availability indicator view");
        } else if (dutvVar.e.isEmpty()) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(this.s.getDrawable(R.drawable.ic_signal_cellular_4_bar_auto_mirrored));
            imageView.setVisibility(0);
        }
    }

    @Override // defpackage.vk
    public final void k(wr wrVar) {
        if (wrVar instanceof duud) {
            duub duubVar = ((duud) wrVar).t;
            return;
        }
        EmojiView emojiView = (EmojiView) wrVar.a.findViewById(R.id.emoji_view);
        if (emojiView != null) {
            emojiView.c = duvq.h;
            emojiView.a = emojiView.a.a("");
            emojiView.a();
            emojiView.b(null);
        }
    }
}
