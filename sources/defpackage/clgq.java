package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clgq extends clpo {
    public static final entd a = entd.p();
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final errl k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    private final errl o;
    private final clli p;
    private final cllj q;
    private final ffbr r;

    public clgq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, clli clliVar, cllj clljVar, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, errl errlVar, errl errlVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
        this.j = ffbrVar9;
        this.p = clliVar;
        this.q = clljVar;
        this.l = ffbrVar10;
        this.m = ffbrVar11;
        this.n = ffbrVar12;
        this.r = ffbrVar13;
        this.k = errlVar;
        this.o = errlVar2;
    }

    public static StatusException b(IllegalArgumentException illegalArgumentException) {
        return Status.e.d(illegalArgumentException).withDescription((String) Optional.ofNullable(illegalArgumentException.getMessage()).orElse("")).asException();
    }

    private final void m(final String str, final ffbc ffbcVar, Supplier supplier) {
        Object obj;
        try {
            obj = supplier.get();
            axnw.h(((elfl) obj).h(new emwl() { // from class: clgj
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    ffbc ffbcVar2 = ffbc.this;
                    ffbcVar2.c(obj2);
                    ffbcVar2.a();
                    return Status.Code.OK;
                }
            }, this.k).e(IllegalArgumentException.class, new emwl() { // from class: clgk
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    IllegalArgumentException illegalArgumentException = (IllegalArgumentException) obj2;
                    ((ensz) ((ensz) ((ensz) clgq.a.j()).g(illegalArgumentException)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 289, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", str);
                    ffbcVar.b(clgq.b(illegalArgumentException));
                    return Status.Code.INVALID_ARGUMENT;
                }
            }, this.k).e(Throwable.class, new emwl() { // from class: clgl
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    Throwable th = (Throwable) obj2;
                    ((ensz) ((ensz) ((ensz) clgq.a.j()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 297, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", str);
                    ffbcVar.b(th);
                    return Status.Code.UNKNOWN;
                }
            }, this.k));
        } catch (IllegalArgumentException e) {
            ((ensz) ((ensz) ((ensz) a.j()).g(e)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 304, "MessagingEngineNotificationServerImpl.java")).t("[%s] Ignoring invalid data", str);
            ffbcVar.b(b(e));
        } catch (Throwable th) {
            ((ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/apps/messaging/shared/rcs/messaging/MessagingEngineNotificationServerImpl", "processRequestAsync", 307, "MessagingEngineNotificationServerImpl.java")).t("[%s] Error while processing request", str);
            ffbcVar.b(th);
        }
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void c(final clne clneVar, ffbc ffbcVar) {
        m("addUserToGroup", ffbcVar, new Supplier() { // from class: clgf
            @Override // java.util.function.Supplier
            public final Object get() {
                clti cltiVar = (clti) clgq.this.e.b();
                return cltiVar.a.b(clneVar).h(new emwl() { // from class: cltg
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clng.a;
                    }
                }, cltiVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void d(final clnu clnuVar, ffbc ffbcVar) {
        m("createGroup", ffbcVar, new Supplier() { // from class: clgi
            @Override // java.util.function.Supplier
            public final Object get() {
                cltm cltmVar = (cltm) clgq.this.d.b();
                return cltmVar.a.b(clnuVar).h(new emwl() { // from class: cltk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clnw.a;
                    }
                }, cltmVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void e(final clqi clqiVar, ffbc ffbcVar) {
        m("receiveGroupNotification", ffbcVar, new Supplier() { // from class: clgc
            @Override // java.util.function.Supplier
            public final Object get() {
                clqi clqiVar2 = clqiVar;
                int i = clqiVar2.c;
                clgq clgqVar = clgq.this;
                if (i == 4) {
                    elfl d = ((avkh) clgqVar.i.b()).d(((cllc) clgqVar.l.b()).apply(clqiVar2));
                    final clld clldVar = (clld) clgqVar.n.b();
                    clldVar.getClass();
                    return d.h(new emwl() { // from class: clfz
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return clld.this.apply((awud) obj);
                        }
                    }, clgqVar.k);
                }
                if (i != 3) {
                    return elfo.e(clqk.a);
                }
                elfl c = ((avkh) clgqVar.i.b()).c(((clky) clgqVar.m.b()).apply(clqiVar2));
                final clld clldVar2 = (clld) clgqVar.n.b();
                clldVar2.getClass();
                return c.h(new emwl() { // from class: clgh
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clld.this.apply((awud) obj);
                    }
                }, clgqVar.k);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void f(clqm clqmVar, ffbc ffbcVar) {
        clli clliVar = this.p;
        elfl i = clliVar.b.a(clliVar.a.apply(clqmVar)).i(new eroh() { // from class: clgo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((avkh) clgq.this.i.b()).e((awxk) obj);
            }
        }, this.o);
        final cllj clljVar = this.q;
        final elfl h = i.h(new emwl() { // from class: clgp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cllj.this.apply((awud) obj);
            }
        }, this.k);
        m("receiveMessageNotification", ffbcVar, new Supplier() { // from class: clga
            @Override // java.util.function.Supplier
            public final Object get() {
                return elfl.this;
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void g(final clqz clqzVar, ffbc ffbcVar) {
        m("removeUserFromGroup", ffbcVar, new Supplier() { // from class: clgm
            @Override // java.util.function.Supplier
            public final Object get() {
                clty cltyVar = (clty) clgq.this.f.b();
                return cltyVar.a.b(clqzVar).h(new emwl() { // from class: cltw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clrb.a;
                    }
                }, cltyVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void h(final clrn clrnVar, ffbc ffbcVar) {
        m("revokeMessage", ffbcVar, new Supplier() { // from class: clgd
            @Override // java.util.function.Supplier
            public final Object get() {
                club clubVar = (club) clgq.this.c.b();
                return clubVar.a.b(clrnVar).h(new emwl() { // from class: cltz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clrp.a;
                    }
                }, clubVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void i(final clrv clrvVar, ffbc ffbcVar) {
        if (((atsd) this.r.b()).a()) {
            throw new UnsupportedOperationException("onSendFileOverMsrpCompleted is not implemented");
        }
        m("sendSlmFile", ffbcVar, new Supplier() { // from class: clgb
            @Override // java.util.function.Supplier
            public final Object get() {
                clug clugVar = (clug) clgq.this.j.b();
                ekzz f = eleg.f("SendSlmFileMethod#processNotificationRequest");
                clrv clrvVar2 = clrvVar;
                try {
                    cluh cluhVar = clugVar.b;
                    cotg a2 = clugVar.a.apply(clrvVar2);
                    clsn clsnVar = clrvVar2.d;
                    if (clsnVar == null) {
                        clsnVar = clsn.a;
                    }
                    clqx clqxVar = clrvVar2.f;
                    if (clqxVar == null) {
                        clqxVar = clqx.a;
                    }
                    if (((Boolean) ((cfup) clie.d.get()).e()).booleanValue()) {
                        clie clieVar = cluhVar.a;
                        axac createBuilder = axad.a.createBuilder();
                        String str = clsnVar.c;
                        createBuilder.copyOnWrite();
                        axad axadVar = (axad) createBuilder.instance;
                        str.getClass();
                        axadVar.b |= 1;
                        axadVar.c = str;
                        clieVar.c(createBuilder.build(), bdhg.a(clqxVar.c), 9, 16);
                    }
                    cotk cotkVar = a2.c;
                    if (cotkVar == null) {
                        cotkVar = cotk.a;
                    }
                    elfl h = elfl.g(erqt.i(cotkVar)).h(new emwl() { // from class: cluf
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return clrx.a;
                        }
                    }, erpp.a);
                    f.b(h);
                    f.close();
                    return h;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void j(final clsd clsdVar, ffbc ffbcVar) {
        m("sendMessage", ffbcVar, new Supplier() { // from class: clge
            @Override // java.util.function.Supplier
            public final Object get() {
                final clue clueVar = (clue) clgq.this.b.b();
                cltu cltuVar = clueVar.a;
                final clsd clsdVar2 = clsdVar;
                return cltuVar.b(clsdVar2).h(new emwl() { // from class: cluc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        if (((Boolean) ((cfup) clie.d.get()).e()).booleanValue()) {
                            clsd clsdVar3 = clsdVar2;
                            clue clueVar2 = clue.this;
                            axac createBuilder = axad.a.createBuilder();
                            clsn clsnVar = clsdVar3.d;
                            if (clsnVar == null) {
                                clsnVar = clsn.a;
                            }
                            String str = clsnVar.c;
                            createBuilder.copyOnWrite();
                            axad axadVar = (axad) createBuilder.instance;
                            str.getClass();
                            axadVar.b |= 1;
                            axadVar.c = str;
                            axad build = createBuilder.build();
                            clqx clqxVar = clsdVar3.f;
                            if (clqxVar == null) {
                                clqxVar = clqx.a;
                            }
                            clueVar2.c.a(build, bdhg.a(clqxVar.c));
                        }
                        return clsf.a;
                    }
                }, clueVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void k(final clsp clspVar, ffbc ffbcVar) {
        m("triggerGroupNotification", ffbcVar, new Supplier() { // from class: clgg
            @Override // java.util.function.Supplier
            public final Object get() {
                cluk clukVar = (cluk) clgq.this.h.b();
                return clukVar.a.b(clspVar).h(new emwl() { // from class: clui
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clsr.a;
                    }
                }, clukVar.b);
            }
        });
    }

    @Override // defpackage.clpo, defpackage.clpm
    public final void l(final clsx clsxVar, ffbc ffbcVar) {
        m("updateGroup", ffbcVar, new Supplier() { // from class: clgn
            @Override // java.util.function.Supplier
            public final Object get() {
                clun clunVar = (clun) clgq.this.g.b();
                return clunVar.a.b(clsxVar).h(new emwl() { // from class: clul
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return clsz.a;
                    }
                }, clunVar.b);
            }
        });
    }
}
