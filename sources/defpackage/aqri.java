package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqri extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqkp b;
    final /* synthetic */ eisx c;
    final /* synthetic */ aqkv d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqri(ffgu ffguVar, aqkp aqkpVar, eisx eisxVar, aqkv aqkvVar) {
        super(2, ffguVar);
        this.b = aqkpVar;
        this.c = eisxVar;
        this.d = aqkvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqri) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            aqkp aqkpVar = this.b;
            final eisx eisxVar = this.c;
            final boolean z = true;
            final aqjw aqjwVar = (aqjw) aqkpVar;
            elfl i = aqjwVar.e(engw.r(this.d)).b().i(new eroh() { // from class: aqiu
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj2) {
                    engw g = ((enhk) obj2).values().g();
                    z.booleanValue();
                    return aqjw.this.t(eisxVar, g, true);
                }
            }, aqjwVar.c);
            this.a = 1;
            obj = fgfz.c(i, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((enhk) obj).size() == 1);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqri aqriVar = new aqri(ffguVar, this.b, this.c, this.d);
        aqriVar.e = obj;
        return aqriVar;
    }
}
