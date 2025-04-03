package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwiy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cwiz b;
    final /* synthetic */ SelfIdentityId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwiy(cwiz cwizVar, SelfIdentityId selfIdentityId, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cwizVar;
        this.c = selfIdentityId;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cwiy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ffss e = axol.e(((aqvh) this.b.b.b()).d(this.c));
            this.a = 1;
            obj = e.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        obj.getClass();
        aqux aquxVar = (aqux) fflm.b((Optional) obj);
        if (aquxVar == null) {
            ensk j = cwiz.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) j.h("com/google/android/apps/messaging/startchat/tracker/SelectedSelfIdentityTrackerImpl$initialize$2", "invokeSuspend", 71, "SelectedSelfIdentityTrackerImpl.kt")).q("Self-identity was not present in the repository.");
        }
        this.b.d(aquxVar);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cwiy(this.b, this.c, ffguVar);
    }
}
