package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aoay implements aqge {
    private final /* synthetic */ aqge a;

    public aoay(anyg anygVar, aobe aobeVar, EmergencySosConversationId emergencySosConversationId, aqge aqgeVar, aqge aqgeVar2, aqge aqgeVar3) {
        this.a = anygVar.a(aobeVar, new BugleConversationId(emergencySosConversationId.a), aqgeVar, aqgeVar2, aqgeVar3);
    }

    @Override // defpackage.aqge
    public final ctbx a(aqgd aqgdVar) {
        return this.a.a(aqgdVar);
    }

    @Override // defpackage.aqge
    public final elfl b() {
        return this.a.b();
    }

    @Override // defpackage.aqge
    public final /* bridge */ /* synthetic */ Object c() {
        return anye.e();
    }
}
