package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjc extends kiu {
    public ArrayList aL;

    public kjc() {
        this.aL = new ArrayList();
    }

    public void ae() {
        ArrayList arrayList = this.aL;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kiu kiuVar = (kiu) this.aL.get(i);
            if (kiuVar instanceof kjc) {
                ((kjc) kiuVar).ae();
            }
        }
    }

    public final void am(kiu kiuVar) {
        this.aL.add(kiuVar);
        kiu kiuVar2 = kiuVar.ae;
        if (kiuVar2 != null) {
            ((kjc) kiuVar2).an(kiuVar);
        }
        kiuVar.ae = this;
    }

    public final void an(kiu kiuVar) {
        this.aL.remove(kiuVar);
        kiuVar.u();
    }

    public final void ao() {
        this.aL.clear();
    }

    @Override // defpackage.kiu
    public void u() {
        this.aL.clear();
        super.u();
    }

    @Override // defpackage.kiu
    public final void x(kgy kgyVar) {
        super.x(kgyVar);
        int size = this.aL.size();
        for (int i = 0; i < size; i++) {
            ((kiu) this.aL.get(i)).x(kgyVar);
        }
    }

    public kjc(byte[] bArr) {
        super(0, 0);
        this.aL = new ArrayList();
    }
}
