package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjs extends ffkk implements ffji {
    final /* synthetic */ ffix a;
    final /* synthetic */ ebe b;
    final /* synthetic */ hun c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjs(ffix ffixVar, ebe ebeVar, hun hunVar) {
        super(1);
        this.a = ffixVar;
        this.b = ebeVar;
        this.c = hunVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        ifo ifoVar = (ifo) obj;
        long j = ((iar) ((ffkl) this.a).a()).a;
        float c = iar.c(j);
        if (c > 0.0f) {
            float em = ifoVar.em(4.0f);
            float a = this.c.a(ffln.b(c), ffln.b((iar.c(ifoVar.b()) - r5) - ifoVar.em(this.b.c(ifoVar.q()))), ifoVar.q()) + ifoVar.em(this.b.b(ifoVar.q()));
            float f = c / 2.0f;
            float f2 = a + f;
            float c2 = ffmk.c((f2 - f) - em, 0.0f);
            float d = ffmk.d(f2 + f + em, iar.c(ifoVar.b()));
            float a2 = iar.a(j);
            float f3 = a2 / 2.0f;
            ifl t = ifoVar.t();
            long a3 = t.a();
            t.b().l();
            try {
                t.c.b(c2, (-a2) / 2.0f, d, f3, 0);
                ifoVar.p();
            } finally {
                t.b().j();
                t.h(a3);
            }
        } else {
            ifoVar.p();
        }
        return ffcu.a;
    }
}
