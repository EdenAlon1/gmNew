package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebhe extends eawx {
    public boolean b;
    public Object c;
    private final eave d;
    private final eaww e;
    private enhk f = enoz.a;

    public ebhe(Context context, eave eaveVar, emyl emylVar, lkr lkrVar, emxc emxcVar) {
        this.d = eaveVar;
        eawa eawaVar = new eawa();
        eawaVar.a = emxc.j(new eavz(ebfx.a(context, context.getResources().getColor(R.color.google_grey900), eboq.f(context, emxcVar).d(eboo.DARK_YELLOW)), context.getString(R.string.og_important_account_alert_badge_a11y_label), eawu.YELLOW_ALERT));
        this.e = eawaVar.a();
        ((lld) emylVar.get()).f(lkrVar, new llh() { // from class: ebhc
            @Override // defpackage.llh
            public final void a(Object obj) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ebhe ebheVar = ebhe.this;
                ebheVar.b = booleanValue;
                ebheVar.a(ebheVar.c);
            }
        });
    }

    @Override // defpackage.eawx
    protected final void a(Object obj) {
        efbd.c();
        this.c = obj;
        Object obj2 = emux.a;
        if (obj != null) {
            dgqi dgqiVar = (dgqi) ebkp.a(this.d, obj, this.f, dgqi.a);
            if (dgqiVar != null && !this.b) {
                ewox ewoxVar = dgqiVar.b;
                if (ewoxVar == null) {
                    ewoxVar = ewox.a;
                }
                ewpb ewpbVar = ewoxVar.b;
                if (ewpbVar == null) {
                    ewpbVar = ewpb.a;
                }
                int a = ewoz.a(ewpbVar.b);
                if (a != 0 && a == 3) {
                    obj2 = emxc.j(this.e);
                }
            }
        }
        this.a.m(obj2);
    }

    public final void b(enhk enhkVar) {
        this.f = enhkVar;
        ebpa.a(new Runnable() { // from class: ebhd
            @Override // java.lang.Runnable
            public final void run() {
                ebhe ebheVar = ebhe.this;
                ebheVar.a(ebheVar.c);
            }
        });
    }
}
