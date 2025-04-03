package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjhp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i = 0; i != readInt; i++) {
            linkedHashMap.put(parcel.readString(), parcel.readParcelable(MediaUploadStates.class.getClassLoader()));
        }
        return new MediaUploadStates(linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MediaUploadStates[i];
    }
}
