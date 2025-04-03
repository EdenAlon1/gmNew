package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bm extends bh {
    public final ArrayList al = new ArrayList();

    public void D() {
        r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bh bhVar = (bh) this.al.get(i);
            if (bhVar instanceof bm) {
                ((bm) bhVar).D();
            }
        }
    }

    public final void F(bh bhVar) {
        this.al.remove(bhVar);
        bhVar.r = null;
    }

    @Override // defpackage.bh
    public void i() {
        this.al.clear();
        super.i();
    }

    @Override // defpackage.bh
    public final void j(ba baVar) {
        super.j(baVar);
        int size = this.al.size();
        for (int i = 0; i < size; i++) {
            ((bh) this.al.get(i)).j(baVar);
        }
    }

    @Override // defpackage.bh
    public final void o(int i, int i2) {
        super.o(i, i2);
        int size = this.al.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((bh) this.al.get(i3)).o(this.w + this.A, this.x + this.B);
        }
    }

    @Override // defpackage.bh
    public final void r() {
        super.r();
        ArrayList arrayList = this.al;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bh bhVar = (bh) this.al.get(i);
            bhVar.o(b(), c());
            if (!(bhVar instanceof bi)) {
                bhVar.r();
            }
        }
    }
}
