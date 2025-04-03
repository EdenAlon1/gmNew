package defpackage;

import android.os.Bundle;
import com.google.android.apps.messaging.multishare.MultiShareActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahts {
    public final MultiShareActivity a;
    public final ffbr b;
    private final ffbr c;

    public ahts(MultiShareActivity multiShareActivity, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = multiShareActivity;
        this.c = ffbrVar;
        this.b = ffbrVar2;
        eiwy e = eiwz.e(multiShareActivity);
        e.d(ejgc.class);
        e.d(ejed.class);
        Bundle extras = multiShareActivity.getIntent().getExtras();
        extras = extras == null ? new Bundle() : extras;
        xin.b(extras, xim.b);
        ((eito) ffbrVar.b()).e(new ahtr(this, extras));
        ((eito) ffbrVar.b()).g(e.a());
    }
}
