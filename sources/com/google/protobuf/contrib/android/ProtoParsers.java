package com.google.protobuf.contrib.android;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.emxf;
import defpackage.eyer;
import defpackage.eyfc;
import defpackage.eygu;
import defpackage.eyhs;
import defpackage.eyju;
import defpackage.eyjv;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ProtoParsers {

    /* compiled from: PG */
    public static final class InternalDontUse<T extends eyhs> implements eyjv<T> {
        public static final Parcelable.Creator<InternalDontUse<?>> CREATOR = new eyju();
        private volatile byte[] a;
        private volatile eyhs b;

        public InternalDontUse(byte[] bArr, eyhs eyhsVar) {
            boolean z = true;
            if (bArr == null && eyhsVar == null) {
                z = false;
            }
            emxf.b(z, "Must have a message or bytes");
            this.a = bArr;
            this.b = eyhsVar;
        }

        @Override // defpackage.eyjv
        public final eyhs a(eyhs eyhsVar, eyfc eyfcVar) {
            try {
                return b(eyhsVar, eyfcVar);
            } catch (eygu e) {
                throw new IllegalStateException(e);
            }
        }

        final eyhs b(eyhs eyhsVar, eyfc eyfcVar) {
            if (this.b == null) {
                this.b = eyhsVar.toBuilder().mergeFrom(this.a, eyfcVar).build();
            }
            return this.b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            if (this.a == null) {
                byte[] bArr = new byte[this.b.getSerializedSize()];
                try {
                    this.b.writeTo(eyer.ab(bArr));
                    this.a = bArr;
                } catch (IOException e) {
                    throw new AssertionError(e);
                }
            }
            parcel.writeInt(this.a.length);
            parcel.writeByteArray(this.a);
        }
    }

    public static eyhs a(Parcel parcel, eyhs eyhsVar, eyfc eyfcVar) {
        return b((InternalDontUse) parcel.readTypedObject(InternalDontUse.CREATOR), eyhsVar, eyfcVar);
    }

    public static eyhs b(InternalDontUse internalDontUse, eyhs eyhsVar, eyfc eyfcVar) {
        return internalDontUse.b(eyhsVar.getDefaultInstanceForType(), eyfcVar);
    }

    public static eyhs c(Intent intent, String str, eyhs eyhsVar, eyfc eyfcVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelableExtra = intent.getParcelableExtra(str);
        if (parcelableExtra instanceof Bundle) {
            Bundle bundle = (Bundle) parcelableExtra;
            bundle.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelableExtra;
        }
        return b(internalDontUse, eyhsVar, eyfcVar);
    }

    public static eyhs d(Bundle bundle, String str, eyhs eyhsVar, eyfc eyfcVar) {
        InternalDontUse internalDontUse;
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Bundle) {
            Bundle bundle2 = (Bundle) parcelable;
            bundle2.setClassLoader(InternalDontUse.class.getClassLoader());
            internalDontUse = (InternalDontUse) bundle2.getParcelable("protoparsers");
        } else {
            internalDontUse = (InternalDontUse) parcelable;
        }
        return b(internalDontUse, eyhsVar, eyfcVar);
    }

    public static eyhs e(Parcel parcel, eyhs eyhsVar, eyfc eyfcVar) {
        try {
            return a(parcel, eyhsVar, eyfcVar);
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }

    public static eyhs f(Bundle bundle, String str, eyhs eyhsVar, eyfc eyfcVar) {
        try {
            return d(bundle, str, eyhsVar, eyfcVar);
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }

    public static eyhs g(byte[] bArr, eyhs eyhsVar) {
        try {
            return eyhsVar.toBuilder().mergeFrom(bArr).build();
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }

    public static eyhs h(byte[] bArr, eyhs eyhsVar, eyfc eyfcVar) {
        try {
            return eyhsVar.toBuilder().mergeFrom(bArr, eyfcVar).build();
        } catch (eygu e) {
            throw new RuntimeException(e);
        }
    }

    public static void i(Parcel parcel, eyhs eyhsVar) {
        parcel.writeTypedObject(new InternalDontUse(null, eyhsVar), 0);
    }

    public static void j(Intent intent, String str, eyhs eyhsVar) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("protoparsers", new InternalDontUse(null, eyhsVar));
        intent.putExtra(str, bundle);
    }

    public static void k(Bundle bundle, String str, eyhs eyhsVar) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("protoparsers", new InternalDontUse(null, eyhsVar));
        bundle.putParcelable(str, bundle2);
    }
}
