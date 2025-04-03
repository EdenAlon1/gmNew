package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class flt extends ffkk implements ffji {
    final /* synthetic */ long a;
    final /* synthetic */ ebe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public flt(long j, ebe ebeVar) {
        super(1);
        this.a = j;
        this.b = ebeVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        float c = iar.c(this.a);
        if (c > 0.0f) {
            int i = flu.a;
            float em = ifoVar.em(4.0f);
            float em2 = ifoVar.em(this.b.b(ifoVar.q())) - em;
            float f = c + em2 + em + em;
            float c2 = ifoVar.q().ordinal() != 1 ? ffmk.c(em2, 0.0f) : iar.c(ifoVar.b()) - f;
            if (ifoVar.q().ordinal() == 1) {
                f = iar.c(ifoVar.b()) - ffmk.c(em2, 0.0f);
            }
            float f2 = f;
            float a = iar.a(this.a);
            float f3 = a / 2.0f;
            ifl t = ifoVar.t();
            long a2 = t.a();
            t.b().l();
            try {
                t.c.b(c2, (-a) / 2.0f, f2, f3, 0);
                ifoVar.p();
            } finally {
                t.b().j();
                t.h(a2);
            }
        } else {
            ifoVar.p();
        }
        return ffcu.a;
    }
}
