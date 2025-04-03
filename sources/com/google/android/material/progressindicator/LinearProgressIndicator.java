package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.ehlb;
import defpackage.ehlc;
import defpackage.ehls;
import defpackage.ehma;
import defpackage.ehmb;
import defpackage.ehmc;
import defpackage.ehmf;
import defpackage.ehmj;
import defpackage.ehmk;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class LinearProgressIndicator extends ehlb<ehmk> {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.ehlb
    public final /* synthetic */ ehlc a(Context context, AttributeSet attributeSet) {
        return new ehmk(context, attributeSet);
    }

    @Override // defpackage.ehlb
    public final void f(int i, boolean z) {
        ehlc ehlcVar = this.a;
        if (ehlcVar != null && ((ehmk) ehlcVar).m == 0 && isIndeterminate()) {
            return;
        }
        super.f(i, false);
    }

    @Override // defpackage.ehlb, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ehmk ehmkVar = (ehmk) this.a;
        boolean z2 = true;
        if (ehmkVar.n != 1 && ((getLayoutDirection() != 1 || ((ehmk) this.a).n != 2) && (getLayoutDirection() != 0 || ((ehmk) this.a).n != 3))) {
            z2 = false;
        }
        ehmkVar.o = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        ehmb indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        ehls progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        ehma ehmjVar;
        ehmc ehmcVar = new ehmc((ehmk) this.a);
        Context context2 = getContext();
        ehmk ehmkVar = (ehmk) this.a;
        if (ehmkVar.m == 0) {
            ehmjVar = new ehmf(ehmkVar);
        } else {
            ehmjVar = new ehmj(context2, ehmkVar);
        }
        setIndeterminateDrawable(new ehmb(context2, ehmkVar, ehmcVar, ehmjVar));
        setProgressDrawable(new ehls(getContext(), (ehmk) this.a, ehmcVar));
    }
}
