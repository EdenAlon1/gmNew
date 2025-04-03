package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bahw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((InsertRcsMessageInTelephonyAction.a) ctba.a(InsertRcsMessageInTelephonyAction.a.class)).hR().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InsertRcsMessageInTelephonyAction[i];
    }
}
