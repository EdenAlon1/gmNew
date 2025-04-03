package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aavd implements aauy {
    public final Context a;
    public final ffsk b;
    public final alye c;
    public final zrq d;
    public final crnr e;
    public final aklf f;
    private final ffxx g;
    private final aauw h;
    private final ffbz i;

    public aavd(Context context, ffsk ffskVar, alye alyeVar, ffxx ffxxVar, zrq zrqVar, aklf aklfVar, aauw aauwVar, crnr crnrVar) {
        context.getClass();
        ffskVar.getClass();
        alyeVar.getClass();
        ffxxVar.getClass();
        aklfVar.getClass();
        aauwVar.getClass();
        crnrVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = alyeVar;
        this.g = ffxxVar;
        this.d = zrqVar;
        this.f = aklfVar;
        this.h = aauwVar;
        this.e = crnrVar;
        this.i = ffca.a(new ffix() { // from class: aauz
            @Override // defpackage.ffix
            public final Object invoke() {
                aavd aavdVar = aavd.this;
                return aqfn.a(aavdVar.c.j(), aavdVar.b).a();
            }
        });
    }

    @Override // defpackage.aauy
    public final fgdj a() {
        ffxx a = fgck.a((ffxx) this.i.a(), this.g, this.h.a, new aavc(this, null));
        int i = fgcz.a;
        fgcz fgczVar = fgcy.a;
        int i2 = engw.d;
        engw engwVar = enou.a;
        engwVar.getClass();
        String string = this.a.getString(R.string.scheduled_messages_list_button_text, 0);
        string.getClass();
        return fgbn.b(a, this.b, fgczVar, new aave(engwVar, new dmxz(string, ((Boolean) this.h.a.c()).booleanValue(), new aava(this))));
    }

    public final void b() {
        this.h.a.f(Boolean.valueOf(!((Boolean) r0.c()).booleanValue()));
    }
}
