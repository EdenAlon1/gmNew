package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ga implements Parcelable {
    public static final Parcelable.Creator<ga> CREATOR = new fz();
    final String a;
    final String b;
    final boolean c;
    final boolean d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final boolean j;
    final boolean k;
    final int l;
    final String m;
    final int n;
    final boolean o;

    public ga(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readInt();
        this.o = parcel.readInt() != 0;
    }

    final ea a(em emVar) {
        ea b = emVar.b(this.a);
        b.l = this.b;
        b.v = this.c;
        b.x = this.d;
        b.y = true;
        b.F = this.e;
        b.G = this.f;
        b.H = this.g;
        b.K = this.h;
        b.s = this.i;
        b.J = this.j;
        b.I = this.k;
        b.Y = lkj.values()[this.l];
        b.o = this.m;
        b.p = this.n;
        b.S = this.o;
        return b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.a);
        sb.append(" (");
        sb.append(this.b);
        sb.append(")}:");
        if (this.c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        if (this.f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.k) {
            sb.append(" hidden");
        }
        if (this.m != null) {
            sb.append(" targetWho=");
            sb.append(this.m);
            sb.append(" targetRequestCode=");
            sb.append(this.n);
        }
        if (this.o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public ga(ea eaVar) {
        this.a = eaVar.getClass().getName();
        this.b = eaVar.l;
        this.c = eaVar.v;
        this.d = eaVar.x;
        this.e = eaVar.F;
        this.f = eaVar.G;
        this.g = eaVar.H;
        this.h = eaVar.K;
        this.i = eaVar.s;
        this.j = eaVar.J;
        this.k = eaVar.I;
        this.l = eaVar.Y.ordinal();
        this.m = eaVar.o;
        this.n = eaVar.p;
        this.o = eaVar.S;
    }
}
