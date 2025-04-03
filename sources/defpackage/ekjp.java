package defpackage;

import android.app.Activity;
import defpackage.ekjm;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekjp {
    public final Object a = new Object();
    public final Map b = new HashMap();
    private final boolean c;
    private final ekki d;
    private final ekjq e;

    /* compiled from: PG */
    public interface a {
        akfr b();
    }

    public ekjp(ekki ekkiVar, ekjq ekjqVar) {
        this.d = ekkiVar;
        this.e = ekjqVar;
        emxc emxcVar = ekjqVar.a;
        boolean z = false;
        if (emxcVar.g() && (emxcVar.c() instanceof ekhp)) {
            z = true;
        }
        this.c = z;
    }

    public final Object a(eisx eisxVar) {
        Set c = c();
        boolean z = true;
        if (!this.c && !c.isEmpty() && (c.size() != 1 || !c.contains(eisxVar))) {
            z = false;
        }
        emxf.r(z, "There is already an account id in use! TikTok does not support multiple accounts yet.\n\tCurrent AccountId: %s\n\tNew AccountId: %s", c, eisxVar);
        emxf.p(this.d.a.getApplicationContext() instanceof fbas, "Sting Activity must be attached to an @Sting Application. Found: %s", this.d.a.getApplicationContext());
        ekjq ekjqVar = this.e;
        if (ekjqVar.a.g()) {
            akfr b = ((a) fazh.a(ekjqVar.b.b(eisxVar), a.class)).b();
            b.a = (Activity) ekjqVar.a.c();
            return b.a();
        }
        akfr b2 = ((a) fazh.a(ekjqVar.b.b(eisxVar), a.class)).b();
        b2.b = ekjqVar.c;
        return b2.a();
    }

    public final void b(eisx eisxVar) {
        fazv c;
        synchronized (this.a) {
            Set c2 = c();
            if (!c2.isEmpty()) {
                eisx eisxVar2 = (eisx) enjk.l(c2);
                synchronized (this.a) {
                    emxf.l(this.b.containsKey(eisxVar2));
                    this.b.remove(eisxVar2);
                    ekjo a2 = this.e.b.a(eisxVar2);
                    synchronized (a2.d) {
                        llv llvVar = a2.a;
                        lnt lntVar = llvVar.b;
                        for (String str : fffi.g(fffi.g(lntVar.a.keySet(), lntVar.b.keySet()), llvVar.a.keySet())) {
                            a2.a.c(str);
                            llv llvVar2 = a2.a;
                            str.getClass();
                            llvVar2.b.b.remove(str);
                        }
                        c = a2.e != null ? ((ekjm.b) fazh.a(a2.e, ekjm.b.class)).c() : null;
                        a2.e = null;
                    }
                    if (c != null) {
                        c.b();
                    }
                }
            }
            this.b.put(eisxVar, a(eisxVar));
        }
    }

    public final Set c() {
        Set unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = DesugarCollections.unmodifiableSet(this.b.keySet());
        }
        return unmodifiableSet;
    }
}
