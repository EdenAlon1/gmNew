package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cqo extends ffkk implements ffji {
    final /* synthetic */ iqk[] a;
    final /* synthetic */ cqp b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqo(iqk[] iqkVarArr, cqp cqpVar, int i, int i2) {
        super(1);
        this.a = iqkVarArr;
        this.b = cqpVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        int i = 0;
        while (true) {
            iqk[] iqkVarArr = this.a;
            if (i >= iqkVarArr.length) {
                return ffcu.a;
            }
            iqk iqkVar = iqkVarArr[i];
            if (iqkVar != null) {
                long a = this.b.a.b.a((iqkVar.a << 32) | (iqkVar.b & 4294967295L), (this.d & 4294967295L) | (this.c << 32), kah.a);
                iqjVar.e(iqkVar, kaa.a(a), kaa.b(a), 0.0f);
            }
            i++;
        }
    }
}
