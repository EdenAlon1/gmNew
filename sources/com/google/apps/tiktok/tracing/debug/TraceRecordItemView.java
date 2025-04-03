package com.google.apps.tiktok.tracing.debug;

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
import defpackage.elix;
import defpackage.eljs;
import defpackage.eljt;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TraceRecordItemView extends elix implements ekhu<eljs> {
    private eljs a;
    private Context b;

    @Deprecated
    public TraceRecordItemView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((eljt) aX()).aN();
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
        return eljs.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final eljs H() {
        eljs eljsVar = this.a;
        if (eljsVar != null) {
            return eljsVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.widget.TextView, android.view.View
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

    public TraceRecordItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TraceRecordItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TraceRecordItemView(ekji ekjiVar) {
        super(ekjiVar);
        d();
    }
}
