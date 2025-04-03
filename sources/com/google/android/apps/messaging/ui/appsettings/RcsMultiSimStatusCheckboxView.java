package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.cxax;
import defpackage.cxba;
import defpackage.cxbc;
import defpackage.cxiu;
import defpackage.ehft;
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
public final class RcsMultiSimStatusCheckboxView extends cxiu implements ekhu<cxba> {
    public cxba a;
    private Context f;

    @Deprecated
    public RcsMultiSimStatusCheckboxView(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.a == null) {
            try {
                cxbc cxbcVar = (cxbc) aX();
                cxax cxaxVar = new cxax(this);
                ekkr.c(cxaxVar);
                try {
                    cxba T = cxbcVar.T();
                    this.a = T;
                    if (T == null) {
                        ekkr.b(cxaxVar);
                    }
                    this.a.d = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof fbas) && !(context instanceof fbal.a) && !(context instanceof ekkn)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ekke)) {
                        throw new IllegalStateException(a.L(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ekkr.b(cxaxVar);
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
        return cxba.class;
    }

    @Override // defpackage.ekhu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final cxba H() {
        cxba cxbaVar = this.a;
        if (cxbaVar != null) {
            return cxbaVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.checkbox.MaterialCheckBox, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ekkw.a(getContext())) {
            Context a = ekkv.a(this);
            Context context = this.f;
            if (context == null) {
                this.f = a;
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
        g();
    }

    @Override // android.widget.CompoundButton, android.view.View
    public final boolean performClick() {
        g();
        final cxba cxbaVar = this.a;
        if (cxbaVar.c.isChecked()) {
            ehft ehftVar = new ehft(cxbaVar.a);
            ehftVar.y(cxbaVar.a.getString(R.string.disable_rcs_warning_title_v2));
            ehftVar.n(cxbaVar.b.length() == 0 ? cxbaVar.a.getString(R.string.disable_rcs_warning_text_sim_level) : cxbaVar.a.getString(R.string.disable_rcs_warning_text_sim_level_phone_number, cxbaVar.b));
            ehftVar.u(cxbaVar.a.getString(R.string.disable_rcs_warning_accept_text), new DialogInterface.OnClickListener() { // from class: cxay
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cxba.this.c.f(0);
                }
            });
            ehftVar.p(cxbaVar.a.getString(android.R.string.cancel), new DialogInterface.OnClickListener() { // from class: cxaz
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            ehftVar.create().show();
        } else {
            cxbaVar.c.f(1);
        }
        return true;
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsMultiSimStatusCheckboxView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsMultiSimStatusCheckboxView(ekji ekjiVar) {
        super(ekjiVar);
        g();
    }
}
