package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.MarkConversationNotYetDeliveredAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baik implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public baik(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
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
    }

    public final /* bridge */ /* synthetic */ Action a(bdhg bdhgVar, boolean z) {
        ckds ckdsVar = (ckds) this.c.b();
        ckdsVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        dtuu dtuuVar = (dtuu) this.e.b();
        dtuuVar.getClass();
        bdmr bdmrVar = (bdmr) this.f.b();
        bdmrVar.getClass();
        bdhgVar.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, ckdsVar, akztVar, dtuuVar, bdmrVar, bdhgVar, z);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        ckds ckdsVar = (ckds) this.c.b();
        ckdsVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        dtuu dtuuVar = (dtuu) this.e.b();
        dtuuVar.getClass();
        bdmr bdmrVar = (bdmr) this.f.b();
        bdmrVar.getClass();
        parcel.getClass();
        return new MarkConversationNotYetDeliveredAction(this.a, this.b, ckdsVar, akztVar, dtuuVar, bdmrVar, parcel);
    }
}
