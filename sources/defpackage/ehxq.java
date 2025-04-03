package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.lifecycle.RcsEngineLifecycleServiceResult;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RcsEngineLifecycleServiceResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RcsEngineLifecycleServiceResult[i];
    }
}
