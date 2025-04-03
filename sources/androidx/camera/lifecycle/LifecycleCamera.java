package androidx.camera.lifecycle;

import androidx.lifecycle.OnLifecycleEvent;
import defpackage.ata;
import defpackage.atc;
import defpackage.ati;
import defpackage.axv;
import defpackage.bla;
import defpackage.lki;
import defpackage.lkj;
import defpackage.lkq;
import defpackage.lkr;
import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class LifecycleCamera implements lkq, ata {
    public final lkr b;
    public final bla c;
    public final Object a = new Object();
    private volatile boolean e = false;
    public boolean d = false;

    public LifecycleCamera(lkr lkrVar, bla blaVar) {
        this.b = lkrVar;
        this.c = blaVar;
        if (lkrVar.P().a().a(lkj.STARTED)) {
            blaVar.e();
        } else {
            blaVar.f();
        }
        lkrVar.P().c(this);
    }

    public final lkr a() {
        lkr lkrVar;
        synchronized (this.a) {
            lkrVar = this.b;
        }
        return lkrVar;
    }

    @Override // defpackage.ata
    public final atc b() {
        return this.c.a.b;
    }

    @Override // defpackage.ata
    public final ati c() {
        return this.c.a.a;
    }

    public final List d() {
        List unmodifiableList;
        synchronized (this.a) {
            unmodifiableList = DesugarCollections.unmodifiableList(this.c.d());
        }
        return unmodifiableList;
    }

    public final void e() {
        synchronized (this.a) {
            if (this.d) {
                return;
            }
            onStop(this.b);
            this.d = true;
        }
    }

    public final boolean f(axv axvVar) {
        boolean contains;
        synchronized (this.a) {
            contains = this.c.d().contains(axvVar);
        }
        return contains;
    }

    @OnLifecycleEvent(a = lki.ON_DESTROY)
    public void onDestroy(lkr lkrVar) {
        synchronized (this.a) {
            bla blaVar = this.c;
            blaVar.g(blaVar.d());
        }
    }

    @OnLifecycleEvent(a = lki.ON_PAUSE)
    public void onPause(lkr lkrVar) {
        this.c.h(false);
    }

    @OnLifecycleEvent(a = lki.ON_RESUME)
    public void onResume(lkr lkrVar) {
        this.c.h(true);
    }

    @OnLifecycleEvent(a = lki.ON_START)
    public void onStart(lkr lkrVar) {
        synchronized (this.a) {
            if (!this.d) {
                this.c.e();
                this.e = true;
            }
        }
    }

    @OnLifecycleEvent(a = lki.ON_STOP)
    public void onStop(lkr lkrVar) {
        synchronized (this.a) {
            if (!this.d) {
                this.c.f();
                this.e = false;
            }
        }
    }
}
