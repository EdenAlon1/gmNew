package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mh {
    private static final Executor g = new mg();
    public final mw a;
    final mc b;
    public List d;
    int f;
    private final List h = new CopyOnWriteArrayList();
    public List e = Collections.EMPTY_LIST;
    final Executor c = g;

    public mh(mw mwVar, mc mcVar) {
        this.a = mwVar;
        this.b = mcVar;
    }

    public final void a(mi miVar) {
        this.h.add(miVar);
    }

    public final void b() {
        for (mi miVar : this.h) {
        }
    }
}
