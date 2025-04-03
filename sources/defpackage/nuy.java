package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class nuy extends vk {
    protected List d = new ArrayList();
    final /* synthetic */ nva e;

    protected nuy(nva nvaVar) {
        this.e = nvaVar;
    }

    protected abstract void F(String str);

    @Override // defpackage.vk
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public void g(nut nutVar, int i) {
        final lro lroVar = this.e.D;
        if (lroVar == null) {
            return;
        }
        if (i == 0) {
            m(nutVar);
            return;
        }
        final nuw nuwVar = (nuw) this.d.get(i - 1);
        final lrv lrvVar = nuwVar.a.b;
        boolean z = lroVar.J().D.get(lrvVar) != null && nuwVar.a();
        nutVar.s.setText(nuwVar.c);
        nutVar.t.setVisibility(true != z ? 4 : 0);
        nutVar.a.setOnClickListener(new View.OnClickListener() { // from class: nux
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lro lroVar2 = lroVar;
                if (lroVar2.n(29)) {
                    nuw nuwVar2 = nuwVar;
                    lrv lrvVar2 = lrvVar;
                    nuy nuyVar = nuy.this;
                    mwr mwrVar = new mwr((mws) lroVar2.J());
                    lrw lrwVar = new lrw(lrvVar2, engw.r(Integer.valueOf(nuwVar2.b)));
                    mwrVar.b(lrwVar.a());
                    mwrVar.t.put(lrwVar.a, lrwVar);
                    mwrVar.c(nuwVar2.a.a());
                    lroVar2.V(new mws(mwrVar));
                    nuyVar.F(nuwVar2.c);
                    nuyVar.e.g.dismiss();
                }
            }
        });
    }

    protected final void I() {
        this.d = Collections.EMPTY_LIST;
    }

    @Override // defpackage.vk
    public final int a() {
        if (this.d.isEmpty()) {
            return 0;
        }
        return this.d.size() + 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new nut(LayoutInflater.from(this.e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    protected abstract void m(nut nutVar);
}
