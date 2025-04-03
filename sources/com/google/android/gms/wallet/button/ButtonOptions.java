package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dhxj;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new dhxj();
    int a;
    int b;
    int c;
    String d;

    private ButtonOptions() {
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            if (dfwq.a(Integer.valueOf(this.a), Integer.valueOf(buttonOptions.a)) && dfwq.a(Integer.valueOf(this.b), Integer.valueOf(buttonOptions.b)) && dfwq.a(Integer.valueOf(this.c), Integer.valueOf(buttonOptions.c)) && dfwq.a(this.d, buttonOptions.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        dfxk.i(parcel, 1, this.a);
        dfxk.i(parcel, 2, this.b);
        dfxk.i(parcel, 3, this.c);
        dfxk.m(parcel, 4, this.d, false);
        dfxk.c(parcel, a);
    }

    public ButtonOptions(int i, int i2, int i3, String str) {
        Integer.valueOf(i).getClass();
        this.a = i;
        Integer.valueOf(i2).getClass();
        this.b = i2;
        Integer.valueOf(i3).getClass();
        this.c = i3;
        dfwv.n(str);
        this.d = str;
    }
}
