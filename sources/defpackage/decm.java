package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class decm implements dgtt {
    public static final cskc a = cskc.g("Bugle", "MessagesExampleStoreIterator");
    static final cfva b = cfvl.e(cfvl.b, "messages_example_store_iterator_page_size", 100);
    public final ffbr c;
    public final ArrayList d;
    public final fctc e;
    public final Calendar f;
    public final Locale g;
    public final ctiz h;
    public ConversationIdType i;
    public int j;
    public int k;
    public int l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final errl p;
    private final fazb q;
    private final cqoh r;
    private final long s;
    private final long t;
    private final Deque u;
    private final ffbr v;
    private final elbx w;
    private final errl x;
    private int y;
    private boolean z;

    public decm(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, errl errlVar, errl errlVar2, fazb fazbVar, cqoh cqohVar, ctiz ctizVar, ffbr ffbrVar5, elbx elbxVar, fctc fctcVar) {
        TimeZone timeZone = TimeZone.getDefault();
        this.i = bdgq.a;
        this.j = 0;
        this.y = 0;
        this.k = 0;
        this.l = 0;
        this.z = false;
        this.m = ffbrVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.c = ffbrVar4;
        this.p = errlVar;
        this.x = errlVar2;
        this.q = fazbVar;
        this.r = cqohVar;
        this.h = ctizVar;
        this.v = ffbrVar5;
        this.w = elbxVar;
        this.e = fctcVar;
        long epochMilli = cqohVar.f().toEpochMilli();
        this.s = epochMilli;
        long j = fctcVar.e;
        this.t = j > 0 ? epochMilli - TimeUnit.SECONDS.toMillis(j) : 0L;
        this.u = new ArrayDeque();
        this.d = new ArrayList();
        this.f = Calendar.getInstance(timeZone);
        this.g = ctid.c(context);
    }

    public static List d(excz exczVar) {
        ArrayList arrayList = new ArrayList();
        List list = exczVar.d;
        if (list != null) {
            arrayList.addAll((Collection) Collection.EL.stream(list).map(new Function() { // from class: debz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = decm.a;
                    fbqt b2 = fbqt.b(((fbuk) obj).e);
                    return b2 == null ? fbqt.UNRECOGNIZED : b2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new decd())));
        }
        String str = exczVar.a;
        String concat = ((Boolean) ((cfup) ctim.k.get()).e()).booleanValue() ? ".*".concat(String.valueOf((String) ctim.l.e())) : (String) ctim.l.e();
        if (!TextUtils.isEmpty(str) && Pattern.matches(concat, str)) {
            arrayList.add(fbqt.MAP_LINK_ANNOTATION);
        }
        return arrayList;
    }

    public static void e(Exception exc) {
        csjb b2 = a.b();
        b2.I("Not creating training example because we could not detect language due to error.");
        b2.s(exc);
    }

    private final void f() {
        ConversationIdType conversationIdType;
        final ConversationIdType conversationIdType2 = this.i;
        ekzz f = eleg.f("MessageExampleStoreIterator#getNextConversation");
        try {
            csix.h();
            bsob e = bsom.e();
            e.z("getNextConversation");
            e.g(new Function() { // from class: dece
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = decm.a;
                    return ((bskp) obj).a;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.e(new bsny(bsom.c.a, true));
            e.x(1);
            if (conversationIdType2.b()) {
                e.i(new Function() { // from class: decg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        cskc cskcVar = decm.a;
                        bsolVar.r(-1L);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            } else {
                e.i(new Function() { // from class: decf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsol bsolVar = (bsol) obj;
                        cskc cskcVar = decm.a;
                        bsolVar.r(ConversationIdType.this.a);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
            bskr bskrVar = (bskr) e.b().o();
            try {
                if (bskrVar.moveToNext()) {
                    conversationIdType = bskrVar.h();
                    bskrVar.close();
                } else {
                    bskrVar.close();
                    conversationIdType = bdgq.a;
                }
                f.close();
                this.i = conversationIdType;
                this.y = 0;
                this.d.clear();
                this.u.clear();
                this.j = 0;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dgtt
    public final void a(final dgts dgtsVar) {
        ekzm b2 = this.w.b("MessagesExampleStoreIterator::next");
        try {
            a.m("next() called");
            elfr.l(c(dgtsVar), new csvw(new Consumer() { // from class: deck
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    cskc cskcVar = decm.a;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: decl
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    decm.a.s("Error creating Brella training example.", (Throwable) obj);
                    decm.this.l++;
                    dgtsVar.a(13, null);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.p);
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dgtt
    public final void b() {
        ekzm b2 = this.w.b("MessagesExampleStoreIterator::request");
        try {
            a.m("request() called");
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x010a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl c(final defpackage.dgts r14) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.decm.c(dgts):elfl");
    }

    @Override // defpackage.dgtt, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ekzm b2 = this.w.b("MessagesExampleStoreIterator::close");
        try {
            a.m("close() called");
            debw debwVar = (debw) this.v.b();
            final int i = this.l;
            final long epochMilli = this.r.f().toEpochMilli() - this.s;
            final boolean z = !this.z;
            debwVar.b(new ffji() { // from class: debs
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    eogz eogzVar = (eogz) obj;
                    int i2 = debw.a;
                    eogzVar.getClass();
                    epam epamVar = (epam) epan.a.createBuilder();
                    epamVar.getClass();
                    epamVar.copyOnWrite();
                    epan epanVar = (epan) epamVar.instance;
                    epanVar.b |= 2;
                    epanVar.d = i;
                    epamVar.copyOnWrite();
                    epan epanVar2 = (epan) epamVar.instance;
                    epanVar2.b |= 1;
                    epanVar2.c = epochMilli;
                    epamVar.copyOnWrite();
                    epan epanVar3 = (epan) epamVar.instance;
                    epanVar3.b |= 4;
                    epanVar3.e = z;
                    eyfy build = epamVar.build();
                    build.getClass();
                    eolw eolwVar = eogzVar.a;
                    eolwVar.copyOnWrite();
                    eolx eolxVar = (eolx) eolwVar.instance;
                    eolx eolxVar2 = eolx.a;
                    eolxVar.d = (epan) build;
                    eolxVar.b |= 2;
                    return ffcu.a;
                }
            });
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
