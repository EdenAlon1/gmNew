package com.google.android.libraries.onegoogle.accountmenu.cards;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.chip.Chip;
import defpackage.ebcu;
import defpackage.eboz;
import defpackage.ebvw;
import defpackage.ebwc;
import defpackage.emux;
import defpackage.emxc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class TextualCardRootView extends FrameLayout implements ebwc {
    public eboz a;
    public eboz b;
    public emxc c;
    private Chip d;
    private Chip e;
    private int f;

    public TextualCardRootView(Context context) {
        this(context, null);
    }

    @Override // defpackage.ebwc
    public final void b(ebvw ebvwVar) {
        if (this.c.g()) {
            ebvwVar.b(this.d, ((ebcu) this.c.c()).b);
            ebvwVar.b(this.e, ((ebcu) this.c.c()).c);
        }
    }

    @Override // defpackage.ebwc
    public final void ho(ebvw ebvwVar) {
        if (this.c.g()) {
            ebvwVar.e(this.d);
            ebvwVar.e(this.e);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.d = (Chip) findViewById(R.id.og_text_card_action);
        this.e = (Chip) findViewById(R.id.og_text_card_secondary_action);
        this.a = new eboz(this.d);
        this.b = new eboz(this.e);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != this.f) {
            this.f = size;
            this.a.b(size);
            this.b.b(this.f);
        }
        super.onMeasure(i, i2);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TextualCardRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = emux.a;
    }
}
