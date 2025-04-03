package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wlf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wlg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlf(wlg wlgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = wlgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wlf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            woi woiVar = (woi) this.b.b.b();
            this.a = 1;
            obj = ffra.a(ekxi.a(woiVar.b), new wnw(null, woiVar), this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        if (((Number) obj).intValue() >= ((Number) this.b.g.b()).longValue()) {
            ((ctyx) this.b.e.b()).h(this.b.a.Y(R.string.mc_enabled_pref_key), false);
            ea eaVar = this.b.a;
            Snackbar r = Snackbar.r(eaVar.N(), eaVar.Y(R.string.magic_compose_disabled_toast), 0);
            final wlg wlgVar = this.b;
            r.t(wlgVar.a.Y(R.string.magic_compose_manage_in_settings), new View.OnClickListener() { // from class: wle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wlg wlgVar2 = wlg.this;
                    ((akvg) wlgVar2.c.b()).h(wlgVar2.a.A());
                }
            });
            r.i();
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new wlf(this.b, ffguVar);
    }
}
