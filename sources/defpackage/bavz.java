package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SelfParticipantsRefreshAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bavz implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bavz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SelfParticipantsRefreshAction c(Parcel parcel) {
        aukf aukfVar = (aukf) this.c.b();
        aukfVar.getClass();
        parcel.getClass();
        return new SelfParticipantsRefreshAction(this.a, this.b, aukfVar, this.d, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        aukf aukfVar = (aukf) this.c.b();
        aukfVar.getClass();
        return new SelfParticipantsRefreshAction(this.a, this.b, aukfVar, this.d);
    }
}
