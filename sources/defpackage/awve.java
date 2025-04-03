package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awve extends eyfq implements eyht {
    public awve() {
        super(awvf.a);
    }

    public final void a(awto awtoVar) {
        copyOnWrite();
        awvf awvfVar = (awvf) this.instance;
        awtp awtpVar = (awtp) awtoVar.build();
        awvf awvfVar2 = awvf.a;
        awtpVar.getClass();
        eygr eygrVar = awvfVar.b;
        if (!eygrVar.c()) {
            awvfVar.b = eyfy.mutableCopy(eygrVar);
        }
        awvfVar.b.add(awtpVar);
    }

    public final void b(awye awyeVar) {
        copyOnWrite();
        awvf awvfVar = (awvf) this.instance;
        awyf awyfVar = (awyf) awyeVar.build();
        awvf awvfVar2 = awvf.a;
        awyfVar.getClass();
        eygr eygrVar = awvfVar.c;
        if (!eygrVar.c()) {
            awvfVar.c = eyfy.mutableCopy(eygrVar);
        }
        awvfVar.c.add(awyfVar);
    }
}
