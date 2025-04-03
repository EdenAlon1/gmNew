package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdep implements cdbo {
    private final errl a;

    public cdep(errl errlVar) {
        this.a = errlVar;
    }

    @Override // defpackage.cdbo
    public final elfl a(final int i, final axeo axeoVar, final int i2) {
        if (i > 0) {
            return elfo.g(new Callable() { // from class: cdem
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bvvn e = ParticipantsTable.e();
                    e.z("ParticipantBatchBackupScheduler#schedule");
                    long j = axeo.this.c;
                    bvvw bvvwVar = new bvvw();
                    enip enipVar = csgg.w;
                    int intValue = ParticipantsTable.i().intValue();
                    if (intValue < 58210) {
                        dtub.w("cms_life_cycle", intValue);
                    }
                    final int i3 = i2;
                    int i4 = i;
                    bvvwVar.aq(new dtrw("participants.cms_life_cycle", 3, bvvw.at((Iterable) enqc.a(enipVar).map(new Function() { // from class: bvvv
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return Integer.valueOf(((csgg) obj).ordinal());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bvvu()))), true));
                    bvvwVar.n(j);
                    bvvwVar.b(new Function() { // from class: cden
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar2 = (bvvw) obj;
                            bvvwVar2.w(-1);
                            return bvvwVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: cdeo
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bvvw bvvwVar2 = (bvvw) obj;
                            bvvwVar2.w(-2);
                            return bvvwVar2;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    bvvwVar.g();
                    e.g(bvvwVar);
                    e.d(new bvvk(ParticipantsTable.c.a, false));
                    e.x(i4);
                    Stream map = Collection.EL.stream(e.b().f()).map(new Function() { // from class: cdel
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return cdbn.a(3, (String) obj, ccue.a(17), i3);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i5 = engw.d;
                    return (engw) map.collect(endq.a);
                }
            }, this.a);
        }
        int i3 = engw.d;
        return elfo.e(enou.a);
    }
}
