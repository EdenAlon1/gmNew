package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjtk implements ffji {
    final /* synthetic */ eyja a;

    public cjtk(eyja eyjaVar) {
        this.a = eyjaVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cjsu cjsuVar = (cjsu) ((cjsw) obj).toBuilder();
        cjsuVar.copyOnWrite();
        cjsw cjswVar = (cjsw) cjsuVar.instance;
        eyja eyjaVar = this.a;
        eyjaVar.getClass();
        cjswVar.d = eyjaVar;
        cjswVar.b |= 2;
        return (cjsw) cjsuVar.build();
    }
}
