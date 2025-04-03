package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctow {
    public static final cfva a = cfvl.i(cfvl.b, "enable_parsing_emoji_suggestions", false);
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final cskc g;

    public ctow(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, @asgu ffbr ffbrVar5) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = cskc.g("Bugle", "SuggestionMapper");
    }

    public final fbxa a(fbxa fbxaVar, fbri fbriVar) {
        fbxaVar.getClass();
        fbriVar.getClass();
        fbwy fbwyVar = fbxaVar.e;
        if (fbwyVar == null) {
            fbwyVar = fbwy.b;
        }
        fbwx fbwxVar = (fbwx) fbwyVar.toBuilder();
        fbwxVar.copyOnWrite();
        ((fbwy) fbwxVar.instance).l = fbriVar.a();
        fbwz fbwzVar = (fbwz) fbxaVar.toBuilder();
        fbwzVar.copyOnWrite();
        fbxa fbxaVar2 = (fbxa) fbwzVar.instance;
        fbwy fbwyVar2 = (fbwy) fbwxVar.build();
        fbwyVar2.getClass();
        fbxaVar2.e = fbwyVar2;
        fbxaVar2.b |= 1;
        eyfy build = fbwzVar.build();
        build.getClass();
        return (fbxa) build;
    }
}
