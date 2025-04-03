package defpackage;

import android.content.Context;
import android.content.UriMatcher;
import android.database.ContentObserver;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.concurrent.atomic.DesugarAtomicLong;
import j$.util.function.LongUnaryOperator$CC;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzan extends ContentObserver {
    public static final cfva a = cfvl.k(cfvl.b, "ditto_desktop_check_cache_expiry_ms", 5000);
    private static final UriMatcher f = new UriMatcher(-1);
    protected fcek b;
    protected String c;
    public final fazb d;
    public final cgzv e;
    private final Context g;
    private final elbx h;
    private final bbfk i;
    private final bbfn j;
    private final bbem k;
    private final bzbz l;
    private final ffbr m;
    private final errl n;
    private final AtomicLong o;

    public bzan(Context context, elbx elbxVar, fazb fazbVar, bbfk bbfkVar, bbfn bbfnVar, bbem bbemVar, bzbz bzbzVar, cgzv cgzvVar, ffbr ffbrVar, errl errlVar) {
        super(efbd.a());
        this.o = new AtomicLong(0L);
        this.g = context;
        this.h = elbxVar;
        this.d = fazbVar;
        this.i = bbfkVar;
        this.j = bbfnVar;
        this.k = bbemVar;
        this.l = bzbzVar;
        this.e = cgzvVar;
        this.m = ffbrVar;
        this.n = errlVar;
        UriMatcher uriMatcher = f;
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.h(context).getPath()).concat("/*/*"), 10);
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.j(context).getPath()).concat("/*"), 20);
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.k(context).getPath()).concat("/*"), 40);
    }

    final synchronized void a(fcek fcekVar, String str) {
        this.b = fcekVar;
        this.c = str;
    }

    @Override // android.database.ContentObserver
    public final synchronized void onChange(boolean z, Uri uri) {
        elfl e;
        ekzm b = this.h.b("DittoContentObserver.onChange");
        try {
            ekzz f2 = eleg.f("DittoContentObserver.handleChange");
            try {
                int match = f.match(uri);
                if (match == 10) {
                    final long epochMilli = ((cqoh) this.m.b()).f().toEpochMilli();
                    final long intValue = epochMilli - ((Integer) a.e()).intValue();
                    if (DesugarAtomicLong.updateAndGet(this.o, new LongUnaryOperator() { // from class: bzak
                        public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                            return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
                        }

                        @Override // java.util.function.LongUnaryOperator
                        public final long applyAsLong(long j) {
                            cfva cfvaVar = bzan.a;
                            return j <= intValue ? epochMilli : j;
                        }

                        public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                            return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
                        }
                    }) == epochMilli) {
                        this.k.a(this.b, this.c).A();
                    }
                    fcek fcekVar = this.b;
                    String str = this.c;
                    if (uri != null && fcekVar != null && str != null) {
                        List<String> pathSegments = uri.getPathSegments();
                        Set<String> queryParameterNames = uri.getQueryParameterNames();
                        if (pathSegments.size() == bcqc.h(this.g).getPathSegments().size() + 2 && (TextUtils.isEmpty(uri.getQuery()) || !enpw.c(queryParameterNames, this.l.a()).isEmpty())) {
                            ((banr) this.j).d(fcekVar, str, uri).A();
                        }
                    }
                } else if (match == 20) {
                    this.i.a(this.b, this.c, uri);
                } else if (match == 40) {
                    if (uri.getPathSegments().size() == bcqc.k(this.g).getPathSegments().size() + 1) {
                        final String lastPathSegment = uri.getLastPathSegment();
                        e = elfo.f(new Runnable() { // from class: bzaj
                            @Override // java.lang.Runnable
                            public final void run() {
                                String str2 = lastPathSegment;
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                ((bzef) bzan.this.d.b()).n(bzar.a(str2), bzee.SESSION_TERMINATED);
                            }
                        }, this.n);
                    } else {
                        e = elfo.e(null);
                    }
                    axnw.h(e);
                }
                f2.close();
                b.close();
            } finally {
            }
        } finally {
        }
    }
}
