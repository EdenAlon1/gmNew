package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czom implements View.OnClickListener {
    final /* synthetic */ czol a;

    public czom(czol czolVar) {
        this.a = czolVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        boolean e = ffkj.e(((Button) view.findViewById(R.id.rbm_bottom_sheet_sim_button)).getText(), view.getContext().getResources().getString(R.string.rbm_got_it_button));
        czol czolVar = this.a;
        if (e) {
            czolVar.a.hw();
            return;
        }
        int i = ((djrq) ffdx.J(((djsi) czolVar.d.b()).n())).a;
        bcxr bcxrVar = czolVar.h;
        bcxq bcxqVar = null;
        if (bcxrVar == null) {
            ffkj.c("selfIdentityListData");
            bcxrVar = null;
        }
        enqv it = bcxrVar.b.iterator();
        it.getClass();
        while (it.hasNext()) {
            bcxq bcxqVar2 = (bcxq) it.next();
            if (bcxqVar2.b() == i) {
                bcxqVar = bcxqVar2;
            }
        }
        if (bcxqVar == null) {
            czolVar.a.hw();
        } else {
            ellj.g(new wde(bcxqVar), view);
            czolVar.a.hw();
        }
    }
}
