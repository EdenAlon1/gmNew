package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszy extends eyfq implements eyht {
    public eszy() {
        super(eszz.a);
    }

    public final void a(String str) {
        copyOnWrite();
        eszz eszzVar = (eszz) this.instance;
        eszz eszzVar2 = eszz.a;
        eszzVar.a();
        eszzVar.h.add(str);
    }

    public final void b(String str, String str2) {
        str2.getClass();
        copyOnWrite();
        eszz eszzVar = (eszz) this.instance;
        eszz eszzVar2 = eszz.a;
        eyhm eyhmVar = eszzVar.g;
        if (!eyhmVar.b) {
            eszzVar.g = eyhmVar.a();
        }
        eszzVar.g.put(str, str2);
    }
}
