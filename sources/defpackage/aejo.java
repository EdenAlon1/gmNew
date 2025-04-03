package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aejo implements aema {
    private crly a;

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        this.a.g(true != aelyVar.Z() ? 8 : 0);
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a = new crly(view, R.id.pin_to_top_view_stub, R.id.pin_to_top);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return aelyVar.Z() != aelyVar2.Z();
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        aelxVar.k(aekiVar.ae());
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
