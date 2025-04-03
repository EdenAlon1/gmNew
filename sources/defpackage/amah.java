package defpackage;

import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amah {
    private final emye a = emye.b('|');
    private final ambi b;

    public amah(ambi ambiVar) {
        this.b = ambiVar;
    }

    public final engw a(String str, Function function) {
        bqyp bqypVar;
        String str2;
        long j;
        int i = engw.d;
        engr engrVar = new engr();
        bqzs a = bqzv.a();
        a.z(str);
        a.d(new Function() { // from class: amaf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqyn bqynVar = (bqyn) obj;
                return new bqyo[]{bqynVar.b, bqynVar.c, bqynVar.n, bqynVar.e, bqynVar.h};
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
        String str3 = "count";
        a.n(new dtzr("COUNT(*)"), "count");
        int i2 = 1;
        String str4 = "phones";
        a.n(new dtzq("group_concat($V, '|')", new Object[]{bqzv.c.d}), "phones");
        a.n(new dtzq("group_concat($V, '|')", new Object[]{bqzv.c.r}), "display_destinations");
        a.n(new dtzq("group_concat($V, '|')", new Object[]{bqzv.c.p}), "types");
        a.n(new dtzq("group_concat(COALESCE($V, $V), '|')", new Object[]{bqzv.c.q, ""}), "labels");
        a.f(function);
        a.v(bqzv.c.b);
        bqyn bqynVar = bqzv.c;
        a.c(new bqzp(bqynVar.o), new bqzp(bqynVar.m));
        bqyp bqypVar2 = (bqyp) a.b().o();
        while (bqypVar2.moveToNext()) {
            try {
                long c = bqypVar2.c();
                String g = bqypVar2.g();
                String h = bqypVar2.h();
                String f = bqypVar2.f();
                engr engrVar2 = new engr();
                int parseInt = Integer.parseInt(bqypVar2.dd(str3));
                if (parseInt == i2) {
                    str2 = str3;
                    j = c;
                    engrVar2.h(this.b.a(Integer.parseInt(bqypVar2.dd("types")), bqypVar2.dd("labels"), bqypVar2.dd(str4), bqypVar2.dd("display_destinations")));
                } else {
                    str2 = str3;
                    j = c;
                    Iterable g2 = this.a.g(bqypVar2.dd(str4));
                    Iterator it = this.a.g(bqypVar2.dd("display_destinations")).iterator();
                    Iterator it2 = this.a.g(bqypVar2.dd("types")).iterator();
                    Iterator it3 = this.a.g(bqypVar2.dd("labels")).iterator();
                    Iterator it4 = g2.iterator();
                    while (it4.hasNext()) {
                        bqyp bqypVar3 = bqypVar2;
                        engrVar2.h(this.b.a(Integer.parseInt((String) it2.next()), it3 != null ? (String) it3.next() : null, (String) it4.next(), (String) it.next()));
                        bqypVar2 = bqypVar3;
                        str4 = str4;
                        it4 = it4;
                        it = it;
                    }
                }
                bqypVar = bqypVar2;
                String str5 = str4;
                try {
                    engw g3 = engrVar2.g();
                    emxf.a(((enou) g3).c == parseInt);
                    engrVar.h(ambj.g(j, g, h, f, g3, bqypVar.e()));
                    bqypVar2 = bqypVar;
                    str3 = str2;
                    str4 = str5;
                    i2 = 1;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        bqypVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bqypVar = bqypVar2;
            }
        }
        bqypVar2.close();
        return engrVar.g();
    }
}
