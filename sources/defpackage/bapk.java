package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.ReceiveMmsMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapk implements bbck {
    private final ffbr a;
    private final ffbr b;

    public bapk(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
    }

    public final /* bridge */ /* synthetic */ Action a(int i, byte[] bArr, long j, int i2, int i3) {
        barb barbVar = (barb) this.a.b();
        barbVar.getClass();
        return new ReceiveMmsMessageAction(i, bArr, j, i2, i3, barbVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        parcel.getClass();
        barb barbVar = (barb) this.b.b();
        barbVar.getClass();
        return new ReceiveMmsMessageAction(parcel, barbVar);
    }
}
