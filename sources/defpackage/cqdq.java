package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqdq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cqdr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqdq(cqdr cqdrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cqdrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cqdq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cqek cqekVar = (cqek) this.b.d.b();
            cqekVar.e.k("last_sync_time_millis", -1L);
            cqekVar.e.k("last_full_sync_time_millis", -1L);
            elfl h = cqekVar.g.j(new emwl() { // from class: cqea
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    cfup cfupVar = cqek.a;
                    cqdu cqduVar = (cqdu) ((cqdv) obj2).toBuilder();
                    eyja b = eykj.b(cqek.d);
                    cqduVar.copyOnWrite();
                    cqdv cqdvVar = (cqdv) cqduVar.instance;
                    b.getClass();
                    cqdvVar.e = b;
                    cqdvVar.b |= 4;
                    eyja b2 = eykj.b(cqek.c);
                    cqduVar.copyOnWrite();
                    cqdv cqdvVar2 = (cqdv) cqduVar.instance;
                    b2.getClass();
                    cqdvVar2.d = b2;
                    cqdvVar2.b |= 2;
                    return (cqdv) cqduVar.build();
                }
            }).h(new emwl() { // from class: cqeb
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    cfup cfupVar = cqek.a;
                    return null;
                }
            }, cqekVar.h);
            this.a = 1;
            if (fgfz.c(h, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cqdq(this.b, ffguVar);
    }
}
