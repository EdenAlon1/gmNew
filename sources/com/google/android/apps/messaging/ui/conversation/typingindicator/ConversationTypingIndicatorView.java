package com.google.android.apps.messaging.ui.conversation.typingindicator;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import defpackage.azze;
import defpackage.czkr;
import defpackage.czyc;
import defpackage.czye;
import defpackage.ffbr;
import defpackage.pbt;
import defpackage.pby;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationTypingIndicatorView extends czye implements czkr<ConversationTypingIndicatorView> {
    public final List a;
    public LinearLayout b;
    public Drawable c;
    pbt d;
    public azze e;
    public ffbr f;

    public ConversationTypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList(5);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (LinearLayout) findViewById(R.id.typer_region);
        this.c = ((ImageView) findViewById(R.id.typing_dots)).getDrawable();
        czyc czycVar = new czyc(this);
        this.d = czycVar;
        pby.a(this.c, czycVar);
    }

    @Override // defpackage.czkr
    public final /* bridge */ /* synthetic */ View a() {
        return this;
    }

    @Override // defpackage.czkr
    public final void b() {
    }
}
