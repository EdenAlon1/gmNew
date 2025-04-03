package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbax implements bbck {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public bbax(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
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
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        bbbe bbbeVar = (bbbe) this.c.b();
        bbbeVar.getClass();
        bbbh bbbhVar = (bbbh) this.d.b();
        bbbhVar.getClass();
        parcel.getClass();
        return new WaitForRcsServiceConnectionAction(bbbeVar, bbbhVar, parcel);
    }
}
