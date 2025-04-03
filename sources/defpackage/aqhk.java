package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.recipient.DefaultRecipient;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqhk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        DefaultRecipient.a aVar = (DefaultRecipient.a) ctba.a(DefaultRecipient.a.class);
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        readBundle.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) readBundle.getParcelable("participant");
        bindData.getClass();
        ProfilesTable.BindData bindData2 = (ProfilesTable.BindData) readBundle.getParcelable("profile");
        aolm ao = aVar.ao();
        eyjv eyjvVar = (eyjv) readBundle.getParcelable("identity");
        eyjvVar.getClass();
        aoku c = ao.c(eyjvVar);
        aqhl av = aVar.av();
        Context context = (Context) av.a.b();
        context.getClass();
        errl errlVar = (errl) av.b.b();
        errlVar.getClass();
        ffbr ffbrVar = av.c;
        ffbr ffbrVar2 = av.d;
        ffbr ffbrVar3 = av.e;
        ffbr ffbrVar4 = av.f;
        ffbr ffbrVar5 = av.g;
        ffbr ffbrVar6 = av.h;
        ffbr ffbrVar7 = av.i;
        ffbr ffbrVar8 = av.j;
        ffbr ffbrVar9 = av.k;
        ffbr ffbrVar10 = av.l;
        aqmm aqmmVar = (aqmm) av.m.b();
        aqmmVar.getClass();
        ffbr ffbrVar11 = av.n;
        ffbr ffbrVar12 = av.o;
        ffbr ffbrVar13 = av.p;
        atly atlyVar = (atly) av.q.b();
        atlyVar.getClass();
        return new DefaultRecipient(context, errlVar, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, ffbrVar5, ffbrVar6, ffbrVar7, ffbrVar8, ffbrVar9, ffbrVar10, aqmmVar, ffbrVar11, ffbrVar12, ffbrVar13, atlyVar, bindData, bindData2, c);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DefaultRecipient[i];
    }
}
