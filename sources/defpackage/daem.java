package defpackage;

import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.debug.DebugMobileConfigurationFragment;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daem {
    public final DebugMobileConfigurationFragment a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public Set e;
    public final ConcurrentHashMap f;
    private final ffsk g;

    public daem(DebugMobileConfigurationFragment debugMobileConfigurationFragment, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = debugMobileConfigurationFragment;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.g = ffskVar;
        this.e = ffen.a;
        this.f = new ConcurrentHashMap();
    }

    public final RadioGroup a() {
        View findViewById = this.a.N().findViewById(R.id.sims_radio_group);
        findViewById.getClass();
        return (RadioGroup) findViewById;
    }

    public final TextView b() {
        View findViewById = this.a.N().findViewById(R.id.flag_values);
        findViewById.getClass();
        return (TextView) findViewById;
    }

    public final void c(String str) {
        axol.k(this.g, null, new dael(this, str, null), 3);
    }
}
