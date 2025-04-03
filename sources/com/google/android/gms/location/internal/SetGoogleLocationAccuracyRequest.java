package com.google.android.gms.location.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhar;
import defpackage.ewfw;
import defpackage.ewga;
import defpackage.ewgs;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class SetGoogleLocationAccuracyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SetGoogleLocationAccuracyRequest> CREATOR = new dhar();
    public final boolean a;
    private final ewfw b;
    private final ewgs c;
    private final ewga d;

    public SetGoogleLocationAccuracyRequest(boolean z, int i, byte[] bArr, byte[] bArr2) {
        ewfw ewfwVar;
        ewgs ewgsVar;
        this.a = z;
        ewga ewgaVar = null;
        switch (i) {
            case 0:
                ewfwVar = ewfw.SOURCE_UNKNOWN;
                break;
            case 1:
                ewfwVar = ewfw.SOURCE_SYSTEM_SETTINGS;
                break;
            case 2:
                ewfwVar = ewfw.SOURCE_QUICK_SETTINGS;
                break;
            case 3:
                ewfwVar = ewfw.SOURCE_LOCATION_ACCURACY;
                break;
            case 4:
                ewfwVar = ewfw.SOURCE_LOCATION_SETTINGS_DIALOG;
                break;
            case 5:
                ewfwVar = ewfw.SOURCE_LOCATION_OFF_WARNING_DIALOG;
                break;
            case 6:
                ewfwVar = ewfw.SOURCE_SETUP_WIZARD;
                break;
            case 7:
                ewfwVar = ewfw.SOURCE_ADD_ACCOUNT;
                break;
            case 8:
                ewfwVar = ewfw.SOURCE_EMERGENCY_LOCATION_SERVICE;
                break;
            case 9:
                ewfwVar = ewfw.SOURCE_FAMILY_LINK;
                break;
            case 10:
                ewfwVar = ewfw.SOURCE_TEST;
                break;
            case 11:
                ewfwVar = ewfw.SOURCE_DEMO_USER;
                break;
            default:
                ewfwVar = null;
                break;
        }
        dfwv.n(ewfwVar);
        this.b = ewfwVar;
        if (bArr != null) {
            try {
                ewgsVar = (ewgs) eyfy.parseFrom(ewgs.a, bArr, eyfc.a());
            } catch (eygu e) {
                throw new BadParcelableException(e);
            }
        } else {
            ewgsVar = null;
        }
        this.c = ewgsVar;
        if (bArr2 != null) {
            ewgaVar = (ewga) eyfy.parseFrom(ewga.a, bArr2, eyfc.a());
        }
        this.d = ewgaVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = dfxk.a(parcel);
        dfxk.d(parcel, 1, z);
        dfxk.i(parcel, 2, this.b.m);
        ewgs ewgsVar = this.c;
        dfxk.f(parcel, 3, ewgsVar == null ? null : ewgsVar.toByteArray(), false);
        ewga ewgaVar = this.d;
        dfxk.f(parcel, 4, ewgaVar != null ? ewgaVar.toByteArray() : null, false);
        dfxk.c(parcel, a);
    }
}
