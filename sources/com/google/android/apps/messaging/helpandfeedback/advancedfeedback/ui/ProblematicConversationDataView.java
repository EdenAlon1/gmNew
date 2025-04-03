package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.adyj;
import defpackage.adyk;
import defpackage.adyu;
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
public final class ProblematicConversationDataView extends adyu implements ekhu<adyj> {
    private adyj g;
    private Context h;

    @Deprecated
    public ProblematicConversationDataView(Context context) {
        super(context);
        j();
    }

    private final void j() {
        if (this.g == null) {
            try {
                this.g = ((adyk) aX()).x();
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
        return adyj.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final adyj H() {
        adyj adyjVar = this.g;
        if (adyjVar != null) {
            return adyjVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.h;
            if (context == null) {
                this.h = a;
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
        j();
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProblematicConversationDataView(ekji ekjiVar) {
        super(ekjiVar);
        j();
    }
}
