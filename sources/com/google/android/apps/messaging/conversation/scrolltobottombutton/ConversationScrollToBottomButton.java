package com.google.android.apps.messaging.conversation.scrolltobottombutton;

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
import defpackage.vyp;
import defpackage.vyq;
import defpackage.vyt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationScrollToBottomButton extends vyt implements ekhu<vyp> {
    private vyp a;
    private Context b;

    @Deprecated
    public ConversationScrollToBottomButton(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((vyq) aX()).l();
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
        return vyp.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final vyp H() {
        vyp vypVar = this.a;
        if (vypVar != null) {
            return vypVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.b;
            if (context == null) {
                this.b = a;
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
        d();
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ConversationScrollToBottomButton(ekji ekjiVar) {
        super(ekjiVar);
        d();
    }
}
