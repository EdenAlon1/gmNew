package defpackage;

import androidx.car.app.model.Alert;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efkz implements efku {
    int b = 0;
    double[] a = new double[5];

    @Override // defpackage.efku
    public final evjm a() {
        evjd evjdVar = (evjd) evjg.a.createBuilder();
        for (int i = 0; i < this.b; i++) {
            evje evjeVar = (evje) evjf.a.createBuilder();
            double d = this.a[i];
            evjeVar.copyOnWrite();
            evjf evjfVar = (evjf) evjeVar.instance;
            evjfVar.b |= 1;
            evjfVar.c = d;
            evjeVar.copyOnWrite();
            evjf evjfVar2 = (evjf) evjeVar.instance;
            evjfVar2.b |= 2;
            evjfVar2.d = 1L;
            evjdVar.copyOnWrite();
            evjg evjgVar = (evjg) evjdVar.instance;
            evjf evjfVar3 = (evjf) evjeVar.build();
            evjfVar3.getClass();
            eygr eygrVar = evjgVar.b;
            if (!eygrVar.c()) {
                evjgVar.b = eyfy.mutableCopy(eygrVar);
            }
            evjgVar.b.add(evjfVar3);
        }
        evjl evjlVar = (evjl) evjm.a.createBuilder();
        evjlVar.copyOnWrite();
        evjm evjmVar = (evjm) evjlVar.instance;
        evjg evjgVar2 = (evjg) evjdVar.build();
        evjgVar2.getClass();
        evjmVar.c = evjgVar2;
        evjmVar.b = 3;
        return (evjm) evjlVar.build();
    }

    @Override // defpackage.efku
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Double d = (Double) obj;
        int i = this.b + 1;
        double[] dArr = this.a;
        int length = dArr.length;
        if (i - length > 0) {
            int i2 = length + (length >> 1);
            if (i2 - i < 0) {
                i2 = i;
            }
            if ((-2147483639) + i2 > 0) {
                if (i < 0) {
                    throw new OutOfMemoryError();
                }
                i2 = 2147483639;
                if (i > 2147483639) {
                    i2 = Alert.DURATION_SHOW_INDEFINITELY;
                }
            }
            this.a = Arrays.copyOf(dArr, i2);
        }
        this.a[this.b] = d.doubleValue();
        this.b++;
    }

    public final String toString() {
        return ", count = " + this.b + ", value =" + Arrays.toString(this.a);
    }
}
