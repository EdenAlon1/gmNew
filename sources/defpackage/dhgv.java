package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhgv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        String str = "";
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    arrayList = dfxj.z(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    arrayList2 = dfxj.z(parcel, readInt, Account.CREATOR);
                    break;
                case 5:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 6:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    arrayList3 = dfxj.z(parcel, readInt, Account.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new ContactsConsentsCoarseStatus(z, z2, arrayList, arrayList2, str, z3, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsCoarseStatus[i];
    }
}
