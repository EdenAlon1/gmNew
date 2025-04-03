package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adds implements addp {
    public final addw a;
    private final errm b;
    private final cbsf c;

    public adds(errm errmVar, cbsf cbsfVar, addw addwVar) {
        this.b = errmVar;
        this.c = cbsfVar;
        this.a = addwVar;
    }

    @Override // defpackage.addp
    public final elfl a(adcy adcyVar) {
        int a;
        int a2;
        if (adcyVar.b.length() > 100) {
            throw new IllegalArgumentException("Search text length is higher than 100.");
        }
        if (adcyVar.g < 0) {
            throw new IllegalArgumentException("Max count cannot be negative.");
        }
        long j = adcyVar.h;
        if (j != 0) {
            long j2 = adcyVar.i;
            if (j2 != 0 && j > j2) {
                throw new IllegalArgumentException("The start timestamp cannot be bigger than end timestamp.");
            }
        }
        adcu adcuVar = (adcu) adcyVar.toBuilder();
        int i = adcyVar.d;
        int a3 = adcv.a(i);
        int i2 = 5;
        if (a3 != 0 && a3 == 2) {
            a = 5;
        } else {
            a = adcv.a(i);
            if (a == 0) {
                a = 1;
            }
        }
        adcuVar.copyOnWrite();
        adcy adcyVar2 = (adcy) adcuVar.instance;
        if (a == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        adcyVar2.d = a - 2;
        int i3 = adcyVar.e;
        int a4 = adcx.a(i3);
        if ((a4 == 0 || a4 != 2) && (i2 = adcx.a(i3)) == 0) {
            i2 = 1;
        }
        adcuVar.copyOnWrite();
        adcy adcyVar3 = (adcy) adcuVar.instance;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        adcyVar3.e = i2 - 2;
        int i4 = adcyVar.g;
        int intValue = i4 == 0 ? ((Integer) addx.a.e()).intValue() : Math.min(i4, ((Integer) addx.a.e()).intValue());
        adcuVar.copyOnWrite();
        ((adcy) adcuVar.instance).g = intValue;
        int i5 = adcyVar.f;
        int a5 = adcw.a(i5);
        if (a5 != 0 && a5 == 2) {
            a2 = 4;
        } else {
            a2 = adcw.a(i5);
            if (a2 == 0) {
                a2 = 1;
            }
        }
        adcuVar.copyOnWrite();
        adcy adcyVar4 = (adcy) adcuVar.instance;
        if (a2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        adcyVar4.f = a2 - 2;
        final adcy adcyVar5 = (adcy) adcuVar.build();
        return this.c.a(SearchQuery.d(engw.r(new SearchQuery.FreeTextSearchFilter(adcyVar5.b)))).i(new eroh() { // from class: addq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Collection c = ((cbne) obj).c();
                boolean isEmpty = c.isEmpty();
                final adcy adcyVar6 = adcyVar5;
                if (!isEmpty || adcyVar6.b.isEmpty()) {
                    return elfo.g(new Callable() { // from class: addt
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ekzz f = eleg.f("SearchMessageDatabaseOperationsImpl#getSmsUris");
                            Collection collection = c;
                            final adcy adcyVar7 = adcy.this;
                            try {
                                String[] strArr = MessagesTable.a;
                                buxz buxzVar = new buxz();
                                buxzVar.an(axuh.b);
                                buxzVar.B(false);
                                buxzVar.ad();
                                int a6 = adcv.a(adcyVar7.d);
                                if (a6 == 0) {
                                    a6 = 1;
                                }
                                int i6 = a6 - 2;
                                if (i6 == 1) {
                                    buxzVar.ah(1);
                                    buxzVar.am(25);
                                } else if (i6 == 2) {
                                    buxzVar.ah(100);
                                    buxzVar.am(117);
                                }
                                int a7 = adcx.a(adcyVar7.e);
                                if (a7 == 0) {
                                    a7 = 1;
                                }
                                int i7 = a7 - 2;
                                if (i7 == 1) {
                                    buxzVar.P(true);
                                } else if (i7 == 2) {
                                    buxzVar.P(false);
                                }
                                long j3 = adcyVar7.h;
                                if (j3 != 0) {
                                    buxzVar.R(j3);
                                }
                                long j4 = adcyVar7.i;
                                if (j4 != 0) {
                                    buxzVar.T(j4);
                                }
                                if (!collection.isEmpty()) {
                                    Stream stream = Collection.EL.stream(collection);
                                    int i8 = engw.d;
                                    buxzVar.u((engw) stream.collect(endq.a));
                                }
                                if (!adcyVar7.c.isEmpty()) {
                                    String[] strArr2 = bons.a;
                                    bonp bonpVar = new bonp(bons.a);
                                    bonpVar.z("getSmsUrisInternally");
                                    bonpVar.d(new Function() { // from class: addu
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            bonr bonrVar = (bonr) obj2;
                                            bonrVar.aq(new dtrw("participants.normalized_destination", 3, bonr.at(adcy.this.c), false));
                                            return bonrVar;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    bonpVar.c(new Function() { // from class: addv
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return ((bonl) obj2).a;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    buxzVar.o(bonpVar.b());
                                }
                                buxo d = MessagesTable.d();
                                d.z("+getSmsUrisInternally");
                                d.c(MessagesTable.c.o);
                                d.g(buxzVar);
                                d.d(addw.a(adcyVar7, MessagesTable.c.i), addw.a(adcyVar7, MessagesTable.c.a));
                                d.x(adcyVar7.g);
                                engw h = d.b().h();
                                f.close();
                                return h;
                            } catch (Throwable th) {
                                try {
                                    f.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    }, adds.this.a.a);
                }
                int i6 = engw.d;
                return elfo.e(enou.a);
            }
        }, this.b).h(new emwl() { // from class: addr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw engwVar = (engw) obj;
                adcz adczVar = (adcz) adda.a.createBuilder();
                int size = engwVar.size();
                for (int i6 = 0; i6 < size; i6++) {
                    Uri uri = (Uri) engwVar.get(i6);
                    addb addbVar = (addb) addc.a.createBuilder();
                    String uri2 = uri.toString();
                    addbVar.copyOnWrite();
                    addc addcVar = (addc) addbVar.instance;
                    uri2.getClass();
                    addcVar.b = uri2;
                    addc addcVar2 = (addc) addbVar.build();
                    adczVar.copyOnWrite();
                    adda addaVar = (adda) adczVar.instance;
                    addcVar2.getClass();
                    eygr eygrVar = addaVar.b;
                    if (!eygrVar.c()) {
                        addaVar.b = eyfy.mutableCopy(eygrVar);
                    }
                    addaVar.b.add(addcVar2);
                }
                return (adda) adczVar.build();
            }
        }, this.b);
    }
}
