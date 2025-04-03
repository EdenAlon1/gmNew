package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import defpackage.ebvw;
import defpackage.ebwc;
import defpackage.emux;
import defpackage.emxc;
import defpackage.engr;
import defpackage.engw;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class DynamicCardRootView extends ConstraintLayout implements ebwc {
    public emxc i;
    public emxc j;
    public boolean k;

    public DynamicCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        if (this.i.g()) {
            ebvwVar.b(this, ((Integer) this.i.c()).intValue());
        }
        this.k = true;
    }

    public final engw f() {
        engr engrVar = new engr();
        ebwc ebwcVar = (ebwc) findViewById(R.id.og_text_card_root);
        if (ebwcVar != null) {
            engrVar.h(ebwcVar);
        }
        return engrVar.g();
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        this.k = false;
        if (this.i.g()) {
            ebvwVar.e(this);
        }
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DynamicCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        emux emuxVar = emux.a;
        this.i = emuxVar;
        this.j = emuxVar;
    }
}
