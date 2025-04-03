package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bavx implements bbgd {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bavx(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final SanitizeParticipantsAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        dtuu dtuuVar = (dtuu) this.d.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, dtuuVar, parcel);
    }

    @Override // defpackage.bbgd
    public final /* bridge */ /* synthetic */ Action b() {
        Context context = (Context) this.a.b();
        context.getClass();
        dtuu dtuuVar = (dtuu) this.d.b();
        dtuuVar.getClass();
        return new SanitizeParticipantsAction(context, this.b, this.c, dtuuVar);
    }
}
