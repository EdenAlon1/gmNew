package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class glc extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ iqk b;
    final /* synthetic */ iqk c;
    final /* synthetic */ int d;
    final /* synthetic */ ecd e;
    final /* synthetic */ irg f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ iqk i;
    final /* synthetic */ gdr j;
    final /* synthetic */ iqk k;
    final /* synthetic */ Integer l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glc(iqk iqkVar, iqk iqkVar2, iqk iqkVar3, int i, ecd ecdVar, irg irgVar, int i2, int i3, iqk iqkVar4, gdr gdrVar, iqk iqkVar5, Integer num) {
        super(1);
        this.a = iqkVar;
        this.b = iqkVar2;
        this.c = iqkVar3;
        this.d = i;
        this.e = ecdVar;
        this.f = irgVar;
        this.g = i2;
        this.h = i3;
        this.i = iqkVar4;
        this.j = gdrVar;
        this.k = iqkVar5;
        this.l = num;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqjVar.e(this.a, 0, 0, 0.0f);
        iqjVar.e(this.b, 0, 0, 0.0f);
        int i = this.d;
        iqk iqkVar = this.c;
        int i2 = i - iqkVar.a;
        ecd ecdVar = this.e;
        irg irgVar = this.f;
        iqjVar.e(iqkVar, (i2 / 2) + ecdVar.b(irgVar, irgVar.q()), this.g - this.h, 0.0f);
        int i3 = this.g;
        iqk iqkVar2 = this.i;
        iqjVar.e(iqkVar2, 0, i3 - iqkVar2.b, 0.0f);
        gdr gdrVar = this.j;
        if (gdrVar != null) {
            iqk iqkVar3 = this.k;
            int i4 = this.g;
            Integer num = this.l;
            num.getClass();
            iqjVar.e(iqkVar3, gdrVar.a, i4 - num.intValue(), 0.0f);
        }
        return ffcu.a;
    }
}
