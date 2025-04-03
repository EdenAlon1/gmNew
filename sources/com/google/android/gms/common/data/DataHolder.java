package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.dfuy;
import defpackage.dfuz;
import defpackage.dfva;
import defpackage.dfwv;
import defpackage.dfxk;
import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new dfva();
    public static final dfuz a = new dfuy(new String[0]);
    final int b;
    public final String[] c;
    public Bundle d;
    public final CursorWindow[] e;
    public final int f;
    public final Bundle g;
    int[] h;
    public int i;
    boolean j;
    private final boolean k;

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.j = false;
        this.k = true;
        this.b = i;
        this.c = strArr;
        this.e = cursorWindowArr;
        this.f = i2;
        this.g = bundle;
    }

    public final int a(int i) {
        int length;
        int i2 = 0;
        dfwv.i(i >= 0 && i < this.i);
        while (true) {
            int[] iArr = this.h;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    public final String b(String str, int i, int i2) {
        c(str, i);
        return this.e[i2].getString(i, this.d.getInt(str));
    }

    public final void c(String str, int i) {
        Bundle bundle = this.d;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (e()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.i) {
            throw new CursorIndexOutOfBoundsException(i, this.i);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.j) {
                this.j = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.e;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    public final void d() {
        this.d = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.c;
            if (i2 >= strArr.length) {
                break;
            }
            this.d.putInt(strArr[i2], i2);
            i2++;
        }
        this.h = new int[this.e.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.e;
            if (i >= cursorWindowArr.length) {
                this.i = i3;
                return;
            }
            this.h[i] = i3;
            i3 += this.e[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
            i++;
        }
    }

    public final boolean e() {
        boolean z;
        synchronized (this) {
            z = this.j;
        }
        return z;
    }

    protected final void finalize() {
        try {
            if (this.k && this.e.length > 0 && !e()) {
                close();
                Log.e("DataBuffer", a.b(this, "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ", ")"));
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String[] strArr = this.c;
        int a2 = dfxk.a(parcel);
        dfxk.C(parcel, 1, strArr);
        dfxk.E(parcel, 2, this.e, i);
        dfxk.i(parcel, 3, this.f);
        dfxk.p(parcel, 4, this.g);
        dfxk.i(parcel, 1000, this.b);
        dfxk.c(parcel, a2);
        if ((i & 1) != 0) {
            close();
        }
    }

    public DataHolder(dfuz dfuzVar, int i) {
        String[] strArr = dfuzVar.a;
        this.j = false;
        this.k = true;
        this.b = 1;
        this.c = strArr;
        this.e = new CursorWindow[0];
        this.f = i;
        this.g = null;
        d();
    }
}
