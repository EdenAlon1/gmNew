package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egp {
    public final int a;
    public final egn[] b;
    public final int c;
    public final int d;
    private final egu e;
    private final List f;
    private final int g;

    public egp(int i, egn[] egnVarArr, egu eguVar, List list, int i2) {
        this.a = i;
        this.b = egnVarArr;
        this.e = eguVar;
        this.f = list;
        this.g = i2;
        int i3 = 0;
        for (egn egnVar : egnVarArr) {
            i3 = Math.max(i3, egnVar.e);
        }
        this.c = i3;
        this.d = ffmk.f(i3 + this.g, 0);
    }

    public final egn[] a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            egn[] egnVarArr = this.b;
            if (i4 >= egnVarArr.length) {
                return egnVarArr;
            }
            egn egnVar = egnVarArr[i4];
            long j = ((efi) this.f.get(i5)).a;
            egnVar.k(i, this.e.b[i6], i2, i3, this.a, i6);
            i6++;
            i4++;
            i5++;
        }
    }
}
