package defpackage;

import android.net.Uri;
import android.os.Bundle;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqu {
    public static final lqu a = new lqu();
    public final Uri b = null;
    public final String c = null;
    public final Bundle d = null;

    static {
        lvf.N(0);
        lvf.N(1);
        lvf.N(2);
    }

    private lqu() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lqu)) {
            return false;
        }
        lqu lquVar = (lqu) obj;
        Uri uri = lquVar.b;
        int i = lvf.a;
        if (Objects.equals(null, null)) {
            String str = lquVar.c;
            if (Objects.equals(null, null)) {
                Bundle bundle = lquVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
