package defpackage;

import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxw extends ejxx implements ljv {
    public final lkr a;
    public ejyr b;
    private final encw c = new enfy();
    private boolean d = true;
    private final ejxt e;
    private final Executor f;
    private final ejlj g;
    private final ejlj h;
    private final eklq i;

    public ejxw(lkr lkrVar, eklq eklqVar, Executor executor) {
        this.a = lkrVar;
        this.i = eklqVar;
        try {
            this.e = (ejxt) eklqVar.a.k(R.id.first_lifecycle_owner_instance, lkrVar, new ekll() { // from class: ejxr
                @Override // defpackage.ekll
                public final Object a() {
                    return new ejxt();
                }
            }, new eklk() { // from class: eklo
                @Override // defpackage.eklk
                public final void a(Object obj) {
                }
            });
            this.f = executor;
            ejlj ejljVar = new ejlj(executor, true, false);
            this.g = ejljVar;
            ejljVar.b();
            this.h = new ejlj(executor, false, false);
            lkrVar.P().c(this);
        } catch (IllegalStateException e) {
            throw new IllegalStateException("Both an unqualified and a `@ViewLifecycle LocalSubscriptionMixin` have been injectedin this Fragment scope. Only one of the two LocalSubscriptionMixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle`LocalSubscriptionMixin exclusively.", e);
        }
    }

    @Override // defpackage.ljv
    public final void f(lkr lkrVar) {
        efbd.c();
        ejyr ejyrVar = this.b;
        efbd.c();
        ejyrVar.e.c();
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        efbd.c();
        final ejyr ejyrVar = this.b;
        if (ejyrVar != null) {
            efbd.c();
            ejyrVar.d.execute(eldl.l(new Runnable() { // from class: ejyp
                @Override // java.lang.Runnable
                public final void run() {
                    ejyr ejyrVar2 = ejyr.this;
                    ejyrVar2.h = 3;
                    cmi cmiVar = new cmi((cmj) ejyrVar2.g);
                    while (cmiVar.hasNext()) {
                        ((ListenableFuture) cmiVar.next()).cancel(false);
                    }
                    ejyrVar2.g = null;
                }
            }));
        }
        this.e.a = false;
    }

    @Override // defpackage.ljv
    public final void ha(lkr lkrVar) {
        efbd.c();
        if (this.d) {
            emxf.l(this.b == null);
            Set entrySet = this.c.entrySet();
            engd engdVar = new engd(entrySet instanceof Collection ? entrySet.size() : 4);
            engdVar.e(entrySet);
            this.b = new ejyr(engdVar.c(), this.f, this.g, this.h);
            if (this.e.a && this.d) {
                final ejyr ejyrVar = this.b;
                efbd.c();
                ejyrVar.d.execute(eldl.l(new Runnable() { // from class: ejyo
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejyr ejyrVar2 = ejyr.this;
                        enqu listIterator = ejyrVar2.b.values().listIterator();
                        while (listIterator.hasNext()) {
                            ejyrVar2.d((ejyu) listIterator.next());
                        }
                    }
                }));
            } else {
                final ejyr ejyrVar2 = this.b;
                efbd.c();
                ejyrVar2.d.execute(eldl.l(new Runnable() { // from class: ejyj
                    @Override // java.lang.Runnable
                    public final void run() {
                        final ejyr ejyrVar3 = ejyr.this;
                        enqu listIterator = ejyrVar3.b.entrySet().listIterator();
                        while (listIterator.hasNext()) {
                            Map.Entry entry = (Map.Entry) listIterator.next();
                            final ejxk ejxkVar = (ejxk) entry.getKey();
                            final ejyu ejyuVar = (ejyu) entry.getValue();
                            emxs emxsVar = new emxs() { // from class: ejyf
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ejyr.b(ejxk.this, (ejyx) obj);
                                }
                            };
                            emxs emxsVar2 = new emxs() { // from class: ejyg
                                @Override // defpackage.emxs
                                public final void a(Object obj) {
                                    ejyr.this.a(ejyuVar, (ListenableFuture) obj);
                                }
                            };
                            efbd.c();
                            ejys ejysVar = ejyuVar.a;
                            ejysVar.getClass();
                            emxc c = ejysVar.c();
                            if (c.g()) {
                                ejyuVar.a = ejyuVar.a.e((ejyx) c.c());
                            }
                            emxc d = ejyuVar.a.d();
                            emxc a = ejyuVar.a.a();
                            if (d.g()) {
                                emxsVar.a(d.c());
                            }
                            if (a.g()) {
                                emxsVar2.a(a.c());
                            }
                        }
                    }
                }));
            }
            this.c.clear();
            this.d = false;
        }
        ejyr ejyrVar3 = this.b;
        efbd.c();
        ejyrVar3.e.b();
    }

    @Override // defpackage.ejxx
    public final ejxm i(int i, ejxk ejxkVar, final emxc emxcVar) {
        efbd.c();
        emxf.l(this.b == null);
        emxf.l(this.c.put(ejxkVar, (ejyu) this.i.b(i, this.a, new ekll() { // from class: ejxp
            @Override // defpackage.ekll
            public final Object a() {
                emxc emxcVar2 = emxc.this;
                if (!emxcVar2.g()) {
                    emux emuxVar = emux.a;
                    return new ejyu(new ejxf(emuxVar, emuxVar, emuxVar, emuxVar));
                }
                emxc j = emxc.j(emxcVar2.c());
                emux emuxVar2 = emux.a;
                return new ejyu(new ejxf(j, emuxVar2, emuxVar2, emuxVar2));
            }
        }, new eklk() { // from class: ejxq
            /* JADX WARN: Type inference failed for: r0v3, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eklk
            public final void a(Object obj) {
                ejyu ejyuVar = (ejyu) obj;
                efbd.c();
                ejys ejysVar = ejyuVar.a;
                ejysVar.getClass();
                emxc a = ejysVar.a();
                if (a.g()) {
                    a.c().cancel(false);
                }
                ejyuVar.a = null;
            }
        })) == null);
        return new ejxs(this, ejxkVar);
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }
}
