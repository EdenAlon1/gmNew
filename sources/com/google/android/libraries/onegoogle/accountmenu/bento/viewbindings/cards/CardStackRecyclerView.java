package com.google.android.libraries.onegoogle.accountmenu.bento.viewbindings.cards;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import com.google.android.flexbox.FlexboxLayoutManager;
import defpackage.deue;
import defpackage.ebch;
import defpackage.ebos;
import defpackage.ehdr;
import defpackage.vk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CardStackRecyclerView extends RecyclerView {
    private final int ac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context) {
        super(context);
        context.getClass();
        int b = ebos.b(getContext().getResources().getDisplayMetrics(), 2);
        this.ac = b;
        deue deueVar = new deue(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ehdr.c(getContext(), R.attr.colorSurfaceContainer, 0));
        gradientDrawable.setSize(b, b);
        deueVar.a = gradientDrawable;
        deueVar.c();
        w(deueVar);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.K(0);
        flexboxLayoutManager.M();
        ap(flexboxLayoutManager);
        setNestedScrollingEnabled(false);
    }

    @Override // android.support.v7.widget.RecyclerView
    public final void am(vk vkVar) {
        throw new Exception("Use provideAdapter function to supply an adapter to CardStackRecyclerView.");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    protected final void onMeasure(int i, int i2) {
        vk vkVar = this.n;
        if ((vkVar instanceof ebch ? (ebch) vkVar : null) != null) {
            throw null;
        }
        throw new IllegalArgumentException("CardStackAdapter has to be set on CardStackRecyclerView before measuring.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        int b = ebos.b(getContext().getResources().getDisplayMetrics(), 2);
        this.ac = b;
        deue deueVar = new deue(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ehdr.c(getContext(), R.attr.colorSurfaceContainer, 0));
        gradientDrawable.setSize(b, b);
        deueVar.a = gradientDrawable;
        deueVar.c();
        w(deueVar);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.K(0);
        flexboxLayoutManager.M();
        ap(flexboxLayoutManager);
        setNestedScrollingEnabled(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStackRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        int b = ebos.b(getContext().getResources().getDisplayMetrics(), 2);
        this.ac = b;
        deue deueVar = new deue(getContext());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ehdr.c(getContext(), R.attr.colorSurfaceContainer, 0));
        gradientDrawable.setSize(b, b);
        deueVar.a = gradientDrawable;
        deueVar.c();
        w(deueVar);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(getContext());
        flexboxLayoutManager.K(0);
        flexboxLayoutManager.M();
        ap(flexboxLayoutManager);
        setNestedScrollingEnabled(false);
    }
}
