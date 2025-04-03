package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessRcsDeliveryReportAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baob implements bbck {
    public final ffbr a;

    public baob(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessRcsDeliveryReportAction c(Parcel parcel) {
        baoa baoaVar = (baoa) this.a.b();
        baoaVar.getClass();
        parcel.getClass();
        return new ProcessRcsDeliveryReportAction(baoaVar, parcel);
    }
}
