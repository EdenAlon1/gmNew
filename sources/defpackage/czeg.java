package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czeg extends wr {
    public final TextView s;

    public czeg(czeh czehVar, View view) {
        super(view);
        TextView textView = (TextView) view.findViewById(R.id.emoji_header);
        this.s = textView;
        textView.setHeight(czehVar.t / 2);
        textView.setPadding(czehVar.s, 0, 0, 0);
    }
}
