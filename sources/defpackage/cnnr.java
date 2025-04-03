package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnnr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cnnv b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnnr(ffgu ffguVar, cnnv cnnvVar, int i) {
        super(2, ffguVar);
        this.b = cnnvVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnnr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            elfl f = this.b.b.f("EMERGENCY+SERVICE+PROVIDER");
            f.getClass();
            this.a = 1;
            obj = fgfz.c(f, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Optional optional = (Optional) obj;
        if (optional.isPresent() && ((bseh) optional.get()).m() != this.c) {
            ensk h = cnnv.a.h();
            h.Y(ente.a, "BugleSatellite");
            enrr enrrVar = (enrr) h;
            enrrVar.Y(csux.p, ((bseh) optional.get()).C());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations$changeEmergencyConversationStateIfPresent$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 194, "EmergencyConversationOperations.kt")).t("Updating emergency conversation joinedState to [%s]", byyq.a(this.c));
            bczy bczyVar = (bczy) this.b.c.b();
            ConversationIdType C = ((bseh) optional.get()).C();
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.A(this.c);
            bczyVar.W(C, bsoeVar);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnnr cnnrVar = new cnnr(ffguVar, this.b, this.c);
        cnnrVar.d = obj;
        return cnnrVar;
    }
}
