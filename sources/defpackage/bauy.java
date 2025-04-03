package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bauy extends bbfg {
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
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;

    public bauy(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20) {
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
        ffbrVar15.getClass();
        this.o = ffbrVar15;
        ffbrVar16.getClass();
        this.p = ffbrVar16;
        ffbrVar17.getClass();
        this.q = ffbrVar17;
        ffbrVar18.getClass();
        this.r = ffbrVar18;
        ffbrVar19.getClass();
        this.s = ffbrVar19;
        ffbrVar20.getClass();
        this.t = ffbrVar20;
    }

    @Override // defpackage.bbfg
    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData) {
        bdtd bdtdVar = (bdtd) this.d.b();
        bdtdVar.getClass();
        cqoh cqohVar = (cqoh) this.e.b();
        cqohVar.getClass();
        cbif cbifVar = (cbif) this.f.b();
        cbifVar.getClass();
        altk altkVar = (altk) this.g.b();
        altkVar.getClass();
        akvz akvzVar = (akvz) this.h.b();
        akvzVar.getClass();
        bdve bdveVar = (bdve) this.i.b();
        bdveVar.getClass();
        cbut cbutVar = (cbut) this.j.b();
        cbutVar.getClass();
        messageIdType.getClass();
        errl errlVar = (errl) this.o.b();
        errlVar.getClass();
        asvn asvnVar = (asvn) this.p.b();
        asvnVar.getClass();
        AtomicReference atomicReference = (AtomicReference) this.s.b();
        atomicReference.getClass();
        ffbr ffbrVar = this.t;
        ffbr ffbrVar2 = this.q;
        ffbr ffbrVar3 = this.r;
        ffbr ffbrVar4 = this.n;
        return new ResendMessageAction(this.a, this.b, this.c, bdtdVar, cqohVar, cbifVar, altkVar, akvzVar, bdveVar, cbutVar, this.k, this.l, this.m, messageIdType, messageUsageStatisticsData, ffbrVar4, errlVar, asvnVar, ffbrVar2, ffbrVar3, atomicReference, ffbrVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bdtd bdtdVar = (bdtd) this.d.b();
        bdtdVar.getClass();
        cqoh cqohVar = (cqoh) this.e.b();
        cqohVar.getClass();
        cbif cbifVar = (cbif) this.f.b();
        cbifVar.getClass();
        altk altkVar = (altk) this.g.b();
        altkVar.getClass();
        akvz akvzVar = (akvz) this.h.b();
        akvzVar.getClass();
        bdve bdveVar = (bdve) this.i.b();
        bdveVar.getClass();
        cbut cbutVar = (cbut) this.j.b();
        cbutVar.getClass();
        errl errlVar = (errl) this.o.b();
        errlVar.getClass();
        asvn asvnVar = (asvn) this.p.b();
        asvnVar.getClass();
        AtomicReference atomicReference = (AtomicReference) this.s.b();
        atomicReference.getClass();
        parcel.getClass();
        ffbr ffbrVar = this.t;
        ffbr ffbrVar2 = this.q;
        ffbr ffbrVar3 = this.r;
        return new ResendMessageAction(this.a, this.b, this.c, bdtdVar, cqohVar, cbifVar, altkVar, akvzVar, bdveVar, cbutVar, this.k, this.l, this.m, this.n, errlVar, asvnVar, ffbrVar2, ffbrVar3, atomicReference, ffbrVar, parcel);
    }
}
