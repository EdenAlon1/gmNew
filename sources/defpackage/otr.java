package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class otr {
    private final otb a;
    private final AtomicBoolean b = new AtomicBoolean(false);
    private final ffbz c = ffca.a(new ffix() { // from class: otq
        @Override // defpackage.ffix
        public final Object invoke() {
            return otr.this.e();
        }
    });

    public otr(otb otbVar) {
        this.a = otbVar;
    }

    private final oyf a() {
        return (oyf) this.c.a();
    }

    protected abstract String c();

    public final oyf d() {
        this.a.l();
        return this.b.compareAndSet(false, true) ? a() : e();
    }

    public final oyf e() {
        otb otbVar = this.a;
        otbVar.l();
        otbVar.m();
        return otbVar.e().b().k(c());
    }

    public final void f(oyf oyfVar) {
        oyfVar.getClass();
        if (oyfVar == a()) {
            this.b.set(false);
        }
    }
}
