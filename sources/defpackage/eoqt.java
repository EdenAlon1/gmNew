package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eoqt extends eyfq implements eyht {
    public eoqt() {
        super(eoqv.a);
    }

    public final void a(eoqp eoqpVar) {
        copyOnWrite();
        eoqv eoqvVar = (eoqv) this.instance;
        eoqs eoqsVar = (eoqs) eoqpVar.build();
        eoqv eoqvVar2 = eoqv.a;
        eoqsVar.getClass();
        eygr eygrVar = eoqvVar.c;
        if (!eygrVar.c()) {
            eoqvVar.c = eyfy.mutableCopy(eygrVar);
        }
        eoqvVar.c.add(eoqsVar);
    }
}
