package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.PauseRcsFileTransferAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bajc implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public bajc(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
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
    }

    public final /* bridge */ /* synthetic */ Action a(MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        errl errlVar = (errl) this.b.b();
        errlVar.getClass();
        cqos cqosVar = (cqos) this.d.b();
        cqosVar.getClass();
        awah awahVar = (awah) this.f.b();
        awahVar.getClass();
        messageIdType.getClass();
        ffbr ffbrVar = this.g;
        return new PauseRcsFileTransferAction(context, errlVar, this.c, cqosVar, this.e, awahVar, ffbrVar, messageIdType);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        errl errlVar = (errl) this.b.b();
        errlVar.getClass();
        cqos cqosVar = (cqos) this.d.b();
        cqosVar.getClass();
        awah awahVar = (awah) this.f.b();
        awahVar.getClass();
        parcel.getClass();
        ffbr ffbrVar = this.g;
        return new PauseRcsFileTransferAction(context, errlVar, this.c, cqosVar, this.e, awahVar, ffbrVar, parcel);
    }
}
