package defpackage;

import android.os.Build;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mpt implements lxt {
    public static final boolean a;
    public final UUID b;
    public final byte[] c;

    static {
        boolean z = false;
        if ("Amazon".equals(Build.MANUFACTURER) && ("AFTM".equals(Build.MODEL) || "AFTB".equals(Build.MODEL))) {
            z = true;
        }
        a = z;
    }

    public mpt(UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
