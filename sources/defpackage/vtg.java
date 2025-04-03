package defpackage;

import android.content.Context;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtg extends txv<Optional<BusinessInfoData>> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtg(vvn vvnVar) {
        super("Business Info");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$10", "onNewData", 2300, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Business Info");
        if (optional.isPresent()) {
            this.a.aJ((BusinessInfoData) optional.get());
            Context z = this.a.N.z();
            z.getClass();
            z.getContentResolver().notifyChange(bcqc.j(this.a.N.z()), null);
        }
    }
}
