package com.google.android.apps.messaging.shared.datamodel.data.common.statsdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import defpackage.bczf;
import defpackage.elfl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eonv;
import defpackage.eooe;
import defpackage.eoog;
import defpackage.eooi;
import defpackage.eooo;
import defpackage.eoxo;
import defpackage.erre;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class MessageUsageStatisticsDataImpl implements MessageUsageStatisticsData {
    public eooi a;
    public DeviceData c;
    public int d;
    public eoog e;

    @Deprecated
    public eonv f;
    public eooo g;
    public eooe h;
    public eoxo i;
    public int j;
    public long k;
    public Optional l;
    public Optional m;
    private final boolean o;
    private static final enru n = enru.c("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl");
    public static final Parcelable.Creator<MessageUsageStatisticsData> CREATOR = new bczf();

    public MessageUsageStatisticsDataImpl() {
        this(eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int a() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final int b() {
        return this.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final long c() {
        return this.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final DeviceData d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final MessageUsageStatisticsData e() {
        final MessageUsageStatisticsDataImpl messageUsageStatisticsDataImpl = new MessageUsageStatisticsDataImpl();
        messageUsageStatisticsDataImpl.a = this.a;
        DeviceData deviceData = this.c;
        if (deviceData != null) {
            DeviceData deviceData2 = new DeviceData(deviceData.a);
            deviceData2.c = deviceData.c;
            deviceData2.b = deviceData.b;
            deviceData2.d = deviceData.d;
            messageUsageStatisticsDataImpl.c = deviceData2;
        } else {
            messageUsageStatisticsDataImpl.c = null;
        }
        messageUsageStatisticsDataImpl.d = this.d;
        messageUsageStatisticsDataImpl.e = this.e;
        messageUsageStatisticsDataImpl.f = this.f;
        messageUsageStatisticsDataImpl.g = this.g;
        messageUsageStatisticsDataImpl.h = this.h;
        messageUsageStatisticsDataImpl.i = this.i;
        messageUsageStatisticsDataImpl.j = this.j;
        messageUsageStatisticsDataImpl.k = this.k;
        this.l.ifPresent(new Consumer() { // from class: bczd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MessageUsageStatisticsDataImpl.this.l = Optional.of((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.m.ifPresent(new Consumer() { // from class: bcze
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                MessageUsageStatisticsDataImpl.this.m = Optional.of((Boolean) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return messageUsageStatisticsDataImpl;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final elfl f() {
        return elfl.g(erre.a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eonv g() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooe h() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eoog i() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooi j() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eooo k() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final eoxo l() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional m() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final Optional n() {
        return this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void o(eoog eoogVar) {
        this.e = eoogVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void p(eoxo eoxoVar) {
        this.i = eoxoVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void q() {
        this.h = eooe.MANUAL_FALLBACK;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void r(DeviceData deviceData) {
        this.c = deviceData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void s(eooi eooiVar) {
        if (eooiVar == null) {
            eooiVar = eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE;
        }
        this.a = eooiVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final void t() {
        this.g = eooo.WAS_RCS_CONVERSATION;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData
    public final boolean u() {
        return this.o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.J);
        parcel.writeParcelable(this.c, i);
        parcel.writeInt(this.d);
        parcel.writeInt(-1);
        parcel.writeInt(this.e.d);
        parcel.writeInt(this.f.d);
        parcel.writeInt(this.g.d);
        parcel.writeInt(this.h.p);
        parcel.writeInt(this.j);
        parcel.writeLong(this.k);
        eoxo eoxoVar = this.i;
        parcel.writeByteArray(eoxoVar != null ? eoxoVar.toByteArray() : new byte[0]);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
    }

    public MessageUsageStatisticsDataImpl(Parcel parcel) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        eooi b = eooi.b(parcel.readInt());
        this.a = b == null ? eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE : b;
        this.c = (DeviceData) parcel.readParcelable(DeviceData.class.getClassLoader());
        this.d = parcel.readInt();
        parcel.readInt();
        this.e = (eoog) Optional.ofNullable(eoog.b(parcel.readInt())).orElse(eoog.UNKNOWN_RESEND_ATTEMPT);
        this.f = (eonv) Optional.ofNullable(eonv.b(parcel.readInt())).orElse(eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (eooo) Optional.ofNullable(eooo.b(parcel.readInt())).orElse(eooo.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (eooe) Optional.ofNullable(eooe.b(parcel.readInt())).orElse(eooe.UNKNOWN_RCS_STATUS_REASON);
        this.j = parcel.readInt();
        this.k = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray != null && createByteArray.length > 0) {
            try {
                this.i = (eoxo) eyfy.parseFrom(eoxo.a, createByteArray, eyfc.a());
            } catch (eygu e) {
                ensk j = n.j();
                j.Y(ente.a, "BugleUsageStatistics");
                ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/datamodel/data/common/statsdata/MessageUsageStatisticsDataImpl", "<init>", (char) 127, "MessageUsageStatisticsDataImpl.java")).q("failed to unparcel ConversationProtocolConditions");
            }
        }
        this.o = parcel.readByte() != 0;
    }

    public MessageUsageStatisticsDataImpl(eooi eooiVar) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = eooiVar;
        this.e = eoog.UNKNOWN_RESEND_ATTEMPT;
        this.f = eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON;
        this.g = eooo.UNKNOWN_WAS_RCS_CONVERSATION;
        this.h = eooe.UNKNOWN_RCS_STATUS_REASON;
        this.o = false;
    }

    public MessageUsageStatisticsDataImpl(eooi eooiVar, DeviceData deviceData, int i, eoog eoogVar, eonv eonvVar, eooo eoooVar, eooe eooeVar, eoxo eoxoVar, int i2, long j) {
        this.d = 0;
        this.l = Optional.empty();
        this.m = Optional.empty();
        this.a = eooiVar == null ? eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE : eooiVar;
        this.c = deviceData;
        this.d = i;
        this.e = (eoog) Optional.ofNullable(eoogVar).orElse(eoog.UNKNOWN_RESEND_ATTEMPT);
        this.f = (eonv) Optional.ofNullable(eonvVar).orElse(eonv.UNKNOWN_INSTANT_MESSAGING_ALWAYS_ON);
        this.g = (eooo) Optional.ofNullable(eoooVar).orElse(eooo.UNKNOWN_WAS_RCS_CONVERSATION);
        this.h = (eooe) Optional.ofNullable(eooeVar).orElse(eooe.UNKNOWN_RCS_STATUS_REASON);
        this.i = eoxoVar;
        this.j = i2;
        this.k = j;
        this.o = true;
    }
}
