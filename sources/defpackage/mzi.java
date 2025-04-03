package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzi implements naq {
    final /* synthetic */ mzs a;

    public mzi(mzs mzsVar) {
        this.a = mzsVar;
    }

    @Override // defpackage.naq
    public final void a(nas nasVar) {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((mzo) it.next()).n(lsf.a(nasVar));
        }
    }

    @Override // defpackage.naq
    public final void b() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((mzo) it.next()).o();
        }
    }

    @Override // defpackage.naq
    public final void c() {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((mzo) it.next()).p();
        }
    }

    @Override // defpackage.naq
    public final void d(lsl lslVar) {
        Iterator it = this.a.j.iterator();
        while (it.hasNext()) {
            ((mzo) it.next()).q(lslVar);
        }
    }
}
