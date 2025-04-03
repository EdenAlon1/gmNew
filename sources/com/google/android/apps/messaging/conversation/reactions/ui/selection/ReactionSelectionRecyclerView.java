package com.google.android.apps.messaging.conversation.reactions.ui.selection;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.cmqo;
import defpackage.cmsl;
import defpackage.cmtd;
import defpackage.elbx;
import defpackage.entd;
import defpackage.eprt;
import defpackage.vfc;
import defpackage.vfz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReactionSelectionRecyclerView extends vfz {
    public static final entd ac = entd.c("BugleReactions");
    public vfc ad;
    public elbx ae;
    public cmqo af;
    public cmsl ag;
    public View ah;
    public cmtd ai;
    public Optional aj;
    public eprt ak;

    public ReactionSelectionRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.getClass();
        layoutParams.width = getContext().getResources().getDimensionPixelSize(R.dimen.scrollable_reactions_selection_bar_recycler_view_width);
        setLayoutParams(layoutParams);
    }
}
