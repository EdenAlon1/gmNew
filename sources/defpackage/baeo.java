package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FixupMessageStatusOnStartupAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baeo implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;

    public baeo(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cbia cbiaVar = (cbia) this.a.b();
        cbiaVar.getClass();
        dtuu dtuuVar = (dtuu) this.b.b();
        dtuuVar.getClass();
        parcel.getClass();
        cqoh cqohVar = (cqoh) this.d.b();
        cqohVar.getClass();
        return new FixupMessageStatusOnStartupAction(cbiaVar, dtuuVar, parcel, this.c, cqohVar, this.e, this.f);
    }
}
