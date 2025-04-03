package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pcm extends pcl {
    private final SparseIntArray d;
    private final Parcel e;
    private final int f;
    private final int g;
    private final String h;
    private int i;
    private int j;
    private int k;

    public pcm(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new cpn(), new cpn(), new cpn());
    }

    @Override // defpackage.pcl
    public final boolean A(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.e.setDataPosition(this.j);
            Parcel parcel = this.e;
            int readInt = parcel.readInt();
            this.k = parcel.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // defpackage.pcl
    public final byte[] B() {
        int readInt = this.e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.e.readByteArray(bArr);
        return bArr;
    }

    @Override // defpackage.pcl
    public final int a() {
        return this.e.readInt();
    }

    @Override // defpackage.pcl
    public final Parcelable c() {
        return this.e.readParcelable(getClass().getClassLoader());
    }

    @Override // defpackage.pcl
    protected final pcl e() {
        int dataPosition = this.e.dataPosition();
        int i = this.j;
        if (i == this.f) {
            i = this.g;
        }
        int i2 = i;
        Parcel parcel = this.e;
        String str = this.h;
        return new pcm(parcel, dataPosition, i2, str.concat("  "), this.a, this.b, this.c);
    }

    @Override // defpackage.pcl
    protected final CharSequence g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.e);
    }

    @Override // defpackage.pcl
    public final String i() {
        return this.e.readString();
    }

    @Override // defpackage.pcl
    public final void k() {
        int i = this.i;
        if (i >= 0) {
            SparseIntArray sparseIntArray = this.d;
            Parcel parcel = this.e;
            int i2 = sparseIntArray.get(i);
            int dataPosition = parcel.dataPosition();
            this.e.setDataPosition(i2);
            this.e.writeInt(dataPosition - i2);
            this.e.setDataPosition(dataPosition);
        }
    }

    @Override // defpackage.pcl
    public final void l(int i) {
        k();
        this.i = i;
        this.d.put(i, this.e.dataPosition());
        r(0);
        r(i);
    }

    @Override // defpackage.pcl
    public final void m(boolean z) {
        this.e.writeInt(z ? 1 : 0);
    }

    @Override // defpackage.pcl
    public final void o(byte[] bArr) {
        this.e.writeInt(bArr.length);
        this.e.writeByteArray(bArr);
    }

    @Override // defpackage.pcl
    protected final void p(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.e, 0);
    }

    @Override // defpackage.pcl
    public final void r(int i) {
        this.e.writeInt(i);
    }

    @Override // defpackage.pcl
    public final void t(Parcelable parcelable) {
        this.e.writeParcelable(parcelable, 0);
    }

    @Override // defpackage.pcl
    public final void v(String str) {
        this.e.writeString(str);
    }

    @Override // defpackage.pcl
    public final boolean y() {
        return this.e.readInt() != 0;
    }

    private pcm(Parcel parcel, int i, int i2, String str, cpn cpnVar, cpn cpnVar2, cpn cpnVar3) {
        super(cpnVar, cpnVar2, cpnVar3);
        this.d = new SparseIntArray();
        this.i = -1;
        this.k = -1;
        this.e = parcel;
        this.f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }
}
