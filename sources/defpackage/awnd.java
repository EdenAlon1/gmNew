package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnd implements awks {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor");
    public final ckss b;
    private final awmi c;
    private final errl d;

    public awnd(ckss ckssVar, awmi awmiVar, errl errlVar) {
        this.b = ckssVar;
        this.c = awmiVar;
        this.d = errlVar;
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, awxc awxcVar) {
        final awxa awxaVar = awxcVar.g;
        if (awxaVar == null) {
            awxaVar = awxa.a;
        }
        if (awxa.a.equals(awxaVar)) {
            ensk e = a.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, conversationIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor", "process", 54, "SubjectGroupMetadataProcessor.java")).q("No changes to the subject in the group notification");
            return elfo.e(ceyt.i());
        }
        boolean z = true;
        if (awxaVar.d && !awxaVar.c.isEmpty()) {
            z = false;
        }
        emxf.b(z, "When the subject deleted flag is true the subject field must be empty");
        return this.c.g(conversationIdType).i(new eroh() { // from class: awnc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                awkh awkhVar = (awkh) obj;
                ensk e2 = awnd.a.e();
                e2.Y(ente.a, "BugleGroupManagement");
                enrr enrrVar2 = (enrr) e2;
                ensn ensnVar = csux.p;
                ConversationIdType conversationIdType2 = conversationIdType;
                enrrVar2.Y(ensnVar, conversationIdType2);
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SubjectGroupMetadataProcessor", "process", 69, "SubjectGroupMetadataProcessor.java")).q("Updating group subject change");
                cksu cksuVar = (cksu) cksv.a.createBuilder();
                awxa awxaVar2 = awxaVar;
                String str = awxaVar2.c;
                cksuVar.copyOnWrite();
                cksv cksvVar = (cksv) cksuVar.instance;
                str.getClass();
                cksvVar.d = str;
                awxf awxfVar = awxaVar2.e;
                if (awxfVar == null) {
                    awxfVar = awxf.a;
                }
                awui awuiVar = awxfVar.c;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                String str2 = awuiVar.d;
                cksuVar.copyOnWrite();
                cksv cksvVar2 = (cksv) cksuVar.instance;
                str2.getClass();
                cksvVar2.g = str2;
                awxf awxfVar2 = awxaVar2.e;
                if (awxfVar2 == null) {
                    awxfVar2 = awxf.a;
                }
                eyja eyjaVar = awxfVar2.d;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                awnd awndVar = awnd.this;
                cksuVar.copyOnWrite();
                cksv cksvVar3 = (cksv) cksuVar.instance;
                eyjaVar.getClass();
                cksvVar3.f = eyjaVar;
                cksvVar3.b |= 1;
                int e3 = awkhVar.e().e();
                cksuVar.copyOnWrite();
                ((cksv) cksuVar.instance).i = e3;
                String a2 = conversationIdType2.a();
                cksuVar.copyOnWrite();
                cksv cksvVar4 = (cksv) cksuVar.instance;
                a2.getClass();
                cksvVar4.h = a2;
                return awndVar.b.c((cksv) cksuVar.build());
            }
        }, this.d);
    }
}
