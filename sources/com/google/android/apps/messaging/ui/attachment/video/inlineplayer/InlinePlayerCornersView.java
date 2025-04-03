package com.google.android.apps.messaging.ui.attachment.video.inlineplayer;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.cxpj;
import defpackage.cxpk;
import defpackage.cxpn;
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
public final class InlinePlayerCornersView extends cxpn implements ekhu<cxpj> {
    private cxpj a;
    private Context b;

    @Deprecated
    public InlinePlayerCornersView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((cxpk) aX()).X();
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
        return cxpj.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxpj H() {
        cxpj cxpjVar = this.a;
        if (cxpjVar != null) {
            return cxpjVar;
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
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d();
        cxpj cxpjVar = this.a;
        if (cxpjVar.d > 0 || cxpjVar.e != null) {
            int width = cxpjVar.a.getWidth();
            int height = cxpjVar.a.getHeight();
            if (cxpjVar.g != width || cxpjVar.h != height) {
                cxpjVar.c.set(cxpjVar.a.getPaddingLeft(), cxpjVar.a.getPaddingTop(), width - cxpjVar.a.getPaddingRight(), height - cxpjVar.a.getPaddingBottom());
                cxpjVar.f.reset();
                float[] fArr = cxpjVar.e;
                if (fArr != null) {
                    cxpjVar.f.addRoundRect(cxpjVar.c, fArr, Path.Direction.CW);
                } else {
                    Path path = cxpjVar.f;
                    RectF rectF = cxpjVar.c;
                    float f = cxpjVar.d;
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                }
                cxpjVar.g = width;
                cxpjVar.h = height;
            }
            int saveCount = canvas.getSaveCount();
            canvas.save();
            canvas.clipPath(cxpjVar.f);
            canvas.drawPaint(cxpjVar.b);
            canvas.restoreToCount(saveCount);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        d();
    }

    public InlinePlayerCornersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InlinePlayerCornersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InlinePlayerCornersView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public InlinePlayerCornersView(ekji ekjiVar) {
        super(ekjiVar);
        d();
    }
}
