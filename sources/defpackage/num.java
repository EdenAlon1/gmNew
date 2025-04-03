package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class num extends nuy {
    final /* synthetic */ nva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public num(nva nvaVar) {
        super(nvaVar);
        this.a = nvaVar;
    }

    @Override // defpackage.nuy
    public final void F(String str) {
        this.a.c.m(1, str);
    }

    public final boolean G(lrz lrzVar) {
        for (int i = 0; i < this.d.size(); i++) {
            if (lrzVar.D.containsKey(((nuw) this.d.get(i)).a.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nuy
    public final void m(nut nutVar) {
        nutVar.s.setText(R.string.exo_track_selection_auto);
        lro lroVar = this.a.D;
        lti.f(lroVar);
        nutVar.t.setVisibility(true != G(lroVar.J()) ? 0 : 4);
        nutVar.a.setOnClickListener(new View.OnClickListener() { // from class: nul
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                num numVar = num.this;
                lro lroVar2 = numVar.a.D;
                if (lroVar2 == null || !lroVar2.n(29)) {
                    return;
                }
                lrz J = numVar.a.D.J();
                lro lroVar3 = numVar.a.D;
                int i = lvf.a;
                mwr mwrVar = new mwr((mws) J);
                mwrVar.d(1);
                mwrVar.c(1);
                lroVar3.V(new mws(mwrVar));
                nva nvaVar = numVar.a;
                nvaVar.c.m(1, nvaVar.getResources().getString(R.string.exo_track_selection_auto));
                numVar.a.g.dismiss();
            }
        });
    }
}
