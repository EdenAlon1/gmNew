package defpackage;

import android.R;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahtr implements eivv {
    final /* synthetic */ ahts a;
    private final Bundle b;

    public ahtr(ahts ahtsVar, Bundle bundle) {
        this.a = ahtsVar;
        this.b = bundle;
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        eisx a = eivtVar.a();
        ahtw ahtwVar = new ahtw();
        fbae.e(ahtwVar);
        ekky.b(ahtwVar, a);
        Bundle bundle = ahtwVar.m;
        bundle.getClass();
        bundle.putAll(this.b);
        cg cgVar = new cg(this.a.a.a());
        cgVar.s(R.id.content, ahtwVar);
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
