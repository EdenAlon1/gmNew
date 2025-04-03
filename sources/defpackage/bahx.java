package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.InsertRcsMessageInTelephonyAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bahx implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;

    public bahx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        ckch ckchVar = (ckch) this.b.b();
        ckchVar.getClass();
        cers cersVar = (cers) this.c.b();
        cersVar.getClass();
        errl errlVar = (errl) this.d.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.e.b();
        errlVar2.getClass();
        atmh atmhVar = (atmh) this.h.b();
        atmhVar.getClass();
        return new InsertRcsMessageInTelephonyAction(parcel, this.a, ckchVar, cersVar, errlVar, errlVar2, this.f, this.g, atmhVar);
    }
}
