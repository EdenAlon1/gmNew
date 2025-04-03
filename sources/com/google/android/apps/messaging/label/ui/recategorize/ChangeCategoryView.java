package com.google.android.apps.messaging.label.ui.recategorize;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ahjv;
import defpackage.ahko;
import defpackage.ahkp;
import defpackage.ahkq;
import defpackage.ahkx;
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
public final class ChangeCategoryView extends ahkx implements ekhu<ahko> {
    private ahko a;
    private Context b;

    @Deprecated
    public ChangeCategoryView(Context context) {
        super(context);
        e();
    }

    private final ahko d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((ahkq) aX()).J();
                ellg.c(this).b = this;
                ellj.d(this, ahjv.class, new ahkp(this.a));
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
        return ahko.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ahko H() {
        ahko ahkoVar = this.a;
        if (ahkoVar != null) {
            return ahkoVar;
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
        final ahko d = d();
        d.k = new cynb() { // from class: ahkm
            @Override // defpackage.cynb
            public final void gl() {
                ahko ahkoVar = ahko.this;
                ahkoVar.d();
                ahkoVar.e();
            }
        };
        ((Optional) d.h.b()).ifPresent(new Consumer() { // from class: ahkn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).h(ahko.this.k);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ahko d = d();
        ((Optional) d.h.b()).ifPresent(new Consumer() { // from class: ahkh
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cync) obj).k(ahko.this.k);
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

    public ChangeCategoryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChangeCategoryView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ChangeCategoryView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ChangeCategoryView(ekji ekjiVar) {
        super(ekjiVar);
        e();
    }
}
