package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessExpressiveStickerAttachmentAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamz implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;

    public bamz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ProcessExpressiveStickerAttachmentAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        ((csum) this.c.b()).getClass();
        cqoh cqohVar = (cqoh) this.d.b();
        cqohVar.getClass();
        parcel.getClass();
        return new ProcessExpressiveStickerAttachmentAction(context, this.b, cqohVar, parcel);
    }
}
