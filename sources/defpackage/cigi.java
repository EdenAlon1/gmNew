package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cigi implements cifa {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate");
    public final errl b;
    public final errl c;
    public final ffbr d;
    public final aolr e;
    public final cowz f;
    public final avkm g;
    public final ffbr h;
    public final cqoh i;
    public final ffbr j;

    public cigi(errl errlVar, errl errlVar2, ffbr ffbrVar, aolr aolrVar, cowz cowzVar, avkm avkmVar, ffbr ffbrVar2, cqoh cqohVar, ffbr ffbrVar3) {
        this.b = errlVar;
        this.c = errlVar2;
        this.d = ffbrVar;
        this.e = aolrVar;
        this.f = cowzVar;
        this.g = avkmVar;
        this.h = ffbrVar2;
        this.i = cqohVar;
        this.j = ffbrVar3;
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl a(ciff ciffVar) {
        return ciez.a(this, ciffVar);
    }

    @Override // defpackage.cifg
    public final /* synthetic */ elfl b(ciff ciffVar, eyhs eyhsVar) {
        return elfo.c();
    }

    @Override // defpackage.cifg
    public final /* bridge */ /* synthetic */ eyhs c(eyee eyeeVar) {
        return (esdc) eyfy.parseFrom(esdc.a, eyeeVar, eyfc.a());
    }

    @Override // defpackage.cifa
    public final /* bridge */ /* synthetic */ elfl d(ciff ciffVar, eyhs eyhsVar) {
        final esdc esdcVar = (esdc) eyhsVar;
        if ((esdcVar.b & 1) != 0) {
            return elfo.g(new Callable() { // from class: cigc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bczy bczyVar = (bczy) cigi.this.d.b();
                    esda esdaVar = esdcVar.c;
                    if (esdaVar == null) {
                        esdaVar = esda.a;
                    }
                    return bczyVar.r(bdgq.b(esdaVar.c));
                }
            }, this.b).i(new eroh() { // from class: cigd
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final bseh bsehVar = (bseh) obj;
                    if (bsehVar == null) {
                        ensk e = cigi.a.e();
                        e.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleRequestInternalForOptionalResponse", 113, "TypingUpdateDelegate.java")).q("Cannot find conversation for typing indicator.");
                        return elfo.e(Optional.empty());
                    }
                    final esdc esdcVar2 = esdcVar;
                    final cigi cigiVar = cigi.this;
                    csta cstaVar = (csta) cigiVar.j.b();
                    escu escuVar = esdcVar2.d;
                    if (escuVar == null) {
                        escuVar = escu.a;
                    }
                    Optional a2 = cstaVar.a(escuVar);
                    if (!a2.isEmpty()) {
                        final int intValue = ((Integer) a2.get()).intValue();
                        return elfo.g(new Callable() { // from class: cigf
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ensk e2 = cigi.a.e();
                                e2.Y(ente.a, "BugleNetwork");
                                enrr enrrVar = (enrr) e2;
                                int i = intValue;
                                enrrVar.Y(csux.t, Integer.valueOf(i));
                                enrrVar.Y(csux.p, bsehVar.C());
                                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 145, "TypingUpdateDelegate.java")).q("Checking whether current subscription ID supports sending typing indicators.");
                                return Boolean.valueOf(cigi.this.f.b(i));
                            }
                        }, cigiVar.b).i(new eroh() { // from class: cigg
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                final bseh bsehVar2 = bsehVar;
                                if (!booleanValue) {
                                    ensk j = cigi.a.j();
                                    j.Y(ente.a, "BugleNetwork");
                                    enrr enrrVar = (enrr) j;
                                    enrrVar.Y(csux.p, bsehVar2.C());
                                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 157, "TypingUpdateDelegate.java")).q("Not sending typing indicator because typing indicator should not be shared for the subscription ID.");
                                    return elfo.e(Optional.empty());
                                }
                                final cigi cigiVar2 = cigi.this;
                                if (bsehVar2.k() != 2) {
                                    String aa = bsehVar2.aa();
                                    if (!emxe.c(aa)) {
                                        return elfo.e(Optional.of(new avkl(((avkc) cigiVar2.h.b()).a(aa, false))));
                                    }
                                    ensk j2 = cigi.a.j();
                                    j2.Y(ente.a, "BugleNetwork");
                                    enrr enrrVar2 = (enrr) j2;
                                    enrrVar2.Y(csux.p, bsehVar2.C());
                                    ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getRecipientsDescriptor", 198, "TypingUpdateDelegate.java")).q("Not sending typing indicator because the other participant does not have a valid normalized destination");
                                    return elfo.e(Optional.empty());
                                }
                                final String ad = bsehVar2.ad();
                                if (emxe.c(ad)) {
                                    ensk j3 = cigi.a.j();
                                    j3.Y(ente.a, "BugleNetwork");
                                    enrr enrrVar3 = (enrr) j3;
                                    enrrVar3.Y(csux.p, bsehVar2.C());
                                    ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 220, "TypingUpdateDelegate.java")).q("Not sending typing indicator because RCS group id is missing");
                                    return elfo.e(Optional.empty());
                                }
                                final String ac = bsehVar2.ac();
                                if (!emxe.c(ac)) {
                                    return elfo.g(new Callable() { // from class: cige
                                        /* JADX WARN: Multi-variable type inference failed */
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            String str;
                                            int i = engw.d;
                                            engr engrVar = new engr();
                                            cigi cigiVar3 = cigi.this;
                                            bczy bczyVar = (bczy) cigiVar3.d.b();
                                            bseh bsehVar3 = bsehVar2;
                                            enqv it = ((engw) bczyVar.L(bsehVar3.C())).iterator();
                                            while (true) {
                                                str = ad;
                                                if (!it.hasNext()) {
                                                    break;
                                                }
                                                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                                                if (emxe.c(bindData.U())) {
                                                    ensk j4 = cigi.a.j();
                                                    j4.Y(ente.a, "BugleNetwork");
                                                    enrr enrrVar4 = (enrr) j4;
                                                    enrrVar4.Y(csux.p, bsehVar3.C());
                                                    enrrVar4.Y(csux.J, str);
                                                    ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 246, "TypingUpdateDelegate.java")).q("Ignoring participant with invalid normalized destination while sending typing indicator");
                                                } else {
                                                    engrVar.h(cigiVar3.e.q(bindData));
                                                }
                                            }
                                            engw g = engrVar.g();
                                            if (!g.isEmpty()) {
                                                return Optional.of(cigiVar3.g.c(str, ac, g));
                                            }
                                            ensk j5 = cigi.a.j();
                                            j5.Y(ente.a, "BugleNetwork");
                                            enrr enrrVar5 = (enrr) j5;
                                            enrrVar5.Y(csux.p, bsehVar3.C());
                                            enrrVar5.Y(csux.J, str);
                                            ((enrr) enrrVar5.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 262, "TypingUpdateDelegate.java")).q("Not sending typing indicator because no valid participant found in the conference");
                                            return Optional.empty();
                                        }
                                    }, cigiVar2.b);
                                }
                                ensk j4 = cigi.a.j();
                                j4.Y(ente.a, "BugleNetwork");
                                enrr enrrVar4 = (enrr) j4;
                                enrrVar4.Y(csux.p, bsehVar2.C());
                                enrrVar4.Y(csux.J, ad);
                                ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "getGroupRecipientsDescriptor", 230, "TypingUpdateDelegate.java")).q("Not sending typing indicator because RCS conference URI is missing");
                                return elfo.e(Optional.empty());
                            }
                        }, cigiVar.c).i(new eroh() { // from class: cigh
                            @Override // defpackage.eroh
                            public final ListenableFuture a(Object obj2) {
                                Optional optional = (Optional) obj2;
                                if (optional.isEmpty()) {
                                    return elfo.e(Optional.empty());
                                }
                                esdc esdcVar3 = esdcVar2;
                                cigi cigiVar2 = cigi.this;
                                esda esdaVar = esdcVar3.c;
                                if (esdaVar == null) {
                                    esdaVar = esda.a;
                                }
                                return cigiVar2.f.a(esdaVar.e ? cowy.ACTIVE : cowy.IDLE, (avkl) optional.get(), cigiVar2.i.f(), intValue).h(new emwl() { // from class: cigb
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj3) {
                                        return Optional.empty();
                                    }
                                }, erpp.a);
                            }
                        }, cigiVar.c);
                    }
                    ensk j = cigi.a.j();
                    j.Y(ente.a, "BugleNetwork");
                    enrr enrrVar = (enrr) j;
                    enrrVar.Y(csux.p, bsehVar.C());
                    ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleTypingUpdatesWithChatApi", 133, "TypingUpdateDelegate.java")).q("Not sending typing indicator because the subscription ID was DEFAULT_SELF_SUB_ID");
                    return elfo.e(Optional.empty());
                }
            }, this.c);
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/handler/ditto/TypingUpdateDelegate", "handleRequestInternalForOptionalResponse", 98, "TypingUpdateDelegate.java")).q("TypingUpdatesRequest does not have typing event.");
        return elfo.e(Optional.empty());
    }
}
