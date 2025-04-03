package defpackage;

import com.google.android.rcs.client.messaging.GetMessagesRequest;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clfi implements clfq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy");
    public final errl b;
    public final avkh c;
    public final clja d;
    public final clhd e;
    private final errl f;
    private final errl g;
    private final ctzw h;
    private final BiFunction i;
    private final clfb j;

    public clfi(errl errlVar, errl errlVar2, errl errlVar3, avkh avkhVar, clja cljaVar, ctzw ctzwVar, BiFunction biFunction, clfb clfbVar, clhd clhdVar) {
        this.f = errlVar;
        this.g = errlVar2;
        this.c = avkhVar;
        this.d = cljaVar;
        this.b = errlVar3;
        this.h = ctzwVar;
        this.i = biFunction;
        this.j = clfbVar;
        this.e = clhdVar;
    }

    @Override // defpackage.clfq
    public final elfl a(axad axadVar) {
        return this.j.a(this.h.a(this.i, RcsMessagingService.class).h(new emwl() { // from class: clfc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((RcsMessagingService) obj).getMessages(GetMessagesRequest.a);
            }
        }, this.g).i(new eroh() { // from class: clfd
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                GetMessagesResponse getMessagesResponse = (GetMessagesResponse) obj;
                if (!MessagingResult.d.equals(getMessagesResponse.a())) {
                    ensk j = clfi.a.j();
                    j.Y(ente.a, "BugleRcs");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 90, "GetAllMessagesStrategy.java")).q("Fetching incoming RCS messages failed");
                    return elfo.e(null);
                }
                clfi clfiVar = clfi.this;
                engw b = getMessagesResponse.b();
                clfiVar.e.b(b.size());
                if (b.isEmpty()) {
                    ensk j2 = clfi.a.j();
                    j2.Y(ente.a, "BugleRcs");
                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 97, "GetAllMessagesStrategy.java")).q("Fetching incoming RCS messages successful but no messages returned from GetAllMessagesStrategy");
                    return elfo.e(null);
                }
                engr engrVar = new engr();
                engw b2 = getMessagesResponse.b();
                int size = b2.size();
                for (int i = 0; i < size; i++) {
                    MessageNotification messageNotification = (MessageNotification) b2.get(i);
                    final bdhg a2 = bdhg.a(messageNotification.b().h());
                    elfl a3 = clfiVar.d.a(messageNotification);
                    final avkh avkhVar = clfiVar.c;
                    avkhVar.getClass();
                    engrVar.h(a3.i(new eroh() { // from class: clff
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            return avkh.this.e((awxk) obj2);
                        }
                    }, clfiVar.b).h(new emwl() { // from class: clfg
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            awud awudVar = (awud) obj2;
                            awuc awucVar = awuc.OK;
                            awuc b3 = awuc.b(awudVar.c);
                            if (b3 == null) {
                                b3 = awuc.UNKNOWN_STATUS;
                            }
                            bdhg bdhgVar = bdhg.this;
                            if (awucVar.equals(b3)) {
                                ensk e = clfi.a.e();
                                e.Y(ente.a, "BugleRcs");
                                enrr enrrVar = (enrr) e;
                                enrrVar.Y(csux.e, bdhgVar.toString());
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "maybeLogResults", 149, "GetAllMessagesStrategy.java")).q("Processing incoming RCS message success");
                                return null;
                            }
                            ensk j3 = clfi.a.j();
                            j3.Y(ente.a, "BugleRcs");
                            enrr enrrVar2 = (enrr) j3;
                            enrrVar2.Y(csux.e, bdhgVar.toString());
                            enrrVar2.Y(awgo.a, awudVar);
                            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "maybeLogResults", 145, "GetAllMessagesStrategy.java")).q("Processing incoming RCS message failed");
                            return null;
                        }
                    }, clfiVar.b).e(IllegalArgumentException.class, new emwl() { // from class: clfh
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            ensk i2 = clfi.a.i();
                            i2.Y(ente.a, "BugleRcs");
                            enrr enrrVar = (enrr) i2;
                            enrrVar.Y(csux.e, bdhg.this.toString());
                            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "processMessages", 131, "GetAllMessagesStrategy.java")).q("Ignoring invalid incoming RCS message");
                            return null;
                        }
                    }, clfiVar.b));
                }
                return elfo.j(engrVar.g()).b(new erog() { // from class: clfe
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        ensk h = clfi.a.h();
                        h.Y(ente.a, "BugleRcs");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/rcs/messaging/GetAllMessagesStrategy", "postIncomingMessages", 108, "GetAllMessagesStrategy.java")).q("Finished processing incoming RCS messages");
                        return elfo.e(null);
                    }
                }, clfiVar.b);
            }
        }, this.f), "GetMessages");
    }

    @Override // defpackage.clfq
    public final /* synthetic */ void b() {
    }
}
