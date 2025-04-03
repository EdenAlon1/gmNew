package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gvm extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;
    final /* synthetic */ iqk c;
    final /* synthetic */ iqk d;
    final /* synthetic */ long e;
    final /* synthetic */ ipq f;
    final /* synthetic */ gvn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gvm(iqk iqkVar, int i, iqk iqkVar2, iqk iqkVar3, long j, ipq ipqVar, gvn gvnVar) {
        super(1);
        this.a = iqkVar;
        this.b = i;
        this.c = iqkVar2;
        this.d = iqkVar3;
        this.e = j;
        this.f = ipqVar;
        this.g = gvnVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        int i = this.b;
        iqk iqkVar = this.a;
        int i2 = 0;
        iqj.m(iqjVar, iqkVar, 0, (i - iqkVar.b) / 2);
        int max = Math.max(this.f.eo(fub.a), this.a.a);
        gvn gvnVar = this.g;
        hun hunVar = gvnVar.b;
        long j = this.e;
        iqk iqkVar2 = this.c;
        int i3 = this.d.a;
        int a = hunVar.a(iqkVar2.a, jzk.b(j), kah.a);
        if (a < max) {
            a += max - a;
        } else {
            int i4 = iqkVar2.a + a;
            if (i4 > jzk.b(j) - i3) {
                a += (jzk.b(j) - i3) - i4;
            }
        }
        int i5 = this.b;
        dxq dxqVar = gvnVar.a;
        if (ffkj.e(dxqVar, dxu.e)) {
            i2 = (i5 - iqkVar2.b) / 2;
        } else if (ffkj.e(dxqVar, dxu.d)) {
            i2 = i5 - iqkVar2.b;
        }
        iqj.m(iqjVar, iqkVar2, a, i2);
        iqk iqkVar3 = this.d;
        iqj.m(iqjVar, iqkVar3, jzk.b(this.e) - iqkVar3.a, (this.b - iqkVar3.b) / 2);
        return ffcu.a;
    }
}
