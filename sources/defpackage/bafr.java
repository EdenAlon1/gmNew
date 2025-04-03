package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.HandleLowStorageAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafr implements bbck {
    private final ffbr a;

    public bafr(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final HandleLowStorageAction c(Parcel parcel) {
        coxb coxbVar = (coxb) this.a.b();
        coxbVar.getClass();
        parcel.getClass();
        return new HandleLowStorageAction(coxbVar, parcel);
    }

    public final HandleLowStorageAction b(int i, long j) {
        coxb coxbVar = (coxb) this.a.b();
        coxbVar.getClass();
        return new HandleLowStorageAction(coxbVar, i, j);
    }
}
