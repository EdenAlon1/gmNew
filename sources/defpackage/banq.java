package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessMessageUpdateAsyncAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class banq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return ((banr) ((ProcessMessageUpdateAsyncAction.a) ctba.a(ProcessMessageUpdateAsyncAction.a.class)).bg()).c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ProcessMessageUpdateAsyncAction[i];
    }
}
