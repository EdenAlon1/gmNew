package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axte implements ffix {
    final /* synthetic */ fgdj[] a;
    final /* synthetic */ ffjm b;

    public axte(fgdj[] fgdjVarArr, ffjm ffjmVar) {
        this.a = fgdjVarArr;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            fgdj fgdjVar = this.a[i];
            arrayList.add(fgdjVar != null ? fgdjVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1]);
    }
}
