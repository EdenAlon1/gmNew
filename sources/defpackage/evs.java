package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class evs extends ffkk implements ffji {
    final /* synthetic */ ffkx a;
    final /* synthetic */ jlk b;
    final /* synthetic */ jou c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evs(ffkx ffkxVar, jlk jlkVar, jou jouVar) {
        super(1);
        this.a = ffkxVar;
        this.b = jlkVar;
        this.c = jouVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jlk jlkVar;
        jlk jlkVar2 = (jlk) obj;
        if (this.a.a && (jlkVar2.a instanceof jou)) {
            int i = jlkVar2.b;
            jlk jlkVar3 = this.b;
            if (i == jlkVar3.b && jlkVar2.c == jlkVar3.c) {
                jou jouVar = this.c;
                if (jouVar == null) {
                    jouVar = new jou(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65535);
                }
                jlkVar = new jlk(jouVar, jlkVar2.b, jlkVar2.c);
                this.a.a = ffkj.e(this.b, jlkVar2);
                return jlkVar;
            }
        }
        jlkVar = jlkVar2;
        this.a.a = ffkj.e(this.b, jlkVar2);
        return jlkVar;
    }
}
