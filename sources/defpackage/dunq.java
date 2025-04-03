package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dunq implements Runnable {
    private final dunv a;
    private final duny b;
    private final Executor c;
    private final emwl d;

    public dunq(dunv dunvVar, duny dunyVar, Executor executor, emwl emwlVar) {
        this.a = dunvVar;
        this.b = dunyVar;
        this.c = executor;
        this.d = emwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.apply(toString());
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.a(this.a);
        b.a(this.b);
        b.a(this.c);
        return b.toString();
    }
}
