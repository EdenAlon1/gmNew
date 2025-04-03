package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.FillPartSizeAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class baeh implements bbck {
    public final ffbr a;
    public final ffbr b;

    public baeh(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dtuu dtuuVar = (dtuu) this.b.b();
        dtuuVar.getClass();
        parcel.getClass();
        return new FillPartSizeAction(this.a, dtuuVar, parcel);
    }
}
