package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esy extends ffkk implements ffji {
    final /* synthetic */ eva a;
    final /* synthetic */ jvw b;
    final /* synthetic */ jvu c;
    final /* synthetic */ juw d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esy(eva evaVar, jvw jvwVar, jvu jvuVar, juw juwVar) {
        super(1);
        this.a = evaVar;
        this.b = jvwVar;
        this.c = jvuVar;
        this.d = juwVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.a.p()) {
            eva evaVar = this.a;
            evaVar.c = ewe.c(this.b, this.c, evaVar.b, this.d, evaVar.p, evaVar.q);
        }
        return new esx();
    }
}
