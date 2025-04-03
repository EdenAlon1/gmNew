package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bpk extends bbt {
    final /* synthetic */ bpl a;

    public bpk(bpl bplVar) {
        this.a = bplVar;
    }

    @Override // defpackage.bbt
    public final void b(int i, bcd bcdVar) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            bgk bgkVar = ((axv) it.next()).p;
            Iterator it2 = bgkVar.e().iterator();
            while (it2.hasNext()) {
                ((bbt) it2.next()).b(i, new bpm(bcdVar, bgkVar.g.j, -1L));
            }
        }
    }
}
