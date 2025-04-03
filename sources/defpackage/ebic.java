package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebic extends eawx {
    public final ebin b;
    public Object c;
    public engw d;
    public boolean e;
    private final eayd f;
    private final Context g;

    public ebic(Context context, lkr lkrVar, eayd eaydVar) {
        int i = engw.d;
        this.d = enou.a;
        this.g = context;
        this.f = eaydVar;
        this.b = new ebin(context);
        eaydVar.f(lkrVar, new llh() { // from class: ebib
            @Override // defpackage.llh
            public final void a(Object obj) {
                final ebic ebicVar = ebic.this;
                efbd.e(new Runnable() { // from class: ebhz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebic ebicVar2 = ebic.this;
                        ebicVar2.a(ebicVar2.c);
                    }
                });
            }
        });
    }

    @Override // defpackage.eawx
    protected final void a(Object obj) {
        emxc emxcVar;
        Object j;
        efbd.c();
        this.c = obj;
        if (obj == null) {
            j = emux.a;
        } else {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.j(this.d);
            engrVar.h(this.c);
            engw g = engrVar.g();
            if (this.f.c(g)) {
                Context context = this.g;
                eawa eawaVar = new eawa();
                eawaVar.a = emxc.j(new eavz(ebfx.a(context, context.getColor(true != ((ebns) eboq.e(context)).a ? R.color.google_grey900 : R.color.google_white), ebnr.b(context, R.attr.ogRedColorOnSurface)), context.getString(R.string.og_critical_security_alert_badge_label_a11y), eawu.RED_ALERT));
                if (this.e) {
                    final eayd eaydVar = this.f;
                    if (enjk.q(g, new emxg() { // from class: ebhy
                        @Override // defpackage.emxg
                        public final boolean a(Object obj2) {
                            return enjk.q(((ebij) eayd.this).r(obj2), new emxg() { // from class: ebii
                                @Override // defpackage.emxg
                                public final boolean a(Object obj3) {
                                    eayf eayfVar = (eayf) obj3;
                                    return eayfVar.a().g && !eayfVar.a().h;
                                }
                            });
                        }
                    })) {
                        emxcVar = emxc.j(new eawc(null, this.b, null, 3));
                        eawaVar.b = emxcVar;
                        j = emxc.j(eawaVar.a());
                    }
                }
                emxcVar = emux.a;
                eawaVar.b = emxcVar;
                j = emxc.j(eawaVar.a());
            } else {
                j = emux.a;
            }
        }
        this.a.m(j);
    }
}
