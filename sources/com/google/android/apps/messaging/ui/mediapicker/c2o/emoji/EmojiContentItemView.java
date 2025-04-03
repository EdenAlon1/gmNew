package com.google.android.apps.messaging.ui.mediapicker.c2o.emoji;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;
import defpackage.crjx;
import defpackage.dcai;
import defpackage.dcal;
import defpackage.dcbx;
import defpackage.dcca;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EmojiContentItemView extends dcca implements dcal {
    public TextView a;
    public dcbx b;
    public dcai c;
    public crjx d;

    public EmojiContentItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.dcal
    public final int a() {
        return 1;
    }

    @Override // defpackage.dcal
    public final void b(dcai dcaiVar) {
        this.c = dcaiVar;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.emoji_text);
        setOnClickListener(new View.OnClickListener() { // from class: dcby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EmojiContentItemView emojiContentItemView = EmojiContentItemView.this;
                dcai dcaiVar = emojiContentItemView.c;
                if (dcaiVar != null) {
                    dcaiVar.a(emojiContentItemView);
                }
            }
        });
        setClipToOutline(true);
        this.a.setTextColor(this.d.g() ? -1 : getContext().getColor(R.color.google_grey900));
    }
}
