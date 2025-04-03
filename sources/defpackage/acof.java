package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebFragment;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acof extends abo {
    final /* synthetic */ acog a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acof(acog acogVar) {
        super(true);
        this.a = acogVar;
    }

    @Override // defpackage.abo
    public final void b() {
        DittoWebFragment dittoWebFragment = (DittoWebFragment) this.a.c.a().g(R.id.ditto_web_fragment_ref);
        if (dittoWebFragment == null) {
            acog.b.r("Cannot find DittoWebFragment");
            return;
        }
        acow H = dittoWebFragment.H();
        if (!((lkk) H.o.b()).a().a(lkj.STARTED)) {
            acow.a.r("Current life cycle state is not STARTED, ignore back button press.");
            ((akzt) H.l.b()).c("Bugle.Satellite.BackPressed.BeforeFragmentStarted.Counts");
            return;
        }
        ejlq ejlqVar = (ejlq) H.h.b();
        actj a = ((actk) H.s.b()).a();
        a.d = false;
        acua acuaVar = acua.FOREGROUND;
        esni esniVar = (esni) esnk.a.createBuilder();
        eyex eyexVar = eyex.a;
        esniVar.copyOnWrite();
        esnk esnkVar = (esnk) esniVar.instance;
        eyexVar.getClass();
        esnkVar.c = eyexVar;
        esnkVar.b = 208;
        ejlqVar.g(ejlp.a(a.b(acuaVar, (esnk) esniVar.build())), H.F);
    }
}
