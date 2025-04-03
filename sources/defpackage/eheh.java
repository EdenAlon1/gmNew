package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eheh implements View.OnClickListener {
    final /* synthetic */ ehfh a;
    final /* synthetic */ ehes b;

    public eheh(ehes ehesVar, ehfh ehfhVar) {
        this.a = ehfhVar;
        this.b = ehesVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int N = this.b.b().N() - 1;
        if (N >= 0) {
            this.b.e(this.a.F(N));
        }
    }
}
