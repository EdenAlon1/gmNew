package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupInformation;
import com.google.android.rcs.client.messaging.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiau implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Collection] */
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyr ehyrVar = new ehyr();
        ehyrVar.a = (String) eijb.h(parcel, 1).get();
        ehyrVar.c((String) eijb.h(parcel, 2).get());
        ehyrVar.b((String) eijb.h(parcel, 3).get());
        ?? r1 = eijb.g(parcel, 4, GroupMember.CREATOR).get();
        if (ehyrVar.b != null) {
            throw new IllegalStateException("Cannot set groupMembers after calling groupMembersBuilder()");
        }
        ehyrVar.c = engw.n(r1);
        ehyrVar.d = eijb.f(parcel, 5, eiic.a);
        ehyrVar.e = eijb.f(parcel, 6, eiji.a);
        emxf.a(eijb.j(parcel).isPresent());
        return ehyrVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupInformation[i];
    }
}
