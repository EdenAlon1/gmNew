package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vtr extends txv<cuyc> {
    final /* synthetic */ vvn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtr(vvn vvnVar) {
        super("Verified SMS brand info");
        this.a = vvnVar;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cuyc cuycVar = (cuyc) obj;
        ensk e = vvn.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(csux.p, this.a.M);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/conversation/screen/ConversationFragmentPeer$18", "onNewData", 2657, "ConversationFragmentPeer.java")).q("ConversationFragment: onNewData: Verified SMS brand info");
        int i = cuycVar.b;
        int i2 = i - 1;
        if (i2 == 1) {
            this.a.aJ(null);
            return;
        }
        if (i2 != 2) {
            return;
        }
        vvn vvnVar = this.a;
        if (i != 3) {
            throw new IllegalStateException("Cannot get brand data from current operation: ".concat(i != 1 ? "REMOVE_DATA" : "DO_NOTHING"));
        }
        BusinessInfoData businessInfoData = cuycVar.a;
        businessInfoData.getClass();
        vvnVar.aJ(businessInfoData);
    }
}
