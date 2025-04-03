package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daxg {
    private static final enru a = enru.c("com/google/android/apps/messaging/ui/debug/SearchDebugUtilsHelper");
    private final csrv b;
    private final ddzb c;

    public daxg(csrv csrvVar, ddzb ddzbVar) {
        this.b = csrvVar;
        this.c = ddzbVar;
    }

    public final boolean a(String str) {
        if (!TextUtils.equals(str, "*xyzzy*") && !TextUtils.equals(str, "*rcsxyzzy*")) {
            return false;
        }
        boolean r = this.b.r();
        boolean z = !r;
        csrv csrvVar = this.b;
        csjz csjzVar = csjz.BUGLE;
        ((Boolean) cful.D.e()).booleanValue();
        csjzVar.getClass();
        cssv cssvVar = (cssv) csrvVar.c.b();
        ((ctyx) cssvVar.b.b()).h("debugging_features_enabled", z);
        Iterator it = ((Set) cssvVar.c.b()).iterator();
        while (it.hasNext()) {
            ((cssw) it.next()).c();
        }
        enru enruVar = csjy.a;
        ensk g = a.g();
        g.Y(ente.a, "Bugle");
        ((enrr) ((enrr) g).h("com/google/android/apps/messaging/ui/debug/SearchDebugUtilsHelper", "toggleDebugMenu", 52, "SearchDebugUtilsHelper.java")).t("Debugger menu enabled: %b", Boolean.valueOf(z));
        this.c.h(true != r ? R.string.manual_debugger_enabled : R.string.manual_debugger_disabled);
        return true;
    }
}
