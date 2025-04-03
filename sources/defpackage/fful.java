package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fful extends ffuj {
    private final ffuq a;
    private final ffum b;
    private final ffrn c;
    private final Object h;

    public fful(ffuq ffuqVar, ffum ffumVar, ffrn ffrnVar, Object obj) {
        this.a = ffuqVar;
        this.b = ffumVar;
        this.c = ffrnVar;
        this.h = obj;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        boolean z = ffso.a;
        ffuq ffuqVar = this.a;
        ffum ffumVar = this.b;
        ffrn ffrnVar = this.c;
        ffrn J = ffuqVar.J(ffrnVar);
        Object obj = this.h;
        if (J == null || !ffuqVar.T(ffumVar, J, obj)) {
            ffumVar.a.j(2);
            ffrn J2 = ffuqVar.J(ffrnVar);
            if (J2 == null || !ffuqVar.T(ffumVar, J2, obj)) {
                ffuqVar.hR(ffuqVar.hY(ffumVar, obj));
            }
        }
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return false;
    }
}
