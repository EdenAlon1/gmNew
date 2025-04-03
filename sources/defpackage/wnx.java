package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wnx implements ffji {
    public static final wnx a = new wnx();

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        czuk czukVar = (czuk) obj;
        czukVar.getClass();
        czuj builder = czukVar.toBuilder();
        int i = czukVar.d + 1;
        builder.copyOnWrite();
        czuk czukVar2 = (czuk) builder.instance;
        czukVar2.b |= 2;
        czukVar2.d = i;
        czuk build = builder.build();
        build.getClass();
        return build;
    }
}
