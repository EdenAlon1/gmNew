package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jo implements nb {
    final /* synthetic */ jz a;
    private final nb b;

    public jo(jz jzVar, nb nbVar) {
        this.a = jzVar;
        this.b = nbVar;
    }

    @Override // defpackage.nb
    public final void a(nc ncVar) {
        nf nfVar = (nf) this.b;
        nfVar.a.onDestroyActionMode(nfVar.e(ncVar));
        jz jzVar = this.a;
        if (jzVar.t != null) {
            jzVar.l.getDecorView().removeCallbacks(this.a.u);
        }
        jz jzVar2 = this.a;
        if (jzVar2.s != null) {
            jzVar2.E();
            jz jzVar3 = this.a;
            kwd e = kvo.e(jzVar3.s);
            e.b(0.0f);
            jzVar3.v = e;
            this.a.v.d(new jn(this));
        }
        jz jzVar4 = this.a;
        iz izVar = jzVar4.n;
        if (izVar != null) {
            izVar.m(jzVar4.r);
        }
        jz jzVar5 = this.a;
        jzVar5.r = null;
        ViewGroup viewGroup = jzVar5.y;
        int[] iArr = kvo.a;
        kvb.c(viewGroup);
        this.a.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nb
    public final boolean b(nc ncVar, MenuItem menuItem) {
        nf nfVar = (nf) this.b;
        return nfVar.a.onActionItemClicked(nfVar.e(ncVar), new ol(nfVar.b, menuItem));
    }

    @Override // defpackage.nb
    public final boolean c(nc ncVar, Menu menu) {
        nf nfVar = (nf) this.b;
        return nfVar.a.onCreateActionMode(nfVar.e(ncVar), nfVar.f(menu));
    }

    @Override // defpackage.nb
    public final void d(nc ncVar, Menu menu) {
        ViewGroup viewGroup = this.a.y;
        int[] iArr = kvo.a;
        kvb.c(viewGroup);
        nf nfVar = (nf) this.b;
        nfVar.a.onPrepareActionMode(nfVar.e(ncVar), nfVar.f(menu));
    }
}
