package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class ffrl extends ffuj {
    public final ffrh a;

    public ffrl(ffrh ffrhVar) {
        this.a = ffrhVar;
    }

    @Override // defpackage.ffuj
    public final void a(Throwable th) {
        Throwable r = this.a.r(e());
        ffrh ffrhVar = this.a;
        if (ffrhVar.G()) {
            fggk fggkVar = (fggk) ffrhVar.a;
            ffqn ffqnVar = fggkVar.f;
            while (true) {
                Object obj = ffqnVar.a;
                if (ffkj.e(obj, fggl.b)) {
                    if (fggkVar.f.d(fggl.b, r)) {
                        return;
                    }
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    if (fggkVar.f.d(obj, null)) {
                        break;
                    }
                }
            }
        }
        ffrhVar.h(r);
        ffrhVar.A();
    }

    @Override // defpackage.ffuj
    public final boolean b() {
        return true;
    }
}
