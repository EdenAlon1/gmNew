package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.diagnostics.LogTelephonyDatabaseAction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acev extends aceu {
    public final ffbr a;

    public acev(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LogTelephonyDatabaseAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        parcel.getClass();
        return new LogTelephonyDatabaseAction(context, parcel);
    }
}
