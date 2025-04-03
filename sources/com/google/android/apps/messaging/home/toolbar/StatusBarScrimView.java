package com.google.android.apps.messaging.home.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.home.toolbar.StatusBarScrimView;
import defpackage.aepe;
import defpackage.ffko;
import defpackage.fflc;
import defpackage.ffls;
import defpackage.ffmx;
import defpackage.kud;
import defpackage.kvd;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StatusBarScrimView extends View {
    public static final /* synthetic */ ffmx[] a;
    public final ffls b;

    static {
        ffko ffkoVar = new ffko(StatusBarScrimView.class, "topInset", "getTopInset()I", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatusBarScrimView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.b = new aepe(0, this);
        kud kudVar = new kud() { // from class: aepd
            @Override // defpackage.kud
            public final kxh ey(View view, kxh kxhVar) {
                int i = kxhVar.f(519).c;
                StatusBarScrimView.this.b.d(StatusBarScrimView.a[0], Integer.valueOf(i));
                return kxhVar;
            }
        };
        int[] iArr = kvo.a;
        kvd.k(this, kudVar);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((Number) this.b.c(a[0])).intValue(), 1073741824));
    }
}
