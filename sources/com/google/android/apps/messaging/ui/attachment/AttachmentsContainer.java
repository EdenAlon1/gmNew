package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.cxnk;
import defpackage.cxnl;
import defpackage.cxod;
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
/* loaded from: classes3.dex */
public final class AttachmentsContainer extends cxod implements ekhu<cxnk> {
    private cxnk a;
    private Context b;

    @Deprecated
    public AttachmentsContainer(Context context) {
        super(context);
        e();
    }

    private final cxnk d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((cxnl) aX()).V();
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
        return cxnk.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxnk H() {
        cxnk cxnkVar = this.a;
        if (cxnkVar != null) {
            return cxnkVar;
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
        e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        cxnk d = d();
        int measuredWidth = d.s.getMeasuredWidth();
        int i3 = d.A;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                d.s.setMeasuredDimension(measuredWidth, d.e);
                return;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                d.s.setMeasuredDimension(measuredWidth, 0);
                return;
            }
        }
        d.s.setMeasuredDimension(measuredWidth, d.f);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        d().l(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        final cxnk d = d();
        int i5 = d.A;
        if (i5 == 4 || i5 == 5) {
            return;
        }
        d.b.post(new Runnable() { // from class: cxmw
            @Override // java.lang.Runnable
            public final void run() {
                cxnk cxnkVar = cxnk.this;
                cxnkVar.l(cxnkVar.s.getScrollX());
            }
        });
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AttachmentsContainer(ekji ekjiVar) {
        super(ekjiVar);
        e();
    }
}
