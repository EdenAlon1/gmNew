package com.google.android.ims.events;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.ims.events.EventHubProxy;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.events.IEventObserver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dipu;
import defpackage.dipv;
import defpackage.dipw;
import defpackage.dipy;
import defpackage.dipz;
import defpackage.diqa;
import defpackage.diqb;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dkna;
import defpackage.dkty;
import defpackage.dkvj;
import defpackage.emxf;
import defpackage.erqt;
import defpackage.errl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class EventHubProxy extends IEvent.Stub {
    public static final diyy<Boolean> DD_NOT_MERGE_EVENTS = dizd.a(154997142);
    private static final diyy a = dizd.a(159965913);
    private final String b;
    private final boolean d;
    ListenableFuture<?> eventFuture;
    private final List f;
    private final List g;
    private final errl h;
    private final Runnable i;
    private dipw j;
    private boolean c = false;
    private volatile long e = Long.MAX_VALUE;

    public EventHubProxy(String str, errl errlVar) {
        String[] strArr = dkna.a;
        this.f = new ArrayList(9);
        this.g = new ArrayList(9);
        this.eventFuture = null;
        this.i = new dipu(this);
        this.j = null;
        this.b = str;
        this.h = errlVar;
        for (int i = 0; i < 9; i++) {
            this.f.add(new dipy());
        }
        this.d = ((Boolean) a.a()).booleanValue();
        for (int i2 = 0; i2 < 9; i2++) {
            if (this.d) {
                this.g.add(new diqa());
            } else {
                this.g.add(new diqb());
            }
        }
    }

    private final void a(IBinder iBinder) {
        dipw dipwVar = new dipw(this);
        this.j = dipwVar;
        try {
            iBinder.linkToDeath(dipwVar, 0);
            dkty.c("Linked death recipient for %s", this.b);
        } catch (RemoteException unused) {
            dkty.q("Unable to link death recipient for %s", this.b);
            this.j = null;
        }
    }

    private final void b(int i, Event event) {
        dipy dipyVar = (dipy) this.f.get(i);
        dkty.c(" *** posting to %d %s observers: %s", Integer.valueOf(dipyVar.size()), this.b, event);
        dipyVar.a(event);
    }

    private final synchronized void c() {
        ListenableFuture<?> listenableFuture = this.eventFuture;
        if (listenableFuture == null || listenableFuture.isDone() || this.eventFuture.isCancelled()) {
            dkty.c("%s: Schedule posting events.", this.b);
            this.eventFuture = this.h.submit(new Runnable() { // from class: dipt
                @Override // java.lang.Runnable
                public final void run() {
                    EventHubProxy.this.postQueuedEvents();
                }
            });
        }
    }

    private final void d() {
        synchronized (this.i) {
            if (this.e == Long.MAX_VALUE) {
                this.e = dkvj.a().longValue() + 100;
                erqt.r(this.h.submit(this.i), new dipv(this), this.h);
            }
        }
    }

    public void flushQueues() {
        synchronized (this.i) {
            if (this.e != Long.MAX_VALUE) {
                this.e = Long.MIN_VALUE;
                this.i.notifyAll();
            }
        }
    }

    public boolean hasSubscribersForEventCategory(int i) {
        String[] strArr = dkna.a;
        emxf.d(i < 9, "invalid category %s", i);
        return isBound() && !((dipy) this.f.get(i)).isEmpty();
    }

    public boolean isBound() {
        return this.c;
    }

    public boolean isSubscribed(int i, IEventObserver iEventObserver) {
        boolean z;
        String[] strArr = dkna.a;
        emxf.d(i < 9, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int hashCode = iEventObserver.hashCode();
        dipy dipyVar = (dipy) this.f.get(i);
        synchronized (dipyVar) {
            z = dipyVar.get(Integer.valueOf(hashCode)) == iEventObserver;
        }
        return z;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void ping() {
        postMergableEvent(new Event(1, 0L, 0L));
    }

    public void postMergableEvent(Event event) {
        dipz dipzVar = (dipz) this.g.get(event.g);
        Event a2 = dipzVar.a(event.h);
        if (!this.d) {
            synchronized (dipzVar) {
                if (a2 == null) {
                    dipzVar.e(event);
                } else {
                    a2.f();
                }
            }
        } else if (a2 == null) {
            dipzVar.e(event);
        } else {
            a2.f();
        }
        d();
    }

    public void postOverridingEvent(Event event) {
        dipz dipzVar = (dipz) this.g.get(event.g);
        if (this.d) {
            dipzVar.d(event.h);
            dipzVar.e(event);
        } else {
            synchronized (dipzVar) {
                dipzVar.d(event.h);
                dipzVar.e(event);
            }
        }
        d();
    }

    public void postQueuedEvents() {
        int i = 0;
        while (true) {
            String[] strArr = dkna.a;
            if (i >= 9) {
                return;
            }
            emxf.d(true, "invalid category %s", i);
            dipz dipzVar = (dipz) this.g.get(i);
            if (this.d) {
                while (true) {
                    Event event = (Event) dipzVar.c().poll();
                    if (event == null) {
                        break;
                    } else {
                        b(i, event);
                    }
                }
            } else {
                synchronized (dipzVar) {
                    Iterator it = dipzVar.b().iterator();
                    while (it.hasNext()) {
                        b(i, (Event) it.next());
                    }
                    dipzVar.b().clear();
                }
            }
            i++;
        }
    }

    public void postUniqueEvent(Event event) {
        dipz dipzVar = (dipz) this.g.get(event.g);
        if (this.d) {
            dipzVar.e(event);
        } else {
            synchronized (dipzVar) {
                dipzVar.e(event);
            }
        }
        if (((Boolean) DD_NOT_MERGE_EVENTS.a()).booleanValue()) {
            c();
        } else {
            d();
        }
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public int subscribe(int i, IEventObserver iEventObserver) {
        Integer valueOf;
        String[] strArr = dkna.a;
        emxf.d(i < 9, "invalid category %s", i);
        if (this.j == null) {
            a(iEventObserver.asBinder());
            this.c = true;
        }
        int hashCode = iEventObserver.hashCode();
        dipy dipyVar = (dipy) this.f.get(i);
        synchronized (dipyVar) {
            valueOf = Integer.valueOf(hashCode);
            dipyVar.put(valueOf, iEventObserver);
        }
        dkty.k("Adding event listener %s for category %d with key %d for hub %s", iEventObserver, Integer.valueOf(i), valueOf, this.b);
        return hashCode;
    }

    @Override // com.google.android.ims.rcsservice.events.IEvent
    public void unsubscribe(int i, int i2) {
        Integer valueOf;
        String[] strArr = dkna.a;
        emxf.d(i < 9, "invalid category %s", i);
        synchronized (((dipy) this.f.get(i))) {
            dipy dipyVar = (dipy) this.f.get(i);
            valueOf = Integer.valueOf(i2);
            dipyVar.remove(valueOf);
        }
        dkty.k("Removing event listener %s for category %d for hub %s", valueOf, Integer.valueOf(i), this.b);
        System.gc();
    }
}
