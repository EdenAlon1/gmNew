package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class stt extends ffhv implements ffjm {
    final /* synthetic */ brbm a;
    final /* synthetic */ stz b;
    final /* synthetic */ Instant c;
    final /* synthetic */ Instant d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stt(ffgu ffguVar, brbm brbmVar, stz stzVar, Instant instant, Instant instant2) {
        super(2, ffguVar);
        this.a = brbmVar;
        this.b = stzVar;
        this.c = instant;
        this.d = instant2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((stt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("+conversationsWithReplies");
        e.i(new stv(this.a, this.c, this.d));
        return new Integer(e.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        stt sttVar = new stt(ffguVar, this.a, this.b, this.c, this.d);
        sttVar.e = obj;
        return sttVar;
    }
}
