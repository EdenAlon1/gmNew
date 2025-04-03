package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.conversation.settings.dataservice.SpamReportingStatus;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wci implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new SpamReportingStatus(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SpamReportingStatus[i];
    }
}
