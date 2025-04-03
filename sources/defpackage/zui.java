package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zui implements ffix {
    final /* synthetic */ axrc[] a;
    final /* synthetic */ zst b;
    final /* synthetic */ zsn c;

    public zui(axrc[] axrcVarArr, zst zstVar, zsn zsnVar) {
        this.a = axrcVarArr;
        this.b = zstVar;
        this.c = zsnVar;
    }

    @Override // defpackage.ffix
    public final zsn invoke() {
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= 10) {
                break;
            }
            axrc axrcVar = this.a[i];
            if (axrcVar != null) {
                obj = axrcVar.b();
            }
            arrayList.add(obj);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj2 = array[0];
        obj2.getClass();
        dnoq dnoqVar = (dnoq) obj2;
        dnve dnveVar = (dnve) array[1];
        dnuo dnuoVar = (dnuo) array[2];
        dofn dofnVar = (dofn) array[3];
        dnvr dnvrVar = (dnvr) array[4];
        dnto dntoVar = this.b.p ? (dnto) array[5] : null;
        eykv eykvVar = (eykv) array[6];
        aail aailVar = (aail) array[7];
        eykv eykvVar2 = (eykv) array[8];
        Object obj3 = array[9];
        obj3.getClass();
        return zum.c(this.c, dnoqVar, dnveVar, dnuoVar, dofnVar, dnvrVar, dntoVar, eykvVar, aailVar, eykvVar2, ((Boolean) obj3).booleanValue());
    }
}
