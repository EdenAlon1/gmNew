package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ddsy;
import defpackage.dduq;
import defpackage.ddvb;
import defpackage.ddve;
import defpackage.ddvg;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkr;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ZeroStateSearchMultipleResultsView extends dduq implements ekhu<ddve> {
    public ddve a;
    private Context b;

    @Deprecated
    public ZeroStateSearchMultipleResultsView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                ddvg ddvgVar = (ddvg) aX();
                ddvb ddvbVar = new ddvb(this);
                ekkr.c(ddvbVar);
                try {
                    ddve aj = ddvgVar.aj();
                    this.a = aj;
                    if (aj == null) {
                        ekkr.b(ddvbVar);
                    }
                    this.a.O = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ekkr.b(ddvbVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ddve.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ddve H() {
        ddve ddveVar = this.a;
        if (ddveVar != null) {
            return ddveVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        d();
        ddsy ddsyVar = this.a.N;
        if (ddsyVar != null) {
            ddsyVar.a(configuration);
        }
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

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ZeroStateSearchMultipleResultsView(ekji ekjiVar) {
        super(ekjiVar);
        d();
    }
}
