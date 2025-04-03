package com.google.android.apps.messaging.conversation.settings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import defpackage.altk;
import defpackage.crjo;
import defpackage.crjx;
import defpackage.ddzb;
import defpackage.ekhw;
import defpackage.wab;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BusinessTopActionView extends wab implements View.OnClickListener {
    public crjo a;
    public altk b;
    public ddzb c;
    public final crjx d;

    /* compiled from: PG */
    public interface a {
        crjx a();
    }

    public BusinessTopActionView(Context context) {
        super(context);
        this.d = ((a) ekhw.a(context, a.class)).a();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        crjo crjoVar = this.a;
        if (crjoVar == null) {
            this.b.aF(1, 2, null);
            this.c.k(R.string.business_action_failed_to_launch);
        } else {
            if (!crjoVar.i()) {
                this.c.k(R.string.business_action_failed_to_launch);
            }
            this.b.aF(this.a.j(), 2, this.a.h());
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
    }

    public BusinessTopActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = ((a) ekhw.a(context, a.class)).a();
    }
}
