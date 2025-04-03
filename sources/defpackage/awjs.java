package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awjs implements awks {
    public static final entd a = entd.c("BugleGroupManagement");
    public final ckni b;
    public final awkr c;
    private final errl d;
    private final awmi e;

    public awjs(errl errlVar, awmi awmiVar, ckni ckniVar, awkr awkrVar) {
        this.d = errlVar;
        this.e = awmiVar;
        this.b = ckniVar;
        this.c = awkrVar;
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, awxc awxcVar) {
        final awvf awvfVar = awxcVar.f;
        if (awvfVar == null) {
            awvfVar = awvf.a;
        }
        return this.e.g(conversationIdType).h(new emwl() { // from class: awjr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awjs awjsVar;
                ConversationIdType conversationIdType2;
                awkh awkhVar = (awkh) obj;
                cknf a2 = awkhVar.h().a();
                awvf awvfVar2 = awvfVar;
                Iterator<E> it = awvfVar2.b.iterator();
                while (true) {
                    awjsVar = awjs.this;
                    if (!it.hasNext()) {
                        break;
                    }
                    awtp awtpVar = (awtp) it.next();
                    ckni ckniVar = awjsVar.b;
                    awvh b = awvh.b(awtpVar.c);
                    if (b == null) {
                        b = awvh.UNKNOWN_TYPE;
                    }
                    ckng ckngVar = (ckng) ckniVar.fP(b);
                    if (ckngVar == null) {
                        ensz enszVar = (ensz) awjs.a.n().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "addCapabilitiesToBuilder", 103, "CapabilitiesGroupMetadataProcessor.java");
                        awvh b2 = awvh.b(awtpVar.c);
                        if (b2 == null) {
                            b2 = awvh.UNKNOWN_TYPE;
                        }
                        enszVar.t("Received a server capability not supported by the client: %s", b2.name());
                    } else {
                        a2.c(ckngVar);
                    }
                }
                for (awyf awyfVar : awvfVar2.c) {
                    ckni ckniVar2 = awjsVar.b;
                    awvh b3 = awvh.b(awyfVar.c);
                    if (b3 == null) {
                        b3 = awvh.UNKNOWN_TYPE;
                    }
                    ckng ckngVar2 = (ckng) ckniVar2.fP(b3);
                    if (ckngVar2 == null) {
                        ensz enszVar2 = (ensz) awjs.a.n().h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "removeCapabilitiesFromBuilder", 120, "CapabilitiesGroupMetadataProcessor.java");
                        awvh b4 = awvh.b(awyfVar.c);
                        if (b4 == null) {
                            b4 = awvh.UNKNOWN_TYPE;
                        }
                        enszVar2.t("Received a server capability not supported by the client: %s", b4.name());
                    } else {
                        a2.b(ckngVar2);
                    }
                }
                cknh a3 = a2.a();
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("CapabilitiesG/roupMetadataProcessor#process");
                bsoeVar.al();
                bsoeVar.O(a3);
                bsoeVar.f(awkhVar.f());
                ensk n = awjs.a.n();
                n.Y(csux.r, awkhVar.i());
                n.Y(csux.o, awkhVar.f().toString());
                n.Y(csux.J, awkhVar.n());
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/CapabilitiesGroupMetadataProcessor", "process", 81, "CapabilitiesGroupMetadataProcessor.java")).D("RCS group capabilities updated. Previous capabilities: %s. New capabilities; %s", awkhVar.h().c(), a3.c());
                awkr awkrVar = awjsVar.c;
                Iterator<E> it2 = awvfVar2.b.iterator();
                while (true) {
                    conversationIdType2 = conversationIdType;
                    if (!it2.hasNext()) {
                        break;
                    }
                    int i = ((awtp) it2.next()).c;
                    awvh b5 = awvh.b(i);
                    if (b5 == null) {
                        b5 = awvh.UNKNOWN_TYPE;
                    }
                    if (b5 == awvh.REMOVE_PARTICIPANT_BY_ALL) {
                        awkrVar.a.a(conversationIdType2, 3);
                    } else {
                        awvh b6 = awvh.b(i);
                        if (b6 == null) {
                            b6 = awvh.UNKNOWN_TYPE;
                        }
                        if (b6 == awvh.REMOVE_PARTICIPANT_BY_ADMIN) {
                            awkrVar.a.a(conversationIdType2, 4);
                        }
                    }
                }
                Iterator<E> it3 = awvfVar2.c.iterator();
                while (it3.hasNext()) {
                    int i2 = ((awyf) it3.next()).c;
                    awvh b7 = awvh.b(i2);
                    if (b7 == null) {
                        b7 = awvh.UNKNOWN_TYPE;
                    }
                    if (b7 != awvh.REMOVE_PARTICIPANT_BY_ALL) {
                        awvh b8 = awvh.b(i2);
                        if (b8 == null) {
                            b8 = awvh.UNKNOWN_TYPE;
                        }
                        if (b8 == awvh.REMOVE_PARTICIPANT_BY_ADMIN) {
                        }
                    }
                    awkrVar.a.a(conversationIdType2, 2);
                }
                return ceyt.i();
            }
        }, this.d);
    }
}
