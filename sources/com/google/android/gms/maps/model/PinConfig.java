package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dfxk;
import defpackage.dhcc;
import defpackage.dhck;
import defpackage.dhcs;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class PinConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PinConfig> CREATOR = new dhcs();
    public final int a;
    public final int b;
    public final Glyph c;

    /* compiled from: PG */
    public static class Glyph extends AbstractSafeParcelable {
        public static final Parcelable.Creator<Glyph> CREATOR = new dhck();
        public final String a;
        public final dhcc b;
        public int c;
        public int d;

        public Glyph(String str, IBinder iBinder, int i, int i2) {
            this.c = -5041134;
            this.d = -16777216;
            this.a = str;
            this.b = iBinder == null ? null : new dhcc(IObjectWrapper.Stub.asInterface(iBinder));
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Glyph)) {
                return false;
            }
            Glyph glyph = (Glyph) obj;
            if (this.c != glyph.c || !Objects.equals(this.a, glyph.a) || this.d != glyph.d) {
                return false;
            }
            dhcc dhccVar = this.b;
            if ((dhccVar == null && glyph.b != null) || (dhccVar != null && glyph.b == null)) {
                return false;
            }
            dhcc dhccVar2 = glyph.b;
            if (dhccVar == null || dhccVar2 == null) {
                return true;
            }
            return Objects.equals(ObjectWrapper.unwrap(dhccVar.a), ObjectWrapper.unwrap(dhccVar2.a));
        }

        public final int hashCode() {
            return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            String str = this.a;
            int a = dfxk.a(parcel);
            dfxk.m(parcel, 2, str, false);
            dhcc dhccVar = this.b;
            dfxk.u(parcel, 3, dhccVar == null ? null : dhccVar.a.asBinder());
            dfxk.i(parcel, 4, this.c);
            dfxk.i(parcel, 5, this.d);
            dfxk.c(parcel, a);
        }
    }

    public PinConfig(int i, int i2, Glyph glyph) {
        this.a = i;
        this.b = i2;
        this.c = glyph;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 2, i2);
        dfxk.i(parcel, 3, this.b);
        dfxk.k(parcel, 4, this.c, i, false);
        dfxk.c(parcel, a);
    }
}
