package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutw extends wr {
    private final EmojiView s;

    public dutw(ViewGroup viewGroup, LayoutInflater layoutInflater, int i, int i2, duvr duvrVar) {
        super(layoutInflater.inflate(R.layout.emoji_view_holder, viewGroup, false));
        this.a.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        EmojiView emojiView = (EmojiView) this.a.findViewById(R.id.emoji_view);
        this.s = emojiView;
        emojiView.d = null;
        emojiView.e = null;
        emojiView.setClickable(true);
        emojiView.setOnTouchListener(duvrVar);
        emojiView.setOnHoverListener(duvrVar);
        emojiView.setOnClickListener(duvrVar);
        if (duvrVar != null) {
            kvo.t(emojiView, kuh.a(emojiView.getContext()));
        }
        emojiView.setOnLongClickListener(duvrVar);
    }

    public final void C(duvq duvqVar, engw engwVar) {
        this.s.c(duvqVar);
        this.s.b = engwVar;
    }
}
