package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ci implements Parcelable {
    public static final Parcelable.Creator<ci> CREATOR = new ch();
    final int[] a;
    final ArrayList b;
    final int[] c;
    final int[] d;
    final int e;
    final String f;
    final int g;
    final int h;
    final CharSequence i;
    final int j;
    final CharSequence k;
    final ArrayList l;
    final ArrayList m;
    final boolean n;

    public ci(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }

    public final void a(cg cgVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.a;
            boolean z = true;
            if (i >= iArr.length) {
                cgVar.j = this.e;
                cgVar.m = this.f;
                cgVar.k = true;
                cgVar.n = this.h;
                cgVar.o = this.i;
                cgVar.p = this.j;
                cgVar.q = this.k;
                cgVar.r = this.l;
                cgVar.s = this.m;
                cgVar.t = this.n;
                return;
            }
            gf gfVar = new gf();
            int i3 = i + 1;
            gfVar.a = iArr[i];
            if (fr.af(2)) {
                Log.v("FragmentManager", "Instantiate " + cgVar + " op #" + i2 + " base fragment #" + this.a[i3]);
            }
            gfVar.h = lkj.values()[this.c[i2]];
            gfVar.i = lkj.values()[this.d[i2]];
            int[] iArr2 = this.a;
            int i4 = i + 2;
            if (iArr2[i3] == 0) {
                z = false;
            }
            gfVar.c = z;
            int i5 = iArr2[i4];
            gfVar.d = i5;
            int i6 = iArr2[i + 3];
            gfVar.e = i6;
            int i7 = i + 5;
            int i8 = iArr2[i + 4];
            gfVar.f = i8;
            i += 6;
            int i9 = iArr2[i7];
            gfVar.g = i9;
            cgVar.f = i5;
            cgVar.g = i6;
            cgVar.h = i8;
            cgVar.i = i9;
            cgVar.r(gfVar);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public ci(cg cgVar) {
        int size = cgVar.e.size();
        this.a = new int[size * 6];
        if (cgVar.k) {
            this.b = new ArrayList(size);
            this.c = new int[size];
            this.d = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                gf gfVar = (gf) cgVar.e.get(i2);
                int i3 = i + 1;
                this.a[i] = gfVar.a;
                ArrayList arrayList = this.b;
                ea eaVar = gfVar.b;
                arrayList.add(eaVar != null ? eaVar.l : null);
                int[] iArr = this.a;
                iArr[i3] = gfVar.c ? 1 : 0;
                iArr[i + 2] = gfVar.d;
                iArr[i + 3] = gfVar.e;
                int i4 = i + 5;
                iArr[i + 4] = gfVar.f;
                i += 6;
                iArr[i4] = gfVar.g;
                this.c[i2] = gfVar.h.ordinal();
                this.d[i2] = gfVar.i.ordinal();
            }
            this.e = cgVar.j;
            this.f = cgVar.m;
            this.g = cgVar.c;
            this.h = cgVar.n;
            this.i = cgVar.o;
            this.j = cgVar.p;
            this.k = cgVar.q;
            this.l = cgVar.r;
            this.m = cgVar.s;
            this.n = cgVar.t;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }
}
