package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnby implements bdod {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final apct d;

    public cnby(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, apct apctVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        apctVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = apctVar;
    }

    @Override // defpackage.bdod
    public final Object a(MessageCoreData messageCoreData, ffgu ffguVar) {
        if (messageCoreData.t() == 0) {
            messageCoreData.bX(this.d.a().a);
        }
        return messageCoreData;
    }

    @Override // defpackage.bdod
    public final void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        String str;
        String str2;
        cmrx cmrxVar;
        eprt eprtVar;
        messageCoreData.getClass();
        messageIdType.getClass();
        cnbt T = messageCoreData.T();
        if (T != null) {
            ((cnbg) this.a.b()).a(T, messageIdType);
            cmql cmqlVar = (cmql) this.b.b();
            if (messageCoreData.t() == 0) {
                messageCoreData.bX(cmqlVar.d.d(messageCoreData));
            }
            cnbt T2 = messageCoreData.T();
            if (T2 != null) {
                cmrm d = T2.d();
                cmrv b = cmrv.b(T2.c().e);
                if (b == null) {
                    b = cmrv.UNRECOGNIZED;
                }
                boolean z = b == cmrv.CUSTOM;
                cmrl c = T2.c();
                eqfc b2 = messageCoreData.cX() ? clbe.b(messageCoreData.aa()).isPresent() ? cmql.b(d, true, z, cmql.e(c, messageCoreData.aa())) : cmql.a(d, true, z, cmql.d(c, messageCoreData.aa(), messageCoreData.E())) : cmql.c(d, true, z, eqfk.a);
                eppq eppqVar = (eppq) eppr.a.createBuilder();
                eprr eprrVar = (eprr) epru.a.createBuilder();
                switch (T2.f().b) {
                    case 0:
                        cmrxVar = cmrx.UNKNOWN;
                        break;
                    case 1:
                        cmrxVar = cmrx.REACTION_BAR;
                        break;
                    case 2:
                        cmrxVar = cmrx.CUSTOM_REACTION_PICKER;
                        break;
                    case 3:
                        cmrxVar = cmrx.DITTO_REACTION_BAR;
                        break;
                    case 4:
                        cmrxVar = cmrx.REACTION_SUMMARY;
                        break;
                    case 5:
                        cmrxVar = cmrx.EMOTIFY_CREATION;
                        break;
                    case 6:
                        cmrxVar = cmrx.EMOTIFY_PICKER_SELF_OWNED;
                        break;
                    case 7:
                        cmrxVar = cmrx.EMOTIFY_PICKER_AUTO_SAVED;
                        break;
                    case 8:
                        cmrxVar = cmrx.DOUBLE_TAP_TO_REACT;
                        break;
                    case 9:
                        cmrxVar = cmrx.MEDIA_VIEWER_REACTION_PICKER;
                        break;
                    default:
                        cmrxVar = null;
                        break;
                }
                if (cmrxVar == null) {
                    cmrxVar = cmrx.UNRECOGNIZED;
                }
                if (ersy.a("bugle.use_complete_surface_mappings", "bugle")) {
                    eprtVar = cmqk.a(cmrxVar);
                } else {
                    emxf.f(cmql.a.containsKey(cmrxVar), "Reaction surface=%s can't be recognized", cmrxVar.name());
                    eprtVar = cmql.a.get(cmrxVar) != null ? (eprt) cmql.a.get(cmrxVar) : eprt.REACTION_SURFACE_TYPE_UNSPECIFIED;
                }
                eprrVar.copyOnWrite();
                epru epruVar = (epru) eprrVar.instance;
                epruVar.c = eprtVar.k;
                epruVar.b |= 1;
                eppqVar.copyOnWrite();
                eppr epprVar = (eppr) eppqVar.instance;
                epru epruVar2 = (epru) eprrVar.build();
                epruVar2.getClass();
                epprVar.d = epruVar2;
                epprVar.c = 103;
                eprq eprqVar = eprq.a;
                eppqVar.copyOnWrite();
                eppr epprVar2 = (eppr) eppqVar.instance;
                eprqVar.getClass();
                epprVar2.f = eprqVar;
                epprVar2.e = 209;
                engw r = engw.r((eppr) eppqVar.build());
                alde aldeVar = cmqlVar.b;
                long t = messageCoreData.t();
                int a = alee.a(messageCoreData);
                int d2 = cmqlVar.c.a(T2.f().c).d();
                r.getClass();
                aldeVar.b(t, a, d2, r, b2, null);
            }
            if (messageCoreData.cB()) {
                cmqm cmqmVar = (cmqm) this.c.b();
                cmrm d3 = T.d();
                akzt akztVar = cmqmVar.a;
                int ordinal = d3.ordinal();
                if (ordinal == 1) {
                    str2 = "Bugle.MessageReactions.Sent.Add.EncryptedCount";
                } else {
                    if (ordinal != 2) {
                        throw new IllegalArgumentException("Invalid reaction action when logging: " + d3.a());
                    }
                    str2 = "Bugle.MessageReactions.Sent.Remove.EncryptedCount";
                }
                akztVar.c(str2);
            } else {
                cmqm cmqmVar2 = (cmqm) this.c.b();
                cmrv b3 = cmrv.b(T.c().e);
                if (b3 == null) {
                    b3 = cmrv.UNRECOGNIZED;
                }
                cmrm d4 = T.d();
                akzt akztVar2 = cmqmVar2.a;
                int ordinal2 = d4.ordinal();
                if (ordinal2 == 1) {
                    str = "Bugle.MessageReactions.Sent.Add.Type";
                } else {
                    if (ordinal2 != 2) {
                        throw new IllegalArgumentException("Invalid reaction action when logging: " + d4.a());
                    }
                    str = "Bugle.MessageReactions.Sent.Remove.Type";
                }
                akztVar2.e(str, cmqm.a(b3));
            }
            cmqm cmqmVar3 = (cmqm) this.c.b();
            if (cmqmVar3.d(T.c(), T.d(), true)) {
                ((akzt) cmqmVar3.b.b()).c("Bugle.MessageReactions.AnimationEffects.Sent");
            }
        }
    }

    @Override // defpackage.bdod
    public final boolean j() {
        return true;
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
