package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cplz implements cigv {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter");
    public final cplo b;
    public final errl c;
    private final cpev d;
    private final Map e;

    public cplz(Map map, cpev cpevVar, cplo cploVar, errl errlVar) {
        this.d = cpevVar;
        this.b = cploVar;
        this.c = errlVar;
        this.e = map;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Iterable, java.util.Collection] */
    @Override // defpackage.cigv
    public final elfl a(final fbzt fbztVar) {
        elfl c;
        ekzz f = eleg.f("TachygramInboxMessageHandlerAdapter#handleInboxMessage");
        try {
            Map map = this.e;
            fbzs b = fbzs.b(fbztVar.d);
            if (b == null) {
                b = fbzs.UNRECOGNIZED;
            }
            cpln cplnVar = (cpln) map.get(b);
            fbzs b2 = fbzs.b(fbztVar.d);
            if (b2 == null) {
                b2 = fbzs.UNRECOGNIZED;
            }
            b2.a();
            cplnVar.getClass();
            cpqw a2 = cplnVar.a(fbztVar);
            ?? a3 = a2.a();
            fbzs b3 = fbzs.b(fbztVar.d);
            if (b3 == null) {
                b3 = fbzs.UNRECOGNIZED;
            }
            boolean b4 = endu.b(a3, b3);
            fbzs b5 = fbzs.b(fbztVar.d);
            if (b5 == null) {
                b5 = fbzs.UNRECOGNIZED;
            }
            emxf.n(b4, "Tachygram does not support receiving InboxMessage.MessageType: %s", b5.a());
            this.d.g(cpeu.TACHYGRAM_MESSAGE_ARRIVED, fbztVar.c);
            fbztVar.getClass();
            c = axol.c(a2.a, ffhe.a, ffsm.a, new cpqv(a2, fbztVar, null));
            elfl e = c.h(new emwl() { // from class: cplu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk h = cplz.a.h();
                    h.Y(ente.a, "BugleTachygram");
                    enrr enrrVar = (enrr) h;
                    enrrVar.Y(csux.e, fbzt.this.c);
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 96, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Incoming InboxMessage has been processed.");
                    return true;
                }
            }, erpp.a).f(cpnd.class, new eroh() { // from class: cplv
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    cpnd cpndVar = (cpnd) obj;
                    ensk j = cplz.a.j();
                    j.Y(ente.a, "BugleTachygram");
                    enrr enrrVar = (enrr) ((enrr) j).g(cpndVar);
                    fbzt fbztVar2 = fbztVar;
                    enrrVar.Y(csux.e, fbztVar2.c);
                    enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 113, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    ecgh ecghVar = new ecgh(cpndVar.a);
                    fbzs b6 = fbzs.b(fbztVar2.d);
                    if (b6 == null) {
                        b6 = fbzs.UNRECOGNIZED;
                    }
                    enrrVar2.D("Tachygram could not process incoming InboxMessage. Failed with TachygramProcessingException. isPermanent: %s. messageType: %s.", ecghVar, new ecgk(b6));
                    if (cpndVar.a) {
                        return elfo.e(true);
                    }
                    cplz cplzVar = cplz.this;
                    ensk h = cplz.a.h();
                    h.Y(ente.a, "BugleTachygram");
                    enrr enrrVar3 = (enrr) h;
                    enrrVar3.Y(csux.e, fbztVar2.c);
                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "scheduleRetry", 161, "TachygramOneToManyInboxMessageHandlerAdapter.java")).q("Scheduling retry for incoming message.");
                    return ((cevh) cplzVar.b.a.b()).b(ceyr.g("tachygram_inbox_message_retry", fbztVar2)).i(new eroh() { // from class: cpls
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return ((cevg) obj2).b();
                        }
                    }, cplzVar.c).h(new emwl() { // from class: cplt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return null;
                        }
                    }, erpp.a).h(new emwl() { // from class: cply
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return true;
                        }
                    }, erpp.a);
                }
            }, this.c).e(esqb.class, new emwl() { // from class: cplw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk j = cplz.a.j();
                    j.Y(ente.a, "BugleTachygram");
                    enrr enrrVar = (enrr) ((enrr) j).g((esqb) obj);
                    fbzt fbztVar2 = fbzt.this;
                    enrrVar.Y(csux.e, fbztVar2.c);
                    enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 134, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    fbzs b6 = fbzs.b(fbztVar2.d);
                    if (b6 == null) {
                        b6 = fbzs.UNRECOGNIZED;
                    }
                    enrrVar2.t("Tachygram could not process incoming InboxMessage. Permanently failing message due to TachygramException. messageType: %s.", new ecgk(b6));
                    return true;
                }
            }, this.c).e(Throwable.class, new emwl() { // from class: cplx
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    ensk j = cplz.a.j();
                    j.Y(ente.a, "BugleTachygram");
                    enrr enrrVar = (enrr) ((enrr) j).g((Throwable) obj);
                    fbzt fbztVar2 = fbzt.this;
                    enrrVar.Y(csux.e, fbztVar2.c);
                    enrr enrrVar2 = (enrr) enrrVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramOneToManyInboxMessageHandlerAdapter", "handleInboxMessageInSpan", 148, "TachygramOneToManyInboxMessageHandlerAdapter.java");
                    fbzs b6 = fbzs.b(fbztVar2.d);
                    if (b6 == null) {
                        b6 = fbzs.UNRECOGNIZED;
                    }
                    enrrVar2.t("Tachygram could not process incoming InboxMessage. Permanently failing message. messageType %s.", new ecgk(b6));
                    return true;
                }
            }, this.c);
            f.b(e);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
