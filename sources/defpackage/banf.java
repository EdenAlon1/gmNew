package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessFileTransferAction;
import com.google.android.ims.rcsservice.events.Event;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class banf implements bbfm {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public banf(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14) {
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
        ffbrVar10.getClass();
        this.j = ffbrVar10;
        ffbrVar11.getClass();
        this.k = ffbrVar11;
        ffbrVar12.getClass();
        this.l = ffbrVar12;
        ffbrVar13.getClass();
        this.m = ffbrVar13;
        ffbrVar14.getClass();
        this.n = ffbrVar14;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessFileTransferAction c(Parcel parcel) {
        bdvi bdviVar = (bdvi) this.a.b();
        bdviVar.getClass();
        bbgg bbggVar = (bbgg) this.b.b();
        bbggVar.getClass();
        cisl cislVar = (cisl) this.c.b();
        cislVar.getClass();
        cqoh cqohVar = (cqoh) this.f.b();
        cqohVar.getClass();
        altk altkVar = (altk) this.g.b();
        altkVar.getClass();
        ctvb ctvbVar = (ctvb) this.h.b();
        ctvbVar.getClass();
        dtuu dtuuVar = (dtuu) this.i.b();
        dtuuVar.getClass();
        Optional optional = (Optional) this.j.b();
        optional.getClass();
        crga crgaVar = (crga) this.k.b();
        crgaVar.getClass();
        parcel.getClass();
        ffbr ffbrVar = this.m;
        ffbr ffbrVar2 = this.n;
        return new ProcessFileTransferAction(bdviVar, bbggVar, cislVar, this.d, this.e, cqohVar, altkVar, ctvbVar, dtuuVar, optional, this.l, crgaVar, ffbrVar, ffbrVar2, parcel);
    }

    public final ProcessFileTransferAction b(Event event) {
        bdvi bdviVar = (bdvi) this.a.b();
        bdviVar.getClass();
        bbgg bbggVar = (bbgg) this.b.b();
        bbggVar.getClass();
        cisl cislVar = (cisl) this.c.b();
        cislVar.getClass();
        cqoh cqohVar = (cqoh) this.f.b();
        cqohVar.getClass();
        altk altkVar = (altk) this.g.b();
        altkVar.getClass();
        ctvb ctvbVar = (ctvb) this.h.b();
        ctvbVar.getClass();
        dtuu dtuuVar = (dtuu) this.i.b();
        dtuuVar.getClass();
        Optional optional = (Optional) this.j.b();
        optional.getClass();
        crga crgaVar = (crga) this.k.b();
        crgaVar.getClass();
        event.getClass();
        return new ProcessFileTransferAction(bdviVar, bbggVar, cislVar, this.d, this.e, cqohVar, altkVar, ctvbVar, dtuuVar, optional, crgaVar, this.l, this.m, this.n, event);
    }
}
