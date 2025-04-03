package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.function.UnaryOperator$CC;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccml implements ccdx {
    public static final cskc a = cskc.g("BugleCms", "CmsMessageObjectConsumer");
    public final crty b;
    public final errl c;
    public final errl d;
    public final ccie e;
    public final ccpg f;
    public final axkm g;
    private final asio h;

    public ccml(ccpg ccpgVar, ccie ccieVar, crty crtyVar, errl errlVar, errl errlVar2, axkm axkmVar, asio asioVar) {
        this.e = ccieVar;
        this.f = ccpgVar;
        this.b = crtyVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.g = axkmVar;
        this.h = asioVar;
    }

    @Override // defpackage.ccdx
    public final elfl a(final engw engwVar, Optional optional, boolean z) {
        elfl g = g(engwVar, optional, true);
        return (csgj.a() && ((Boolean) ((cfup) csgj.o.get()).e()).booleanValue() && !this.h.a()) ? g.i(new eroh() { // from class: cclx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final ccml ccmlVar = ccml.this;
                final engw engwVar2 = engwVar;
                final enhk enhkVar = (enhk) obj;
                return ccmlVar.g.s().i(new eroh() { // from class: cclm
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        final enhk enhkVar2 = enhkVar;
                        if (!booleanValue) {
                            return elfo.e(enhkVar2);
                        }
                        engw engwVar3 = engwVar2;
                        return ccml.this.g.u(((Boolean) ((cfup) csfu.g.get()).e()).booleanValue() ? engwVar3.size() - enhkVar2.size() : engwVar3.size()).h(new emwl() { // from class: ccln
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return enhk.this;
                            }
                        }, erpp.a);
                    }
                }, ccmlVar.d);
            }
        }, this.c) : g;
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return !teq.a((eszz) obj);
    }

    @Override // defpackage.ccdx
    public final boolean c() {
        return true;
    }

    @Override // defpackage.ccdx
    public final /* bridge */ /* synthetic */ elfl d(Object obj) {
        return e((eszz) obj, true);
    }

    public final elfl e(eszz eszzVar, boolean z) {
        return f(eszzVar, true, z);
    }

    public final elfl f(final eszz eszzVar, final boolean z, final boolean z2) {
        return elfo.h(new erog() { // from class: ccmg
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return ccml.this.f.d(eszzVar, z2, false);
            }
        }, this.c).f(csgt.class, new eroh() { // from class: ccmh
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                csgt csgtVar = (csgt) obj;
                int i = csgtVar.c;
                if (i == 0) {
                    throw null;
                }
                if (i != 59) {
                    throw csgtVar;
                }
                if (!z) {
                    throw csgtVar;
                }
                final boolean z3 = z2;
                final eszz eszzVar2 = eszzVar;
                final ccml ccmlVar = ccml.this;
                csjb a2 = ccml.a.a();
                a2.I("Conversation not found in BugleDb. Fetch from CMS.");
                a2.A("cms_conversation_id", eszzVar2.m);
                a2.A("cms_object_id", eszzVar2.c);
                a2.r();
                return ccmlVar.b.m(eszzVar2.m).i(new eroh() { // from class: ccly
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ccml.this.e.a((eswr) obj2, z3);
                    }
                }, ccmlVar.c).i(new eroh() { // from class: cclz
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        csjb c = ccml.a.c();
                        c.I("Restored CMS conversation not found in BugleDb.");
                        eszz eszzVar3 = eszzVar2;
                        c.A("cms_conversation_id", eszzVar3.m);
                        c.A("cms_object_id", eszzVar3.c);
                        c.r();
                        return ccml.this.f(eszzVar3, false, z3);
                    }
                }, ccmlVar.c).e(fedn.class, new emwl() { // from class: ccma
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        fedn fednVar = (fedn) obj2;
                        if (fednVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                            throw new ccmk(fednVar);
                        }
                        throw fednVar;
                    }
                }, erpp.a).f(csgt.class, new eroh() { // from class: ccmb
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        csgt csgtVar2 = (csgt) obj2;
                        if (!(csgtVar2.getCause() instanceof SQLiteConstraintException)) {
                            throw csgtVar2;
                        }
                        boolean z4 = z3;
                        eszz eszzVar3 = eszzVar2;
                        ccml ccmlVar2 = ccml.this;
                        csjb e = ccml.a.e();
                        e.I("Error saving CMS conversation id to DB, probably because multiple objects tried to restore the conversation. Try object restore again.");
                        e.A("cms_conversation_id", eszzVar3.m);
                        e.A("cms_object_id", eszzVar3.c);
                        e.s(csgtVar2);
                        return ccmlVar2.f(eszzVar3, false, z4);
                    }
                }, ccmlVar.c);
            }
        }, this.c);
    }

    public final elfl g(engw engwVar, final Optional optional, boolean z) {
        elfl j = this.f.j(engwVar, optional);
        return z ? j.i(new eroh() { // from class: ccmf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                enhk enhkVar = (enhk) obj;
                enhkVar.getClass();
                enhk enhkVar2 = (enhk) Collection.EL.stream(enhkVar.entrySet()).filter(new Predicate() { // from class: ccls
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
                    public final boolean test(Object obj2) {
                        Map.Entry entry = (Map.Entry) obj2;
                        if (!(entry.getValue() instanceof csgt)) {
                            return false;
                        }
                        int i = ((csgt) entry.getValue()).c;
                        if (i != 0) {
                            return i == 59;
                        }
                        throw null;
                    }
                }).map(new Function() { // from class: cclt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((eszz) ((Map.Entry) obj2).getKey()).m;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).distinct().collect(endq.a(UnaryOperator$CC.identity(), new Function() { // from class: cclu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return new engr();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                if (!enhkVar2.isEmpty()) {
                    enqu listIterator = enhkVar.keySet().listIterator();
                    while (listIterator.hasNext()) {
                        eszz eszzVar = (eszz) listIterator.next();
                        engr engrVar = (engr) enhkVar2.get(eszzVar.m);
                        if (engrVar != null) {
                            engrVar.h(eszzVar);
                        }
                    }
                }
                enhk enhkVar3 = (enhk) Collection.EL.stream(enhkVar2.entrySet()).collect(endq.a(new Function() { // from class: cclv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (String) ((Map.Entry) obj2).getKey();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cclw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((engr) ((Map.Entry) obj2).getValue()).g();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                enhd enhdVar = new enhd();
                enqu listIterator2 = enhkVar.entrySet().listIterator();
                while (listIterator2.hasNext()) {
                    Map.Entry entry = (Map.Entry) listIterator2.next();
                    if (!enhkVar3.containsKey(((eszz) entry.getKey()).m)) {
                        enhdVar.i(entry);
                    }
                }
                elfl e = elfo.e(enhdVar);
                enqu listIterator3 = enhkVar3.entrySet().listIterator();
                while (listIterator3.hasNext()) {
                    final Optional optional2 = optional;
                    final ccml ccmlVar = ccml.this;
                    final Map.Entry entry2 = (Map.Entry) listIterator3.next();
                    e = e.i(new eroh() { // from class: ccmd
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj2) {
                            final Map.Entry entry3 = entry2;
                            final enhd enhdVar2 = (enhd) obj2;
                            final String str = (String) entry3.getKey();
                            final engw engwVar2 = (engw) entry3.getValue();
                            csjb c = ccml.a.c();
                            c.I("Conversation not found in BugleDb. Fetch from CMS.");
                            c.A("cms_conversation_id", str);
                            Stream map = Collection.EL.stream(engwVar2).map(new ccmc());
                            int i = engw.d;
                            c.A("cms_object_ids", map.collect(endq.a));
                            c.r();
                            final ccml ccmlVar2 = ccml.this;
                            elfl e2 = ccmlVar2.b.m(str).i(new eroh() { // from class: cclo
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    return ccml.this.e.a((eswr) obj3, true);
                                }
                            }, ccmlVar2.c).e(fedn.class, new emwl() { // from class: cclp
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    fedn fednVar = (fedn) obj3;
                                    if (fednVar.a.getCode().equals(Status.Code.NOT_FOUND)) {
                                        throw new ccmk(fednVar);
                                    }
                                    throw fednVar;
                                }
                            }, erpp.a);
                            final Optional optional3 = optional2;
                            elfl f = e2.i(new eroh() { // from class: cclq
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    return ccml.this.g(engwVar2, optional3, false);
                                }
                            }, ccmlVar2.c).f(Exception.class, new eroh() { // from class: cclr
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    if ((!(exc instanceof csgt) || !(exc.getCause() instanceof SQLiteConstraintException)) && !(exc instanceof SQLiteConstraintException)) {
                                        throw exc;
                                    }
                                    Optional optional4 = optional3;
                                    engw engwVar3 = engwVar2;
                                    String str2 = str;
                                    ccml ccmlVar3 = ccml.this;
                                    csjb e3 = ccml.a.e();
                                    e3.I("Error saving CMS conversation id to DB, probably because multiple objects tried to restore the conversation. Try object restore again.");
                                    e3.A("cms_conversation_id", str2);
                                    Stream map2 = Collection.EL.stream(engwVar3).map(new ccmc());
                                    int i2 = engw.d;
                                    e3.A("cms_object_ids", map2.collect(endq.a));
                                    e3.s(exc);
                                    return ccmlVar3.g(engwVar3, optional4, false);
                                }
                            }, ccmlVar2.c);
                            enhdVar2.getClass();
                            return f.h(new emwl() { // from class: ccmi
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    enhd enhdVar3 = enhd.this;
                                    enhdVar3.g((enhk) obj3);
                                    return enhdVar3;
                                }
                            }, erpp.a).e(Exception.class, new emwl() { // from class: ccmj
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    Exception exc = (Exception) obj3;
                                    engw engwVar3 = (engw) entry3.getValue();
                                    int size = engwVar3.size();
                                    int i2 = 0;
                                    while (true) {
                                        enhd enhdVar3 = enhdVar2;
                                        if (i2 >= size) {
                                            return enhdVar3;
                                        }
                                        enhdVar3.k((eszz) engwVar3.get(i2), exc);
                                        i2++;
                                    }
                                }
                            }, erpp.a);
                        }
                    }, ccmlVar.d);
                }
                return e.h(new emwl() { // from class: ccme
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        return ((enhd) obj2).c();
                    }
                }, erpp.a);
            }
        }, this.c) : j;
    }
}
