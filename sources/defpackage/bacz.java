package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.CountryCodeDetectorAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bacz implements bbck {
    private final ffbr a;

    public bacz(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CountryCodeDetectorAction c(Parcel parcel) {
        ctvi ctviVar = (ctvi) this.a.b();
        ctviVar.getClass();
        parcel.getClass();
        return new CountryCodeDetectorAction(ctviVar, parcel);
    }

    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        ctvi ctviVar = (ctvi) this.a.b();
        ctviVar.getClass();
        return new CountryCodeDetectorAction(ctviVar);
    }
}
