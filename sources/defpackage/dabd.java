package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dabd extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ dabe b;

    public dabd(dabe dabeVar, Context context) {
        this.a = context;
        this.b = dabeVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Context context = this.a;
        TextView textView = this.b.d;
        String a = crmi.a(context);
        dcxx.d(context, textView, dcxx.a(context.getString(R.string.google_tos_chat_features_tooltip_v2, a), a, context.getString(R.string.google_tos_chat_features_learn_more_url, ctid.c(context).getLanguage())), this.a.getResources().getDimensionPixelSize(R.dimen.chat_features_tooltip_bottom_margin));
    }
}
