package com.google.android.apps.messaging.ui.conversation;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.au;
import defpackage.cxta;
import defpackage.cxtc;
import defpackage.cxvv;
import defpackage.cxvx;
import defpackage.cxvy;
import defpackage.cxwa;
import defpackage.cxxm;
import defpackage.cynb;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkr;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.ellg;
import defpackage.ellj;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import defpackage.ucl;
import defpackage.ucm;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ComposeMessageView extends cxxm implements ekhu<cxtc> {
    public cxtc d;
    private Context e;

    @Deprecated
    public ComposeMessageView(Context context) {
        super(context);
        f();
    }

    private final cxtc e() {
        f();
        return this.d;
    }

    /* JADX WARN: Finally extract failed */
    private final void f() {
        if (this.d == null) {
            try {
                cxwa cxwaVar = (cxwa) aX();
                cxta cxtaVar = new cxta(this);
                ekkr.c(cxtaVar);
                try {
                    cxtc Y = cxwaVar.Y();
                    this.d = Y;
                    if (Y == null) {
                        ekkr.b(cxtaVar);
                    }
                    this.d.a = this;
                    ellg.c(this).b = this;
                    cxtc cxtcVar = this.d;
                    ellj.d(this, ucl.class, new cxvx(cxtcVar));
                    ellj.d(this, ucm.class, new cxvy(cxtcVar));
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.d == null) {
                        ekkr.b(cxtaVar);
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
        return cxtc.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cxtc H() {
        cxtc cxtcVar = this.d;
        if (cxtcVar != null) {
            return cxtcVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new au(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.e;
            if (context == null) {
                this.e = a;
            } else {
                boolean z = true;
                if (context != a && !ekkv.b(context)) {
                    z = false;
                }
                emxf.m(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        final cxvv cxvvVar = e().c;
        cxvvVar.as = new cynb() { // from class: cxtt
            @Override // defpackage.cynb
            public final void gl() {
                cxvv.this.K();
            }
        };
        ((Optional) cxvvVar.ag.b()).ifPresent(new Consumer() { // from class: cxtu
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).h(cxvv.this.as);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cxvvVar.K();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        cxtc e = e();
        final cxvv cxvvVar = e.c;
        ((Optional) cxvvVar.ag.b()).ifPresent(new Consumer() { // from class: cxte
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).k(cxvv.this.as);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ComposeMessageView(ekji ekjiVar) {
        super(ekjiVar);
        f();
    }
}
