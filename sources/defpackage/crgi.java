package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class crgi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ crgn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgi(crgn crgnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = crgnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crgi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            crgn crgnVar = this.b;
            this.a = 1;
            Map a = ((crgz) crgnVar.c.b()).a();
            ((crgy) crgnVar.d.b()).b(a);
            Object a2 = ffsl.a(new crgm(crgnVar, a, null), this);
            Object obj3 = ffhh.a;
            if (a2 != obj3) {
                a2 = ffcu.a;
            }
            if (a2 != obj3) {
                a2 = ffcu.a;
            }
            if (a2 == obj2) {
                return obj2;
            }
        }
        ensk e = crgn.a.e();
        e.Y(ente.a, "BugleTransport");
        ((enrr) e.h("com/google/android/apps/messaging/shared/transport/ChatTransportControllerImpl$kickOffUpdateTransportRegistration$1$1", "invokeSuspend", 214, "ChatTransportControllerImpl.kt")).q("Update transport registration finished successfully.");
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new crgi(this.b, ffguVar);
    }
}
