package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 9) {
                arrayList5 = dfxj.z(parcel, readInt, BirthdayEntity.CREATOR);
            } else if (d == 11) {
                arrayList3 = dfxj.z(parcel, readInt, EmailEntity.CREATOR);
            } else if (d == 13) {
                arrayList4 = dfxj.z(parcel, readInt, PhoneEntity.CREATOR);
            } else if (d == 148) {
                arrayList6 = dfxj.z(parcel, readInt, PhotoEntity.CREATOR);
            } else if (d == 4) {
                arrayList = dfxj.z(parcel, readInt, NameEntity.CREATOR);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                arrayList2 = dfxj.z(parcel, readInt, PhotoEntity.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new PersonEntity(str, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PersonEntity[i];
    }
}
