package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uvf implements ellh {
    final /* synthetic */ uuy a;

    public uvf(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ellh
    public final /* synthetic */ elli a(ellf ellfVar) {
        vgn vgnVar = (vgn) ellfVar;
        uuy uuyVar = this.a;
        bcqs bcqsVar = (bcqs) uuyVar.aL.a();
        if (!uuyVar.Q.isPresent()) {
            return elli.a;
        }
        vfq vfqVar = (vfq) uuyVar.Q.get();
        cmtd c = vgnVar.c();
        cmrl a = vgnVar.a();
        eprt d = vgnVar.d();
        cmrm b = vgnVar.b();
        boolean q = bcqsVar.q();
        boolean z = ((typ) bcqsVar.d).d;
        ConversationIdType conversationIdType = uuyVar.ap;
        int a2 = uuyVar.ay.a();
        SelfIdentityId i = uuyVar.ay.i();
        uuw uuwVar = uuyVar.ay;
        uuwVar.getClass();
        return vfqVar.c(c, a, d, b, q, z, conversationIdType, a2, i, new urr(uuwVar), uuyVar.L, uuyVar.al);
    }
}
