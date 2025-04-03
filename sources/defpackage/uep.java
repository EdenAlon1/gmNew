package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uep implements Parcelable.Creator {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional ofNullable;
        char c;
        boolean z;
        int i;
        String readString = parcel.readString();
        Uri uri = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        eohh eohhVar = (eohh) Enum.valueOf(eohh.class, parcel.readString());
        Size readSize = parcel.readSize();
        long readLong = parcel.readLong();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        Uri uri2 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        ctua ctuaVar = ueq.n;
        parcel.getClass();
        if (parcel.readByte() == 0) {
            ofNullable = Optional.empty();
        } else {
            Object readValue = parcel.readValue(ctuaVar.getClass().getClassLoader());
            readValue.getClass();
            ofNullable = Optional.ofNullable(readValue);
        }
        Optional optional = ofNullable;
        byza byzaVar = (byza) Enum.valueOf(byza.class, parcel.readString());
        Uri uri3 = (Uri) parcel.readParcelable(GalleryContent.class.getClassLoader());
        String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
        String readString3 = parcel.readString();
        switch (readString3.hashCode()) {
            case -1905220446:
                if (readString3.equals("DISPLAY")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -317273382:
                if (readString3.equals("DISPLAY_AND_ALLOW_HIDING")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 449635224:
                if (readString3.equals("HIDE_AND_REQUIRE_EXTRA_CONSENT_BEFORE_SHOWING")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 907287315:
                if (readString3.equals("PROCESSING")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1054202442:
                if (readString3.equals("HIDE_AND_ALLOW_SHOWING")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            int i2 = 2;
            if (c != 1) {
                if (c == 2) {
                    i2 = 3;
                } else if (c == 3) {
                    i2 = 4;
                } else {
                    if (c != 4) {
                        throw new IllegalArgumentException();
                    }
                    i = 5;
                    z = false;
                }
            }
            z = false;
            i = i2;
        } else {
            z = false;
            i = 1;
        }
        return new ueq(readString, uri, eohhVar, readSize, readLong, readInt == 1 ? true : z, readInt2 == 1 ? true : z, uri2, optional, byzaVar, uri3, readString2, i);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ueq[i];
    }
}
