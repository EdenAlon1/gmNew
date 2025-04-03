package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hiv extends ffkk implements ffix {
    final /* synthetic */ hjh a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hiv(hjh hjhVar) {
        super(0);
        this.a = hjhVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        ffrf v;
        hjh hjhVar = this.a;
        synchronized (hjhVar.d) {
            v = hjhVar.v();
            if (((hiu) hjhVar.q.c()).compareTo(hiu.b) <= 0) {
                throw fftq.a("Recomposer shutdown; frame clock awaiter will never resume", hjhVar.f);
            }
        }
        if (v != null) {
            v.w(ffcu.a);
        }
        return ffcu.a;
    }
}
