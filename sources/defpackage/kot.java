package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kot {
    public static final void a(kou kouVar, Set set, Map map) {
        if (TextUtils.isEmpty(kouVar.e)) {
            throw new IllegalArgumentException("Shortcut must have a non-empty label");
        }
        Intent[] intentArr = kouVar.c;
        if (intentArr == null || intentArr.length == 0) {
            throw new IllegalArgumentException("Shortcut must have an intent");
        }
    }
}
