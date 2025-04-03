package defpackage;

import android.content.ContentValues;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtwd {
    public static dtwc n() {
        dtrf dtrfVar = new dtrf();
        dtrfVar.d = new AtomicInteger(0);
        dtrfVar.c(false);
        dtrfVar.c = new emyl() { // from class: dtwa
            @Override // defpackage.emyl
            public final Object get() {
                return dtzh.c(null, null);
            }
        };
        dtrfVar.a = dtui.a;
        dtrfVar.f = new AtomicLong(-1L);
        dtrfVar.e = new AtomicLong(-1L);
        dtrfVar.g = new AtomicBoolean(true);
        return dtrfVar;
    }

    public abstract ContentValues a();

    public abstract dtui b();

    public abstract dtve c();

    public abstract dtxc d();

    public abstract dtyq e();

    public abstract emyl f();

    public abstract emyl g();

    public abstract String h();

    public abstract AtomicBoolean i();

    public abstract AtomicInteger j();

    public abstract AtomicLong k();

    public abstract AtomicLong l();

    public abstract boolean m();

    public final dtzh o() {
        dtzh dtzhVar = (dtzh) g().get();
        return dtzhVar == null ? dtzh.c(null, null) : dtzhVar;
    }
}
