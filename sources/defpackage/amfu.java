package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amfu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ amfv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amfu(amfv amfvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = amfvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amfu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            amfv amfvVar = this.b;
            this.a = 1;
            obj = amfvVar.d(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        amfv amfvVar2 = this.b;
        ensk e = amfv.a.e();
        e.Y(ente.a, "Bugle");
        enrr enrrVar = (enrr) e;
        enrrVar.Y(amfv.b, ffdx.aA((List) obj, null, null, null, null, 63));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/BugleConversationLocalIdentitiesSupplier", "logFilteredSelfIdentities", 73, "BugleConversationLocalIdentitiesSupplier.kt")).t("Filtered self identities for the sim picker, conversation %s.", amfvVar2.c.a);
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new amfu(this.b, ffguVar);
    }
}
