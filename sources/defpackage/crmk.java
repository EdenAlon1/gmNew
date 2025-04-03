package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.util.LegacyGroupProtocolSwitchAction;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crmk implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;

    public crmk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LegacyGroupProtocolSwitchAction c(Parcel parcel) {
        cbvt cbvtVar = (cbvt) this.b.b();
        cbvtVar.getClass();
        bdtd bdtdVar = (bdtd) this.c.b();
        bdtdVar.getClass();
        cqoh cqohVar = (cqoh) this.d.b();
        cqohVar.getClass();
        parcel.getClass();
        return new LegacyGroupProtocolSwitchAction(this.a, cbvtVar, bdtdVar, cqohVar, parcel);
    }
}
