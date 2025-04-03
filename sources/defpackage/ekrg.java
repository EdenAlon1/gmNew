package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekrg {
    private long b;
    private final long c = TimeUnit.MILLISECONDS.convert(3, TimeUnit.MINUTES);
    private final List d = new ArrayList();
    public boolean a = false;

    public final ekrh a() {
        emxf.m(this.b != 0, "You must specify a minimum sync interval for all syncs.");
        enhd enhdVar = new enhd();
        for (ekrj ekrjVar : this.d) {
            enhdVar.k(ekrjVar.b(), ekrjVar);
        }
        return new ekrd(this.b, this.c, enhdVar.c(), this.a);
    }

    public final void b(ekrj ekrjVar) {
        this.d.add(ekrjVar);
    }

    public final void c(long j, TimeUnit timeUnit) {
        this.b = TimeUnit.MILLISECONDS.convert(j, timeUnit);
    }
}
