package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awju implements awks {
    public static final entd a = entd.c("BugleGroupManagement");
    private final awmi b;
    private final errl c;

    public awju(awmi awmiVar, errl errlVar) {
        this.b = awmiVar;
        this.c = errlVar;
    }

    @Override // defpackage.awks
    public final elfl a(final ConversationIdType conversationIdType, awxc awxcVar) {
        final awvj awvjVar = awxcVar.d;
        if (awvjVar == null) {
            awvjVar = awvj.a;
        }
        return awvj.a.equals(awvjVar) ? elfo.e(ceyt.i()) : this.b.g(conversationIdType).h(new emwl() { // from class: awjt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                awkh awkhVar = (awkh) obj;
                ensk n = awju.a.n();
                n.Y(csux.o, awkhVar.f().toString());
                n.Y(csux.J, awkhVar.n());
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/EndpointMetadataProcessor", "process", 56, "EndpointMetadataProcessor.java")).q("Updating the RCS conference URI");
                String[] strArr = bsom.a;
                bsoe bsoeVar = new bsoe();
                bsoeVar.ap("EndpointMetadataProcessor#process");
                awui awuiVar = awvj.this.c;
                if (awuiVar == null) {
                    awuiVar = awui.a;
                }
                ConversationIdType conversationIdType2 = conversationIdType;
                bsoeVar.N(awuiVar.d);
                bsoeVar.f(conversationIdType2);
                return ceyt.i();
            }
        }, this.c);
    }
}
