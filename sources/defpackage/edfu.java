package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edfu implements dhqh {
    @Override // defpackage.dhqh
    public final /* bridge */ /* synthetic */ Object a(dhre dhreVar) {
        dhri dhriVar = new dhri();
        if (((dhrm) dhreVar).d) {
            dhriVar.c(new dfqu(new Status(16, "Location request was cancelled. Please try again.")));
        } else if (dhreVar.h() == null && dhreVar.i() == null) {
            dhriVar.c(new dfqu(new Status(8, "Location unavailable.")));
        }
        return dhriVar.a.h() != null ? dhriVar.a : dhreVar;
    }
}
