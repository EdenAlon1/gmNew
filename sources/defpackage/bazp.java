package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateCloudSyncMessageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazp implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public bazp(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final UpdateCloudSyncMessageAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cish cishVar = (cish) this.d.b();
        cishVar.getClass();
        cisl cislVar = (cisl) this.e.b();
        cislVar.getClass();
        dtuu dtuuVar = (dtuu) this.f.b();
        dtuuVar.getClass();
        axmw axmwVar = (axmw) this.g.b();
        axmwVar.getClass();
        parcel.getClass();
        return new UpdateCloudSyncMessageAction(context, this.b, this.c, cishVar, cislVar, dtuuVar, axmwVar, parcel);
    }
}
