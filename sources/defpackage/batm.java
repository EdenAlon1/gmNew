package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((RecurringTelemetryUploaderAction.a) ctba.a(RecurringTelemetryUploaderAction.a.class)).ik().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RecurringTelemetryUploaderAction[i];
    }
}
