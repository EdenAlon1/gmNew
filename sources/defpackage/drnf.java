package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.time.Duration;
import j$.time.Instant;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drnf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        LinkedHashMap linkedHashMap;
        parcel.getClass();
        drjx drjxVar = (drjx) parcel.readParcelable(drng.class.getClassLoader());
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
        return new drng(drjxVar, readString, linkedHashMap, parcel.readString(), parcel.readLong(), (Instant) parcel.readSerializable(), (doxr) parcel.readParcelable(drng.class.getClassLoader()), (Duration) parcel.readSerializable(), (dteh) ProtoParsers.a(parcel, dteh.a, eyfc.a()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new drng[i];
    }
}
