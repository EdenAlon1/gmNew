package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.consentprimitive.ContactsConsentsCoarseStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsConfig;
import com.google.android.gms.people.consentprimitive.ContactsConsentsDetailedStatus;
import com.google.android.gms.people.consentprimitive.ContactsConsentsStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhgy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ContactsConsentsCoarseStatus contactsConsentsCoarseStatus = null;
        ContactsConsentsDetailedStatus contactsConsentsDetailedStatus = null;
        ContactsConsentsConfig contactsConsentsConfig = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                contactsConsentsCoarseStatus = (ContactsConsentsCoarseStatus) dfxj.n(parcel, readInt, ContactsConsentsCoarseStatus.CREATOR);
            } else if (d == 2) {
                contactsConsentsDetailedStatus = (ContactsConsentsDetailedStatus) dfxj.n(parcel, readInt, ContactsConsentsDetailedStatus.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                contactsConsentsConfig = (ContactsConsentsConfig) dfxj.n(parcel, readInt, ContactsConsentsConfig.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new ContactsConsentsStatus(contactsConsentsCoarseStatus, contactsConsentsDetailedStatus, contactsConsentsConfig);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ContactsConsentsStatus[i];
    }
}
