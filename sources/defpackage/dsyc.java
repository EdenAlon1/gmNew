package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsyc {
    public final ffji a;
    public final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public Object c;
    private final ffji d;
    private final ffji e;

    public dsyc(ffji ffjiVar, ffji ffjiVar2, ffji ffjiVar3) {
        this.d = ffjiVar;
        this.e = ffjiVar2;
        this.a = ffjiVar3;
    }

    public final void a(dsyi dsyiVar) {
        dsyiVar.getClass();
        if (this.b.add(dsyiVar) && !this.b.isEmpty() && this.c == null) {
            Object invoke = this.d.invoke(new dsyb(this));
            this.e.invoke(invoke);
            this.c = invoke;
        }
    }
}
