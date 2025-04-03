package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateAttachmentAfterResizingAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bazm implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bazm(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    public final /* bridge */ /* synthetic */ Action a(String str, String str2, String str3, byzc byzcVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((cbia) this.b.b()).getClass();
        bdor bdorVar = (bdor) this.c.b();
        bdorVar.getClass();
        dtuu dtuuVar = (dtuu) this.d.b();
        dtuuVar.getClass();
        str.getClass();
        str2.getClass();
        byzcVar.getClass();
        return new UpdateAttachmentAfterResizingAction(context, bdorVar, dtuuVar, str, str2, str3, byzcVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((cbia) this.b.b()).getClass();
        bdor bdorVar = (bdor) this.c.b();
        bdorVar.getClass();
        dtuu dtuuVar = (dtuu) this.d.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new UpdateAttachmentAfterResizingAction(context, bdorVar, dtuuVar, parcel);
    }
}
