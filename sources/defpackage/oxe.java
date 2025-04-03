package defpackage;

import android.database.SQLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxe {
    public static final void a(ouz ouzVar, String str) {
        ovi a = ouzVar.a(str);
        try {
            a.j();
            ffit.a(a, null);
        } finally {
        }
    }

    public static final void b(int i, String str) {
        throw new SQLException(a.h(i, "Error code: ").concat(", message: ".concat(str)));
    }
}
