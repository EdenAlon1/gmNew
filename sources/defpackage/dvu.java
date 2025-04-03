package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dvu extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ ffky b;
    final /* synthetic */ drd c;
    final /* synthetic */ ffji d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvu(float f, ffky ffkyVar, drd drdVar, ffji ffjiVar) {
        super(1);
        this.a = f;
        this.b = ffkyVar;
        this.c = drdVar;
        this.d = ffjiVar;
    }

    public final void a(cxs cxsVar) {
        float f;
        float a = dvv.a(((Number) cxsVar.a()).floatValue(), this.a);
        float f2 = a - this.b.a;
        try {
            f = this.c.a(f2);
        } catch (CancellationException unused) {
            cxsVar.c();
            f = 0.0f;
        }
        this.d.invoke(Float.valueOf(f));
        if (Math.abs(f2 - f) > 0.5f || a != ((Number) cxsVar.a()).floatValue()) {
            cxsVar.c();
        }
        this.b.a += f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((cxs) obj);
        return ffcu.a;
    }
}
