package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;
import defpackage.ehlb;
import defpackage.ehlc;
import defpackage.ehld;
import defpackage.ehli;
import defpackage.ehln;
import defpackage.ehlo;
import defpackage.ehls;
import defpackage.ehma;
import defpackage.ehmb;
import defpackage.pcj;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class CircularProgressIndicator extends ehlb<ehlo> {
    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.ehlb
    public final /* synthetic */ ehlc a(Context context, AttributeSet attributeSet) {
        return new ehlo(context, attributeSet);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        ehma ehliVar;
        ehld ehldVar = new ehld((ehlo) this.a);
        Context context2 = getContext();
        ehlo ehloVar = (ehlo) this.a;
        if (ehloVar.m == 1) {
            ehliVar = new ehln(context2, ehloVar);
        } else {
            ehliVar = new ehli(ehloVar);
        }
        ehmb ehmbVar = new ehmb(context2, ehloVar, ehldVar, ehliVar);
        ehmbVar.c = pcj.b(context2.getResources(), R.drawable.indeterminate_static, null);
        setIndeterminateDrawable(ehmbVar);
        setProgressDrawable(new ehls(getContext(), (ehlo) this.a, ehldVar));
    }
}
