package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eazb extends wr {
    public final AccountParticle s;
    public final emxc t;
    public final llh u;
    public final emxc v;
    public final ebvw w;
    public Object x;

    public eazb(ViewGroup viewGroup, eave eaveVar, eawd eawdVar, emxc emxcVar, final eaxz eaxzVar, int i, final ebvw ebvwVar, final ebny ebnyVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false));
        C(this.a, i, i);
        AccountParticle accountParticle = (AccountParticle) this.a.findViewById(R.id.account_list_item_particle);
        this.s = accountParticle;
        this.t = emxcVar;
        this.v = eaxzVar.a;
        this.w = ebvwVar;
        C(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.j.t();
        accountParticle.j.h();
        accountParticle.j.i(eawdVar, eaveVar);
        accountParticle.i = new eaxx(accountParticle, eaveVar, eaxzVar);
        emxc emxcVar2 = eaxzVar.a;
        eaxl eaxlVar = null;
        if (emxcVar2.g()) {
            emxc emxcVar3 = ((eaye) emxcVar2.c()).c;
            if (emxcVar3.g()) {
                lkr lkrVar = ((eaye) emxcVar2.c()).a;
                eaxlVar = new eaxl(engw.r(new ebic(accountParticle.getContext(), lkrVar, (eayd) emxcVar3.c())), lkrVar);
            }
        }
        if (eaxlVar != null) {
            accountParticle.j.n(eaxlVar);
        }
        if (emxcVar.g()) {
            ImageView imageView = (ImageView) accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip);
            emxcVar.c();
            imageView.setImageResource(R.drawable.quantum_gm_ic_info_outline_vd_theme_24);
        }
        final ViewGroup viewGroup2 = (ViewGroup) this.a.findViewById(R.id.account_list_item_critical_alert_container);
        this.u = new llh() { // from class: eayz
            @Override // defpackage.llh
            public final void a(Object obj) {
                eazb eazbVar = eazb.this;
                if (eazbVar.x != null) {
                    emxc emxcVar4 = eazbVar.v;
                    if (emxcVar4.g() && ((eaye) emxcVar4.c()).c.g()) {
                        eaxz eaxzVar2 = eaxzVar;
                        ebvw ebvwVar2 = ebvwVar;
                        ebny ebnyVar2 = ebnyVar;
                        ViewGroup viewGroup3 = viewGroup2;
                        emxc emxcVar5 = ((eaye) eazbVar.v.c()).c;
                        View view = eazbVar.a;
                        ((eayd) emxcVar5.c()).p(view.getContext(), eazbVar.x, viewGroup3, ebnyVar2, eazbVar.a, ebvwVar2, false, eaxzVar2.b);
                    }
                }
            }
        };
    }

    private static void C(View view, int i, int i2) {
        int[] iArr = kvo.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
