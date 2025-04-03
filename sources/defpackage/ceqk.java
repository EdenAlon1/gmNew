package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceqk extends eyfq implements eyht {
    public ceqk() {
        super(ceql.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ceql ceqlVar = (ceql) this.instance;
        ceql ceqlVar2 = ceql.a;
        str.getClass();
        eygr eygrVar = ceqlVar.c;
        if (!eygrVar.c()) {
            ceqlVar.c = eyfy.mutableCopy(eygrVar);
        }
        ceqlVar.c.add(str);
    }
}
