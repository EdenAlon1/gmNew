package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eypq extends eyfq implements eyht {
    public eypq() {
        super(eyps.a);
    }

    public final void a(eyee eyeeVar) {
        copyOnWrite();
        eyps eypsVar = (eyps) this.instance;
        eyps eypsVar2 = eyps.a;
        eygr eygrVar = eypsVar.d;
        if (!eygrVar.c()) {
            eypsVar.d = eyfy.mutableCopy(eygrVar);
        }
        eypsVar.d.add(eyeeVar);
    }
}
