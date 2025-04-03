package defpackage;

import android.os.BaseBundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdhg extends bdhi {
    public static final bdhg a = new bdhg(null);

    private bdhg(String str) {
        super(str);
    }

    public static bdhg a(String str) {
        return str == null ? a : new bdhg(str);
    }

    public static bdhg b(BaseBundle baseBundle, String str) {
        return baseBundle == null ? a : a(baseBundle.getString(str));
    }

    public final String toString() {
        return "RcsMessageIdType:".concat(String.valueOf(this.b));
    }
}
