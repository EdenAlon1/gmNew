package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDeliveryReportAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bakr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessDeliveryReportAction.a) ctba.a(ProcessDeliveryReportAction.a.class)).hX().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessDeliveryReportAction[i];
    }
}
