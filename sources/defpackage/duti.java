package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duti extends wr {
    public final View s;
    public final TextView t;
    public final ImageView u;

    public duti(View view) {
        super(view);
        this.u = (ImageView) kvo.b(view, R.id.emoji_picker_header_icon);
        this.t = (TextView) view.findViewById(R.id.emoji_picker_header_text);
        View findViewById = view.findViewById(R.id.emoji_picker_header_underline);
        this.s = (findViewById == null || findViewById.getVisibility() != 0) ? null : findViewById;
    }

    final void C(boolean z) {
        if (this.s == null) {
            this.a.setSelected(z);
            return;
        }
        this.u.setSelected(z);
        this.s.setVisibility(true != z ? 8 : 0);
        this.s.setSelected(z);
    }
}
