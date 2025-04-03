package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gpt extends ffkk implements ffji {
    final /* synthetic */ iqk a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpt(iqk iqkVar, int i) {
        super(1);
        this.a = iqkVar;
        this.b = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        iqk iqkVar = this.a;
        if (iqkVar != null) {
            int i = this.b;
            float f = gpy.a;
            iqj.m(iqjVar, iqkVar, 0, (i - iqkVar.b) / 2);
        }
        return ffcu.a;
    }
}
