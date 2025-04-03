package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class syg implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        Integer num;
        Integer num2;
        boolean z;
        Integer num3;
        boolean z2;
        Object obj;
        Boolean bool;
        String readString = parcel.readString();
        if (readString.hashCode() != -1374584045 || !readString.equals("PARTICIPANT")) {
            throw new IllegalArgumentException();
        }
        if (parcel.readInt() == 0) {
            str = parcel.readString();
            num = null;
        } else {
            str = null;
            num = null;
        }
        String readString2 = parcel.readString();
        Integer num4 = num;
        String readString3 = parcel.readString();
        int readInt = parcel.readInt();
        if (parcel.readInt() == 1) {
            num2 = num4;
            z = true;
        } else {
            num2 = num4;
            z = false;
        }
        if (parcel.readInt() == 1) {
            num3 = num2;
            z2 = true;
        } else {
            num3 = num2;
            z2 = false;
        }
        if (parcel.readInt() == 0) {
            obj = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            obj = num3;
        }
        if (parcel.readInt() == 0) {
            bool = Boolean.valueOf(parcel.readInt() == 1);
        } else {
            bool = num3;
        }
        if (parcel.readInt() == 0) {
            num3 = Integer.valueOf(parcel.readInt());
        }
        return new syh(str, readString2, readString3, readInt, z, z2, obj, bool, num3, (BlockAndReportSpamCallbacks.ParticipantBlockAndSpamStatus) parcel.readParcelable(szw.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new syh[i];
    }
}
