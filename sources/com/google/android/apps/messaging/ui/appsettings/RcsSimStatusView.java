package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.cxct;
import defpackage.cxcu;
import defpackage.cxiv;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.kjz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RcsSimStatusView extends cxiv implements ekhu<cxct> {
    private cxct i;
    private Context j;

    @Deprecated
    public RcsSimStatusView(Context context) {
        super(context);
        h();
    }

    private final void h() {
        if (this.i == null) {
            try {
                this.i = ((cxcu) aX()).U();
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
        return cxct.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final cxct H() {
        cxct cxctVar = this.i;
        if (cxctVar != null) {
            return cxctVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kjz();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.j;
            if (context == null) {
                this.j = a;
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
        h();
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsSimStatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RcsSimStatusView(ekji ekjiVar) {
        super(ekjiVar);
        h();
    }
}
