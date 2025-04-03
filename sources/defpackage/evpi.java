package defpackage;

import com.google.gson.internal.sql.SqlDateTypeAdapter;
import com.google.gson.internal.sql.SqlTimeTypeAdapter;
import com.google.gson.internal.sql.SqlTimestampTypeAdapter;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpi {
    public static final boolean a;
    public static final evlg b;
    public static final evlg c;
    public static final evlg d;

    static {
        boolean z;
        evlg evlgVar;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        a = z;
        if (z) {
            int i = evpg.b;
            int i2 = evph.b;
            b = SqlDateTypeAdapter.a;
            c = SqlTimeTypeAdapter.a;
            evlgVar = SqlTimestampTypeAdapter.a;
        } else {
            evlgVar = null;
            b = null;
            c = null;
        }
        d = evlgVar;
    }
}
