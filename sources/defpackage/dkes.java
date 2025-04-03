package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkes implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new RcsEngineLifecycleServiceResult(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RcsEngineLifecycleServiceResult[i];
    }
}
