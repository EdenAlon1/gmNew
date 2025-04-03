package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtq implements ffix {
    final /* synthetic */ fgdj[] a;
    final /* synthetic */ ffjp b;

    public axtq(fgdj[] fgdjVarArr, ffjp ffjpVar) {
        this.a = fgdjVarArr;
        this.b = ffjpVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(5);
        for (int i = 0; i < 5; i++) {
            fgdj fgdjVar = this.a[i];
            arrayList.add(fgdjVar != null ? fgdjVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.f(array[0], array[1], array[2], array[3], array[4]);
    }
}
