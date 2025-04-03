package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axti implements ffix {
    final /* synthetic */ fgdj[] a;
    final /* synthetic */ ffjn b;

    public axti(fgdj[] fgdjVarArr, ffjn ffjnVar) {
        this.a = fgdjVarArr;
        this.b = ffjnVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            fgdj fgdjVar = this.a[i];
            arrayList.add(fgdjVar != null ? fgdjVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1], array[2]);
    }
}
