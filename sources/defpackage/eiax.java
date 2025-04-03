package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiax implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiay e = GroupMember.e();
        ehys ehysVar = (ehys) e;
        ehysVar.a = (eica) eijb.f(parcel, 1, eijd.a).get();
        e.b((String) eijb.h(parcel, 2).get());
        ehysVar.b = eijb.f(parcel, 3, eijd.a);
        e.c(((Integer) eijb.d(parcel, 4).get()).intValue() == 1);
        emxf.a(eijb.j(parcel).isPresent());
        return e.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupMember[i];
    }
}
