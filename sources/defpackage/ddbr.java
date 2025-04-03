package defpackage;

import android.content.Context;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddbr extends ClickableSpan {
    final /* synthetic */ Context a;
    final /* synthetic */ ddbs b;

    public ddbr(ddbs ddbsVar, Context context) {
        this.a = context;
        this.b = ddbsVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        eldl.p(this.a, ((akvg) this.b.e.b()).o(this.a));
    }
}
