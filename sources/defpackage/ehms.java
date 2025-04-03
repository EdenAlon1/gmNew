package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehms extends kpn {
    final /* synthetic */ ehmv a;
    final /* synthetic */ ehmu b;

    public ehms(ehmu ehmuVar, ehmv ehmvVar) {
        this.a = ehmvVar;
        this.b = ehmuVar;
    }

    @Override // defpackage.kpn
    public final void a(int i) {
        this.b.o = true;
        this.a.a(i);
    }

    @Override // defpackage.kpn
    public final void b(Typeface typeface) {
        ehmu ehmuVar = this.b;
        ehmuVar.m = Typeface.create(typeface, ehmuVar.d);
        this.b.o = true;
        this.a.b(this.b.m, false);
    }
}
