package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.R;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
class abyx implements ejlr<Void, Void> {
    final /* synthetic */ abyy a;

    public abyx(abyy abyyVar) {
        this.a = abyyVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b();
        this.a.s.setEnabled(false);
        ellj.f(new abyg(true), (ea) this.a.b.b());
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        ((ddzb) this.a.e.b()).k(R.string.donation_flow_complete);
        Bundle extras = ((eg) this.a.c.b()).getIntent().getExtras();
        extras.getClass();
        if (extras.containsKey("EXTRA_LISTENER_KEY")) {
            Map map = (Map) ((fbbb) this.a.k).a;
            String string = extras.getString("EXTRA_LISTENER_KEY");
            string.getClass();
            abwp abwpVar = (abwp) map.get(string);
            abwpVar.getClass();
            abwpVar.a();
        }
        ellj.f(new abyd(4), (ea) this.a.b.b());
        ((abxg) this.a.j.b()).b(2);
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        this.a.a();
        this.a.s.setEnabled(true);
        abyy.a.s("#donateCallback: failed to donate messages", th);
        ellj.f(new abyg(false), (ea) this.a.b.b());
        ((ddzb) this.a.e.b()).k(R.string.donation_donate_error);
        ((abxg) this.a.j.b()).b(3);
    }
}
