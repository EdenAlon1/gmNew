package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.net.URI;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class cpih {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cpih(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final elfl a(esqv esqvVar, awui awuiVar) {
        awvx awvxVar = (awvx) awvy.b.createBuilder();
        awvxVar.a(cpkn.a(esqvVar.c));
        String str = esqvVar.a.a.c;
        awvxVar.copyOnWrite();
        awvy awvyVar = (awvy) awvxVar.instance;
        str.getClass();
        awvyVar.c |= 1;
        awvyVar.d = str;
        awui a = ((avkc) this.a.b()).a(((URI) esqvVar.a.b.get()).toString(), true);
        awvxVar.copyOnWrite();
        awvy awvyVar2 = (awvy) awvxVar.instance;
        a.getClass();
        awvyVar2.f = a;
        awvyVar2.c |= 4;
        awwx awwxVar = (awwx) awwy.a.createBuilder();
        String str2 = esqvVar.b.a;
        awwxVar.copyOnWrite();
        awwy awwyVar = (awwy) awwxVar.instance;
        awwyVar.b |= 1;
        awwyVar.c = str2;
        awvxVar.copyOnWrite();
        awvy awvyVar3 = (awvy) awvxVar.instance;
        awwy awwyVar2 = (awwy) awwxVar.build();
        awwyVar2.getClass();
        awvyVar3.i = awwyVar2;
        awvyVar3.c |= 8;
        Stream map = Collection.EL.stream(esqvVar.d).map(new Function() { // from class: cpie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((esqy) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final emwd m = new cpiw().m();
        Stream map2 = map.map(new Function() { // from class: cpif
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (awui) emwd.this.fP((fcek) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: cpig
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                awui awuiVar2 = (awui) obj;
                awwn awwnVar = (awwn) awwq.a.createBuilder();
                awwnVar.copyOnWrite();
                awwq awwqVar = (awwq) awwnVar.instance;
                awuiVar2.getClass();
                awwqVar.c = awuiVar2;
                awwqVar.b |= 1;
                awwp awwpVar = awwp.JOINED;
                awwnVar.copyOnWrite();
                awwq awwqVar2 = (awwq) awwnVar.instance;
                awwqVar2.d = awwpVar.e;
                awwqVar2.b |= 2;
                return (awwq) awwnVar.build();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        awvxVar.b((Iterable) map2.collect(endq.a));
        awvxVar.copyOnWrite();
        awvy awvyVar4 = (awvy) awvxVar.instance;
        awuiVar.getClass();
        awvyVar4.l = awuiVar;
        awvyVar4.c |= 64;
        awvz awvzVar = (awvz) awwa.a.createBuilder();
        esqs esqsVar = esqvVar.b.d;
        awvzVar.copyOnWrite();
        awwa awwaVar = (awwa) awvzVar.instance;
        awwaVar.b |= 1;
        awwaVar.c = esqsVar.b;
        awvxVar.copyOnWrite();
        awvy awvyVar5 = (awvy) awvxVar.instance;
        awwa awwaVar2 = (awwa) awvzVar.build();
        awwaVar2.getClass();
        awvyVar5.j = awwaVar2;
        awvyVar5.c |= 16;
        if (((asqj) this.c.b()).a()) {
            awwj a2 = cpin.a(esqvVar.b.c);
            awvxVar.copyOnWrite();
            awvy awvyVar6 = (awvy) awvxVar.instance;
            awvyVar6.m = a2;
            awvyVar6.c |= 128;
        }
        return ((avkh) this.b.b()).d((awvy) awvxVar.build());
    }
}
