package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dusu implements dusz {
    final /* synthetic */ dutb a;

    public dusu(dutb dutbVar) {
        this.a = dutbVar;
    }

    @Override // defpackage.durr
    public final void a(duvq duvqVar) {
        throw null;
    }

    @Override // defpackage.durr
    public final void b(duvq duvqVar) {
        throw null;
    }

    @Override // defpackage.dusz
    public final void c(int i, int i2) {
        dutt duttVar;
        int g;
        int i3;
        dutj dutjVar = this.a.y;
        if (dutjVar != null && (g = dutb.g(i)) <= dutjVar.a() - 1 && g != (i3 = dutjVar.d)) {
            dutjVar.d = g;
            if (i3 != -1) {
                dutjVar.r(i3, false);
            }
            dutjVar.r(dutjVar.d, true);
        }
        dutb dutbVar = this.a;
        RecyclerView recyclerView = dutbVar.w;
        if (recyclerView != null && (duttVar = dutbVar.d) != null && duttVar.l()) {
            recyclerView.ak(dutb.g(i));
        }
        if (i == 0) {
            this.a.d();
        }
        dusz duszVar = this.a.c;
        if (duszVar == null || i2 != 3) {
            return;
        }
        dsxd dsxdVar = (dsxd) ((dqvz) duszVar).a.g.invoke();
        if (dsxdVar.a() == dsxi.b) {
            dsxdVar.c(dsxi.a);
        } else {
            dsxdVar.b(false);
        }
    }

    @Override // defpackage.durr
    public final void d(View view) {
        throw null;
    }
}
