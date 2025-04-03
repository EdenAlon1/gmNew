package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.akvz;
import defpackage.altk;
import defpackage.asvn;
import defpackage.bauw;
import defpackage.baux;
import defpackage.bbfg;
import defpackage.bdtd;
import defpackage.bdve;
import defpackage.cbif;
import defpackage.cbut;
import defpackage.cqoh;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.entd;
import defpackage.eogt;
import defpackage.errl;
import defpackage.ffbr;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ResendMessageAction extends Action<MessageCoreData> implements Parcelable {
    private final ffbr A;
    private final ffbr B;
    private final ffbr C;
    public final altk a;
    public final ffbr b;
    public final AtomicReference c;
    public final baux d;
    private final ffbr f;
    private final bdtd g;
    private final cqoh h;
    private final cbif i;
    private final akvz j;
    private final bdve k;
    private final cbut l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final errl p;
    private final asvn q;
    private final ffbr y;
    private final ffbr z;
    private static final entd e = entd.c("BugleDataModel");
    public static final Parcelable.Creator<Action<MessageCoreData>> CREATOR = new bauw();

    /* compiled from: PG */
    public interface a {
        bbfg ba();
    }

    public ResendMessageAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, bdtd bdtdVar, cqoh cqohVar, cbif cbifVar, altk altkVar, akvz akvzVar, bdve bdveVar, cbut cbutVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, MessageIdType messageIdType, MessageUsageStatisticsData messageUsageStatisticsData, ffbr ffbrVar7, errl errlVar, asvn asvnVar, ffbr ffbrVar8, ffbr ffbrVar9, AtomicReference atomicReference, ffbr ffbrVar10) {
        super(eogt.RESEND_MESSAGE_ACTION);
        this.d = new baux();
        this.A = ffbrVar;
        this.B = ffbrVar3;
        this.f = ffbrVar2;
        this.g = bdtdVar;
        this.h = cqohVar;
        this.i = cbifVar;
        this.a = altkVar;
        this.j = akvzVar;
        this.k = bdveVar;
        this.l = cbutVar;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.b = ffbrVar7;
        this.p = errlVar;
        this.q = asvnVar;
        this.y = ffbrVar8;
        this.z = ffbrVar9;
        this.c = atomicReference;
        this.C = ffbrVar10;
        this.t.v("message_id", messageIdType.b());
        this.t.t("message_usage_stats_data", messageUsageStatisticsData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ResendMessageAction");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01ef  */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 985
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.action.ResendMessageAction.b():java.lang.Object");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ResendMessage.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ResendMessageAction(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, bdtd bdtdVar, cqoh cqohVar, cbif cbifVar, altk altkVar, akvz akvzVar, bdve bdveVar, cbut cbutVar, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, asvn asvnVar, ffbr ffbrVar8, ffbr ffbrVar9, AtomicReference atomicReference, ffbr ffbrVar10, Parcel parcel) {
        super(parcel, eogt.RESEND_MESSAGE_ACTION);
        this.d = new baux();
        this.A = ffbrVar;
        this.B = ffbrVar3;
        this.f = ffbrVar2;
        this.g = bdtdVar;
        this.h = cqohVar;
        this.i = cbifVar;
        this.a = altkVar;
        this.j = akvzVar;
        this.k = bdveVar;
        this.l = cbutVar;
        this.m = ffbrVar4;
        this.n = ffbrVar5;
        this.o = ffbrVar6;
        this.b = ffbrVar7;
        this.p = errlVar;
        this.q = asvnVar;
        this.y = ffbrVar8;
        this.z = ffbrVar9;
        this.c = atomicReference;
        this.C = ffbrVar10;
    }
}
