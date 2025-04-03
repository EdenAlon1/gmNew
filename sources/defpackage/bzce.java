package defpackage;

import android.content.Context;
import android.content.UriMatcher;
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
public final class bzce extends ejte {
    public static final cfva a = cfvl.k(cfvl.b, "ditto_desktop_check_cache_expiry_ms", 5000);
    private static final UriMatcher f = new UriMatcher(-1);
    public fcek b;
    public String c;
    public final fazb d;
    public final ffbr e;
    private final Context g;
    private final bbfk h;
    private final bbfn i;
    private final bbem j;
    private final bzbz k;
    private final ffbr l;
    private final errl m;
    private final AtomicLong n;

    public bzce(Context context, elbx elbxVar, fazb fazbVar, bbfk bbfkVar, bbfn bbfnVar, bbem bbemVar, bzbz bzbzVar, ffbr ffbrVar, ffbr ffbrVar2, errl errlVar) {
        super(elbxVar, "NewDittoContentObserver", errlVar);
        this.n = new AtomicLong(0L);
        this.g = context;
        this.d = fazbVar;
        this.h = bbfkVar;
        this.i = bbfnVar;
        this.j = bbemVar;
        this.k = bzbzVar;
        this.e = ffbrVar;
        this.l = ffbrVar2;
        this.m = errlVar;
        UriMatcher uriMatcher = f;
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.h(context).getPath()).concat("/*/*"), 10);
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.j(context).getPath()).concat("/*"), 20);
        uriMatcher.addURI(azwg.a(context), String.valueOf(bcqc.k(context).getPath()).concat("/*"), 40);
    }

    @Override // defpackage.ejte
    public final synchronized void a(boolean z, Uri uri) {
        elfl e;
        uri.getClass();
        ekzz f2 = eleg.f("NewDittoContentObserver.handleChange");
        try {
            int match = f.match(uri);
            if (match == 10) {
                final long epochMilli = ((cqoh) this.l.b()).f().toEpochMilli();
                final long intValue = epochMilli - ((Integer) a.e()).intValue();
                if (DesugarAtomicLong.updateAndGet(this.n, new LongUnaryOperator() { // from class: bzcb
                    public final /* synthetic */ LongUnaryOperator andThen(LongUnaryOperator longUnaryOperator) {
                        return LongUnaryOperator$CC.$default$andThen(this, longUnaryOperator);
                    }

                    @Override // java.util.function.LongUnaryOperator
                    public final long applyAsLong(long j) {
                        cfva cfvaVar = bzce.a;
                        return j <= intValue ? epochMilli : j;
                    }

                    public final /* synthetic */ LongUnaryOperator compose(LongUnaryOperator longUnaryOperator) {
                        return LongUnaryOperator$CC.$default$compose(this, longUnaryOperator);
                    }
                }) == epochMilli) {
                    this.j.a(this.b, this.c).A();
                }
                fcek fcekVar = this.b;
                String str = this.c;
                if (fcekVar != null && str != null) {
                    List<String> pathSegments = uri.getPathSegments();
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    if (pathSegments.size() == bcqc.h(this.g).getPathSegments().size() + 2 && (TextUtils.isEmpty(uri.getQuery()) || !enpw.c(queryParameterNames, this.k.a()).isEmpty())) {
                        ((banr) this.i).d(fcekVar, str, uri).A();
                    }
                }
            } else if (match == 20) {
                this.h.a(this.b, this.c, uri);
            } else if (match == 40) {
                if (uri.getPathSegments().size() == bcqc.k(this.g).getPathSegments().size() + 1) {
                    final String lastPathSegment = uri.getLastPathSegment();
                    e = elfo.f(new Runnable() { // from class: bzca
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str2 = lastPathSegment;
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            ((bzef) bzce.this.d.b()).n(bzar.a(str2), bzee.SESSION_TERMINATED);
                        }
                    }, this.m);
                } else {
                    e = elfo.e(null);
                }
                axnw.h(e);
            }
            f2.close();
        } finally {
        }
    }

    final synchronized void b(fcek fcekVar, String str) {
        this.b = fcekVar;
        this.c = str;
    }
}
