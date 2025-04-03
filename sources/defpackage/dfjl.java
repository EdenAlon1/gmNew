package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfjl extends eyfq implements eyht {
    public dfjl() {
        super(dfjm.a);
    }

    public final void a(dfix dfixVar) {
        copyOnWrite();
        dfjm dfjmVar = (dfjm) this.instance;
        dfjm dfjmVar2 = dfjm.a;
        eygr eygrVar = dfjmVar.d;
        if (!eygrVar.c()) {
            dfjmVar.d = eyfy.mutableCopy(eygrVar);
        }
        dfjmVar.d.add(dfixVar);
    }
}
