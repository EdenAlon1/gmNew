package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hix extends ffkk implements ffji {
    final /* synthetic */ hjh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hix(hjh hjhVar) {
        super(1);
        this.a = hjhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        CancellationException a = fftq.a("Recomposer effect job completed", th);
        hjh hjhVar = this.a;
        synchronized (hjhVar.d) {
            ffud ffudVar = hjhVar.e;
            if (ffudVar != null) {
                hjhVar.q.f(hiu.b);
                ffudVar.t(a);
                hjhVar.o = null;
                ffudVar.hZ(new hiw(hjhVar, th));
            } else {
                hjhVar.f = a;
                hjhVar.q.f(hiu.a);
            }
        }
        return ffcu.a;
    }
}
