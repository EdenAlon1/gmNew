package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eyiu extends eyfq implements eyht {
    public eyiu() {
        super(eyiw.a);
    }

    public final void a(String str, eyjq eyjqVar) {
        eyjqVar.getClass();
        copyOnWrite();
        eyiw eyiwVar = (eyiw) this.instance;
        eyiw eyiwVar2 = eyiw.a;
        eyhm eyhmVar = eyiwVar.b;
        if (!eyhmVar.b) {
            eyiwVar.b = eyhmVar.a();
        }
        eyiwVar.b.put(str, eyjqVar);
    }
}
