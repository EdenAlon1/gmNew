package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveRbmSuggestionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bart implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public bart(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
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
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
    }

    public final /* bridge */ /* synthetic */ Action a(Bundle bundle) {
        cqoh cqohVar = (cqoh) this.f.b();
        cqohVar.getClass();
        cbgf cbgfVar = (cbgf) this.g.b();
        cbgfVar.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, cqohVar, cbgfVar, this.h, this.i, bundle);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        cqoh cqohVar = (cqoh) this.f.b();
        cqohVar.getClass();
        cbgf cbgfVar = (cbgf) this.g.b();
        cbgfVar.getClass();
        parcel.getClass();
        return new ReceiveRbmSuggestionsAction(this.a, this.b, this.c, this.d, this.e, cqohVar, cbgfVar, this.h, this.i, parcel);
    }
}
