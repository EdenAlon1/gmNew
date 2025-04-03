package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ddsy;
import defpackage.ddur;
import defpackage.ddvj;
import defpackage.ddvm;
import defpackage.ddvo;
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
public final class ZeroStateSearchResultsView extends ddur implements ekhu<ddvm> {
    public ddvm ac;
    private Context ad;

    @Deprecated
    public ZeroStateSearchResultsView(Context context) {
        super(context);
        aR();
    }

    private final void aR() {
        if (this.ac == null) {
            try {
                ddvo ddvoVar = (ddvo) aX();
                ddvj ddvjVar = new ddvj(this);
                ekkr.c(ddvjVar);
                try {
                    ddvm ak = ddvoVar.ak();
                    this.ac = ak;
                    if (ak == null) {
                        ekkr.b(ddvjVar);
                    }
                    this.ac.y = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.ac == null) {
                        ekkr.b(ddvjVar);
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
        return ddvm.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: aQ, reason: merged with bridge method [inline-methods] */
    public final ddvm H() {
        ddvm ddvmVar = this.ac;
        if (ddvmVar != null) {
            return ddvmVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        aR();
        ddsy ddsyVar = this.ac.o;
        if (ddsyVar != null) {
            ddsyVar.a(configuration);
        }
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

    public ZeroStateSearchResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeroStateSearchResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ZeroStateSearchResultsView(ekji ekjiVar) {
        super(ekjiVar);
        aR();
    }
}
