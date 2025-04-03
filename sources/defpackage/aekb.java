package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aekb implements aema {
    private crly a;

    @Override // defpackage.aema
    public final void b(aely aelyVar, boolean z) {
        this.a.g(aelyVar.f());
    }

    @Override // defpackage.aema
    public final void c(View view) {
        this.a = new crly(view, R.id.work_profile_icon, R.id.work_profile_icon, R.layout.work_profile_icon);
    }

    @Override // defpackage.aema
    public final boolean d(aely aelyVar, aely aelyVar2) {
        return aelyVar2.f() != aelyVar.f();
    }

    @Override // defpackage.aema
    public final void e(aelx aelxVar, aeki aekiVar) {
        aelxVar.p(true != aekiVar.ab() ? 8 : 0);
    }

    @Override // defpackage.aema
    public final /* synthetic */ aely a(aely aelyVar) {
        return aelyVar;
    }
}
