package defpackage;

import android.net.Uri;
import android.util.Pair;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgmd {
    public final Map a = new HashMap();

    public final Uri a(String str, String str2) {
        return (Uri) this.a.get(Pair.create(str, str2));
    }

    public final boolean b(String str, String str2) {
        return this.a.containsKey(Pair.create(str, str2));
    }
}
