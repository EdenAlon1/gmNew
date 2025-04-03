package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiow implements Parcelable.Creator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i;
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        Intent intent2 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        int readInt4 = parcel.readInt();
        long readLong = parcel.readLong();
        eioc.c(readString, "packageName cannot be null.");
        eioc.c(readString2, "serviceClass cannot be null.");
        eioc.c(intent, "Service intent cannot be null.");
        eioc.c(intent2, "Item click intent cannot be null");
        boolean z = true;
        if (readInt == 1) {
            i = 1;
        } else {
            i = 1;
            z = false;
        }
        if (!z) {
            eioc.a(readInt2 != 0 ? i : 0, "Invalidate resource id of display name");
            eioc.a(readInt3 != 0 ? i : 0, "Invalidate resource id of display icon");
        }
        return new eiox(readString, readString2, z, readInt4 == i ? i : 0, readLong, readInt2, readInt3, intent, intent2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eiox[i];
    }
}
