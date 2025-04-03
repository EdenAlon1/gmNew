package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjtf implements ffji {
    public static final cjtf a = new cjtf();

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        cjsu cjsuVar = (cjsu) ((cjsw) obj).toBuilder();
        String str = cjtn.a;
        cjsuVar.copyOnWrite();
        cjsw cjswVar = (cjsw) cjsuVar.instance;
        str.getClass();
        cjswVar.b |= 1;
        cjswVar.c = str;
        return (cjsw) cjsuVar.build();
    }
}
