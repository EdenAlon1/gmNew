package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canq {
    private static final cskc a = cskc.g("BugleDatabase", "SurroundingTombstoneUpdater");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;

    public canq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
    }

    private final MessageCoreData d(MessageCoreData messageCoreData) {
        return ((bdmq) this.b.b()).j(messageCoreData.z(), messageCoreData.o());
    }

    private static final csjb e() {
        return a.c();
    }

    public final void a(MessageCoreData messageCoreData, caof caofVar, long j) {
        boolean z;
        cskc cskcVar = a;
        csjb a2 = cskcVar.a();
        a2.I("insertOrUpdateTombstoneAtConversationBottomIfNeeded");
        a2.y("protocolSwitchTombstone status", caofVar.h);
        a2.A("protocol", caofVar.a());
        a2.r();
        if (caofVar.a() != camy.d || bzwf.g()) {
            MessageCoreData a3 = ((bzqb) this.c.b()).a(messageCoreData.z(), messageCoreData.B());
            if (a3 == null) {
                csjb a4 = cskcVar.a();
                a4.I("Found a conversation with no latest message");
                a4.A("conversationId", messageCoreData.z());
                a4.r();
                csjb e = e();
                e.I("inserting a new group tombstone");
                e.A("conversationId", messageCoreData.z());
                e.r();
                ffbz ffbzVar = caoc.a;
                camy b = camx.b(messageCoreData);
                b.getClass();
                int ordinal = b.ordinal();
                caoc caocVar = null;
                if (ordinal != 0 && ordinal != 1) {
                    if (ordinal == 2) {
                        caocVar = caoc.b;
                    } else {
                        if (ordinal != 3) {
                            throw new ffcd();
                        }
                        caocVar = caoc.c;
                    }
                }
                if (caocVar == null) {
                    return;
                }
                List L = ((bczy) this.d.b()).L(messageCoreData.z());
                L.getClass();
                ((cbvt) this.e.b()).o(Optional.empty(), messageCoreData.z(), L, caocVar.g, messageCoreData.o() - 1);
                return;
            }
            canr a5 = ((cans) this.g.b()).a(a3);
            csjb a6 = cskcVar.a();
            a6.I("latest message found");
            Class<?> cls = a5.getClass();
            int i = fflc.a;
            a6.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new ffkb(cls).c());
            a6.y("status", a5.a().k());
            a6.A("protocol", a5.b());
            a6.r();
            if (a5.b() == caofVar.a() && !(a5 instanceof camz)) {
                csjb a7 = cskcVar.a();
                a7.I("protocols are matching. returning");
                a7.r();
                return;
            }
            if (a5 instanceof canp) {
                canp canpVar = (canp) a5;
                boolean z2 = canpVar.b() == camy.d;
                csjb e2 = e();
                e2.I("latest message is protocol switch tombstone. Deleting and updating current latest message.");
                e2.r();
                ((canw) this.f.b()).a(canpVar.a);
                z = z2;
                a3 = ((bzqb) this.c.b()).a(messageCoreData.z(), messageCoreData.B());
            } else {
                z = false;
            }
            if (a3 == null) {
                csjb e3 = e();
                e3.I("Couldn't find latest message. Inserting a new protocol switch tombstone");
                e3.A("tombstone status", caofVar.a());
                e3.r();
                canw canwVar = (canw) this.f.b();
                ConversationIdType z3 = messageCoreData.z();
                z3.getClass();
                canwVar.b(z3, caofVar.h, j, Boolean.valueOf(z));
                return;
            }
            canr a8 = ((cans) this.g.b()).a(a3);
            csjb a9 = cskcVar.a();
            a9.I("current latest message");
            a9.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new ffkb(a8.getClass()).c());
            a9.y("status", a8.a().k());
            a9.A("protocol", a8.b());
            a9.r();
            if (a8 instanceof camz) {
                csjb e4 = e();
                e4.I("current latest message is new conversation tombstone. Attempting to update the tombstone");
                e4.r();
                camz camzVar = (camz) a8;
                caoc c = camzVar.c(camx.b(messageCoreData));
                if (c != null) {
                    ((canw) this.f.b()).d(camzVar.a, c.g);
                }
                if (((aspc) this.h.b()).a() && caofVar.a() == camy.b && camzVar.b() == camy.d) {
                    canw canwVar2 = (canw) this.f.b();
                    ConversationIdType z4 = messageCoreData.z();
                    z4.getClass();
                    canwVar2.b(z4, caofVar.h, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            if (!((aspc) this.h.b()).a()) {
                if (a8.b() != caofVar.a()) {
                    csjb e5 = e();
                    e5.I("current latest message protocol is different from the target protocol");
                    e5.A("latest message protocol", a8.b());
                    e5.A("target tombstone status", caofVar.a());
                    e5.r();
                    canw canwVar3 = (canw) this.f.b();
                    ConversationIdType z5 = messageCoreData.z();
                    z5.getClass();
                    canwVar3.b(z5, caofVar.h, j, Boolean.valueOf(z));
                    return;
                }
                return;
            }
            camy b2 = a8.b();
            camy a10 = caofVar.a();
            camy camyVar = camy.b;
            boolean z6 = b2 == camyVar && a10 == camy.c;
            boolean z7 = b2 == camy.c && a10 == camyVar;
            if (z6 || z7 || b2 == a10) {
                return;
            }
            csjb e6 = e();
            e6.I("current latest message protocol is different from the target protocol");
            e6.A("latest message protocol", a8.b());
            e6.A("target tombstone status", caofVar.a());
            e6.r();
            canw canwVar4 = (canw) this.f.b();
            ConversationIdType z8 = messageCoreData.z();
            z8.getClass();
            canwVar4.b(z8, caofVar.h, j, Boolean.valueOf(z));
        }
    }

    public final void b(MessageCoreData messageCoreData) {
        csjb e = e();
        e.I("Update previous tombstone");
        e.r();
        MessageCoreData k = ((bdmq) this.b.b()).k(messageCoreData.z(), messageCoreData.o());
        if (k == null) {
            return;
        }
        canr a2 = ((cans) this.g.b()).a(k);
        csjb e2 = e();
        e2.I("updatePreviousTombstone: tombstone");
        Class<?> cls = a2.getClass();
        int i = fflc.a;
        e2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new ffkb(cls).c());
        e2.y("status", a2.a().k());
        e2.A("protocol", a2.b());
        e2.r();
        if (!(a2 instanceof camz)) {
            if (a2 instanceof canp) {
                canp canpVar = (canp) a2;
                MessageCoreData d = d(messageCoreData);
                if (d != null) {
                    if (cant.a(d.k()) || canpVar.b() != camx.b(d)) {
                        ((canw) this.f.b()).a(canpVar.a);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        camz camzVar = (camz) a2;
        a.m("updateNewConversationTombstoneBasedOnCurrentOrNextMessage");
        cans cansVar = (cans) this.g.b();
        MessageCoreData d2 = d(messageCoreData);
        if (d2 != null) {
            messageCoreData = d2;
        }
        canr a3 = cansVar.a(messageCoreData);
        if (a3.b() != camy.d || bzwf.g()) {
            if (a3 instanceof canp) {
                canp canpVar2 = (canp) a3;
                csjb e3 = e();
                e3.I("updateProtocolForNewConversationTombstoneToMatchProtocolSwitchTombstone");
                e3.A("protocolSwitchTombstone protocol", canpVar2.b());
                e3.A("newConversationTombstone protocol", camzVar.b());
                e3.r();
                caoc c = camzVar.c(canpVar2.b());
                if (c != null) {
                    ((canw) this.f.b()).d(camzVar.a, c.g);
                }
                ((canw) this.f.b()).a(canpVar2.a);
                return;
            }
            if (a3 instanceof cana) {
                cana canaVar = (cana) a3;
                csjb e4 = e();
                e4.I("updateProtocolForNewConversationTombstoneToMatchNonTombstoneMessage");
                e4.A("nonTombstone protocol", canaVar.b());
                e4.A("newConversationTombstone protocol", camzVar.b());
                e4.r();
                caoc c2 = camzVar.c(camx.b(canaVar.a));
                if (c2 == null || camzVar.b() == c2.a()) {
                    return;
                }
                ((canw) this.f.b()).d(camzVar.a, c2.g);
            }
        }
    }
}
