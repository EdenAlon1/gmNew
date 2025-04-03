package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessPendingRevocationsAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bany implements bbck {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;

    public bany(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
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
    public final ProcessPendingRevocationsAction c(Parcel parcel) {
        bbfq bbfqVar = (bbfq) this.b.b();
        bbfqVar.getClass();
        parcel.getClass();
        return new ProcessPendingRevocationsAction(this.a, bbfqVar, this.c, this.d, parcel);
    }
}
