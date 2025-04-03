package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czok extends ClickableSpan {
    final /* synthetic */ czol a;
    final /* synthetic */ Context b;

    public czok(czol czolVar, Context context) {
        this.a = czolVar;
        this.b = context;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Intent o = ((akvg) this.a.b.b()).o(this.b);
        o.getClass();
        eldl.p(this.b, o);
    }
}
