package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbiv extends eyfq implements eyht {
    public fbiv() {
        super(fbiw.a);
    }

    public final void a(fbik fbikVar) {
        copyOnWrite();
        fbiw fbiwVar = (fbiw) this.instance;
        fbiw fbiwVar2 = fbiw.a;
        fbikVar.getClass();
        eygr eygrVar = fbiwVar.b;
        if (!eygrVar.c()) {
            fbiwVar.b = eyfy.mutableCopy(eygrVar);
        }
        fbiwVar.b.add(fbikVar);
    }
}
