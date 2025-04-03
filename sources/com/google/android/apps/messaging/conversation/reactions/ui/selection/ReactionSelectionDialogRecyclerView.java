package com.google.android.apps.messaging.conversation.reactions.ui.selection;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.vgf;
import defpackage.vgg;
import defpackage.vho;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReactionSelectionDialogRecyclerView extends vho implements ekhu<vgf> {
    private vgf ac;
    private Context ad;

    @Deprecated
    public ReactionSelectionDialogRecyclerView(Context context) {
        super(context);
        aR();
    }

    private final void aR() {
        if (this.ac == null) {
            try {
                this.ac = ((vgg) aX()).j();
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof ekke)) {
                    throw new IllegalStateException(a.L(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return vgf.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vgf H() {
        vgf vgfVar = this.ac;
        if (vgfVar != null) {
            return vgfVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.ad;
            if (context == null) {
                this.ad = a;
                return;
            }
            boolean z = true;
            if (context != a && !ekkv.b(context)) {
                z = false;
            }
            emxf.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        aR();
    }

    public ReactionSelectionDialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReactionSelectionDialogRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReactionSelectionDialogRecyclerView(ekji ekjiVar) {
        super(ekjiVar);
        aR();
    }
}
