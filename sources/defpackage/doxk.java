package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxk implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        parcel.getClass();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int i = 4;
        switch (readString2.hashCode()) {
            case -2130433380:
                if (readString2.equals("INTENT")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -975978826:
                if (readString2.equals("INPUT_METHOD_EDITOR")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 433141802:
                if (readString2.equals("UNKNOWN")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1186196854:
                if (readString2.equals("CLIPBOARD")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1564508962:
                if (readString2.equals("DRAG_AND_DROP")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            i = 1;
        } else if (c == 1) {
            i = 2;
        } else if (c == 2) {
            i = 3;
        } else if (c != 3) {
            if (c != 4) {
                throw new IllegalArgumentException();
            }
            i = 5;
        }
        return new doxm(readString, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new doxm[i];
    }
}
