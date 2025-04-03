package com.google.android.apps.messaging.ui.mediapicker.c2o.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.cful;
import defpackage.ctyx;
import defpackage.dcbh;
import defpackage.eyfc;
import defpackage.eyjv;
import defpackage.eymm;
import defpackage.eymn;
import defpackage.eymo;
import defpackage.eymp;
import defpackage.eymr;
import defpackage.uky;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CustomizationModel implements Iterable<eymp>, Parcelable {
    public static final Parcelable.Creator<CustomizationModel> CREATOR = new dcbh();
    public final ArrayList a;
    public boolean b;
    private final List c;

    public CustomizationModel() {
        this.b = false;
        this.a = new ArrayList();
        this.c = new ArrayList();
    }

    public static final boolean e(ctyx ctyxVar, eymn eymnVar, Boolean bool, boolean z) {
        int ordinal = eymnVar.ordinal();
        if (ordinal == 1) {
            return !((Boolean) cful.g.e()).booleanValue();
        }
        if (ordinal == 4) {
            return (z || bool == null || bool.booleanValue() || !ctyxVar.q("is_eligible_for_wallet", false)) ? false : true;
        }
        if (ordinal == 6) {
            return false;
        }
        if (ordinal == 7) {
            return ((Boolean) cful.b.e()).booleanValue();
        }
        if (ordinal != 8) {
            return true;
        }
        return ((Boolean) cful.c.e()).booleanValue() && !uky.c();
    }

    public final int a() {
        return this.a.size();
    }

    public final eymp b(int i) {
        return (eymp) this.a.get(i);
    }

    public final void c() {
        this.c.clear();
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            eymp eympVar = (eymp) arrayList.get(i);
            if (eympVar.d) {
                this.c.add(eympVar);
            }
        }
    }

    public final void d(int i, boolean z) {
        eymo createBuilder = eymp.a.createBuilder((eymp) this.a.get(i));
        createBuilder.copyOnWrite();
        ((eymp) createBuilder.instance).d = z;
        this.a.set(i, createBuilder.build());
        c();
        this.b = true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<eymp> iterator() {
        return this.a.iterator();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        eymm eymmVar = (eymm) eymr.a.createBuilder();
        eymmVar.a(this.a);
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, (eymr) eymmVar.build()), 0);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    public CustomizationModel(Parcel parcel) {
        this.b = false;
        eymr eymrVar = (eymr) ((eyjv) parcel.readParcelable(eymr.class.getClassLoader())).a(eymr.a, eyfc.a());
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        arrayList.addAll(eymrVar.b);
        this.b = parcel.readByte() != 0;
        this.c = new ArrayList();
        c();
    }
}
