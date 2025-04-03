package defpackage;

import android.app.Activity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alez implements aley {
    private final fazb a;
    private final fazb b;
    private final fazb c;
    private final fazb d;

    public alez(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5) {
        fazbVar.getClass();
        fazbVar2.getClass();
        fazbVar3.getClass();
        fazbVar4.getClass();
        fazbVar5.getClass();
        this.a = fazbVar;
        this.b = fazbVar2;
        this.c = fazbVar4;
        this.d = fazbVar5;
    }

    @Override // defpackage.aley
    public final void a(View view, int i) {
        if (view == null) {
            return;
        }
        dvwz a = ((dvyc) this.a.b()).a(i);
        Object b = this.d.b();
        b.getClass();
        a.f(alfb.a((alff) b));
        ((dvxy) this.b.b()).b(view, a);
    }

    @Override // defpackage.aley
    public final void b(Activity activity, int i) {
        dvwz a = ((dvyc) this.a.b()).a(i);
        a.g(dvyd.b());
        dvxl dvxlVar = dvxe.b;
        dvxe dvxeVar = a.c;
        emxf.p(dvxeVar == null, "CVE %s has already been built.", dvxeVar);
        a.b = dvxlVar;
        Object b = this.d.b();
        b.getClass();
        a.f(alfb.a((alff) b));
        ((dvxy) this.b.b()).f(activity, a);
    }

    @Override // defpackage.aley
    public final void c(View view) {
        ((dvxi) this.c.b()).a(dvxh.e(), view);
    }
}
