package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eeub extends View.BaseSavedState {
    public static final Parcelable.Creator<eeub> CREATOR = new eeua();
    boolean a;

    public eeub(Parcel parcel) {
        super(parcel);
        this.a = parcel.readByte() == 1;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.a ? (byte) 1 : (byte) 0);
    }

    public eeub(Parcelable parcelable) {
        super(parcelable);
    }
}
