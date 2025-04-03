package defpackage;

import android.database.Cursor;
import android.telephony.SmsMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.IntPredicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.IntStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfh implements ejuh {
    final /* synthetic */ int a;
    final /* synthetic */ cxfi b;

    public cxfh(cxfi cxfiVar, int i) {
        this.a = i;
        this.b = cxfiVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#SimMessagesDataService#LoadData");
        try {
            final int i = this.a;
            erph f2 = new erph(elfo.g(new Callable() { // from class: cxey
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final cxfh cxfhVar = cxfh.this;
                    return cxfhVar.b.f.h(i).h().map(new Function() { // from class: cxez
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            final List list = (List) obj;
                            IntStream filter = IntStream.CC.range(0, list.size()).filter(new IntPredicate() { // from class: cxfb
                                public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                                    return IntPredicate$CC.$default$and(this, intPredicate);
                                }

                                public final /* synthetic */ IntPredicate negate() {
                                    return IntPredicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                                    return IntPredicate$CC.$default$or(this, intPredicate);
                                }

                                @Override // java.util.function.IntPredicate
                                public final boolean test(int i2) {
                                    return list.get(i2) != null;
                                }
                            });
                            final cxfh cxfhVar2 = cxfh.this;
                            return (List) filter.mapToObj(new IntFunction() { // from class: cxfc
                                @Override // java.util.function.IntFunction
                                public final Object apply(int i2) {
                                    SmsMessage smsMessage = (SmsMessage) list.get(i2);
                                    cwug cwugVar = new cwug();
                                    cxfh cxfhVar3 = cxfh.this;
                                    cwugVar.b = ((aolr) cxfhVar3.b.h.b()).u(smsMessage.getDisplayOriginatingAddress(), cxfhVar3.a);
                                    cwugVar.a = smsMessage.getDisplayMessageBody();
                                    cwugVar.c = cxfhVar3.b.a(smsMessage.getTimestampMillis());
                                    cwugVar.c(smsMessage.getIndexOnIcc());
                                    cwugVar.b(i2);
                                    return cwugVar.a();
                                }
                            }).collect(Collectors.toCollection(new Supplier() { // from class: cxfd
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new ArrayList();
                                }
                            }));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.b.g)).f(eldl.e(new erot() { // from class: cxfg
                @Override // defpackage.erot
                public final erph a(erpc erpcVar, Object obj) {
                    erph f3;
                    final Optional optional = (Optional) obj;
                    boolean isPresent = optional.isPresent();
                    final cxfh cxfhVar = cxfh.this;
                    if (isPresent) {
                        optional.getClass();
                        return new erph(elfo.g(new Callable() { // from class: cxfa
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return (List) Optional.this.get();
                            }
                        }, cxfhVar.b.g));
                    }
                    if (cxfhVar.b.f.t()) {
                        erph b = cxfhVar.b.d.b(cxfi.a, new String[0], null, null, null);
                        final int i2 = cxfhVar.a;
                        f3 = b.f(eldl.e(new erot() { // from class: cxff
                            @Override // defpackage.erot
                            public final erph a(erpc erpcVar2, Object obj2) {
                                final Cursor cursor = (Cursor) obj2;
                                final cxfh cxfhVar2 = cxfh.this;
                                final int i3 = i2;
                                return new erph(elfo.g(new Callable() { // from class: cxfe
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        Cursor cursor2;
                                        ArrayList arrayList = new ArrayList();
                                        int length = cxfi.b.length;
                                        int[] iArr = new int[4];
                                        int i4 = 0;
                                        while (true) {
                                            cursor2 = cursor;
                                            if (i4 >= 4) {
                                                break;
                                            }
                                            iArr[i4] = cursor2.getColumnIndex(cxfi.b[i4]);
                                            i4++;
                                        }
                                        int i5 = 0;
                                        while (cursor2.moveToNext()) {
                                            int i6 = i3;
                                            cxfh cxfhVar3 = cxfh.this;
                                            cwug cwugVar = new cwug();
                                            cwugVar.b = ((aolr) cxfhVar3.b.h.b()).u(cursor2.getString(iArr[0]), i6);
                                            cwugVar.a = cursor2.getString(iArr[1]);
                                            cwugVar.c = cxfhVar3.b.a(cursor2.getLong(iArr[2]));
                                            cwugVar.c(cursor2.getInt(iArr[3]));
                                            cwugVar.b(i5);
                                            arrayList.add(cwugVar.a());
                                            i5++;
                                        }
                                        return arrayList;
                                    }
                                }, cxfhVar2.b.g));
                            }
                        }), cxfhVar.b.g);
                    } else {
                        f3 = new erph(elfo.e(new ArrayList()));
                    }
                    return new erph(elfl.g(f3.g()));
                }
            }), this.b.g).f(eldl.e(new erot() { // from class: cxex
                @Override // defpackage.erot
                public final erph a(erpc erpcVar, Object obj) {
                    final List list = (List) obj;
                    final cxfh cxfhVar = cxfh.this;
                    return new erph(elfo.g(new Callable() { // from class: cxew
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ejug.a(list, cxfh.this.b.e.f());
                        }
                    }, cxfhVar.b.g));
                }
            }), this.b.g);
            f.a(f2);
            f.close();
            return f2;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ekzz f = eleg.f("MessageDataSource#SimMessagesDataService#FetchAndStoreData");
        try {
            elfl e = elfo.e(null);
            f.close();
            return e;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return this.b.i;
    }
}
