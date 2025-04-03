package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baom implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessTelephonyChangeAction.a) ctba.a(ProcessTelephonyChangeAction.a.class)).ie().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessTelephonyChangeAction[i];
    }
}
