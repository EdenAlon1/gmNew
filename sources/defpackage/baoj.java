package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baoj implements bbfr {
    private final ffbr a;
    private final ffbr b;

    public baoj(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action a(MessageIdType messageIdType, String str, int i, int i2) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        return new ProcessSentMessageAction(baoiVar, messageIdType, str, i, i2);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action b(int i, Uri uri, Bundle bundle) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        uri.getClass();
        bundle.getClass();
        return new ProcessSentMessageAction(baoiVar, i, uri, bundle);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        parcel.getClass();
        return new ProcessSentMessageAction(baoiVar, parcel);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action d(bdhg bdhgVar, int i, long j, long j2, Duration duration) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        duration.getClass();
        return new ProcessSentMessageAction(baoiVar, bdhgVar, i, j, j2, duration);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action e(bdhg bdhgVar, int i, Instant instant, eopq eopqVar, awyp awypVar) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        instant.getClass();
        eopqVar.getClass();
        awypVar.getClass();
        return new ProcessSentMessageAction(baoiVar, bdhgVar, i, instant, eopqVar, awypVar);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action f(bdhg bdhgVar, awud awudVar, Instant instant, boolean z, eopq eopqVar, awyp awypVar, eqxi eqxiVar) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        awudVar.getClass();
        instant.getClass();
        eopqVar.getClass();
        awypVar.getClass();
        return new ProcessSentMessageAction(baoiVar, bdhgVar, awudVar, instant, z, eopqVar, awypVar, eqxiVar);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action g(bdgr bdgrVar, int i, int i2) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        return new ProcessSentMessageAction(baoiVar, bdgrVar, i, i2);
    }

    @Override // defpackage.bbfr
    public final /* synthetic */ Action h(MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        coxc coxcVar = (coxc) this.b.b();
        coxcVar.getClass();
        return new ProcessSentMessageAction(baoiVar, coxcVar, messageIdType, uri, i, i2, i3, i4, str, bool);
    }

    @Override // defpackage.bbfr
    public final /* bridge */ /* synthetic */ Action i(MessageIdType messageIdType, bdhg bdhgVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, eqxi eqxiVar, eopp eoppVar) {
        baoi baoiVar = (baoi) this.a.b();
        baoiVar.getClass();
        messageIdType.getClass();
        eoppVar.getClass();
        return new ProcessSentMessageAction(baoiVar, messageIdType, bdhgVar, uri, uri2, i, i2, i3, i4, eqxiVar, eoppVar);
    }
}
