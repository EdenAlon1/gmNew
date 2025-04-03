package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtu implements ffix {
    final /* synthetic */ fgdj[] a;
    final /* synthetic */ ffjq b;

    public axtu(fgdj[] fgdjVarArr, ffjq ffjqVar) {
        this.a = fgdjVarArr;
        this.b = ffjqVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            fgdj fgdjVar = this.a[i];
            arrayList.add(fgdjVar != null ? fgdjVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
}
