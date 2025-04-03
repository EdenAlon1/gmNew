package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eher implements View.OnClickListener {
    final /* synthetic */ ehfh a;
    final /* synthetic */ ehes b;

    public eher(ehes ehesVar, ehfh ehfhVar) {
        this.a = ehfhVar;
        this.b = ehesVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int L = this.b.b().L() + 1;
        if (L < this.b.ag.n.a()) {
            this.b.e(this.a.F(L));
        }
    }
}
