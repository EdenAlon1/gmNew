package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.bcun;
import defpackage.bcuo;
import defpackage.ellf;
import defpackage.ellq;
import defpackage.waf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationSettingsOptionItemView extends waf {
    public TextView a;
    public TextView b;
    public SwitchCompat c;
    public bcun d;
    public bcuo e;
    public ellq f;

    /* compiled from: PG */
    public final class a implements ellf {
        public final bcun a;

        public a(bcun bcunVar) {
            this.a = bcunVar;
        }
    }

    public ConversationSettingsOptionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.title);
        this.b = (TextView) findViewById(R.id.subtitle);
        this.c = (SwitchCompat) findViewById(R.id.switch_button);
        bcun a2 = this.e.a(getContext());
        this.d = a2;
        this.f.b(this, new a(a2));
    }
}
