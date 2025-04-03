package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uks {
    public static final List a() {
        fffs fffsVar = new fffs((byte[]) null);
        fffsVar.add(dszr.b);
        if (((Boolean) uky.a.e()).booleanValue()) {
            fffsVar.add(dszr.c);
        }
        if (((Boolean) uky.b.e()).booleanValue()) {
            fffsVar.add(dszr.f);
        }
        return ffdx.a(fffsVar);
    }

    public static final String b(Bundle bundle) {
        return bundle.getString("initial_search_term");
    }

    public static final ugo[] c() {
        return (ugo[]) ukv.b.a();
    }
}
