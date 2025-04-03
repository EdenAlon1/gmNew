package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dfyt;
import defpackage.dhco;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MapStyleOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MapStyleOptions> CREATOR = new dhco();
    public final String a;

    public MapStyleOptions(String str) {
        dfwv.o(str, "json must not be null");
        this.a = str;
    }

    public static MapStyleOptions a(Context context) {
        try {
            return new MapStyleOptions(new String(dfyt.b(context.getResources().openRawResource(R.raw.mapstyle_night)), "UTF-8"));
        } catch (IOException e) {
            throw new Resources.NotFoundException("Failed to read resource 2132017207: ".concat(e.toString()));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = dfxk.a(parcel);
        dfxk.m(parcel, 2, str, false);
        dfxk.c(parcel, a);
    }
}
