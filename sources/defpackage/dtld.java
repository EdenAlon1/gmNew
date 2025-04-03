package defpackage;

import android.app.Activity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtld {
    public static final enru a = enru.c("com/google/android/libraries/compose/voice/ui/screen/VoiceUiAdapter");
    public final dtds b;
    public final Activity c;
    public final fgcm d;
    public boolean e;
    public final fgcm f;
    public final fgdj g;
    public final dtkw h;
    private final Optional i;

    public dtld(dtds dtdsVar, Activity activity, Optional optional) {
        activity.getClass();
        this.b = dtdsVar;
        this.c = activity;
        this.i = optional;
        this.d = fgdm.a(null);
        dteg dtegVar = (dteg) dteh.a.createBuilder();
        dtegVar.getClass();
        fgcm a2 = fgdm.a(dtei.a(dtegVar));
        this.f = a2;
        this.g = new fgco(a2);
        this.h = new dtkw(this);
    }

    public final ffxx a(dtiz dtizVar) {
        dtiu dtiuVar = null;
        dtlc dtlcVar = new dtlc(this, null);
        dtdy dtdyVar = (dtdy) this.b;
        List g = ffdx.g(new fgbt(dtizVar.a, dtlcVar), dtizVar.d, dtizVar.g, this.d, dtdyVar.g, dtdyVar.e, this.g);
        if (dtizVar.j.isPresent()) {
            Object obj = dtizVar.j.get();
            dpdv dpdvVar = (dpdv) obj;
            dpdvVar.a.f(true);
            dtiuVar = new dtiu(dpdvVar.b, new dtlb(obj));
        }
        return new dtkz((ffxx[]) ffdx.ak(g).toArray(new ffxx[0]), this, dtizVar, dtiuVar);
    }

    public final void b() {
        c(dtja.b);
    }

    public final void c(final dtjb dtjbVar) {
        final ffji ffjiVar = new ffji() { // from class: dtkt
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((dtkq) obj).getClass();
                dtld dtldVar = this;
                int ordinal = dtjb.this.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        dtldVar.c.getWindow().addFlags(128);
                        return ffcu.a;
                    }
                    if (ordinal != 2) {
                        throw new ffcd();
                    }
                }
                dtldVar.c.getWindow().clearFlags(128);
                return ffcu.a;
            }
        };
        this.i.ifPresent(new Consumer() { // from class: dtku
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
