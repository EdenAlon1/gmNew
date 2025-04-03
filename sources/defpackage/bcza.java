package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcza extends ffhv implements ffjm {
    int a;
    final /* synthetic */ BackgroundLoadingMessageUsageStatisticsData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcza(BackgroundLoadingMessageUsageStatisticsData backgroundLoadingMessageUsageStatisticsData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = backgroundLoadingMessageUsageStatisticsData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcza) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        elfl elflVar = this.b.a;
        this.a = 1;
        if (fgfz.c(elflVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bcza(this.b, ffguVar);
    }
}
