package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabp implements ffix {
    final /* synthetic */ axrc[] a;

    public aabp(axrc[] axrcVarArr) {
        this.a = axrcVarArr;
    }

    @Override // defpackage.ffix
    public final dmxv invoke() {
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= 2) {
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
        dmxv dmxvVar = (dmxv) array[0];
        return ((Boolean) array[1]).booleanValue() ? dmxvVar : dmxv.l(dmxvVar, null, false, false, 524286);
    }
}
