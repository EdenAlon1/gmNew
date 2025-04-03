package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhjo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        PersonFieldMetadataEntity personFieldMetadataEntity = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d != 17) {
                switch (d) {
                    case 2:
                        personFieldMetadataEntity = (PersonFieldMetadataEntity) dfxj.n(parcel, readInt, PersonFieldMetadataEntity.CREATOR);
                        break;
                    case 3:
                        str = dfxj.t(parcel, readInt);
                        break;
                    case 4:
                        str6 = dfxj.t(parcel, readInt);
                        break;
                    case 5:
                        str3 = dfxj.t(parcel, readInt);
                        break;
                    case 6:
                        str4 = dfxj.t(parcel, readInt);
                        break;
                    case 7:
                        str5 = dfxj.t(parcel, readInt);
                        break;
                    default:
                        dfxj.C(parcel, readInt);
                        break;
                }
            } else {
                str2 = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new NameEntity(personFieldMetadataEntity, str, str2, str3, str4, str5, str6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NameEntity[i];
    }
}
