package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class aqyr {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public aqyr(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.d = ffbrVar4;
        this.a = ffbrVar;
        this.c = ffbrVar2;
        this.b = ffbrVar3;
        this.e = ffbrVar5;
    }

    public final Optional a(int i) {
        if (!((atrn) this.e.b()).a()) {
            return ((djsi) this.c.b()).g(i).map(new Function() { // from class: aqyq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    aqyr aqyrVar = aqyr.this;
                    return ((aolr) aqyrVar.b.b()).b(((avkc) aqyrVar.a.b()).c(((djrj) obj).a));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        Optional ofNullable = Optional.ofNullable(((ckac) this.d.b()).a(i));
        final aolr aolrVar = (aolr) this.b.b();
        aolrVar.getClass();
        return ofNullable.map(new Function() { // from class: aqyp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aolr.this.b((awui) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
