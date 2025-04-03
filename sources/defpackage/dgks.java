package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.StateUpdate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgks implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return StateUpdate.Type.a(parcel.readString());
        } catch (dgkt e) {
            throw new RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new StateUpdate.Type[i];
    }
}
