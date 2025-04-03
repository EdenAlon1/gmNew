package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.ActionPreference;
import com.google.android.gms.people.cpg.CpgDocument;
import com.google.android.gms.people.cpg.GroupContactOrder;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhia implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        GroupContactOrder groupContactOrder = null;
        int i = 0;
        ActionPreference actionPreference = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                groupContactOrder = (GroupContactOrder) dfxj.n(parcel, readInt, GroupContactOrder.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                actionPreference = (ActionPreference) dfxj.n(parcel, readInt, ActionPreference.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CpgDocument(i, groupContactOrder, actionPreference);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CpgDocument[i];
    }
}
