package com.google.android.apps.messaging.conversation.screen;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.engw;
import defpackage.enou;
import defpackage.eoko;
import defpackage.eold;
import defpackage.eonz;
import defpackage.epuz;
import defpackage.vjp;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationActivityUsageStatisticsState implements Parcelable {
    public static final Parcelable.Creator<ConversationActivityUsageStatisticsState> CREATOR = new vjp();
    public eoko a;
    public int b;
    public int c;
    public int d;
    public boolean e;
    public Boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public List k;
    public int l;
    public int m;
    private int n;

    public ConversationActivityUsageStatisticsState(Parcel parcel) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.i = 0;
        this.l = 1;
        this.m = 2;
        this.n = 1;
        int i = engw.d;
        this.k = enou.a;
        this.a = eoko.b(parcel.readInt());
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.f = null;
        } else {
            this.f = Boolean.valueOf(readInt == 1);
        }
        this.g = parcel.readInt() == 1;
        this.h = parcel.readInt() == 1;
        this.i = parcel.readInt();
        this.l = eold.a(parcel.readInt());
        this.j = parcel.readInt() == 1;
        int b = epuz.b(parcel.readInt());
        if (b != 0) {
            this.m = b;
        }
        int a = eonz.a(parcel.readInt());
        if (a != 0) {
            this.n = a;
        }
        int[] iArr = new int[parcel.readInt()];
        parcel.readIntArray(iArr);
        this.k = (List) DesugarArrays.stream(iArr).mapToObj(new IntFunction() { // from class: vjm
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return eooc.b(i2);
            }
        }).collect(Collectors.toCollection(new Supplier() { // from class: vjn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.u);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        Boolean bool = this.f;
        parcel.writeInt(bool == null ? -1 : bool.booleanValue() ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i);
        int i2 = this.l;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i3);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(epuz.a(this.m));
        int i4 = this.n;
        int i5 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        parcel.writeInt(i5);
        parcel.writeInt(this.k.size());
        parcel.writeIntArray(Collection.EL.stream(this.k).mapToInt(new ToIntFunction() { // from class: vjo
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((eooc) obj).u;
            }
        }).toArray());
    }

    public ConversationActivityUsageStatisticsState(eoko eokoVar) {
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.i = 0;
        this.l = 1;
        this.m = 2;
        this.n = 1;
        int i = engw.d;
        this.k = enou.a;
        this.a = eokoVar;
    }
}
