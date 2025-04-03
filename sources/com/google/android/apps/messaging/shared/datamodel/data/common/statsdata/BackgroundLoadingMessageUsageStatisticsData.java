package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import defpackage.axol;
import defpackage.bcyz;
import defpackage.bcza;
import defpackage.bczb;
import defpackage.elfl;
import defpackage.eonv;
import defpackage.eooe;
import defpackage.eoog;
import defpackage.eooi;
import defpackage.eooo;
import defpackage.eoxo;
import defpackage.erqt;
import defpackage.ffhe;
import defpackage.ffqz;
import defpackage.ffsk;
import defpackage.ffsm;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class BackgroundLoadingMessageUsageStatisticsData implements MessageUsageStatisticsData {

    @UsedByReflection
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR;
    public elfl a;
    private eooi c;
    private final ffsk d;

    static {
        Parcelable.Creator<MessageUsageStatisticsData> creator = MessageUsageStatisticsDataImpl.CREATOR;
        creator.getClass();
        CREATOR = creator;
    }

    public BackgroundLoadingMessageUsageStatisticsData(elfl<MessageUsageStatisticsDataImpl> elflVar, eooi eooiVar, ffsk ffskVar) {
        elflVar.getClass();
        eooiVar.getClass();
        ffskVar.getClass();
        this.a = elflVar;
        this.c = eooiVar;
        this.d = ffskVar;
    }

    private final MessageUsageStatisticsDataImpl v() {
        Object q = erqt.q(this.a);
        q.getClass();
        return (MessageUsageStatisticsDataImpl) q;
    }

    private final elfl w(elfl elflVar) {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new bcyz(elflVar, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return v().d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return v().j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return v().k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return v().c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        elfl w = w(this.a);
        this.a = w(this.a);
        return new BackgroundLoadingMessageUsageStatisticsData(w, this.c, this.d);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elfl f() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new bcza(this, null));
        return c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eonv g() {
        eonv eonvVar = v().f;
        eonvVar.getClass();
        return eonvVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooe h() {
        eooe eooeVar = v().h;
        eooeVar.getClass();
        return eooeVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eoog i() {
        eoog eoogVar = v().e;
        eoogVar.getClass();
        return eoogVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooi j() {
        return this.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooo k() {
        eooo eoooVar = v().g;
        eoooVar.getClass();
        return eoooVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eoxo l() {
        return v().i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        Optional optional = v().l;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        Optional optional = v().m;
        optional.getClass();
        return optional;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(eoog eoogVar) {
        eoogVar.getClass();
        v().e = eoogVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(eoxo eoxoVar) {
        v().i = eoxoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        v().q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        v().c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s(eooi eooiVar) {
        eooiVar.getClass();
        this.c = eooiVar;
        v().s(eooiVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void t() {
        v().t();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean u() {
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        ffqz.a(ffhe.a, new bczb(this, parcel, i, null));
    }
}
