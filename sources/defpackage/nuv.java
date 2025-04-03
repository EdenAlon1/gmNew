package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nuv extends nuy {
    final /* synthetic */ nva a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nuv(nva nvaVar) {
        super(nvaVar);
        this.a = nvaVar;
    }

    public final void G(List list) {
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= ((enou) list).c) {
                break;
            }
            if (((nuw) list.get(i)).a()) {
                z = true;
                break;
            }
            i++;
        }
        nva nvaVar = this.a;
        ImageView imageView = nvaVar.p;
        if (imageView != null) {
            imageView.setImageDrawable(z ? nvaVar.z : nvaVar.A);
            nva nvaVar2 = this.a;
            nvaVar2.p.setContentDescription(z ? nvaVar2.B : nvaVar2.C);
        }
        this.d = list;
    }

    @Override // defpackage.nuy
    /* renamed from: H */
    public final void g(nut nutVar, int i) {
        super.g(nutVar, i);
        if (i > 0) {
            nutVar.t.setVisibility(true != ((nuw) this.d.get(i + (-1))).a() ? 4 : 0);
        }
    }

    @Override // defpackage.nuy, defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        g((nut) wrVar, i);
    }

    @Override // defpackage.nuy
    public final void m(nut nutVar) {
        boolean z;
        nutVar.s.setText(R.string.exo_track_selection_none);
        int i = 0;
        while (true) {
            if (i >= this.d.size()) {
                z = true;
                break;
            } else {
                if (((nuw) this.d.get(i)).a()) {
                    z = false;
                    break;
                }
                i++;
            }
        }
        nutVar.t.setVisibility(true != z ? 4 : 0);
        nutVar.a.setOnClickListener(new View.OnClickListener() { // from class: nuu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                nuv nuvVar = nuv.this;
                lro lroVar = nuvVar.a.D;
                if (lroVar == null || !lroVar.n(29)) {
                    return;
                }
                lrz J = nuvVar.a.D.J();
                lro lroVar2 = nuvVar.a.D;
                mwr mwrVar = new mwr((mws) J);
                mwrVar.d(3);
                mwrVar.r = -3;
                int i2 = engw.d;
                mwrVar.p = new engr().g();
                mwrVar.q = false;
                lroVar2.V(new mws(mwrVar));
                nuvVar.a.g.dismiss();
            }
        });
    }

    @Override // defpackage.nuy
    public final void F(String str) {
    }
}
