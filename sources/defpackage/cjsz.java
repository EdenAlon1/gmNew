package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjsz implements ffji {
    final /* synthetic */ String a;
    final /* synthetic */ String b;

    public cjsz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cjsu cjsuVar = (cjsu) ((cjsw) obj).toBuilder();
        cjty cjtyVar = (cjty) cjtz.a.createBuilder();
        cjtyVar.getClass();
        cjtyVar.copyOnWrite();
        cjtz cjtzVar = (cjtz) cjtyVar.instance;
        cjtzVar.b |= 1;
        cjtzVar.c = this.b;
        eyfy build = cjtyVar.build();
        build.getClass();
        String str = this.a;
        str.getClass();
        cjsuVar.copyOnWrite();
        ((cjsw) cjsuVar.instance).a().put(str, (cjtz) build);
        return (cjsw) cjsuVar.build();
    }
}
