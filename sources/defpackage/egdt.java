package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdt {
    public final fapt a;
    public final emyg b;

    public egdt(fapt faptVar, emyg emygVar) {
        this.a = faptVar;
        this.b = emygVar;
    }

    public final exfw a() {
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = this.a.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        emyg emygVar = this.b;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfwVar2.b |= 1;
        exfwVar2.e = a;
        return (exfw) exfvVar.build();
    }

    public final exfw b(int i) {
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = this.a.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        emyg emygVar = this.b;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfwVar2.b |= 1;
        exfwVar2.e = a;
        exfvVar.copyOnWrite();
        exfw exfwVar3 = (exfw) exfvVar.instance;
        exfwVar3.b |= 4;
        exfwVar3.g = i;
        return (exfw) exfvVar.build();
    }

    public final exfw c(Throwable th) {
        exfu exfuVar;
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = this.a.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        emyg emygVar = this.b;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfwVar2.b |= 1;
        exfwVar2.e = a;
        exfu exfuVar2 = egcz.a;
        if (th instanceof dezu) {
            exft exftVar = (exft) exfu.a.createBuilder();
            exftVar.copyOnWrite();
            exfu exfuVar3 = (exfu) exftVar.instance;
            exfuVar3.c = 16;
            exfuVar3.b |= 1;
            int i = true != egct.b(th) ? 7 : 6;
            exftVar.copyOnWrite();
            exfu exfuVar4 = (exfu) exftVar.instance;
            exfuVar4.d = i - 1;
            exfuVar4.b |= 2;
            exfuVar = (exfu) exftVar.build();
        } else if (th instanceof fedn) {
            int b = exqc.b(((fedn) th).a.getCode().value());
            if (b != 0) {
                exft exftVar2 = (exft) exfu.a.createBuilder();
                exftVar2.copyOnWrite();
                exfu exfuVar5 = (exfu) exftVar2.instance;
                exfuVar5.c = b - 1;
                exfuVar5.b |= 1;
                exfuVar = (exfu) exftVar2.build();
            } else {
                exfuVar = egcz.a;
            }
        } else if (th instanceof IOException) {
            exft exftVar3 = (exft) exfu.a.createBuilder();
            exftVar3.copyOnWrite();
            exfu exfuVar6 = (exfu) exftVar3.instance;
            exfuVar6.c = 14;
            exfuVar6.b |= 1;
            exfuVar = (exfu) exftVar3.build();
        } else {
            exfuVar = egcz.a;
        }
        exfvVar.copyOnWrite();
        exfw exfwVar3 = (exfw) exfvVar.instance;
        exfuVar.getClass();
        exfwVar3.f = exfuVar;
        exfwVar3.b |= 2;
        return (exfw) exfvVar.build();
    }

    public final void d() {
        this.b.f();
    }

    public final exfw e(int i, Throwable th) {
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = this.a.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        emyg emygVar = this.b;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfwVar2.b |= 1;
        exfwVar2.e = a;
        exft exftVar = (exft) exfu.a.createBuilder();
        exftVar.copyOnWrite();
        exfu exfuVar = (exfu) exftVar.instance;
        exfuVar.c = i - 1;
        exfuVar.b |= 1;
        String name = th.getCause() != null ? th.getCause().getClass().getName() : th.getClass().getName();
        exftVar.copyOnWrite();
        exfu exfuVar2 = (exfu) exftVar.instance;
        name.getClass();
        exfuVar2.b |= 8;
        exfuVar2.f = name;
        exfvVar.copyOnWrite();
        exfw exfwVar3 = (exfw) exfvVar.instance;
        exfu exfuVar3 = (exfu) exftVar.build();
        exfuVar3.getClass();
        exfwVar3.f = exfuVar3;
        exfwVar3.b |= 2;
        return (exfw) exfvVar.build();
    }
}
