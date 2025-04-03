package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaxa extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    boolean d;
    int e;
    final /* synthetic */ aaxb f;
    final /* synthetic */ engw g;
    final /* synthetic */ boolean h;
    final /* synthetic */ aaxg i;
    final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaxa(aaxb aaxbVar, engw engwVar, boolean z, aaxg aaxgVar, boolean z2, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = aaxbVar;
        this.g = engwVar;
        this.h = z;
        this.i = aaxgVar;
        this.j = z2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aaxa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        boolean z;
        fgcm fgcmVar;
        engw engwVar;
        ffhh ffhhVar = ffhh.a;
        if (this.e != 0) {
            z = this.d;
            obj2 = this.c;
            Object obj3 = this.b;
            Object obj4 = this.a;
            ffci.b(obj);
            engwVar = obj3;
            fgcmVar = obj4;
        } else {
            ffci.b(obj);
            aaxb aaxbVar = this.f;
            engw engwVar2 = this.g;
            obj2 = this.h ? this.i : null;
            fgcm fgcmVar2 = aaxbVar.a;
            boolean z2 = this.j;
            this.a = fgcmVar2;
            this.b = engwVar2;
            this.c = obj2;
            this.d = z2;
            this.e = 1;
            obj = aaxbVar.f(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            z = z2;
            engwVar = engwVar2;
            fgcmVar = fgcmVar2;
        }
        fgcmVar.f(new aaxe(engwVar, (aaxg) obj2, z, (Boolean) obj));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aaxa(this.f, this.g, this.h, this.i, this.j, ffguVar);
    }
}
