package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.execution.DeferBackgroundWorkAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbef implements bbck {
    public final ffbr a;

    public bbef(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final DeferBackgroundWorkAction c(Parcel parcel) {
        bbdv bbdvVar = (bbdv) this.a.b();
        bbdvVar.getClass();
        parcel.getClass();
        return new DeferBackgroundWorkAction(bbdvVar, parcel);
    }
}
