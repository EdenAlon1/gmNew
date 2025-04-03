package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzpf extends ceut {
    public static final cfva a = cfvl.r(164486593, "use_attachment_to_blobstore_uploader_worker");
    public final ffbr b;
    public final ffbr c;
    public final bcsq d;
    public final bigl e;
    public final chdj f;
    public final atky g;
    private final errl h;
    private final errl i;
    private final fazb j;

    public bzpf(ffbr ffbrVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, bcsq bcsqVar, bigl biglVar, chdj chdjVar, fazb fazbVar, atky atkyVar) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.h = errlVar;
        this.i = errlVar2;
        this.d = bcsqVar;
        this.e = biglVar;
        this.f = chdjVar;
        this.j = fazbVar;
        this.g = atkyVar;
    }

    private final boolean k() {
        return Collection.EL.stream((Set) this.j.b()).allMatch(new Predicate() { // from class: bzpc
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((bzhr) obj).b();
            }
        });
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final cety a() {
        cetx l = cety.l();
        poh pohVar = new poh();
        pohVar.c(2);
        ((ceti) l).a = pohVar.a();
        l.c(5);
        l.f(poa.EXPONENTIAL);
        return l.a();
    }

    @Override // defpackage.ceve
    public final ekzz b() {
        return eleg.f("UploadAttachmentsToBlobstoreHandler");
    }

    @Override // defpackage.ceve
    public final eyhz d() {
        return bzph.a.getParserForType();
    }

    @Override // defpackage.ceut, defpackage.ceve
    public final /* synthetic */ boolean h(eyhs eyhsVar) {
        return k();
    }

    @Override // defpackage.ceut
    protected final /* bridge */ /* synthetic */ elfl j(ceuw ceuwVar, eyhs eyhsVar) {
        final bzph bzphVar = (bzph) eyhsVar;
        return !k() ? elfo.e(ceyt.k()) : elfo.h(new erog() { // from class: bzpd
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ArrayList arrayList;
                bzpf bzpfVar = bzpf.this;
                bznu bznuVar = (bznu) bzpfVar.b.b();
                bzph bzphVar2 = bzphVar;
                List list = (List) Collection.EL.stream(bzphVar2.b).map(new Function() { // from class: bzpa
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        cfva cfvaVar = bzpf.a;
                        return bdhb.b((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bzpb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                if (bzpfVar.g.a()) {
                    arrayList = new ArrayList();
                    bifu bifuVar = (bifu) bzpfVar.e.e((MessageIdType[]) list.toArray(new MessageIdType[0])).b().o();
                    while (bifuVar.moveToNext()) {
                        try {
                            arrayList.add(((bcsf) bzpfVar.c.b()).c(bifuVar));
                        } finally {
                        }
                    }
                    bifuVar.close();
                } else {
                    arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        bjjd bjjdVar = (bjjd) bzpfVar.d.b((MessageIdType) it.next()).o();
                        try {
                            if (bjjdVar.moveToNext()) {
                                arrayList.add(((bcsf) bzpfVar.c.b()).e(bjjdVar));
                            }
                            bjjdVar.close();
                        } finally {
                        }
                    }
                }
                boolean z = bzphVar2.c;
                String str = bzphVar2.d;
                return bznuVar.a(bznu.b(arrayList, str), z, str, bzpfVar.f, Optional.empty());
            }
        }, this.i).h(new emwl() { // from class: bzpe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cfva cfvaVar = bzpf.a;
                return ceyt.i();
            }
        }, this.h);
    }
}
