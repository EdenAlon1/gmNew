package defpackage;

import android.R;
import android.content.Context;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmg implements ablw {
    public final aawu a;
    public final able b;
    public final aigz c;
    public final ffbr d;
    public final abmi e;
    public final abmi f;
    public final fgdj g;
    public final fgdj h;
    private final Context i;
    private final ffsk j;
    private final ffix k;

    public abmg(Context context, ffsk ffskVar, aawu aawuVar, able ableVar, aigz aigzVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        aawuVar.getClass();
        aigzVar.getClass();
        this.i = context;
        this.j = ffskVar;
        this.a = aawuVar;
        this.b = ableVar;
        this.c = aigzVar;
        this.d = ffbrVar;
        this.k = axqa.b(new ffix() { // from class: ablz
            @Override // defpackage.ffix
            public final Object invoke() {
                abmg abmgVar = abmg.this;
                Optional optional = (Optional) abmgVar.d.b();
                final ffji ffjiVar = new ffji() { // from class: ablx
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((ajjn) obj).a() != null);
                    }
                };
                if (((Boolean) optional.map(new Function() { // from class: ably
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ffji.this.invoke(obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    ajjl a = ((ajjn) ((Optional) abmgVar.d.b()).get()).a();
                    if (a == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    a.a();
                } else {
                    abmgVar.c.h(aijc.a);
                }
                return ffcu.a;
            }
        }, ffskVar);
        String string = context.getString(R.string.cancel);
        string.getClass();
        this.e = new abmi(string, dmzz.ai, new ffix() { // from class: abma
            @Override // defpackage.ffix
            public final Object invoke() {
                abmg.this.a.b();
                return ffcu.a;
            }
        });
        String string2 = context.getString(R.string.cancel);
        string2.getClass();
        this.f = new abmi(string2, dmzz.p, new ffix() { // from class: abmb
            @Override // defpackage.ffix
            public final Object invoke() {
                ((abos) abmg.this.b).n.f(null);
                return ffcu.a;
            }
        });
        ffxx a = fgck.a(aawuVar.a(), ((abos) ableVar).n, aigzVar.g(), new abmc(this, null));
        int i = fgcz.a;
        fgdj b = fgbn.b(a, ffskVar, fgcy.a(0L, 3), a(aigzVar.i(aijc.a)));
        this.g = b;
        this.h = fgbn.b(new abmf(b), ffskVar, fgcy.a(0L, 3), Boolean.valueOf(a(aigzVar.i(aijc.a)).c));
    }

    public final abmi a(boolean z) {
        String string = this.i.getString(com.google.android.apps.messaging.R.string.top_app_bar_back);
        string.getClass();
        return new abmi(string, dmzz.p, false, z, this.k);
    }
}
