package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.PhoneEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                personFieldMetadataEntity = (PersonFieldMetadataEntity) dfxj.n(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                str2 = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new PhoneEntity(personFieldMetadataEntity, str, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PhoneEntity[i];
    }
}
