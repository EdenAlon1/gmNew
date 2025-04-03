package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class irp extends ffkk implements ffix {
    final /* synthetic */ irq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irp(irq irqVar) {
        super(0);
        this.a = irqVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        irq irqVar = this.a;
        irqVar.e = false;
        HashSet hashSet = new HashSet();
        hne hneVar = irqVar.c;
        Object[] objArr = hneVar.a;
        int i = hneVar.b;
        for (int i2 = 0; i2 < i; i2++) {
            iui iuiVar = (iui) objArr[i2];
            irn irnVar = (irn) irqVar.d.a[i2];
            hvh hvhVar = iuiVar.x.e;
            if (hvhVar.z) {
                irq.b(hvhVar, irnVar, hashSet);
            }
        }
        irqVar.c.g();
        irqVar.d.g();
        hne hneVar2 = irqVar.a;
        Object[] objArr2 = hneVar2.a;
        int i3 = hneVar2.b;
        for (int i4 = 0; i4 < i3; i4++) {
            isg isgVar = (isg) objArr2[i4];
            irn irnVar2 = (irn) irqVar.b.a[i4];
            if (isgVar.z) {
                irq.b(isgVar, irnVar2, hashSet);
            }
        }
        irqVar.a.g();
        irqVar.b.g();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((isg) it.next()).z();
        }
        return ffcu.a;
    }
}
