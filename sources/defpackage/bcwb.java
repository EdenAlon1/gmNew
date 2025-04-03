package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcwb extends bcpr implements bbeo {
    private static final cskc c = cskc.g("Bugle", "LaunchConversationData");
    public bbcd a;
    public final bbeq b;
    private deea d;

    public bcwb(bbeq bbeqVar, deea deeaVar) {
        this.d = deeaVar;
        this.b = bbeqVar;
    }

    @Override // defpackage.bbeo
    public final void a(bbcd bbcdVar, Object obj) {
        deea deeaVar;
        csix.k(bbcdVar == this.a);
        String str = (String) obj;
        if (str != null && j(str) && (deeaVar = this.d) != null) {
            deeaVar.f.c.k(R.string.conversation_creation_failure);
        }
        c.n("onGetOrCreateConversationFailed");
        this.a = null;
    }

    @Override // defpackage.bbeo
    public final void b(bbcd bbcdVar, Object obj, ConversationIdType conversationIdType) {
        deea deeaVar;
        deea deeaVar2;
        csix.k(bbcdVar == this.a);
        csix.l(conversationIdType);
        if (obj instanceof bcwa) {
            bcwa bcwaVar = (bcwa) obj;
            if (j(bcwaVar.a) && (deeaVar2 = this.d) != null) {
                boolean z = bcwaVar.b;
                deeaVar2.a(conversationIdType);
            }
        } else {
            String str = (String) obj;
            if (str != null && j(str) && (deeaVar = this.d) != null) {
                deeaVar.a(conversationIdType);
            }
        }
        this.a = null;
    }

    @Override // defpackage.bcpr
    protected final void h() {
        this.d = null;
        bbcd bbcdVar = this.a;
        if (bbcdVar != null) {
            synchronized (bbcdVar.b) {
                bbcdVar.d = null;
            }
        }
        this.a = null;
    }
}
