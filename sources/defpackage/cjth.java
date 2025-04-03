package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjth implements ffji {
    final /* synthetic */ String a;

    public cjth(String str) {
        this.a = str;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cjsu cjsuVar = (cjsu) ((cjsw) obj).toBuilder();
        String str = this.a;
        str.getClass();
        cjsuVar.copyOnWrite();
        ((cjsw) cjsuVar.instance).a().remove(str);
        return (cjsw) cjsuVar.build();
    }
}
