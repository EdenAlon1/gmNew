package com.google.android.apps.messaging.otp.deletion.save;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.aivb;
import defpackage.aivm;
import defpackage.aivn;
import defpackage.aivo;
import defpackage.aivr;
import defpackage.cynb;
import defpackage.ekhu;
import defpackage.ekji;
import defpackage.ekke;
import defpackage.ekkn;
import defpackage.ekkv;
import defpackage.ekkw;
import defpackage.ellg;
import defpackage.ellj;
import defpackage.emxf;
import defpackage.fbal;
import defpackage.fbas;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SaveOtpView extends aivr implements ekhu<aivm> {
    private aivm a;
    private Context b;

    @Deprecated
    public SaveOtpView(Context context) {
        super(context);
        e();
    }

    private final aivm d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((aivo) aX()).L();
                ellg.c(this).b = this;
                ellj.d(this, aivb.class, new aivn(this.a));
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
        return aivm.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aivm H() {
        aivm aivmVar = this.a;
        if (aivmVar != null) {
            return aivmVar;
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
            } else {
                boolean z = true;
                if (context != a && !ekkv.b(context)) {
                    z = false;
                }
                emxf.m(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        final aivm d = d();
        d.g = new cynb() { // from class: aivk
            @Override // defpackage.cynb
            public final void gl() {
                aivm.this.c();
            }
        };
        ((Optional) d.d.b()).ifPresent(new Consumer() { // from class: aivl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).h(aivm.this.g);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final aivm d = d();
        ((Optional) d.d.b()).ifPresent(new Consumer() { // from class: aivg
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).k(aivm.this.g);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    public SaveOtpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SaveOtpView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SaveOtpView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public SaveOtpView(ekji ekjiVar) {
        super(ekjiVar);
        e();
    }
}
