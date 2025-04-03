package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpnb {
    public static final entd a = entd.c("BugleTachygram");
    public final cpna b;
    public final errl c;
    public final errl d;
    public final chfz e;
    public final axbl f;
    public final avkh g;
    public final ffbr h;
    public final errm i;
    public final cqoh j;
    private final Set k;
    private final cpjh l = new cpjh();

    public cpnb(cpna cpnaVar, errl errlVar, errl errlVar2, chfz chfzVar, Set set, axbl axblVar, avkh avkhVar, ffbr ffbrVar, errm errmVar, cqoh cqohVar) {
        this.b = cpnaVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = chfzVar;
        this.k = set;
        this.f = axblVar;
        this.g = avkhVar;
        this.h = ffbrVar;
        this.i = errmVar;
        this.j = cqohVar;
    }

    public final elfl a(final esqb esqbVar, final Object obj) {
        if (esqbVar instanceof esps) {
            return e(obj, esqbVar.a);
        }
        f("Tachygram user suspended by the server. Triggering re-provisioning.", esqbVar);
        ArrayList arrayList = new ArrayList();
        enqu listIterator = ((enpx) this.k).listIterator();
        while (listIterator.hasNext()) {
            arrayList.add(((cijd) listIterator.next()).c(cpta.b(this.b.b(obj))));
        }
        return elfo.j(arrayList).b(new erog() { // from class: cpms
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return cpnb.this.e(obj, esqbVar.a);
            }
        }, this.c);
    }

    public final elfl b(final esqb esqbVar, final Object obj) {
        f("call into chat api to remove user from group.", esqbVar);
        cpna cpnaVar = this.b;
        awui b = cpnaVar.b(obj);
        String f = cpnaVar.f(obj);
        final awvs awvsVar = (awvs) awvt.c.createBuilder();
        awvsVar.copyOnWrite();
        awvt awvtVar = (awvt) awvsVar.instance;
        f.getClass();
        awvtVar.d |= 1;
        awvtVar.e = f;
        awvsVar.b(b);
        awvsVar.copyOnWrite();
        awvt awvtVar2 = (awvt) awvsVar.instance;
        b.getClass();
        awvtVar2.r = b;
        awvtVar2.d |= 512;
        return elfo.e(Optional.empty()).i(new eroh() { // from class: cpmz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final awvs awvsVar2 = awvsVar;
                ((Optional) obj2).ifPresent(new Consumer() { // from class: cpmo
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj3) {
                        entd entdVar = cpnb.a;
                        String a2 = ((azhq) obj3).a();
                        awvs awvsVar3 = awvs.this;
                        awvsVar3.copyOnWrite();
                        awvt awvtVar3 = (awvt) awvsVar3.instance;
                        eygj eygjVar = awvt.a;
                        awvtVar3.d |= 2;
                        awvtVar3.f = a2;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return cpnb.this.g.c((awvt) awvsVar2.build());
            }
        }, this.d).i(new eroh() { // from class: cpmm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                return cpnb.this.e(obj, esqbVar.a);
            }
        }, this.c);
    }

    public final elfl c(ceuw ceuwVar, Object obj) {
        return d(obj, ceuwVar, null).h(new emwl() { // from class: cpmp
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return avuj.a((avui) obj2);
            }
        }, erpp.a);
    }

    public final elfl d(final Object obj, final ceuw ceuwVar, Function function) {
        Object apply;
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 136, "TachygramOutgoingOperationTemplate.java")).t("Executing outgoing tachygram operation %s", this.b.g());
        final long a2 = this.j.a();
        ekzz f = eleg.f("TachygramOutgoingOperationTemplate::process::networkCall");
        try {
            elfl c = this.b.c(obj);
            if (function != null) {
                apply = function.apply(c);
                c = (elfl) apply;
            }
            f.b(c);
            f.close();
            return c.i(new eroh() { // from class: cpmw
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    ensz enszVar = (ensz) ((ensz) cpnb.a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "processInternalAndCatch", 152, "TachygramOutgoingOperationTemplate.java");
                    cpnb cpnbVar = cpnb.this;
                    enszVar.C("Executed outgoing tachygram operation %s, latency[ms]=%d", cpnbVar.b.g(), cpnbVar.j.a() - a2);
                    return cpnbVar.b.e(obj, obj2);
                }
            }, this.d).h(new emwl() { // from class: cpmx
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    return cpnb.this.g(1, (awud) obj2);
                }
            }, erpp.a).f(esqb.class, new eroh() { // from class: cpmy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    final cpnb cpnbVar = cpnb.this;
                    final esqb esqbVar = (esqb) obj2;
                    final Object obj3 = obj;
                    if (cpnbVar.b.h()) {
                        int ordinal = esqbVar.a.c.ordinal();
                        if (ordinal == 0 || ordinal == 1) {
                            cpnbVar.f("call into chat api to maybe try the operation again.", esqbVar);
                            return cpnbVar.e(obj3, esqbVar.a);
                        }
                        if (ordinal == 3) {
                            return cpnbVar.a(esqbVar, obj3);
                        }
                        if (ordinal == 4) {
                            emxf.m(!cpnbVar.b.f(obj3).isEmpty(), "Group recovery invoked on a non-group operation");
                        } else if (ordinal == 5) {
                            return cpnbVar.b(esqbVar, obj3);
                        }
                        cpnbVar.f("call into chat api to maybe try the operation again.", esqbVar);
                        return cpnbVar.e(obj3, esqbVar.a);
                    }
                    ceuw ceuwVar2 = ceuwVar;
                    if (ceuwVar2 != null && !ceuwVar2.c()) {
                        cpnbVar.f("call into chat api to maybe try the operation again.", esqbVar);
                        return cpnbVar.e(obj3, esqbVar.a);
                    }
                    switch (esqbVar.a.c.ordinal()) {
                        case 0:
                            return cpnbVar.e(obj3, esqbVar.a);
                        case 1:
                            cpnbVar.f("returning work queue result to retry.", esqbVar);
                            return elfo.e(avui.FAIL_RETRY);
                        case 2:
                            awui b = cpnbVar.b.b(obj3);
                            if (b.d.isEmpty()) {
                                cpnbVar.f("attempting to refresh registration but empty chat endpoint is found.", esqbVar);
                                return cpnbVar.e(obj3, esqbVar.a);
                            }
                            cpnbVar.f("refreshing registration and returning work queue result to retry.", esqbVar);
                            return cpnbVar.e.c(b).h(new emwl() { // from class: cpmn
                                @Override // defpackage.emwl
                                public final Object apply(Object obj4) {
                                    entd entdVar = cpnb.a;
                                    return avui.FAIL_RETRY;
                                }
                            }, cpnbVar.c);
                        case 3:
                            return cpnbVar.a(esqbVar, obj3);
                        case 4:
                            cpnbVar.f("call into chat api to re-create the group and retry the operation.", esqbVar);
                            String f2 = cpnbVar.b.f(obj3);
                            final awvs awvsVar = (awvs) awvt.c.createBuilder();
                            awvsVar.copyOnWrite();
                            awvt awvtVar = (awvt) awvsVar.instance;
                            f2.getClass();
                            awvtVar.d |= 1;
                            awvtVar.e = f2;
                            awvk awvkVar = (awvk) awvn.a.createBuilder();
                            awvm awvmVar = awvm.CAUSE_GROUP_NOT_FOUND;
                            awvkVar.copyOnWrite();
                            awvn awvnVar = (awvn) awvkVar.instance;
                            awvnVar.c = awvmVar.d;
                            awvnVar.b = 1 | awvnVar.b;
                            awvsVar.copyOnWrite();
                            awvt awvtVar2 = (awvt) awvsVar.instance;
                            awvn awvnVar2 = (awvn) awvkVar.build();
                            awvnVar2.getClass();
                            awvtVar2.q = awvnVar2;
                            awvtVar2.d |= 256;
                            awui b2 = cpnbVar.b.b(obj3);
                            awvsVar.copyOnWrite();
                            awvt awvtVar3 = (awvt) awvsVar.instance;
                            b2.getClass();
                            awvtVar3.r = b2;
                            awvtVar3.d |= 512;
                            return elfo.e(Optional.empty()).i(new eroh() { // from class: cpmq
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj4) {
                                    final awvs awvsVar2 = awvsVar;
                                    ((Optional) obj4).ifPresent(new Consumer() { // from class: cpmv
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void o(Object obj5) {
                                            entd entdVar = cpnb.a;
                                            String a3 = ((azhq) obj5).a();
                                            awvs awvsVar3 = awvs.this;
                                            awvsVar3.copyOnWrite();
                                            awvt awvtVar4 = (awvt) awvsVar3.instance;
                                            eygj eygjVar = awvt.a;
                                            awvtVar4.d |= 2;
                                            awvtVar4.f = a3;
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    return cpnb.this.g.c((awvt) awvsVar2.build());
                                }
                            }, cpnbVar.d).i(new eroh() { // from class: cpmr
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj4) {
                                    return cpnb.this.e(obj3, esqbVar.a);
                                }
                            }, cpnbVar.c);
                        case 5:
                            return cpnbVar.b(esqbVar, obj3);
                        case 6:
                            return cpnbVar.f.a(new axbi(cpnbVar.b.a(obj3))).i(new eroh() { // from class: cpmu
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj4) {
                                    return cpnb.this.e(obj3, esqbVar.a);
                                }
                            }, erpp.a);
                        default:
                            cpnbVar.f("Unknown Tachygram RecoveryType.", esqbVar);
                            return cpnbVar.e(obj3, esqbVar.a);
                    }
                }
            }, this.c);
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final elfl e(Object obj, espw espwVar) {
        return this.b.d(obj, this.l.apply(espwVar)).h(new emwl() { // from class: cpmt
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                return cpnb.this.g(2, (awud) obj2);
            }
        }, this.c);
    }

    public final void f(String str, esqb esqbVar) {
        if (!(esqbVar instanceof estd)) {
            ((ensz) ((ensz) ((ensz) a.j()).g(esqbVar)).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 502, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.g(), str);
            return;
        }
        ensz enszVar = (ensz) ((ensz) a.j()).g(esqbVar);
        estd estdVar = (estd) esqbVar;
        enszVar.Y(cppz.a, estdVar.c.t);
        enszVar.Y(cppz.b, estdVar.c.getDescription());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "logTachygramException", 499, "TachygramOutgoingOperationTemplate.java")).D("%s failed: %s", this.b.g(), str);
    }

    public final avui g(int i, awud awudVar) {
        if (i == 1) {
            awuc b = awuc.b(awudVar.c);
            if (b == null) {
                b = awuc.UNKNOWN_STATUS;
            }
            if (b.equals(awuc.OK)) {
                ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 510, "TachygramOutgoingOperationTemplate.java")).t("Successfully completed %s", this.b.g());
                return avui.SUCCESS;
            }
        }
        ensz enszVar = (ensz) a.j();
        ensn ensnVar = awgo.b;
        awuc b2 = awuc.b(awudVar.c);
        if (b2 == null) {
            b2 = awuc.UNKNOWN_STATUS;
        }
        enszVar.Y(ensnVar, b2);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOutgoingOperationTemplate", "handleProcessingComplete", 516, "TachygramOutgoingOperationTemplate.java")).t("Failed to complete %s, returning work queue result to no retry.", this.b.g());
        return avui.FAIL_NO_RETRY;
    }
}
