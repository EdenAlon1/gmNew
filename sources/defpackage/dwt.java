package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwt {
    public static final long a(Parcel parcel) {
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return kam.b(j, 0L) ? kak.a : kal.d(j, parcel.readFloat());
    }
}
