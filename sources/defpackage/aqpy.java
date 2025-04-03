package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqpy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqqa b;
    final /* synthetic */ aqpw c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqpy(aqqa aqqaVar, aqpw aqpwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqqaVar;
        this.c = aqpwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqpy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aqpx aqpxVar = (aqpx) this.b.c.b();
            aqpw aqpwVar = this.c;
            cetp cetpVar = new cetp();
            cetpVar.c = Duration.ofSeconds(5L);
            elfl b = ((cevh) aqpxVar.a.b()).a(ceyr.h("participant_contact_sync", aqpwVar, cetpVar.a())).b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqpy(this.b, this.c, ffguVar);
    }
}
