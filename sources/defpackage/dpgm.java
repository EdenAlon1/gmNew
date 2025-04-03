package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        int i;
        int i2;
        parcel.getClass();
        dpgl dpglVar = (dpgl) Enum.valueOf(dpgl.class, parcel.readString());
        String readString = parcel.readString();
        int hashCode = readString.hashCode();
        char c2 = 65535;
        if (hashCode == 2030823) {
            if (readString.equals("BACK")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != 67167753) {
            if (hashCode == 433141802 && readString.equals("UNKNOWN")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (readString.equals("FRONT")) {
                c = 2;
            }
            c = 65535;
        }
        int i3 = 3;
        if (c == 0) {
            i = 3;
            i3 = 1;
        } else if (c == 1) {
            i = 3;
            i3 = 2;
        } else {
            if (c != 2) {
                throw new IllegalArgumentException();
            }
            i = 3;
        }
        String readString2 = parcel.readString();
        int hashCode2 = readString2.hashCode();
        if (hashCode2 != -77725029) {
            if (hashCode2 != 433141802) {
                if (hashCode2 == 1511893915 && readString2.equals("PORTRAIT")) {
                    c2 = 1;
                }
            } else if (readString2.equals("UNKNOWN")) {
                c2 = 0;
            }
        } else if (readString2.equals("LANDSCAPE")) {
            c2 = 2;
        }
        if (c2 == 0) {
            i2 = 1;
        } else if (c2 == 1) {
            i2 = 2;
        } else {
            if (c2 != 2) {
                throw new IllegalArgumentException();
            }
            i2 = i;
        }
        return new dpgo(dpglVar, i3, i2, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dpgo[i];
    }
}
