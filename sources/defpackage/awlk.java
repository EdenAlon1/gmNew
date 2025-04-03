package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awlk implements awks {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor");
    public final awmi a;
    public final awnk b;
    private final ffsk d;

    public awlk(awmi awmiVar, awnk awnkVar, ffsk ffskVar) {
        ffskVar.getClass();
        this.a = awmiVar;
        this.b = awnkVar;
        this.d = ffskVar;
    }

    @Override // defpackage.awks
    public final elfl a(ConversationIdType conversationIdType, awxc awxcVar) {
        elfl c2;
        awxcVar.getClass();
        awwc awwcVar = awxcVar.h;
        if (awwcVar == null) {
            awwcVar = awwc.a;
        }
        awwc awwcVar2 = awwcVar;
        awwcVar2.getClass();
        if (ffkj.e(awwc.a, awwcVar2)) {
            ensk e = c.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, conversationIdType);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor", "process", 39, "IconUrlMetadataProcessor.kt")).q("No changes to the icon URL in the group notification");
            elfl e2 = elfo.e(ceyt.i());
            e2.getClass();
            return e2;
        }
        if (awwcVar2.d) {
            String str = awwcVar2.c;
            str.getClass();
            if (str.length() != 0) {
                throw new IllegalArgumentException("When the icon URL deleted flag is true the icon URL field must be empty");
            }
        }
        ensk e3 = c.e();
        e3.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar2 = (enrr) e3;
        enrrVar2.Y(csux.p, conversationIdType);
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/IconUrlMetadataProcessor", "process", 50, "IconUrlMetadataProcessor.kt")).q("Updating icon URL");
        c2 = axol.c(this.d, ffhe.a, ffsm.a, new awlj(this, awxcVar, conversationIdType, awwcVar2, null));
        return c2;
    }
}
