package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cner implements cndm {
    private final bbfb a;
    private final byzp b;
    private final cqoh c;
    private final cndj d;
    private final cndn e;

    public cner(bbfb bbfbVar, byzp byzpVar, cqoh cqohVar, cndj cndjVar, cndn cndnVar) {
        this.a = bbfbVar;
        this.b = byzpVar;
        this.c = cqohVar;
        this.d = cndjVar;
        this.e = cndnVar;
        if (cndnVar == cndn.SMS_TRANSPORT || cndnVar == cndn.MMS_TRANSPORT) {
            return;
        }
        Objects.toString(cndnVar);
        throw new IllegalStateException("Could not create a sender for ".concat(cndnVar.toString()));
    }

    private final void c(cndi cndiVar, cmrl cmrlVar, cmrm cmrmVar) {
        cmrx cmrxVar;
        long a = this.c.a();
        cndn cndnVar = this.e;
        cndn cndnVar2 = cndn.SMS_TRANSPORT;
        cndh cndhVar = (cndh) cndiVar;
        SelfIdentityId selfIdentityId = cndhVar.c;
        MessageCoreData i = cndnVar == cndnVar2 ? this.b.i(cndhVar.a, selfIdentityId, this.d.a(cmrmVar, cmrlVar, ((cmsw) cndhVar.d).c)) : this.b.g(cndhVar.a, selfIdentityId, this.d.a(cmrmVar, cmrlVar, ((cmsw) cndhVar.d).c), null, false);
        cmrh cmrhVar = (cmrh) cmri.a.createBuilder();
        cmrhVar.copyOnWrite();
        ((cmri) cmrhVar.instance).c = true;
        if (selfIdentityId != null) {
            String b = selfIdentityId.b();
            cmrhVar.copyOnWrite();
            ((cmri) cmrhVar.instance).b = b;
        }
        cmrr cmrrVar = (cmrr) cmrs.a.createBuilder();
        cmrrVar.copyOnWrite();
        cmrs cmrsVar = (cmrs) cmrrVar.instance;
        cmri cmriVar = (cmri) cmrhVar.build();
        cmriVar.getClass();
        cmrsVar.c = cmriVar;
        cmrsVar.b |= 1;
        eyfy build = cmrrVar.build();
        build.getClass();
        ConversationIdType conversationIdType = cndhVar.a;
        cmtd cmtdVar = cndhVar.d;
        cmrs cmrsVar2 = (cmrs) build;
        cmrw cmrwVar = (cmrw) cmry.a.createBuilder();
        cmrwVar.getClass();
        eprt eprtVar = ((cmqi) cndhVar.e).a;
        int ordinal = eprtVar.ordinal();
        if (ordinal == 1) {
            cmrxVar = cmrx.REACTION_BAR;
        } else if (ordinal == 3) {
            cmrxVar = cmrx.DITTO_REACTION_BAR;
        } else {
            if (ordinal != 4) {
                throw new IllegalArgumentException("Could not convert surface type: " + eprtVar.k);
            }
            cmrxVar = cmrx.CUSTOM_REACTION_PICKER;
        }
        MessageIdType messageIdType = ((cmsw) cmtdVar).a;
        cmrz.c(cmrxVar, cmrwVar);
        cmrz.b(cndhVar.b, cmrwVar);
        ((MessageData) i).l = cnbs.a(conversationIdType, messageIdType, cmrlVar, cmrsVar2, cmrmVar, cmrz.a(cmrwVar));
        i.bx(true);
        this.a.d(i, cndhVar.b, eooi.MESSAGE_REACTION, a).t();
    }

    @Override // defpackage.cndm
    public final void a(cndi cndiVar, cmrl cmrlVar) {
        cmrlVar.getClass();
        c(cndiVar, cmrlVar, cmrm.ADD_REACTION);
    }

    @Override // defpackage.cndm
    public final void b(cndi cndiVar, cmrl cmrlVar) {
        cmrlVar.getClass();
        c(cndiVar, cmrlVar, cmrm.REMOVE_REACTION);
    }
}
