package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cwtd implements ejwd<eixz> {
    final /* synthetic */ Preference a;
    final /* synthetic */ cwto b;

    public cwtd(cwto cwtoVar, Preference preference) {
        this.a = preference;
        this.b = cwtoVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        cwto.a.s("Error retrieving account", th);
        this.b.f.b().af(this.a);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.f.b().af(this.a);
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
