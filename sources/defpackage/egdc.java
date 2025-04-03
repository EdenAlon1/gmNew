package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdc {
    private final emyg a;
    private final exfv b;

    public egdc(emyg emygVar, exfv exfvVar) {
        this.a = emygVar;
        this.b = exfvVar;
    }

    public final exfw a() {
        long a = this.a.a(TimeUnit.MICROSECONDS);
        exfv exfvVar = this.b;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfw exfwVar2 = exfw.a;
        exfwVar.b |= 1;
        exfwVar.e = a;
        return (exfw) exfvVar.build();
    }

    public final void b() {
        emyg emygVar = this.a;
        emygVar.e();
        emygVar.f();
    }
}
