package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehkl implements View.OnClickListener {
    final /* synthetic */ ehkm a;

    public ehkl(ehkm ehkmVar) {
        this.a = ehkmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        og ogVar = ((ehkh) view).f;
        ehkm ehkmVar = this.a;
        boolean A = ehkmVar.G.a.A(ogVar, ehkmVar.F, 0);
        if (ogVar == null || !ogVar.isCheckable()) {
            return;
        }
        if (!A || ogVar.isChecked()) {
            this.a.f(ogVar);
        }
    }
}
