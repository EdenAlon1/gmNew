package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vfo extends wr implements tvr {
    public final EmojiAppCompatTextView s;
    public final TextView t;

    public vfo(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.reaction);
        findViewById.getClass();
        this.s = (EmojiAppCompatTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.reaction_count);
        findViewById2.getClass();
        this.t = (TextView) findViewById2;
    }

    @Override // defpackage.tvr
    public final tve a() {
        return tve.CUSTOM_REACTION_BADGE;
    }

    @Override // defpackage.tvr
    public final void b() {
    }
}
