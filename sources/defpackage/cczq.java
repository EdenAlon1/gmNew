package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cczq extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ Optional c;
    final /* synthetic */ cdaf d;
    final /* synthetic */ ccvl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cczq(Optional optional, cdaf cdafVar, ccvl ccvlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = optional;
        this.d = cdafVar;
        this.e = ccvlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cczq) c((Map) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                Map map = (Map) this.b;
                Optional optional = this.c;
                final ccvl ccvlVar = this.e;
                final ffji ffjiVar = new ffji() { // from class: cczm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj2) {
                        int i = ccvl.this.b.e;
                        cenl cenlVar = (cenl) obj2;
                        long a = cenlVar.a.a();
                        cenk a2 = cenlVar.a(i);
                        if (a2 != null) {
                            a2.d = a;
                        }
                        return ffcu.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cczn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        ffji.this.invoke(obj2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                ccvq ccvqVar = this.d.g;
                ccvl ccvlVar2 = this.e;
                this.a = 1;
                obj = ccvqVar.a(map, ccvlVar2, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            return (Map) obj;
        } finally {
            Optional optional2 = this.c;
            final ccvl ccvlVar3 = this.e;
            final ffji ffjiVar2 = new ffji() { // from class: cczo
                @Override // defpackage.ffji
                public final Object invoke(Object obj2) {
                    int i = ccvl.this.b.e;
                    cenl cenlVar = (cenl) obj2;
                    long a = cenlVar.a.a();
                    cenk a2 = cenlVar.a(i);
                    if (a2 != null) {
                        a2.e = a;
                    }
                    return ffcu.a;
                }
            };
            optional2.ifPresent(new Consumer() { // from class: cczp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    ffji.this.invoke(obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cczq cczqVar = new cczq(this.c, this.d, this.e, ffguVar);
        cczqVar.b = obj;
        return cczqVar;
    }
}
