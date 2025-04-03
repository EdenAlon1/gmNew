package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjtm implements ffji {
    final /* synthetic */ String a;

    public cjtm(String str) {
        this.a = str;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cjsu cjsuVar = (cjsu) ((cjsw) obj).toBuilder();
        cjsuVar.copyOnWrite();
        cjsw cjswVar = (cjsw) cjsuVar.instance;
        cjswVar.b |= 1;
        cjswVar.c = this.a;
        return (cjsw) cjsuVar.build();
    }
}
