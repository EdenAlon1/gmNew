package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctio implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        char c;
        String readString = parcel.readString();
        int i = 5;
        switch (readString.hashCode()) {
            case -1454870105:
                if (readString.equals("SPAM_JOB")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339402136:
                if (readString.equals("BUSINESS_MESSAGE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -134073210:
                if (readString.equals("PENPAL_SPAM")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2539132:
                if (readString.equals("SCAM")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 2551625:
                if (readString.equals("SPAM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 264024178:
                if (readString.equals("REMINDER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1766289450:
                if (readString.equals("SPAM_DELIVERY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                throw new IllegalArgumentException();
        }
        return new ctip(i, parcel.readFloat(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ctip[i];
    }
}
