package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yuh implements ysi {
    private final Optional b;
    private final cqoh c;
    private final dsaq d;

    public yuh(Optional optional, cqoh cqohVar, ysb ysbVar) {
        cqohVar.getClass();
        this.b = optional;
        this.c = cqohVar;
        this.d = new dsaq(R.drawable.quantum_gm_ic_schedule_vd_theme_24, new dsap(ysbVar.a(R.color.scheduled_send_shortcut_background), new dszo(R.color.scheduled_send_shortcut_icon_tint)));
    }

    @Override // defpackage.ysi
    public final int a() {
        return R.string.scheduled_send_shortcut_title;
    }

    @Override // defpackage.ysi
    public final dsaq b() {
        return this.d;
    }

    @Override // defpackage.ysi
    public final /* synthetic */ List c() {
        return ffel.a;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, xig] */
    @Override // defpackage.ysi
    @ffbs
    public final void d(View view) {
        this.b.isPresent();
        if (this.b.get().a()) {
            this.c.f();
        }
    }

    @Override // defpackage.ysi
    public final boolean e() {
        this.b.isPresent();
        return true;
    }
}
