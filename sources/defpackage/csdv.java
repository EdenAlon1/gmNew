package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csdv {
    public final ffbr a;

    public csdv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar2;
    }

    public static final csgv a(MessageIdType messageIdType) {
        return new csgv("Cannot create message reply. CmsId does not exist for replied-to message.", engw.r(new csgn(messageIdType.toString(), 3)));
    }
}
