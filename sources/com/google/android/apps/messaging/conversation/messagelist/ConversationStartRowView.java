package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.azze;
import defpackage.crji;
import defpackage.cskc;
import defpackage.czkr;
import defpackage.uqk;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationStartRowView extends uqk implements czkr<ConversationStartRowView> {
    public static final cskc a = cskc.g("Bugle", "ConversationStartRowView");
    public azze b;
    public crji c;
    public ConversationStartView d;

    public ConversationStartRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (ConversationStartView) findViewById(R.id.conversation_start_view);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.czkr
    public final void b() {
    }
}
