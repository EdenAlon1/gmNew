package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzt extends lml implements bcyv {
    private final bcpt a = new bcpt();
    private final llg b;

    public ddzt() {
        llg llgVar = new llg();
        this.b = llgVar;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        llgVar.m(new ddzs());
    }

    @Override // defpackage.bcyv
    public final void a(bcyw bcywVar) {
        this.a.d();
        this.b.j(new ddzs());
    }

    @Override // defpackage.bcyv
    public final void b(bcyw bcywVar) {
        emxf.a(true);
        this.a.d();
        bcyd bcydVar = (bcyd) bcywVar;
        emxf.a(bcydVar.q());
        List p = bcydVar.p();
        emxf.l(p.size() == 1);
        cbaj cbajVar = (cbaj) p.get(0);
        Uri uri = cbajVar.c;
        String str = cbajVar.d;
    }

    @Override // defpackage.lml
    public final void fD() {
        if (this.a.g()) {
            this.a.f();
        }
    }
}
