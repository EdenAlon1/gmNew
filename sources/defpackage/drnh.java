package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        parcel.getClass();
        drld drldVar = (drld) parcel.readParcelable(drni.class.getClassLoader());
        String readString = parcel.readString();
        if (parcel.readInt() == 0) {
            linkedHashMap = null;
        } else {
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            linkedHashMap = linkedHashMap2;
        }
        return new drni(drldVar, readString, linkedHashMap, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (Instant) parcel.readSerializable(), (doxr) parcel.readParcelable(drni.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new drni[i];
    }
}
