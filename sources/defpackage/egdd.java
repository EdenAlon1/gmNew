package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egdd {
    private final emyg a;
    private final List b = new ArrayList();
    private final int c;

    public egdd(ffbr ffbrVar, int i) {
        this.a = (emyg) ffbrVar.b();
        this.c = i;
    }

    public final exgc a() {
        exgb exgbVar = (exgb) exgc.a.createBuilder();
        exgbVar.a(this.b);
        exgf exgfVar = (exgf) exgg.a.createBuilder();
        exgfVar.copyOnWrite();
        exgg exggVar = (exgg) exgfVar.instance;
        exggVar.c = this.c - 1;
        exggVar.b |= 1;
        long a = this.a.a(TimeUnit.MICROSECONDS);
        exgfVar.copyOnWrite();
        exgg exggVar2 = (exgg) exgfVar.instance;
        exggVar2.b |= 2;
        exggVar2.d = a;
        exgbVar.copyOnWrite();
        exgc exgcVar = (exgc) exgbVar.instance;
        exgg exggVar3 = (exgg) exgfVar.build();
        exggVar3.getClass();
        exgcVar.d = exggVar3;
        exgcVar.b |= 1;
        return (exgc) exgbVar.build();
    }

    public final exge b() {
        emyg emygVar = this.a;
        emygVar.e();
        emygVar.f();
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = this.c - 1;
        exgeVar.b |= 1;
        return (exge) exgdVar.build();
    }

    public final void c(exfw exfwVar) {
        this.b.add(exfwVar);
    }
}
