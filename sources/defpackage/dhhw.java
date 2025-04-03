package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.contactssync.model.AccountWithDataSet;
import com.google.android.gms.people.contactssync.model.GetImportSimContactsSuggestionsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhhw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        AccountWithDataSet accountWithDataSet = null;
        int[] iArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                accountWithDataSet = (AccountWithDataSet) dfxj.n(parcel, readInt, AccountWithDataSet.CREATOR);
            } else if (d == 2) {
                iArr = dfxj.H(parcel, readInt);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetImportSimContactsSuggestionsRequest(accountWithDataSet, enip.o(ermn.j(iArr)), z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetImportSimContactsSuggestionsRequest[i];
    }
}
