package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emqu extends eyfq implements eyht {
    public emqu() {
        super(emqv.a);
    }

    public final void a(String str) {
        copyOnWrite();
        emqv emqvVar = (emqv) this.instance;
        emqv emqvVar2 = emqv.a;
        eygr eygrVar = emqvVar.f;
        if (!eygrVar.c()) {
            emqvVar.f = eyfy.mutableCopy(eygrVar);
        }
        emqvVar.f.add(str);
    }
}
