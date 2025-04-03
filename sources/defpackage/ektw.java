package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ektw {
    public static ektw d(ektw ektwVar, ektw ektwVar2) {
        emxf.l(ektwVar.c().equals(ektwVar2.c()));
        HashSet hashSet = new HashSet();
        emxc emxcVar = emux.a;
        ektv.a(ektwVar.c(), hashSet);
        long min = Math.min(ektwVar.a(), ektwVar2.a());
        emxc b = ektwVar.b();
        boolean g = b.g();
        emxc b2 = ektwVar2.b();
        if (g && b2.g()) {
            emxcVar = emxc.j(Long.valueOf(Math.min(((Long) b.c()).longValue(), ((Long) b2.c()).longValue())));
        } else if (b.g()) {
            emxcVar = b;
        } else if (b2.g()) {
            emxcVar = b2;
        }
        return new ekru(hashSet, min, emxcVar);
    }

    public abstract long a();

    public abstract emxc b();

    public abstract Set c();
}
