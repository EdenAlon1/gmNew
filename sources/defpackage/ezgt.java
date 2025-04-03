package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ezgt extends eyfq implements eyht {
    public ezgt() {
        super(ezgu.a);
    }

    public final void a(int i) {
        copyOnWrite();
        ezgu ezguVar = (ezgu) this.instance;
        ezgu ezguVar2 = ezgu.a;
        eygi eygiVar = ezguVar.b;
        if (!eygiVar.c()) {
            ezguVar.b = eyfy.mutableCopy(eygiVar);
        }
        ezguVar.b.h(i);
    }
}
