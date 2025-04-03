package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egda {
    private final ffbr a;

    public egda(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final egdb a() {
        return new egdb((emyg) this.a.b());
    }

    public final egdc b(int i) {
        emyg emygVar = new egdb((emyg) this.a.b()).a;
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgp exgpVar = (exgp) exgq.a.createBuilder();
        exgpVar.copyOnWrite();
        exgq exgqVar = (exgq) exgpVar.instance;
        exgqVar.c = 6;
        exgqVar.b |= 1;
        exgpVar.copyOnWrite();
        exgq exgqVar2 = (exgq) exgpVar.instance;
        exgqVar2.d = i - 1;
        exgqVar2.b |= 2;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgq exgqVar3 = (exgq) exgpVar.build();
        exgqVar3.getClass();
        exfwVar.d = exgqVar3;
        exfwVar.c = 1;
        return new egdc(emygVar, exfvVar);
    }
}
