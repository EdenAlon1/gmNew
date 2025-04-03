package defpackage;

import android.net.Uri;
import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cpzm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cpzo b;
    final /* synthetic */ cpzl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cpzm(cpzo cpzoVar, cpzl cpzlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cpzoVar;
        this.c = cpzlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cpzm) c((akzw) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cpzo cpzoVar = this.b;
            Set b = fffi.b(Uri.parse(this.c.d));
            eyee eyeeVar = this.c.c;
            eyeeVar.getClass();
            cqja cqjaVar = new cqja(b, 1, cqjf.b(eyeeVar), UUID.randomUUID());
            this.a = 1;
            obj = cpzoVar.b.b(cqjaVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ensk h = cpzo.a.h();
        h.Y(ente.a, "BugleTelephony");
        ((enrr) h.h("com/google/android/apps/messaging/shared/telephony/forwardsync/SpotSyncWorkHandler$processPendingWorkItemAsync$1$1", "invokeSuspend", 78, "SpotSyncWorkHandler.kt")).t("SpotSyncWorkHandler: Spot sync completed. batchStats: %s", (cqfd) obj);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cpzm(this.b, this.c, ffguVar);
    }
}
