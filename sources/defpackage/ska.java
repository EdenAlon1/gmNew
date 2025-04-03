package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ska extends ffhv implements ffjm {
    int a;
    final /* synthetic */ skf b;
    final /* synthetic */ aree c;
    final /* synthetic */ ardv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ska(ffgu ffguVar, skf skfVar, aree areeVar, ardv ardvVar) {
        super(2, ffguVar);
        this.b = skfVar;
        this.c = areeVar;
        this.d = ardvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ska) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            skf skfVar = this.b;
            aree areeVar = this.c;
            ardv ardvVar = this.d;
            ardn ardnVar = ardn.VMT_STATUS_QUEUED;
            this.a = 1;
            if (skfVar.d(ardnVar, areeVar, ardvVar.a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        skf skfVar2 = this.b;
        slx slxVar = (slx) slz.a.createBuilder();
        slxVar.getClass();
        String a = this.c.a.a();
        a.getClass();
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).e = a;
        String b = this.c.b.b();
        b.getClass();
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).f = b;
        aree areeVar2 = this.c;
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).b = areeVar2.c;
        String uri = this.c.d.toString();
        uri.getClass();
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).c = uri;
        String languageTag = this.d.a.toLanguageTag();
        languageTag.getClass();
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).d = languageTag;
        int i = true != this.c.e ? 4 : 3;
        slxVar.copyOnWrite();
        ((slz) slxVar.instance).g = i - 2;
        eyfy build = slxVar.build();
        build.getClass();
        return ((cevh) skfVar2.d.a.b()).a(ceyr.g("soda_file_transcription", (slz) build));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ska skaVar = new ska(ffguVar, this.b, this.c, this.d);
        skaVar.e = obj;
        return skaVar;
    }
}
