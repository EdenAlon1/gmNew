package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uul implements ctuj {
    final /* synthetic */ uuy a;

    public uul(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ctuj
    public final void a() {
        uuy uuyVar = this.a;
        uuyVar.aK = null;
        uuyVar.ay.l();
    }

    @Override // defpackage.ctuj
    public final void c() {
        csjy.i("Bugle", "User denied storage permission");
    }

    @Override // defpackage.ctuj
    public final void d() {
        if (this.a.v.a() == 1) {
            this.a.r(((bcse) this.a.v.b().iterator().next()).Y());
            return;
        }
        uuy uuyVar = this.a;
        ArrayList arrayList = uuyVar.aK;
        if (arrayList == null) {
            throw new IllegalStateException("No data for selected message, failed to save attachment");
        }
        uuyVar.r(arrayList);
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.ctuj
    public final /* synthetic */ void b() {
    }
}
