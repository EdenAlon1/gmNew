package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcyz extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elfl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcyz(elfl elflVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elflVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcyz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            elfl elflVar = this.b;
            this.a = 1;
            obj = fgfz.c(elflVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ((MessageUsageStatisticsDataImpl) obj).e();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bcyz(this.b, ffguVar);
    }
}
