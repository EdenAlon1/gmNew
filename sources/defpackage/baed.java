package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FallbackToXmsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baed implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public baed(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
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
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
    }

    public final /* bridge */ /* synthetic */ Action a(bdhg bdhgVar, int i, eqyl eqylVar) {
        akzt akztVar = (akzt) this.a.b();
        akztVar.getClass();
        cqoh cqohVar = (cqoh) this.d.b();
        cqohVar.getClass();
        altk altkVar = (altk) this.e.b();
        altkVar.getClass();
        ckds ckdsVar = (ckds) this.f.b();
        ckdsVar.getClass();
        dtuu dtuuVar = (dtuu) this.g.b();
        dtuuVar.getClass();
        errl errlVar = (errl) this.i.b();
        errlVar.getClass();
        eqylVar.getClass();
        return new FallbackToXmsAction(akztVar, this.b, this.c, cqohVar, altkVar, ckdsVar, dtuuVar, this.h, errlVar, bdhgVar, i, eqylVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        akzt akztVar = (akzt) this.a.b();
        akztVar.getClass();
        cqoh cqohVar = (cqoh) this.d.b();
        cqohVar.getClass();
        altk altkVar = (altk) this.e.b();
        altkVar.getClass();
        ckds ckdsVar = (ckds) this.f.b();
        ckdsVar.getClass();
        dtuu dtuuVar = (dtuu) this.g.b();
        dtuuVar.getClass();
        errl errlVar = (errl) this.i.b();
        errlVar.getClass();
        parcel.getClass();
        return new FallbackToXmsAction(akztVar, this.b, this.c, cqohVar, altkVar, ckdsVar, dtuuVar, this.h, errlVar, parcel);
    }
}
