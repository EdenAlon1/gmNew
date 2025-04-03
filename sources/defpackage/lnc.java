package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnc extends ffkk implements ffji {
    final /* synthetic */ ffsd a;
    final /* synthetic */ lkk b;
    final /* synthetic */ lnd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnc(ffsd ffsdVar, lkk lkkVar, lnd lndVar) {
        super(1);
        this.a = ffsdVar;
        this.b = lkkVar;
        this.c = lndVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.a.ex(ffhe.a)) {
            this.a.a(ffhe.a, new lnb(this.b, this.c));
        } else {
            this.b.d(this.c);
        }
        return ffcu.a;
    }
}
