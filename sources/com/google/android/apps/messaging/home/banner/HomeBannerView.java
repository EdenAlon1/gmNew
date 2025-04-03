package com.google.android.apps.messaging.home.banner;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.aefn;
import defpackage.aefo;
import defpackage.aefr;
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
public final class HomeBannerView extends aefr implements ekhu<aefn> {
    private aefn g;
    private Context h;

    @Deprecated
    public HomeBannerView(Context context) {
        super(context);
        j();
    }

    private final void j() {
        if (this.g == null) {
            try {
                this.g = ((aefo) aX()).B();
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
        return aefn.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final aefn H() {
        aefn aefnVar = this.g;
        if (aefnVar != null) {
            return aefnVar;
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

    public HomeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HomeBannerView(ekji ekjiVar) {
        super(ekjiVar);
        j();
    }
}
