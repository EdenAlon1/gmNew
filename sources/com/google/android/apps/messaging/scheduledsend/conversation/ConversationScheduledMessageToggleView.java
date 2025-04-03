package com.google.android.apps.messaging.scheduledsend.conversation;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.akpt;
import defpackage.crlw;
import defpackage.czkr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationScheduledMessageToggleView extends akpt implements czkr<ConversationScheduledMessageToggleView> {
    public TextView a;
    public ImageView b;
    public boolean c;

    public ConversationScheduledMessageToggleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.toggle_text_view);
        ImageView imageView = (ImageView) findViewById(R.id.schedule_send_icon);
        this.b = imageView;
        imageView.getDrawable().setAutoMirrored(true);
        TextView textView = this.a;
        int i = crlw.a;
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.czkr
    public final void b() {
    }
}
