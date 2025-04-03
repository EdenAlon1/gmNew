package defpackage;

import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes3.dex */
class cwtk implements ejwd<Boolean> {
    final /* synthetic */ cwto a;

    public cwtk(cwto cwtoVar) {
        this.a = cwtoVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        cwto.a.s("Error retrieving vsms eligibility", th);
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        csjb c = cwto.a.c();
        c.A("vsms setting eligible", bool);
        c.r();
        ((PreferenceScreen) this.a.Y.get()).N(bool.booleanValue());
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
