package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SyncTelephonyThreadsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((SyncTelephonyThreadsAction.SyncTelephonyThreadsActionInjector) ctba.a(SyncTelephonyThreadsAction.SyncTelephonyThreadsActionInjector.class)).ip().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncTelephonyThreadsAction[i];
    }
}
