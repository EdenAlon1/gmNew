package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ectv extends eyfq implements eyht {
    public ectv() {
        super(ectw.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ectw ectwVar = (ectw) this.instance;
        ectw ectwVar2 = ectw.a;
        eygr eygrVar = ectwVar.j;
        if (!eygrVar.c()) {
            ectwVar.j = eyfy.mutableCopy(eygrVar);
        }
        ectwVar.j.add(str);
    }
}
