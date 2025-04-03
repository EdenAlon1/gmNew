package com.google.android.apps.messaging.ui.attachment.video;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.ctap;
import defpackage.cxon;
import defpackage.cxoo;
import defpackage.cxow;
import defpackage.cxox;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.ellv;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoAttachmentView extends cxoo implements ekhu, ellv {
    private cxow a;
    private final TypedArray b;
    private Context c;

    @Deprecated
    public VideoAttachmentView(Context context) {
        super(context);
        this.b = null;
        f();
    }

    private final cxow e() {
        f();
        return this.a;
    }

    private final void f() {
        if (this.a == null) {
            try {
                this.a = ((cxox) aX()).W();
                TypedArray typedArray = this.b;
                if (typedArray != null) {
                    typedArray.recycle();
                }
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
        return cxow.class;
    }

    @Override // defpackage.ellv
    public final TypedArray a() {
        return this.b;
    }

    @Override // defpackage.ekhu
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final cxow H() {
        cxow cxowVar = this.a;
        if (cxowVar != null) {
            return cxowVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.c;
            if (context == null) {
                this.c = a;
                return;
            }
            boolean z = true;
            if (context != a && !ekkv.b(context)) {
                z = false;
            }
            emxf.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cxow e = e();
        ListenableFuture listenableFuture = e.c;
        if (listenableFuture != null) {
            listenableFuture.cancel(true);
            e.c = null;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        super.onMeasure(i, i2);
        cxow e = e();
        if (e.i) {
            return;
        }
        if (e.a == null) {
            int measuredWidth2 = e.f.getMeasuredWidth();
            int measuredHeight2 = e.f.getMeasuredHeight();
            float a = ctap.a(measuredWidth2, measuredHeight2, e.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_width), e.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_height), e.d.getResources().getDimensionPixelSize(R.dimen.video_attachment_min_size));
            measuredHeight = (int) (measuredHeight2 * a);
            measuredWidth = (int) (measuredWidth2 * a);
            e.f.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        } else {
            measuredWidth = e.f.getMeasuredWidth();
            measuredHeight = e.f.getMeasuredHeight();
        }
        float f = measuredHeight;
        float f2 = measuredWidth;
        float min = Math.min(Math.max(View.MeasureSpec.getSize(i) / f2, View.MeasureSpec.getSize(i2) / f), Math.max(Math.max(1.0f, e.d.getMinimumWidth() / f2), Math.max(1.0f, e.d.getMinimumHeight() / f)));
        e.d.setMeasuredDimension((int) (f2 * min), (int) (f * min));
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        final cxow e = e();
        if (e.h) {
            return;
        }
        e.f.setOnLongClickListener(new View.OnLongClickListener() { // from class: cxor
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                cxow.this.d.performLongClick();
                return true;
            }
        });
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context.obtainStyledAttributes(attributeSet, cxon.a);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = context.obtainStyledAttributes(attributeSet, cxon.a, i, 0);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = context.obtainStyledAttributes(attributeSet, cxon.a, i, i2);
    }

    public VideoAttachmentView(ekji ekjiVar) {
        super(ekjiVar);
        this.b = null;
        f();
    }
}
