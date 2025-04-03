package com.google.android.libraries.messaging.lighter.richcard.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.dzya;
import defpackage.dzyk;
import defpackage.fdql;
import defpackage.tb;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class CardCarouselView extends RecyclerView implements dzya {
    private final tb ac;

    public CardCarouselView(Context context) {
        this(context, null);
    }

    @Override // defpackage.dzya
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        throw null;
    }

    public CardCarouselView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardCarouselView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPadding(getResources().getDimensionPixelSize(R.dimen.rich_card_start_end_padding), 0, 0, 0);
        setClipToPadding(false);
        tb tbVar = new tb(getContext(), 0);
        this.ac = tbVar;
        Drawable drawable = getContext().getDrawable(R.drawable.rich_card_divider);
        if (drawable != null) {
            tbVar.a = drawable;
            if (!fdql.h()) {
                w(tbVar);
            }
            setNestedScrollingEnabled(false);
            if (fdql.h()) {
                dzyk.a(getContext(), fdql.e());
                dzyk.a(getContext(), fdql.d());
                getContext().getResources().getDimensionPixelSize(R.dimen.bubble_cell_content_start_end_padding);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
    }
}
