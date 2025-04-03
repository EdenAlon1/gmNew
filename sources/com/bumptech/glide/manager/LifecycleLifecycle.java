package com.bumptech.glide.manager;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.lki;
import defpackage.lkj;
import defpackage.lkk;
import defpackage.lkq;
import defpackage.lkr;
import defpackage.rgt;
import defpackage.rgu;
import defpackage.rkh;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleLifecycle implements rgt, lkq {
    private final Set a = new HashSet();
    private final lkk b;

    public LifecycleLifecycle(lkk lkkVar) {
        this.b = lkkVar;
        lkkVar.c(this);
    }

    @Override // defpackage.rgt
    public final void a(rgu rguVar) {
        this.a.add(rguVar);
        if (this.b.a() == lkj.DESTROYED) {
            rguVar.m();
        } else if (this.b.a().a(lkj.STARTED)) {
            rguVar.n();
        } else {
            rguVar.o();
        }
    }

    @Override // defpackage.rgt
    public final void b(rgu rguVar) {
        this.a.remove(rguVar);
    }

    @OnLifecycleEvent(a = lki.ON_DESTROY)
    public void onDestroy(lkr lkrVar) {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rgu) it.next()).m();
        }
        lkrVar.P().d(this);
    }

    @OnLifecycleEvent(a = lki.ON_START)
    public void onStart(lkr lkrVar) {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rgu) it.next()).n();
        }
    }

    @OnLifecycleEvent(a = lki.ON_STOP)
    public void onStop(lkr lkrVar) {
        Iterator it = rkh.h(this.a).iterator();
        while (it.hasNext()) {
            ((rgu) it.next()).o();
        }
    }
}
