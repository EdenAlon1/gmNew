package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.emoji.ui.views.SingleEmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwp extends wr {
    public final SingleEmojiView s;
    private final View t;

    public dqwp(View view) {
        super(view);
        this.t = view;
        View findViewById = view.findViewById(R.id.emoji);
        findViewById.getClass();
        this.s = (SingleEmojiView) findViewById;
    }
}
