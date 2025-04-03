package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evps extends eyfq implements eyht {
    public evps() {
        super(evpt.a);
    }

    public final void a(String str) {
        copyOnWrite();
        evpt evptVar = (evpt) this.instance;
        evpt evptVar2 = evpt.a;
        str.getClass();
        eygr eygrVar = evptVar.d;
        if (!eygrVar.c()) {
            evptVar.d = eyfy.mutableCopy(eygrVar);
        }
        evptVar.d.add(str);
    }
}
