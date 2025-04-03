package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class msx implements nco {
    private final lqc a;

    public msx(lqc lqcVar) {
        this.a = lqcVar;
    }

    @Override // defpackage.nco
    public final int a(ncp ncpVar, ndk ndkVar) {
        return ncpVar.c(Alert.DURATION_SHOW_INDEFINITELY) == -1 ? -1 : 0;
    }

    @Override // defpackage.nco
    public final void c(ncr ncrVar) {
        ndu p = ncrVar.p(0, 3);
        ncrVar.w(new ndm(-9223372036854775807L));
        ncrVar.r();
        lqb lqbVar = new lqb(this.a);
        lqbVar.c("text/x-unknown");
        lqbVar.j = this.a.o;
        p.i(new lqc(lqbVar));
    }

    @Override // defpackage.nco
    public final boolean f(ncp ncpVar) {
        return true;
    }

    @Override // defpackage.nco
    public final /* synthetic */ List x() {
        int i = engw.d;
        return enou.a;
    }

    @Override // defpackage.nco
    public final void d() {
    }

    @Override // defpackage.nco
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.nco
    public final void e(long j, long j2) {
    }
}
