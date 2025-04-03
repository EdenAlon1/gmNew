package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpxt {
    private final ffbr a;

    public cpxt(ffbr ffbrVar) {
        ffbrVar.getClass();
        this.a = ffbrVar;
    }

    public final String a() {
        String string = ((Bundle) this.a.b()).getString("messages_archival");
        if (string == null || string.length() == 0) {
            return null;
        }
        return string;
    }
}
