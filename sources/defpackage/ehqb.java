package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehqb extends kzu {
    public static final Parcelable.Creator<ehqb> CREATOR = new ehqa();
    public final int a;

    public ehqb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.a = parcel.readInt();
    }

    @Override // defpackage.kzu, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
    }

    public ehqb(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
        super(parcelable);
        this.a = sideSheetBehavior.c;
    }
}
