package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbar implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bbar(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
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
    public final UpdateRbmBotParticipantAction c(Parcel parcel) {
        cbgf cbgfVar = (cbgf) this.c.b();
        cbgfVar.getClass();
        dtuu dtuuVar = (dtuu) this.d.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new UpdateRbmBotParticipantAction(this.a, this.b, cbgfVar, dtuuVar, parcel);
    }
}
