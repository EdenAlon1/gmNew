package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aktg implements aktd {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ViewStub h;
    private final View i;
    private final aktf j = new aktf(this);
    private boolean k = false;
    private Instant l;
    private View m;
    private ddym n;

    public aktg(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ViewStub viewStub, View view) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
        this.h = viewStub;
        this.i = view;
    }

    @Override // defpackage.aktd
    public final Optional a() {
        return Optional.ofNullable(this.l);
    }

    @Override // defpackage.aktd
    public final void b() {
        View view = this.m;
        if (view != null) {
            view.setVisibility(8);
        }
        this.l = null;
    }

    @Override // defpackage.aktd
    public final void c() {
        ddym ddymVar = this.n;
        if (ddymVar == null || !ddymVar.d()) {
            return;
        }
        this.n.a();
    }

    @Override // defpackage.aktd
    public final void d() {
        if (this.k) {
            if (((Boolean) cful.ap.e()).booleanValue() && ((Optional) this.d.b()).isPresent()) {
                ((dsma) ((Optional) this.d.b()).get()).n(this.j);
            } else {
                ((dede) this.c.b()).g(this.j);
                ((dede) this.c.b()).h(this.j);
            }
            this.k = false;
        }
    }

    @Override // defpackage.aktd
    public final void e() {
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            if (cnvu.a() || ((bdtd) this.g.b()).a() <= 1) {
                ddym ddymVar = this.n;
                if (ddymVar == null) {
                    if (!this.k) {
                        if (((Boolean) cful.ap.e()).booleanValue() && ((Optional) this.d.b()).isPresent()) {
                            ((dsma) ((Optional) this.d.b()).get()).k(this.j);
                        } else {
                            ((dede) this.c.b()).c(this.j);
                            ((dede) this.c.b()).d(this.j);
                        }
                        this.k = true;
                    }
                    ddym ddymVar2 = new ddym(LayoutInflater.from(this.i.getContext()).inflate(R.layout.scheduled_send_tooltip, (ViewGroup) null), 1, this.i, 2);
                    this.n = ddymVar2;
                    ddymVar2.a.c = false;
                    ddymVar = ddymVar2;
                }
                if (ddymVar.d()) {
                    return;
                }
                this.n.c();
                ((adsd) this.b.b()).a(22);
                ((akpn) this.f.b()).a.c("Bugle.ScheduledSend.Tooltip.SendButton.Counts");
            }
        }
    }

    @Override // defpackage.aktd
    public final void f(Instant instant) {
        if (this.m == null) {
            this.h.setLayoutResource(R.layout.scheduled_send_compose_label_large);
            ViewStub viewStub = this.h;
            ffbr ffbrVar = this.a;
            View inflate = viewStub.inflate();
            ((ellq) ffbrVar.b()).b(inflate.findViewById(R.id.scheduled_send_compose_label_close), new aktc());
            ((ellq) this.a.b()).b(inflate.findViewById(R.id.scheduled_send_compose_label_text), new akth());
            this.m = inflate;
        }
        this.m.setVisibility(0);
        ((TextView) this.m.findViewById(R.id.scheduled_send_compose_label_text)).setText(((aksx) this.e.b()).a(instant));
        this.l = instant;
    }
}
