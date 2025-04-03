package com.google.android.apps.messaging.home.list;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.aein;
import defpackage.aeio;
import defpackage.aejw;
import defpackage.au;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationListItemView extends aejw implements ekhu<aein> {
    private aein d;
    private Context e;

    @Deprecated
    public ConversationListItemView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.d == null) {
            try {
                this.d = ((aeio) aX()).D();
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
        return aein.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aein H() {
        aein aeinVar = this.d;
        if (aeinVar != null) {
            return aeinVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new au(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.e;
            if (context == null) {
                this.e = a;
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
        e();
    }

    public ConversationListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationListItemView(ekji ekjiVar) {
        super(ekjiVar);
        e();
    }
}
