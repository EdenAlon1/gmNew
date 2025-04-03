package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ClearCloudSyncMessagesAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacx implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public bacx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.a = ffbrVar2;
        ffbrVar3.getClass();
        this.b = ffbrVar3;
        ffbrVar4.getClass();
        this.c = ffbrVar4;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ClearCloudSyncMessagesAction c(Parcel parcel) {
        bbfw bbfwVar = (bbfw) this.a.b();
        bbfwVar.getClass();
        cbgf cbgfVar = (cbgf) this.b.b();
        cbgfVar.getClass();
        dtuu dtuuVar = (dtuu) this.c.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new ClearCloudSyncMessagesAction(bbfwVar, cbgfVar, dtuuVar, parcel);
    }
}
