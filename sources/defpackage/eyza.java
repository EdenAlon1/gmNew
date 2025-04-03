package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyza extends eyfq implements eyht {
    public eyza() {
        super(eyzb.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eyzb eyzbVar = (eyzb) this.instance;
        eyzb eyzbVar2 = eyzb.a;
        str.getClass();
        eygr eygrVar = eyzbVar.b;
        if (!eygrVar.c()) {
            eyzbVar.b = eyfy.mutableCopy(eygrVar);
        }
        eyzbVar.b.add(str);
    }
}
