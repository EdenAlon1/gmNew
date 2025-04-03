package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canc {
    private static final cskc a = cskc.g("BugleDatabase", "OnDraftTypeChangedGroupProcessor");
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public canc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
    }

    private final void b(int i, camz camzVar) {
        csjb a2 = a.a();
        a2.I("Setting new conversation creation tombstone");
        a2.y("DraftMessageType", i);
        a2.r();
        caoc c = camzVar.c(camx.a(i));
        if (c != null) {
            ((canw) this.d.b()).d(camzVar.a, c.g);
        }
    }

    public final void a(ConversationIdType conversationIdType, int i) {
        canb canbVar;
        MessageCoreData o = ((bdmq) this.b.b()).o(conversationIdType);
        if (o == null) {
            canu canuVar = (canu) this.c.b();
            csjb a2 = canu.a.a();
            a2.I("setConversationCreationTombstone skip insert, no messages in conversation");
            a2.A("conversationId", conversationIdType);
            a2.r();
            canuVar.b.c("Bugle.Etouffee.UI.PredictiveTombstone.Found.Empty.GroupConversation");
            return;
        }
        canr a3 = ((cans) this.e.b()).a(o);
        cskc cskcVar = a;
        csjb a4 = cskcVar.a();
        a4.I("current last message");
        Class<?> cls = a3.getClass();
        int i2 = fflc.a;
        a4.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, new ffkb(cls).c());
        a4.y("status", a3.a().k());
        a4.A("protocol", a3.b());
        a4.r();
        if (a3 instanceof camz) {
            camz camzVar = (camz) a3;
            if (i == 30) {
                b(i, camzVar);
                return;
            }
            if (i == 40) {
                if (bzwf.g()) {
                    b(i, camzVar);
                    return;
                }
                return;
            } else {
                csjb a5 = cskcVar.a();
                a5.I("setConversationCreationTombstone skip insert, non-RCS conversation");
                a5.A("conversationId", camzVar.a.z());
                a5.r();
                return;
            }
        }
        ffbz ffbzVar = caof.a;
        caof a6 = caoe.a(camx.a(i));
        if (a6 == null) {
            csjb a7 = cskcVar.a();
            a7.I("draftMessageType is not supported");
            a7.y("draftMessageType", i);
            a7.A("conversationId", a3.a().z());
            a7.r();
            return;
        }
        if (a6 != caof.e || bzwf.g()) {
            if ((a3 instanceof cana) || (a3 instanceof camp) || (a3 instanceof camw)) {
                if (a6.a() == a3.b()) {
                    csjb a8 = cskcVar.a();
                    a8.I("Skipping tombstone insertion, both current and new tombstones are equal");
                    a8.A("current message protocol", a3.b());
                    a8.y("newTombstone", a6.h);
                    a8.r();
                    return;
                }
                csjb a9 = cskcVar.a();
                a9.I("Inserting new tombstone, last message is different from current draft type");
                a9.A("current message protocol", a3.b());
                a9.y("newTombstone", a6.h);
                a9.r();
                canw canwVar = (canw) this.d.b();
                ConversationIdType z = a3.a().z();
                z.getClass();
                canwVar.b(z, a6.h, a3.a().o() + 1, null);
                return;
            }
            if (a3 instanceof canp) {
                canp canpVar = (canp) a3;
                if (a6.a() == canpVar.b()) {
                    canbVar = canb.a;
                } else {
                    MessageCoreData r = ((bdmq) this.b.b()).r(canpVar.a.z());
                    canbVar = r == null ? canb.b : a6.a() == new cana(r).b() ? canb.c : canb.d;
                }
                csjb a10 = cskcVar.a();
                a10.I("insertOrUpdateProtocolSwitchTombstone");
                a10.A("scenario", canbVar);
                a10.r();
                int ordinal = canbVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        csjb a11 = cskcVar.a();
                        a11.I("setProtocolChangeTombstone found no messages before last tombstone; updating tombstone");
                        a11.y("newTombstoneStatus", a6.h);
                        a11.r();
                        ((canw) this.d.b()).d(canpVar.a, a6.h);
                        return;
                    }
                    if (ordinal == 2) {
                        ((canw) this.d.b()).a(canpVar.a);
                    } else {
                        if (ordinal != 3) {
                            throw new ffcd();
                        }
                        ((canw) this.d.b()).d(canpVar.a, a6.h);
                    }
                }
            }
        }
    }
}
