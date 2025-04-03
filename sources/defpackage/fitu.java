package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fitu implements fiuq, fiuo {
    public final fiuq[] a;
    public final fiuo[] b;
    private final int c;
    private final int d;

    public fitu(List list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            Object obj = list.get(i);
            if (obj instanceof fitu) {
                e(arrayList, ((fitu) obj).a);
            } else {
                arrayList.add(obj);
            }
            Object obj2 = list.get(i + 1);
            if (obj2 instanceof fitu) {
                e(arrayList2, ((fitu) obj2).b);
            } else {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.contains(null) || arrayList.isEmpty()) {
            this.a = null;
            this.c = 0;
        } else {
            int size2 = arrayList.size();
            this.a = new fiuq[size2];
            int i2 = 0;
            for (int i3 = 0; i3 < size2; i3++) {
                fiuq fiuqVar = (fiuq) arrayList.get(i3);
                i2 += fiuqVar.b();
                this.a[i3] = fiuqVar;
            }
            this.c = i2;
        }
        if (arrayList2.contains(null) || arrayList2.isEmpty()) {
            this.b = null;
            this.d = 0;
            return;
        }
        int size3 = arrayList2.size();
        this.b = new fiuo[size3];
        int i4 = 0;
        for (int i5 = 0; i5 < size3; i5++) {
            fiuo fiuoVar = (fiuo) arrayList2.get(i5);
            i4 += fiuoVar.a();
            this.b[i5] = fiuoVar;
        }
        this.d = i4;
    }

    private static final void e(List list, Object[] objArr) {
        if (objArr != null) {
            for (Object obj : objArr) {
                list.add(obj);
            }
        }
    }

    @Override // defpackage.fiuo
    public final int a() {
        return this.d;
    }

    @Override // defpackage.fiuq
    public final int b() {
        return this.c;
    }

    @Override // defpackage.fiuo
    public final int c(fiuk fiukVar, CharSequence charSequence, int i) {
        fiuo[] fiuoVarArr = this.b;
        if (fiuoVarArr == null) {
            throw new UnsupportedOperationException();
        }
        for (int i2 = 0; i2 < fiuoVarArr.length && i >= 0; i2++) {
            i = fiuoVarArr[i2].c(fiukVar, charSequence, i);
        }
        return i;
    }

    @Override // defpackage.fiuq
    public final void d(Appendable appendable, long j, firb firbVar, int i, firk firkVar, Locale locale) {
        fiuq[] fiuqVarArr = this.a;
        if (fiuqVarArr == null) {
            throw new UnsupportedOperationException();
        }
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        for (fiuq fiuqVar : fiuqVarArr) {
            fiuqVar.d(appendable, j, firbVar, i, firkVar, locale2);
        }
    }
}
