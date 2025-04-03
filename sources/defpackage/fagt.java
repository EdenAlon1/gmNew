package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fagt extends eyfq implements eyht {
    public fagt() {
        super(fagu.a);
    }

    public final void a(String str) {
        copyOnWrite();
        fagu faguVar = (fagu) this.instance;
        fagu faguVar2 = fagu.a;
        eygr eygrVar = faguVar.f;
        if (!eygrVar.c()) {
            faguVar.f = eyfy.mutableCopy(eygrVar);
        }
        faguVar.f.add(str);
    }
}
