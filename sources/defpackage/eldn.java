package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldn extends eyfq implements eyht {
    public eldn() {
        super(eldq.a);
    }

    public final void a(ekzx ekzxVar) {
        copyOnWrite();
        eldq eldqVar = (eldq) this.instance;
        eldq eldqVar2 = eldq.a;
        ekzxVar.getClass();
        eygr eygrVar = eldqVar.e;
        if (!eygrVar.c()) {
            eldqVar.e = eyfy.mutableCopy(eygrVar);
        }
        eldqVar.e.add(ekzxVar);
    }
}
