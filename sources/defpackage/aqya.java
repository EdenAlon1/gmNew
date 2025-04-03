package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aqya {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final Context d;

    public aqya(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Context context) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = context;
    }

    public final void a(int i, aoku aokuVar) {
        ((ctyw) this.a.b()).a(i).l(this.d.getString(R.string.mms_phone_number_pref_key), aokuVar.j());
        ((bavz) this.b.b()).b().K();
        ((bbfy) this.c.b()).a(i).t();
    }
}
