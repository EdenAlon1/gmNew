package com.google.android.apps.messaging.welcome.v1.expresssignin;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.demh;
import defpackage.deml;
import defpackage.demm;
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
public final class WelcomeExpressSignInTopView extends demh implements ekhu<deml> {
    private deml i;
    private Context j;

    @Deprecated
    public WelcomeExpressSignInTopView(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.i == null) {
            try {
                this.i = ((demm) aX()).am();
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
        return deml.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        deml demlVar = this.i;
        if (demlVar != null) {
            return demlVar;
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
        g();
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WelcomeExpressSignInTopView(ekji ekjiVar) {
        super(ekjiVar);
        g();
    }
}
