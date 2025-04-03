package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axtm implements ffix {
    final /* synthetic */ fgdj[] a;
    final /* synthetic */ ffjo b;

    public axtm(fgdj[] fgdjVarArr, ffjo ffjoVar) {
        this.a = fgdjVarArr;
        this.b = ffjoVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            fgdj fgdjVar = this.a[i];
            arrayList.add(fgdjVar != null ? fgdjVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1], array[2], array[3]);
    }
}
