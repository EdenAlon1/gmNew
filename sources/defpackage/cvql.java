package defpackage;

import android.R;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvql implements eivv {
    final /* synthetic */ cvqm a;
    private final Bundle b;

    public cvql(cvqm cvqmVar, Bundle bundle) {
        this.a = cvqmVar;
        this.b = bundle;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        cvqu a = cvqu.a(eivtVar.a());
        a.at(this.b);
        cg cgVar = new cg(this.a.a.a());
        cgVar.s(R.id.content, a);
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.a.b.b()).a(eiupVar);
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
