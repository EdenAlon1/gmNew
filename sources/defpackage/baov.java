package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessUserAlertAsyncAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baov extends bbfs {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public baov(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
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
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        this.i = ffbrVar9;
    }

    @Override // defpackage.bbfs
    public final /* bridge */ /* synthetic */ Action a(int i, fcek fcekVar, String str) {
        bzgd bzgdVar = (bzgd) this.c.b();
        bzgdVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        errl errlVar = (errl) this.e.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.f.b();
        errlVar2.getClass();
        chyj chyjVar = (chyj) this.g.b();
        chyjVar.getClass();
        chww chwwVar = (chww) this.h.b();
        chwwVar.getClass();
        fcekVar.getClass();
        str.getClass();
        return new ProcessUserAlertAsyncAction(this.a, this.b, bzgdVar, akztVar, errlVar, errlVar2, chyjVar, chwwVar, this.i, i, fcekVar, str);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bzgd bzgdVar = (bzgd) this.c.b();
        bzgdVar.getClass();
        akzt akztVar = (akzt) this.d.b();
        akztVar.getClass();
        errl errlVar = (errl) this.e.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.f.b();
        errlVar2.getClass();
        chyj chyjVar = (chyj) this.g.b();
        chyjVar.getClass();
        chww chwwVar = (chww) this.h.b();
        chwwVar.getClass();
        parcel.getClass();
        return new ProcessUserAlertAsyncAction(this.a, this.b, bzgdVar, akztVar, errlVar, errlVar2, chyjVar, chwwVar, this.i, parcel);
    }
}
