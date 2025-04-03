package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a;
import defpackage.czhd;
import defpackage.czhe;
import defpackage.czhg;
import defpackage.czly;
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
public final class ClickFixingEmojiAppCompatTextView extends czly implements ekhu<czhe> {
    public czhe a;
    private Context b;

    @Deprecated
    public ClickFixingEmojiAppCompatTextView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        if (this.a == null) {
            try {
                czhg czhgVar = (czhg) aX();
                czhd czhdVar = new czhd(this);
                ekkr.c(czhdVar);
                try {
                    czhe Z = czhgVar.Z();
                    this.a = Z;
                    if (Z == null) {
                        ekkr.b(czhdVar);
                    }
                    this.a.a = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ekkr.b(czhdVar);
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
        return czhe.class;
    }

    @Override // defpackage.ekhu
    public final /* bridge */ /* synthetic */ Object H() {
        czhe czheVar = this.a;
        if (czheVar != null) {
            return czheVar;
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
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c();
        return super.onTouchEvent(motionEvent);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickFixingEmojiAppCompatTextView(ekji ekjiVar) {
        super(ekjiVar);
        c();
    }
}
