package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GetFrecentConversationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafk extends bbfa {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public bafk(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
    }

    @Override // defpackage.bbfa
    public final /* bridge */ /* synthetic */ Action a() {
        crpr crprVar = (crpr) this.b.b();
        crprVar.getClass();
        azwd azwdVar = (azwd) this.c.b();
        azwdVar.getClass();
        return new GetFrecentConversationsAction(this.a, crprVar, azwdVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        crpr crprVar = (crpr) this.b.b();
        crprVar.getClass();
        azwd azwdVar = (azwd) this.c.b();
        azwdVar.getClass();
        parcel.getClass();
        return new GetFrecentConversationsAction(this.a, crprVar, azwdVar, parcel);
    }
}
