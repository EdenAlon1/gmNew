package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.EnsureConnectivityStabilizedAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class badt implements bbck {
    public final ffbr a;
    public final ffbr b;

    public badt(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final EnsureConnectivityStabilizedAction c(Parcel parcel) {
        csjk csjkVar = (csjk) this.a.b();
        csjkVar.getClass();
        akzt akztVar = (akzt) this.b.b();
        akztVar.getClass();
        parcel.getClass();
        return new EnsureConnectivityStabilizedAction(csjkVar, akztVar, parcel);
    }
}
