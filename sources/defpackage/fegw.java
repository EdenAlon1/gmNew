package defpackage;

import android.os.Parcel;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fegw extends fegx {
    public febo a;
    public Status b;
    public febo c;

    public fegw(fefu fefuVar, int i, fevo fevoVar) {
        super(fefuVar, i, fevoVar);
    }

    @Override // defpackage.fegx
    protected final int a(Parcel parcel) {
        fegn.b(parcel, this.a);
        return 0;
    }

    @Override // defpackage.fegx
    protected final int b(Parcel parcel) {
        int a = feho.a(parcel, this.b);
        fegn.b(parcel, this.c);
        this.d.u(this.e);
        return a;
    }
}
