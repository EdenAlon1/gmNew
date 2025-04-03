package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessDownloadedMmsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bakv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((ProcessDownloadedMmsAction.a) ctba.a(ProcessDownloadedMmsAction.a.class)).hY().c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessDownloadedMmsAction[i];
    }
}
