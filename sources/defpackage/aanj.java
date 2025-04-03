package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aanj implements ffix {
    final /* synthetic */ axrc[] a;

    public aanj(axrc[] axrcVarArr) {
        this.a = axrcVarArr;
    }

    @Override // defpackage.ffix
    public final doml invoke() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            axrc axrcVar = this.a[i];
            arrayList.add(axrcVar != null ? axrcVar.b() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj = array[0];
        doms domsVar = (doms) array[1];
        doml domlVar = (doml) obj;
        return ((Boolean) array[2]).booleanValue() ? doml.l(domlVar, null, null, domsVar, null, null, false, false, 4194299) : doml.l(domlVar, null, null, domsVar, null, null, false, false, 4192251);
    }
}
