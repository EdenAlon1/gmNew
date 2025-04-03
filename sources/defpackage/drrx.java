package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drrx implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        parcel.getClass();
        String readString = parcel.readString();
        int i = 4;
        switch (readString.hashCode()) {
            case -1271056834:
                if (readString.equals("UNKNOWN_REQUEST_FAILURE_REASON")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 478131041:
                if (readString.equals("REQUEST_CANCELLED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 573789423:
                if (readString.equals("UNRECOGNIZED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 660924809:
                if (readString.equals("SOME_MEDIA_FAILED_TO_UPLOAD")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1554701229:
                if (readString.equals("ALBUM_CREATION_FAILED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 2;
        } else if (c == 1) {
            i = 3;
        } else if (c != 2) {
            if (c == 3) {
                i = 5;
            } else {
                if (c != 4) {
                    throw new IllegalArgumentException();
                }
                i = 1;
            }
        }
        int readInt = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
        for (int i2 = 0; i2 != readInt; i2++) {
            linkedHashMap.put(parcel.readString(), edfb.c(parcel.readString()));
        }
        return new drry(i, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new drry[i];
    }
}
