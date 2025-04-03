package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baks implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;

    public baks(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cqoh cqohVar = (cqoh) this.b.b();
        cqohVar.getClass();
        coxk coxkVar = (coxk) this.c.b();
        coxkVar.getClass();
        altk altkVar = (altk) this.d.b();
        altkVar.getClass();
        dtuu dtuuVar = (dtuu) this.e.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new ProcessDeliveryReportAction(this.a, cqohVar, coxkVar, altkVar, dtuuVar, parcel);
    }
}
