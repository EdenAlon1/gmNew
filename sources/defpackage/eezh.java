package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eezh implements eezi {
    final /* synthetic */ Bundle a;

    public eezh(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.eezi
    public final void a(efaa efaaVar) {
        if (efaaVar instanceof eezx) {
            Bundle bundle = new Bundle();
            ((eezx) efaaVar).a();
            String G = eezj.G(efaaVar);
            G.getClass();
            this.a.putBundle(G, bundle);
        }
    }
}
