package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aawz extends ffhv implements ffjm {
    Object a;
    Object b;
    boolean c;
    int d;
    final /* synthetic */ aaxb e;
    final /* synthetic */ engw f;
    final /* synthetic */ boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawz(aaxb aaxbVar, engw engwVar, boolean z, ffgu ffguVar) {
        super(2, ffguVar);
        this.e = aaxbVar;
        this.f = engwVar;
        this.g = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aawz) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        fgcm fgcmVar;
        engw engwVar;
        ffhh ffhhVar = ffhh.a;
        if (this.d != 0) {
            z = this.c;
            Object obj2 = this.b;
            Object obj3 = this.a;
            ffci.b(obj);
            engwVar = obj2;
            fgcmVar = obj3;
        } else {
            ffci.b(obj);
            aaxb aaxbVar = this.e;
            engw engwVar2 = this.f;
            boolean z2 = this.g;
            fgcm fgcmVar2 = aaxbVar.a;
            this.a = fgcmVar2;
            this.b = engwVar2;
            this.c = z2;
            this.d = 1;
            obj = aaxbVar.f(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            z = z2;
            fgcmVar = fgcmVar2;
            engwVar = engwVar2;
        }
        fgcmVar.f(new aaxe(engwVar, null, z, (Boolean) obj));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aawz(this.e, this.f, this.g, ffguVar);
    }
}
