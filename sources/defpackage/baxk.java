package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SendReportAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baxk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SendReportAction.a) ctba.a(SendReportAction.a.class)).bu().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SendReportAction[i];
    }
}
