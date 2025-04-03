package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import defpackage.a;
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
import defpackage.uvq;
import defpackage.uvr;
import defpackage.uvt;
import defpackage.uwr;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageListRecyclerView extends uwr implements ekhu<uvr> {
    public uvr ac;
    private Context ad;

    @Deprecated
    public MessageListRecyclerView(Context context) {
        super(context);
        aR();
    }

    private final void aR() {
        if (this.ac == null) {
            try {
                uvt uvtVar = (uvt) aX();
                uvq uvqVar = new uvq(this);
                ekkr.c(uvqVar);
                try {
                    uvr h = uvtVar.h();
                    this.ac = h;
                    if (h == null) {
                        ekkr.b(uvqVar);
                    }
                    this.ac.b = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.ac == null) {
                        ekkr.b(uvqVar);
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
        return uvr.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uvr H() {
        uvr uvrVar = this.ac;
        if (uvrVar != null) {
            return uvrVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
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

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aR();
        uvr uvrVar = this.ac;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = uvrVar.a;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        return onTouchEvent;
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MessageListRecyclerView(ekji ekjiVar) {
        super(ekjiVar);
        aR();
    }
}
