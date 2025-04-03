package defpackage;

import android.util.Pair;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class actj {
    public static final cskc a = cskc.g("Bugle", "FluentJsBridgeRequestSender");
    public long b = Math.max(((Long) acrz.g.e()).longValue(), 500L);
    public TimeUnit c = TimeUnit.MILLISECONDS;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    private final acuq g;
    private final acjc h;
    private final errl i;

    public actj(acuq acuqVar, acjc acjcVar, errl errlVar) {
        this.g = acuqVar;
        this.h = acjcVar;
        this.i = errlVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl a(final defpackage.acua r7, final defpackage.esnk r8) {
        /*
            r6 = this;
            boolean r0 = r6.f
            r1 = 0
            if (r0 == 0) goto L2b
            acua r0 = defpackage.acua.FOREGROUND
            if (r7 == r0) goto L23
            acuq r0 = r6.g
            boolean r0 = r0.h(r7)
            if (r0 != 0) goto L2b
            acjc r0 = r6.h
            elfl r0 = r0.b()
            actc r2 = new actc
            r2.<init>()
            errl r3 = r6.i
            elfl r0 = r0.h(r2, r3)
            goto L2f
        L23:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Cannot apply startBackgroundHandlerIfNecessary to requests targeted at BridgeHostType.FOREGROUND"
            r7.<init>(r8)
            throw r7
        L2b:
            elfl r0 = defpackage.elfo.e(r1)
        L2f:
            boolean r2 = r6.d
            if (r2 == 0) goto L58
            acuq r2 = r6.g
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            boolean r4 = r2.h(r7)
            if (r4 == 0) goto L42
            elfl r1 = defpackage.elfo.e(r1)
            goto L5c
        L42:
            actx r1 = new actx
            r1.<init>()
            com.google.common.util.concurrent.ListenableFuture r1 = defpackage.kfg.a(r1)
            elfl r1 = defpackage.elfl.g(r1)
            r4 = 30000(0x7530, double:1.4822E-319)
            errm r2 = r2.e
            elfl r1 = r1.j(r4, r3, r2)
            goto L5c
        L58:
            elfl r1 = defpackage.elfo.e(r1)
        L5c:
            r2 = 2
            com.google.common.util.concurrent.ListenableFuture[] r2 = new com.google.common.util.concurrent.ListenableFuture[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            elfn r0 = defpackage.elfo.m(r2)
            acte r1 = new acte
            r1.<init>()
            errl r2 = r6.i
            elfl r0 = r0.a(r1, r2)
            actf r1 = new actf
            r1.<init>()
            errl r2 = r6.i
            elfl r0 = r0.i(r1, r2)
            actg r1 = new actg
            r1.<init>()
            errl r7 = r6.i
            java.lang.Class<java.lang.Exception> r8 = java.lang.Exception.class
            elfl r7 = r0.e(r8, r1, r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.actj.a(acua, esnk):elfl");
    }

    public final elfl b(acua acuaVar, esnk esnkVar) {
        return a(acuaVar, esnkVar).h(new emwl() { // from class: actd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                if (optional == null || !optional.isPresent()) {
                    throw new acth();
                }
                return (esnn) optional.get();
            }
        }, this.i);
    }

    public final elfl c(final acua acuaVar, final esnk esnkVar, int i) {
        Optional empty;
        final acua acuaVar2;
        Pair create;
        final esnk esnkVar2;
        if (i < 0) {
            return elfo.d(new acti());
        }
        try {
            final acuq acuqVar = this.g;
            long j = this.b;
            TimeUnit timeUnit = this.c;
            if (acuaVar == acua.AGNOSTIC) {
                try {
                    synchronized (acuq.b) {
                        Map.Entry entry = null;
                        for (Map.Entry entry2 : acuqVar.i.entrySet()) {
                            if (((acum) entry2.getValue()).c().e()) {
                                if (!((acum) entry2.getValue()).g()) {
                                    if (entry != null && ((acua) entry2.getKey()).d <= ((acua) entry.getKey()).d) {
                                    }
                                    entry = entry2;
                                }
                            }
                        }
                        if (entry == null) {
                            throw new acuo();
                        }
                        create = Pair.create((acua) entry.getKey(), (acum) entry.getValue());
                    }
                    empty = Optional.of((acua) create.first);
                } catch (acuo unused) {
                    empty = Optional.empty();
                }
                acuaVar2 = (acua) empty.orElseThrow(new Supplier() { // from class: actv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new acuo();
                    }
                });
            } else {
                acuaVar2 = acuaVar;
            }
            if (!acuqVar.h(acuaVar2)) {
                throw new acuo();
            }
            if (esnkVar.d.isEmpty()) {
                esni esniVar = (esni) esnk.a.createBuilder(esnkVar);
                String uuid = UUID.randomUUID().toString();
                esniVar.copyOnWrite();
                esnk esnkVar3 = (esnk) esniVar.instance;
                uuid.getClass();
                esnkVar3.d = uuid;
                esnkVar2 = (esnk) esniVar.build();
            } else {
                esnkVar2 = esnkVar;
            }
            final String str = esnkVar2.d;
            return elfj.e(new eros() { // from class: actn
                @Override // defpackage.eros
                public final erph a(final erpc erpcVar) {
                    final acuq acuqVar2 = acuq.this;
                    final esnk esnkVar4 = esnkVar2;
                    final String str2 = str;
                    final acua acuaVar3 = acuaVar2;
                    return elfj.c(kfg.a(new kfd() { // from class: actq
                        @Override // defpackage.kfd
                        public final Object a(kfb kfbVar) {
                            acuq acuqVar3 = acuq.this;
                            Map map = acuqVar3.j;
                            String str3 = str2;
                            acua acuaVar4 = acuaVar3;
                            synchronized (map) {
                                if (acuqVar3.j.containsKey(str3)) {
                                    throw new IllegalStateException(a.t(str3, "Duplicated requestId: "));
                                }
                                acuqVar3.j.put(str3, kfbVar);
                            }
                            erpc erpcVar2 = erpcVar;
                            esnk esnkVar5 = esnkVar4;
                            erpcVar2.a(eldl.j(new acuc(acuqVar3, str3, kfbVar)), acuqVar3.e);
                            ((acip) acuqVar3.g.b()).g(esnkVar5.d, esnj.b(esnj.c(esnkVar5.b)));
                            synchronized (acuq.b) {
                                acum acumVar = (acum) acuqVar3.i.get(acuaVar4);
                                if (acumVar == null) {
                                    throw new acuo();
                                }
                                acumVar.c().a(acuq.a(esnkVar5));
                            }
                            return null;
                        }
                    })).a;
                }
            }, acuqVar.e).h().h(new emwl() { // from class: acto
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return Optional.of((esnn) obj);
                }
            }, acuqVar.e).j(j, timeUnit, acuqVar.e).e(Exception.class, new emwl() { // from class: actp
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    String str2 = str;
                    Exception exc = (Exception) obj;
                    acuq acuqVar2 = acuq.this;
                    synchronized (acuqVar2.j) {
                        acuqVar2.j.remove(str2);
                    }
                    esnk esnkVar4 = esnkVar2;
                    if (exc instanceof TimeoutException) {
                        ((acip) acuqVar2.g.b()).h(esnkVar4.d, esnj.b(esnj.c(esnkVar4.b)), fagh.DEADLINE_EXCEEDED);
                        return Optional.empty();
                    }
                    ((acip) acuqVar2.g.b()).h(esnkVar4.d, esnj.b(esnj.c(esnkVar4.b)), fagh.UNKNOWN);
                    if (exc instanceof RuntimeException) {
                        throw ((RuntimeException) exc);
                    }
                    throw new emyx(exc);
                }
            }, acuqVar.e).i(new eroh() { // from class: acta
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    esnk esnkVar4 = esnkVar;
                    Optional optional = (Optional) obj;
                    if (optional != null && optional.isPresent()) {
                        csjb c = actj.a.c();
                        c.I("Request completed successfully");
                        int c2 = esnj.c(esnkVar4.b);
                        if (c2 == 0) {
                            throw null;
                        }
                        c.A("requestType", esnj.a(c2));
                        c.y("remainingRetries", 0);
                        c.r();
                        return elfo.e(optional);
                    }
                    csjb c3 = actj.a.c();
                    c3.I("Received an empty response. Retrying.");
                    int c4 = esnj.c(esnkVar4.b);
                    if (c4 == 0) {
                        throw null;
                    }
                    acua acuaVar3 = acuaVar;
                    actj actjVar = actj.this;
                    c3.A("requestType", esnj.a(c4));
                    c3.y("remainingRetries", 0);
                    c3.r();
                    return actjVar.c(acuaVar3, esnkVar4, -1);
                }
            }, this.i).f(Exception.class, new eroh() { // from class: actb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Exception exc = (Exception) obj;
                    csjb c = actj.a.c();
                    c.I("Received a response error. Retrying.");
                    esnk esnkVar4 = esnkVar;
                    int c2 = esnj.c(esnkVar4.b);
                    if (c2 == 0) {
                        throw null;
                    }
                    acua acuaVar3 = acuaVar;
                    actj actjVar = actj.this;
                    c.A("requestType", esnj.a(c2));
                    c.y("remainingRetries", 0);
                    c.s(exc);
                    return actjVar.c(acuaVar3, esnkVar4, -1);
                }
            }, this.i);
        } catch (acuo e) {
            return elfo.d(e);
        }
    }

    public final void d(acua acuaVar, esnk esnkVar) {
        a(acuaVar, esnkVar).k(axnw.b(), this.i);
    }

    public final void e() {
        this.b = Math.max(((Long) acrz.h.e()).longValue(), 500L);
        this.c = TimeUnit.MILLISECONDS;
    }
}
