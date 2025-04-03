package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;
import com.google.android.rcs.client.messaging.data.SubjectExtension;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiei eieiVar = new eiei();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    eieiVar.d(dfxj.t(parcel, readInt));
                    break;
                case 2:
                    eieiVar.e(dfxj.t(parcel, readInt));
                    break;
                case 3:
                    eieiVar.b(dfxj.t(parcel, readInt));
                    break;
                case 4:
                    ArrayList z = dfxj.z(parcel, readInt, GroupMember.CREATOR);
                    if (eieiVar.a != null) {
                        throw new IllegalStateException("Cannot set groupMembers after calling groupMembersBuilder()");
                    }
                    eieiVar.b = engw.n(z);
                    break;
                case 5:
                    eieiVar.c((GroupRemoteCapabilities) dfxj.n(parcel, readInt, GroupRemoteCapabilities.CREATOR));
                    break;
                case 6:
                    eieiVar.f((SubjectExtension) dfxj.n(parcel, readInt, SubjectExtension.CREATOR));
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        return eieiVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupInformation[i];
    }
}
