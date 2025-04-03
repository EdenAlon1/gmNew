package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adzi implements ffxy {
    final /* synthetic */ adzm a;
    final /* synthetic */ ffjm b;

    public adzi(adzm adzmVar, ffjm ffjmVar) {
        this.a = adzmVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        adhm adhmVar = (adhm) obj;
        lkj lkjVar = lkj.STARTED;
        if (lkjVar.compareTo(lkj.CREATED) < 0) {
            Objects.toString(lkjVar);
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(lkjVar)));
        }
        adzm adzmVar = this.a;
        ffjm ffjmVar = this.b;
        ffsd ffsdVar = fftc.a;
        ffuu j = fghh.a.j();
        boolean ex = j.ex(ffguVar.u());
        lkk lkkVar = adzmVar.a;
        if (!ex) {
            if (lkkVar.a() == lkj.DESTROYED) {
                throw new lko();
            }
            if (lkkVar.a().compareTo(lkjVar) >= 0) {
                adhl adhlVar = adhmVar.a;
                adhlVar.getClass();
                ffjmVar.a(adhlVar, adhmVar.b);
                return ffcu.a;
            }
        }
        adzh adzhVar = new adzh(ffjmVar, adhmVar);
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        lnd lndVar = new lnd(lkjVar, lkkVar, ffrhVar, adzhVar);
        if (ex) {
            j.a(ffhe.a, new lne(lkkVar, lndVar));
        } else {
            lkkVar.c(lndVar);
        }
        ffrhVar.d(new lnc(j, lkkVar, lndVar));
        Object m = ffrhVar.m();
        ffhh ffhhVar = ffhh.a;
        if (m == ffhhVar) {
            ffguVar.getClass();
        }
        if (m == ffhhVar) {
            return m;
        }
        return ffcu.a;
    }
}
