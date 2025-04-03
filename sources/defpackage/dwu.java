package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dwu {
    public static final void a(long j, Parcel parcel) {
        long c = kak.c(j);
        byte b = 0;
        if (!kam.b(c, 0L)) {
            if (kam.b(c, 4294967296L)) {
                b = 1;
            } else if (kam.b(c, 8589934592L)) {
                b = 2;
            }
        }
        parcel.writeByte(b);
        if (kam.b(kak.c(j), 0L)) {
            return;
        }
        parcel.writeFloat(kak.a(j));
    }
}
