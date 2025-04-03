package defpackage;

import android.os.Parcel;
import io.grpc.Status;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feho {
    static int a(Parcel parcel, Status status) {
        int value = status.getCode().value() << 16;
        String description = status.getDescription();
        if (description != null && description.length() > 1000) {
            description = description.substring(0, 1000);
        }
        if (description == null) {
            return value;
        }
        int i = value | 32;
        parcel.writeString(description);
        return i;
    }

    static Status b(int i, Parcel parcel) {
        int i2 = i >> 16;
        int i3 = i & 32;
        Status fromCodeValue = Status.fromCodeValue(i2 & PrivateKeyType.INVALID);
        return i3 != 0 ? fromCodeValue.withDescription(parcel.readString()) : fromCodeValue;
    }

    static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(0);
        parcel.writeInt(i);
        parcel.setDataPosition(dataPosition);
    }

    static boolean d(int i, int i2) {
        return (i & i2) != 0;
    }
}
