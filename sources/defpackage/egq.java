package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class egq {
    private final egu a;
    private final int b;
    private final int c;
    private final ego d;
    private final egy e;

    public egq(egu eguVar, int i, int i2, ego egoVar, egy egyVar) {
        this.a = eguVar;
        this.b = i;
        this.c = i2;
        this.d = egoVar;
        this.e = egyVar;
    }

    public abstract egp a(int i, egn[] egnVarArr, List list, int i2);

    public final int b(int i) {
        egy egyVar = this.e;
        int i2 = egyVar.h;
        eln elnVar = egyVar.a.c;
        egw egwVar = egw.a;
        ehv a = elnVar.a(i);
        ((efp) a.c).a.a(egwVar, Integer.valueOf(i - a.a));
        return 1;
    }

    public final long c(int i, int i2) {
        return jzj.d(ffmk.f(this.a.a[i], 0));
    }

    public final egp d(int i) {
        int i2;
        egx c = this.e.c(i);
        int size = c.b.size();
        if (size != 0) {
            i2 = c.a + size == this.b ? 0 : this.c;
        } else {
            size = 0;
            i2 = 0;
        }
        egn[] egnVarArr = new egn[size];
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            long j = ((efi) c.b.get(i4)).a;
            egn d = this.d.d(c.a + i4, c(i3, 1), i3, 1, i2);
            i3++;
            egnVarArr[i4] = d;
        }
        return a(i, egnVarArr, c.b, i2);
    }
}
