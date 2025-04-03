package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bczb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ BackgroundLoadingMessageUsageStatisticsData b;
    final /* synthetic */ Parcel c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bczb(BackgroundLoadingMessageUsageStatisticsData backgroundLoadingMessageUsageStatisticsData, Parcel parcel, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = backgroundLoadingMessageUsageStatisticsData;
        this.c = parcel;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bczb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl elflVar = this.b.a;
            this.a = 1;
            obj = fgfz.c(elflVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((MessageUsageStatisticsDataImpl) obj).writeToParcel(this.c, this.d);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bczb(this.b, this.c, this.d, ffguVar);
    }
}
