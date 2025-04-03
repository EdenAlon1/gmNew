package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgrs {
    public static int a(ceyt ceytVar) {
        Bundle a = ceytVar.a();
        if (a == null) {
            return 0;
        }
        return a.getInt("delete_count");
    }
}
