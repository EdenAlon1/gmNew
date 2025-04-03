package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupMember;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eieh eiehVar = new eieh();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                ArrayList z = dfxj.z(parcel, readInt, GroupMember.CREATOR);
                if (eiehVar.a != null) {
                    throw new IllegalStateException("Cannot set changedMembers after calling changedMembersBuilder()");
                }
                eiehVar.b = engw.n(z);
            }
        }
        return eiehVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupEvent[i];
    }
}
