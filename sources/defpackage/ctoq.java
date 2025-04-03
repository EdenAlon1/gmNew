package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctoq extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffbr b;
    final /* synthetic */ errl c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctoq(ffgu ffguVar, ffbr ffbrVar, errl errlVar) {
        super(2, ffguVar);
        this.b = ffbrVar;
        this.c = errlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctoq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        final emhv d = ctmg.d((String) ctjd.A.e());
        final emmt emmtVar = (emmt) this.b.b();
        final String str = (String) ctjd.B.e();
        final errl errlVar = this.c;
        final Random random = new Random();
        final engw a = emmp.a(str);
        ListenableFuture f = erny.f(erqc.o(d.equals(emhv.a) ? erqt.i(emmr.c().a()) : emmtVar.c(d).f(new erot() { // from class: emme
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj2) {
                final InputStream inputStream = (InputStream) obj2;
                final emhv emhvVar = emhv.this;
                final engw engwVar = a;
                final emmt emmtVar2 = emmtVar;
                final Executor executor = errlVar;
                return new erph(erqt.n(new erog() { // from class: emmc
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        InputStream inputStream2 = inputStream;
                        if (inputStream2 == null) {
                            return erqt.i(emmr.c().a());
                        }
                        emhx emhxVar = emhvVar.c;
                        if (emhxVar == null) {
                            emhxVar = emhx.a;
                        }
                        final Executor executor2 = executor;
                        final emmt emmtVar3 = emmtVar2;
                        final engw engwVar2 = engwVar;
                        final String str2 = emhxVar.d;
                        final emio emioVar = (emio) eyfy.parseFrom(emio.a, inputStream2, eyfc.a());
                        final emmq c = emmr.c();
                        final enhk enhkVar = (enhk) Collection.EL.stream(((emkw) emioVar.b.get(0)).b).distinct().filter(new Predicate() { // from class: emma
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
                            public final boolean test(Object obj3) {
                                return !engw.this.contains(((ewnk) obj3).c);
                            }
                        }).collect(endq.a(new Function() { // from class: emmm
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((ewnk) obj3).c;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: emmn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                final ewnk ewnkVar = (ewnk) obj3;
                                emhu emhuVar = (emhu) emhv.a.createBuilder();
                                emhw emhwVar = (emhw) emhx.a.createBuilder();
                                emhwVar.copyOnWrite();
                                emhx emhxVar2 = (emhx) emhwVar.instance;
                                String str3 = str2;
                                str3.getClass();
                                emhxVar2.b |= 2;
                                emhxVar2.d = str3;
                                String str4 = ewnkVar.c;
                                emhwVar.copyOnWrite();
                                emhx emhxVar3 = (emhx) emhwVar.instance;
                                str4.getClass();
                                emhxVar3.b |= 1;
                                emhxVar3.c = str4;
                                emhuVar.copyOnWrite();
                                emhv emhvVar2 = (emhv) emhuVar.instance;
                                emhx emhxVar4 = (emhx) emhwVar.build();
                                emhxVar4.getClass();
                                emhvVar2.c = emhxVar4;
                                emhvVar2.b |= 1;
                                return erny.f(erqc.o(emmt.this.d((emhv) emhuVar.build())), new emwl() { // from class: emmd
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj4) {
                                        String str5;
                                        String str6;
                                        ewmt ewmtVar;
                                        ewnk ewnkVar2 = ewnk.this;
                                        Optional optional = (Optional) obj4;
                                        try {
                                            if (optional.isPresent()) {
                                                String replace = ((String) optional.get()).replace("android://", "file:///data/user/0/");
                                                ewnj ewnjVar = (ewnj) ewnk.a.createBuilder();
                                                String str7 = ewnkVar2.c;
                                                ewnjVar.copyOnWrite();
                                                ewnk ewnkVar3 = (ewnk) ewnjVar.instance;
                                                str7.getClass();
                                                ewnkVar3.c = str7;
                                                String str8 = ewnkVar2.h;
                                                ewnjVar.copyOnWrite();
                                                ewnk ewnkVar4 = (ewnk) ewnjVar.instance;
                                                str8.getClass();
                                                ewnkVar4.h = str8;
                                                ewmv ewmvVar = (ewmv) ewmw.a.createBuilder();
                                                ewmw ewmwVar = ewnkVar2.e;
                                                if (ewmwVar == null) {
                                                    ewmwVar = ewmw.a;
                                                }
                                                String str9 = ewmwVar.c;
                                                ewmvVar.copyOnWrite();
                                                ewmw ewmwVar2 = (ewmw) ewmvVar.instance;
                                                str9.getClass();
                                                ewmwVar2.c = str9;
                                                ewmw ewmwVar3 = ewnkVar2.e;
                                                if (ewmwVar3 == null) {
                                                    ewmwVar3 = ewmw.a;
                                                }
                                                int c2 = emmp.c(ewmwVar3.c);
                                                ewmvVar.copyOnWrite();
                                                ((ewmw) ewmvVar.instance).e = ewmu.a(c2);
                                                ewmw ewmwVar4 = ewnkVar2.e;
                                                if (ewmwVar4 == null) {
                                                    ewmwVar4 = ewmw.a;
                                                }
                                                ewmt ewmtVar2 = ewmwVar4.f;
                                                if (ewmtVar2 == null) {
                                                    ewmtVar2 = ewmt.a;
                                                }
                                                ewmvVar.copyOnWrite();
                                                ewmw ewmwVar5 = (ewmw) ewmvVar.instance;
                                                ewmtVar2.getClass();
                                                ewmwVar5.f = ewmtVar2;
                                                ewmwVar5.b |= 1;
                                                ewnjVar.copyOnWrite();
                                                ewnk ewnkVar5 = (ewnk) ewnjVar.instance;
                                                ewmw ewmwVar6 = (ewmw) ewmvVar.build();
                                                ewmwVar6.getClass();
                                                ewnkVar5.e = ewmwVar6;
                                                ewnkVar5.b |= 1;
                                                ewmv ewmvVar2 = (ewmv) ewmw.a.createBuilder();
                                                ewmvVar2.copyOnWrite();
                                                ewmw ewmwVar7 = (ewmw) ewmvVar2.instance;
                                                replace.getClass();
                                                ewmwVar7.c = replace;
                                                if ((ewnkVar2.b & 4) != 0) {
                                                    ewmw ewmwVar8 = ewnkVar2.g;
                                                    if (ewmwVar8 == null) {
                                                        ewmwVar8 = ewmw.a;
                                                    }
                                                    str5 = ewmwVar8.c;
                                                } else {
                                                    ewmw ewmwVar9 = ewnkVar2.e;
                                                    if (ewmwVar9 == null) {
                                                        ewmwVar9 = ewmw.a;
                                                    }
                                                    str5 = ewmwVar9.c;
                                                }
                                                ewmvVar2.copyOnWrite();
                                                ewmw ewmwVar10 = (ewmw) ewmvVar2.instance;
                                                str5.getClass();
                                                ewmwVar10.d = str5;
                                                if ((ewnkVar2.b & 4) != 0) {
                                                    ewmw ewmwVar11 = ewnkVar2.g;
                                                    if (ewmwVar11 == null) {
                                                        ewmwVar11 = ewmw.a;
                                                    }
                                                    str6 = ewmwVar11.c;
                                                } else {
                                                    ewmw ewmwVar12 = ewnkVar2.e;
                                                    if (ewmwVar12 == null) {
                                                        ewmwVar12 = ewmw.a;
                                                    }
                                                    str6 = ewmwVar12.c;
                                                }
                                                int c3 = emmp.c(str6);
                                                ewmvVar2.copyOnWrite();
                                                ((ewmw) ewmvVar2.instance).e = ewmu.a(c3);
                                                if ((ewnkVar2.b & 4) != 0) {
                                                    ewmw ewmwVar13 = ewnkVar2.g;
                                                    if (ewmwVar13 == null) {
                                                        ewmwVar13 = ewmw.a;
                                                    }
                                                    ewmtVar = ewmwVar13.f;
                                                    if (ewmtVar == null) {
                                                        ewmtVar = ewmt.a;
                                                    }
                                                } else {
                                                    ewmw ewmwVar14 = ewnkVar2.e;
                                                    if (ewmwVar14 == null) {
                                                        ewmwVar14 = ewmw.a;
                                                    }
                                                    ewmtVar = ewmwVar14.f;
                                                    if (ewmtVar == null) {
                                                        ewmtVar = ewmt.a;
                                                    }
                                                }
                                                ewmvVar2.copyOnWrite();
                                                ewmw ewmwVar15 = (ewmw) ewmvVar2.instance;
                                                ewmtVar.getClass();
                                                ewmwVar15.f = ewmtVar;
                                                ewmwVar15.b |= 1;
                                                ewnjVar.copyOnWrite();
                                                ewnk ewnkVar6 = (ewnk) ewnjVar.instance;
                                                ewmw ewmwVar16 = (ewmw) ewmvVar2.build();
                                                ewmwVar16.getClass();
                                                ewnkVar6.g = ewmwVar16;
                                                ewnkVar6.b |= 4;
                                                return (ewnk) ewnjVar.build();
                                            }
                                        } catch (Exception e) {
                                            ((enrr) ((enrr) ((enrr) emmp.a.j()).g(e)).h("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider", "getStickerForUri", (char) 606, "StickerProvider.java")).q("returning default Sticker instance");
                                        }
                                        return ewnk.a;
                                    }
                                }, executor2);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }));
                        return erny.f(erqc.o(erqt.c(enhkVar.values()).a(new Callable() { // from class: emmo
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                enhd enhdVar = new enhd();
                                enqu listIterator = enhk.this.entrySet().listIterator();
                                while (listIterator.hasNext()) {
                                    Map.Entry entry = (Map.Entry) listIterator.next();
                                    enhdVar.k((String) entry.getKey(), (ewnk) erqt.q((Future) entry.getValue()));
                                }
                                return enhdVar.c();
                            }
                        }, executor2)), new emwl() { // from class: emmh
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                emmq emmqVar = emmq.this;
                                emmqVar.c((enhk) obj3);
                                Stream distinct = Collection.EL.stream(((emkw) emioVar.b.get(0)).c).distinct();
                                final engw engwVar3 = engwVar2;
                                Stream filter = distinct.filter(new Predicate() { // from class: emmi
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
                                    public final boolean test(Object obj4) {
                                        return !engw.this.contains(((emiq) obj4).c);
                                    }
                                });
                                Function function = new Function() { // from class: emmj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function2) {
                                        return Function$CC.$default$andThen(this, function2);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return ((emiq) obj4).b.toLowerCase();
                                    }

                                    public final /* synthetic */ Function compose(Function function2) {
                                        return Function$CC.$default$compose(this, function2);
                                    }
                                };
                                Supplier supplier = new Supplier() { // from class: emmk
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return new HashMap();
                                    }
                                };
                                Function function2 = new Function() { // from class: emml
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function3) {
                                        return Function$CC.$default$andThen(this, function3);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj4) {
                                        return ((emiq) obj4).c;
                                    }

                                    public final /* synthetic */ Function compose(Function function3) {
                                        return Function$CC.$default$compose(this, function3);
                                    }
                                };
                                int i2 = engw.d;
                                emmqVar.b(enhk.j((Map) filter.collect(Collectors.groupingBy(function, supplier, Collectors.mapping(function2, endq.a)))));
                                return emmqVar.a();
                            }
                        }, executor2);
                    }
                }, executor));
            }
        }, errlVar).a(Exception.class, new erow() { // from class: emmf
            @Override // defpackage.erow
            public final Object a(erpc erpcVar, Object obj2) {
                ((enrr) ((enrr) ((enrr) emmp.a.i()).g((Exception) obj2)).h("com/google/chat/smartmessaging/smartreply/android/emotivecontentproviders/StickerProvider", "readFromConfigFileAsync", 206, "StickerProvider.java")).q("StickerSuggestions creation failed, disabling");
                return emmr.c().a();
            }
        }, errlVar).g()), new emwl() { // from class: emmb
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                emmr emmrVar = (emmr) obj2;
                return new emmp(emmrVar.a(), emmrVar.b(), str, a, random);
            }
        }, errlVar);
        this.a = 1;
        Object c = fgfz.c(f, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctoq ctoqVar = new ctoq(ffguVar, this.b, this.c);
        ctoqVar.d = obj;
        return ctoqVar;
    }
}
