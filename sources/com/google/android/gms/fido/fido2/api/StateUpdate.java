package com.google.android.gms.fido.fido2.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfxk;
import defpackage.dgij;
import defpackage.dgik;
import defpackage.dgil;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class StateUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StateUpdate> CREATOR = new dgil();
    public final String a;
    private final Type b;

    /* compiled from: PG */
    public enum Type implements Parcelable {
        CANCEL("cancel"),
        PAUSE("pause"),
        RESUME("resume"),
        STOP("stop"),
        DEVICE_SELECTION("user_selected_device"),
        SELECT_VIEW("user_selected_view"),
        SELECT_TRANSPORT_VIEW("user_selected_view_for_transport"),
        UPDATE_CURRENT_VIEW("update_current_view");

        public static final Parcelable.Creator<Type> CREATOR = new dgij();
        public final String i;

        Type(String str) {
            this.i = str;
        }

        public static Type a(String str) {
            for (Type type : values()) {
                if (str.equals(type.i)) {
                    return type;
                }
            }
            throw new dgik(str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.i);
        }
    }

    static {
        new StateUpdate(Type.CANCEL);
        new StateUpdate(Type.PAUSE);
        new StateUpdate(Type.RESUME);
        new StateUpdate(Type.STOP);
    }

    public StateUpdate(Type type) {
        dfwv.n(type);
        this.b = type;
        boolean z = true;
        if (!type.equals(Type.CANCEL) && !type.equals(Type.PAUSE) && !type.equals(Type.RESUME) && !type.equals(Type.STOP)) {
            z = false;
        }
        dfwv.a(z);
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof StateUpdate)) {
            return false;
        }
        StateUpdate stateUpdate = (StateUpdate) obj;
        return dfwq.a(this.b, stateUpdate.b) && dfwq.a(this.a, stateUpdate.a);
    }

    public final int hashCode() {
        Type type = Type.CANCEL;
        return Arrays.hashCode(new Object[]{this.b.i, this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = dfxk.a(parcel);
        Type type = Type.CANCEL;
        dfxk.m(parcel, 2, this.b.i, false);
        dfxk.m(parcel, 3, this.a, false);
        dfxk.c(parcel, a);
    }

    public StateUpdate(String str, String str2) {
        dfwv.n(str);
        try {
            this.b = Type.a(str);
            this.a = str2;
        } catch (dgik e) {
            throw new IllegalArgumentException(e);
        }
    }
}
