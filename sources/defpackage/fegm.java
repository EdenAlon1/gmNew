package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegm implements febi {
    private final Parcelable.Creator a;
    private final boolean b;

    public fegm(Parcelable.Creator creator, boolean z) {
        this.a = creator;
        this.b = z;
    }

    @Override // defpackage.febi
    public final /* bridge */ /* synthetic */ InputStream a(Object obj) {
        boolean z = this.b;
        return new fegz(this.a, (Parcelable) obj, z);
    }

    @Override // defpackage.febi
    public final /* bridge */ /* synthetic */ Object b(InputStream inputStream) {
        if (!(inputStream instanceof fegz)) {
            throw new UnsupportedOperationException("Can't unmarshall a parcelable from a regular byte stream");
        }
        fegz fegzVar = (fegz) inputStream;
        if (fegzVar.b) {
            return fegzVar.c;
        }
        if (fegzVar.e == null) {
            Parcelable parcelable = fegzVar.c;
            Parcelable.Creator creator = fegzVar.a;
            creator.getClass();
            Parcel obtain = Parcel.obtain();
            parcelable.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            Parcelable parcelable2 = (Parcelable) creator.createFromParcel(obtain);
            obtain.recycle();
            fegzVar.e = parcelable2;
        }
        return fegzVar.e;
    }
}
