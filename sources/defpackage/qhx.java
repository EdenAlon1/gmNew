package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qhx extends qii {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhx(List list) {
        super(list);
        float[] fArr;
        int length;
        float[] fArr2;
        int length2;
        for (int i = 0; i < list.size(); i++) {
            qlx qlxVar = (qlx) list.get(i);
            qim qimVar = (qim) qlxVar.b;
            qim qimVar2 = (qim) qlxVar.c;
            if (qimVar != null && qimVar2 != null && (length = (fArr = qimVar.a).length) != (length2 = (fArr2 = qimVar2.a).length)) {
                int i2 = length + length2;
                float[] fArr3 = new float[i2];
                System.arraycopy(fArr, 0, fArr3, 0, length);
                System.arraycopy(fArr2, 0, fArr3, length, length2);
                Arrays.sort(fArr3);
                float f = Float.NaN;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    float f2 = fArr3[i4];
                    if (f2 != f) {
                        fArr3[i3] = f2;
                        i3++;
                        f = fArr3[i4];
                    }
                }
                float[] copyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                qlxVar = new qlx(qimVar.a(copyOfRange), qimVar2.a(copyOfRange));
            }
            list.set(i, qlxVar);
        }
    }

    @Override // defpackage.qih
    public final qer a() {
        return new qew(this.a);
    }
}
