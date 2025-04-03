package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fgv implements fcp {
    final /* synthetic */ fhi a;

    public fgv(fhi fhiVar) {
        this.a = fhiVar;
    }

    @Override // defpackage.fcp
    public final boolean b(long j, fdh fdhVar) {
        eva evaVar;
        if (!this.a.t() || this.a.f().a().length() == 0 || (evaVar = this.a.d) == null || evaVar.d() == null) {
            return false;
        }
        d(this.a.f(), j, false, fdhVar);
        return true;
    }

    @Override // defpackage.fcp
    public final boolean c(long j, fdh fdhVar) {
        eva evaVar;
        if (!this.a.t() || this.a.f().a().length() == 0 || (evaVar = this.a.d) == null || evaVar.d() == null) {
            return false;
        }
        hzi hziVar = this.a.j;
        if (hziVar != null) {
            hziVar.b();
        }
        fhi fhiVar = this.a;
        fhiVar.m = j;
        fhiVar.w = -1;
        this.a.i(true);
        fhi fhiVar2 = this.a;
        d(fhiVar2.f(), fhiVar2.m, true, fdhVar);
        return true;
    }

    public final void d(jvu jvuVar, long j, boolean z, fdh fdhVar) {
        this.a.p(jpm.i(this.a.b(jvuVar, j, z, false, fdhVar, false)) ? eug.c : eug.b);
    }

    @Override // defpackage.fcp
    public final void a() {
    }
}
