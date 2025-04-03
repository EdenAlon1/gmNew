package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.DocumentContents;
import com.google.android.gms.appdatasearch.DocumentSection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class devm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        DocumentSection[] documentSectionArr = null;
        Account account = null;
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                documentSectionArr = (DocumentSection[]) dfxj.J(parcel, readInt, DocumentSection.CREATOR);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                account = (Account) dfxj.n(parcel, readInt, Account.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new DocumentContents(documentSectionArr, str, z, account);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DocumentContents[i];
    }
}
