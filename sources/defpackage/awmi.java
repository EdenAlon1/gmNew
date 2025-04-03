package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmi {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter");
    public final errl b;
    public final errl c;
    public final errl d;
    public final ckju e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final bdtd k;
    public final aolr l;
    public final Set m;
    public final ffbr n;
    private final chco o;
    private final ckni p;
    private final ckac q;
    private final djsi r;
    private final djrk s;
    private final ffbr t;
    private final ffbr u;

    public awmi(errl errlVar, errl errlVar2, errl errlVar3, ckju ckjuVar, ffbr ffbrVar, chco chcoVar, ffbr ffbrVar2, ckni ckniVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, bdtd bdtdVar, ckac ckacVar, djsi djsiVar, djrk djrkVar, ffbr ffbrVar6, aolr aolrVar, ffbr ffbrVar7, Set set, ffbr ffbrVar8) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = errlVar3;
        this.e = ckjuVar;
        this.f = ffbrVar;
        this.o = chcoVar;
        this.g = ffbrVar2;
        this.p = ckniVar;
        this.h = ffbrVar3;
        this.i = ffbrVar5;
        this.j = ffbrVar4;
        this.k = bdtdVar;
        this.q = ckacVar;
        this.r = djsiVar;
        this.s = djrkVar;
        this.t = ffbrVar6;
        this.l = aolrVar;
        this.u = ffbrVar7;
        this.m = set;
        this.n = ffbrVar8;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.awkh a(final defpackage.awui r21, defpackage.bseh r22) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awmi.a(awui, bseh):awkh");
    }

    public final aztg b(awui awuiVar, final bseh bsehVar) {
        Optional map = this.r.i(this.s.a(awuiVar.d)).map(new Function() { // from class: awlv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((djrq) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bdtd bdtdVar = this.k;
        bdtdVar.getClass();
        return (aztg) map.map(new Function() { // from class: awlw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bdtd.this.g(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: awlx
            @Override // java.util.function.Supplier
            public final Object get() {
                ensk j = awmi.a.j();
                j.Y(ente.a, "BugleGroupManagement");
                enrr enrrVar = (enrr) j;
                ensn ensnVar = csux.p;
                bseh bsehVar2 = bsehVar;
                enrrVar.Y(ensnVar, bsehVar2.C());
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getConversationSubscription", 740, "IncomingRcsGroupNotificationConversationGetter.java")).q("Cannot find subscription for group notification self identity, falling back to existing subscription");
                String S = bsehVar2.S();
                S.getClass();
                aztg f = awmi.this.k.f(aqvf.b(S));
                f.getClass();
                return f;
            }
        });
    }

    public final ckjy c(awvy awvyVar, engw engwVar) {
        ckjy w = ckjz.w();
        w.j(true);
        w.p(false);
        w.q(true);
        w.w(epby.GROUP_NOTIFICATION);
        w.u(awvyVar.d);
        awui awuiVar = awvyVar.f;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        w.s(awuiVar.d);
        awwy awwyVar = awvyVar.i;
        if (awwyVar == null) {
            awwyVar = awwy.a;
        }
        w.n(awwyVar.c);
        w.r(engwVar);
        awui awuiVar2 = awvyVar.l;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        w.l(Optional.of(awuiVar2));
        w.t(d(awvyVar));
        return w;
    }

    public final cknh d(awvy awvyVar) {
        cknf cknfVar = new cknf(0L);
        for (awvh awvhVar : new eygk(awvyVar.g, awvy.a)) {
            ckng ckngVar = (ckng) this.p.fP(awvhVar);
            if (ckngVar == null) {
                ensk e = a.e();
                e.Y(ente.a, "BugleGroupManagement");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getRcsGroupCapability", 686, "IncomingRcsGroupNotificationConversationGetter.java")).t("Received a server capability not supported by the client: %s", awvhVar.name());
            } else {
                cknfVar.c(ckngVar);
            }
        }
        return cknfVar.a();
    }

    public final elfl e(final awvy awvyVar, final engw engwVar) {
        return elfo.g(new Callable() { // from class: awlr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ckjz D;
                awmi awmiVar = awmi.this;
                boolean a2 = ((atzy) awmiVar.n.b()).a();
                awvy awvyVar2 = awvyVar;
                engw engwVar2 = engwVar;
                if (a2) {
                    awwa awwaVar = awvyVar2.j;
                    if (awwaVar == null) {
                        awwaVar = awwa.a;
                    }
                    Uri parse = Uri.parse(awwaVar.c);
                    ckjy c = awmiVar.c(awvyVar2, engwVar2);
                    ((ckhq) c).b = Optional.of(parse);
                    D = c.D();
                } else {
                    D = awmiVar.c(awvyVar2, engwVar2).D();
                }
                ConversationIdType a3 = awmiVar.e.a(D);
                if (!a3.b()) {
                    return a3;
                }
                ensk j = awmi.a.j();
                j.Y(ente.a, "BugleGroupManagement");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "findOrCreateRcsConversation", 385, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupFullState notification.");
                return null;
            }
        }, this.d);
    }

    public final elfl f(awui awuiVar, String str) {
        ckjy w = ckjz.w();
        w.j(false);
        w.p(false);
        w.q(true);
        w.w(epby.GROUP_NOTIFICATION);
        w.u(str);
        final elfl d = this.e.d(w.D());
        final elfl e = elfo.e(awuiVar);
        return elfo.m(d, e).a(new Callable() { // from class: awmh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConversationIdType conversationIdType = (ConversationIdType) erqt.q(d);
                final awui awuiVar2 = (awui) erqt.q(e);
                if (!conversationIdType.b()) {
                    final awmi awmiVar = awmi.this;
                    return (awkh) bsom.k(conversationIdType, new Function() { // from class: awls
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return awmi.this.a(awuiVar2, (bseh) obj);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
                ensk j = awmi.a.j();
                j.Y(ente.a, "BugleGroupManagement");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getExistingConversation", 304, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation for an incoming GroupEvent notification.");
                return null;
            }
        }, this.c);
    }

    public final elfl g(final ConversationIdType conversationIdType) {
        return this.o.a().i(new eroh() { // from class: awlt
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                try {
                    return elfo.e(((avkc) awmi.this.g.b()).a((String) obj, false));
                } catch (IllegalArgumentException e) {
                    return elfo.d(new awnb(e));
                }
            }
        }, this.c).i(new eroh() { // from class: awly
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return awmi.this.h((awui) obj, conversationIdType);
            }
        }, this.b);
    }

    public final elfl h(final awui awuiVar, final ConversationIdType conversationIdType) {
        return elfo.g(new Callable() { // from class: awll
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final awmi awmiVar = awmi.this;
                final awui awuiVar2 = awuiVar;
                Function function = new Function() { // from class: awln
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bseh bsehVar = (bseh) obj;
                        if (bsehVar == null) {
                            return null;
                        }
                        return awmi.this.a(awuiVar2, bsehVar);
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                };
                ConversationIdType conversationIdType2 = conversationIdType;
                awkh awkhVar = (awkh) bsom.j(conversationIdType2, function);
                if (awkhVar != null) {
                    return awkhVar;
                }
                ensk j = awmi.a.j();
                j.Y(ente.a, "BugleGroupManagement");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IncomingRcsGroupNotificationConversationGetter", "getGroupConversationMetadata", 252, "IncomingRcsGroupNotificationConversationGetter.java")).q("Failed to retrieve conversation to create GroupConversationMetadata.");
                throw new awmj(String.format("Cannot find conversation bind data to create GroupConversationMetadata. Bugle conversation ID: %s", conversationIdType2));
            }
        }, this.c);
    }

    public final boolean i(awvy awvyVar) {
        if (!((asqj) this.t.b()).a()) {
            return false;
        }
        awwj awwjVar = awvyVar.m;
        if (awwjVar == null) {
            awwjVar = awwj.a;
        }
        return awwjVar.c;
    }

    public final boolean j() {
        return ((asqj) this.t.b()).a() && !((Boolean) this.u.b()).booleanValue();
    }
}
