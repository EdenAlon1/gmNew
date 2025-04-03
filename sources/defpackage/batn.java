package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RecurringTelemetryUploaderAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class batn implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;

    public batn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
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
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
    }

    public final /* bridge */ /* synthetic */ Action a() {
        Context context = (Context) this.a.b();
        context.getClass();
        almw almwVar = (almw) this.b.b();
        almwVar.getClass();
        akzt akztVar = (akzt) this.c.b();
        akztVar.getClass();
        alns alnsVar = (alns) this.d.b();
        alnsVar.getClass();
        cpwl cpwlVar = (cpwl) this.e.b();
        cpwlVar.getClass();
        cpvq cpvqVar = (cpvq) this.f.b();
        cpvqVar.getClass();
        errl errlVar = (errl) this.g.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.h.b();
        errlVar2.getClass();
        return new RecurringTelemetryUploaderAction(context, almwVar, akztVar, alnsVar, cpwlVar, cpvqVar, errlVar, errlVar2, this.i);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        almw almwVar = (almw) this.b.b();
        almwVar.getClass();
        akzt akztVar = (akzt) this.c.b();
        akztVar.getClass();
        alns alnsVar = (alns) this.d.b();
        alnsVar.getClass();
        errl errlVar = (errl) this.g.b();
        errlVar.getClass();
        errl errlVar2 = (errl) this.h.b();
        errlVar2.getClass();
        cpwl cpwlVar = (cpwl) this.e.b();
        cpwlVar.getClass();
        cpvq cpvqVar = (cpvq) this.f.b();
        cpvqVar.getClass();
        parcel.getClass();
        return new RecurringTelemetryUploaderAction(context, almwVar, akztVar, alnsVar, errlVar, errlVar2, cpwlVar, cpvqVar, this.i, parcel);
    }
}
