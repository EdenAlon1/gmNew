package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecwx extends eyfq implements eyht {
    public ecwx() {
        super(ecwy.a);
    }

    public final void a(eyee eyeeVar) {
        copyOnWrite();
        ecwy ecwyVar = (ecwy) this.instance;
        ecwy ecwyVar2 = ecwy.a;
        eygr eygrVar = ecwyVar.d;
        if (!eygrVar.c()) {
            ecwyVar.d = eyfy.mutableCopy(eygrVar);
        }
        ecwyVar.d.add(eyeeVar);
    }
}
