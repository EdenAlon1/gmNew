package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exvu extends eyfq implements eyht {
    public exvu() {
        super(exvv.a);
    }

    public final void a(exvz exvzVar) {
        copyOnWrite();
        exvv exvvVar = (exvv) this.instance;
        exwa exwaVar = (exwa) exvzVar.build();
        exvv exvvVar2 = exvv.a;
        exwaVar.getClass();
        eygr eygrVar = exvvVar.c;
        if (!eygrVar.c()) {
            exvvVar.c = eyfy.mutableCopy(eygrVar);
        }
        exvvVar.c.add(exwaVar);
    }
}
