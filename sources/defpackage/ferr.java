package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ferr implements feap {
    final /* synthetic */ fean a;
    final /* synthetic */ ferw b;

    public ferr(ferw ferwVar, fean feanVar) {
        this.a = feanVar;
        this.b = ferwVar;
    }

    @Override // defpackage.feap
    public final void a(fdyd fdydVar) {
        feao fertVar;
        fdyc fdycVar = fdydVar.a;
        if (fdycVar == fdyc.SHUTDOWN) {
            return;
        }
        ferw ferwVar = this.b;
        if (fdycVar == fdyc.TRANSIENT_FAILURE || fdycVar == fdyc.IDLE) {
            ferwVar.f.e();
        }
        if (ferwVar.g == fdyc.TRANSIENT_FAILURE) {
            if (fdycVar == fdyc.CONNECTING) {
                return;
            }
            if (fdycVar == fdyc.IDLE) {
                ferwVar.d();
                return;
            }
        }
        fean feanVar = this.a;
        int ordinal = fdycVar.ordinal();
        if (ordinal == 0) {
            fertVar = new fert(feak.a);
        } else if (ordinal == 1) {
            fertVar = new fert(feak.c(feanVar));
        } else if (ordinal == 2) {
            fertVar = new fert(feak.b(fdydVar.b));
        } else {
            if (ordinal != 3) {
                throw new IllegalArgumentException("Unsupported state:".concat(fdycVar.toString()));
            }
            fertVar = new ferv(ferwVar, feanVar);
        }
        ferwVar.f(fdycVar, fertVar);
    }
}
