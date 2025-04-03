package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxt {
    public final ctyx a;
    private final Resources b;
    private String c;

    public ctxt(Context context, ctyx ctyxVar) {
        this.b = context.getResources();
        this.a = ctyxVar;
    }

    public final String a() {
        return this.a.f(b(), "auto");
    }

    public final String b() {
        if (this.c == null) {
            this.c = this.b.getString(R.string.current_country_pref_key);
        }
        return this.c;
    }
}
