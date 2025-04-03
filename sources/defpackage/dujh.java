package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dujh implements View.OnClickListener {
    final /* synthetic */ dujl a;

    public dujh(dujl dujlVar) {
        this.a = dujlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b();
        this.a.a.dismissAllowingStateLoss();
    }
}
