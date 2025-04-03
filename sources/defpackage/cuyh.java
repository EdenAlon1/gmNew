package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuyh implements cuye {
    public static final /* synthetic */ int f = 0;
    private static final cskc g = cskc.g("Bugle", "VerifiedSmsEnabledCheckerImpl");
    private final ctyx h;
    private final Context i;
    private final Optional j;
    private final cvbr k;

    public cuyh(ctyx ctyxVar, Context context, Optional optional, cvbr cvbrVar) {
        this.h = ctyxVar;
        this.i = context;
        this.j = optional;
        this.k = cvbrVar;
    }

    @Override // defpackage.cuye
    public final elfl a() {
        return this.k.d().h(new emwl() { // from class: cuyg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cvas cvasVar = (cvas) obj;
                int i = cuyh.f;
                return Boolean.valueOf(Stream.CC.concat(Collection.EL.stream(DesugarCollections.unmodifiableMap(cvasVar.c).values()), Collection.EL.stream(DesugarCollections.unmodifiableMap(cvasVar.e).values())).anyMatch(new Predicate() { // from class: cuyf
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
                        int i2 = cuyh.f;
                        return ((cvan) obj2).b.size() > 0;
                    }
                }));
            }
        }, erpp.a);
    }

    @Override // defpackage.cuye
    public final boolean b() {
        return c() && d();
    }

    @Override // defpackage.cuye
    public final boolean c() {
        return ((Boolean) cful.ab.e()).booleanValue() && this.h.q(this.i.getResources().getString(R.string.vsms_enabled_pref_key), this.i.getResources().getBoolean(R.bool.vsms_enabled_pref_default));
    }

    @Override // defpackage.cuye
    public final boolean d() {
        if (this.j.isPresent()) {
            g.p("VSMS is not supported on wearable devices.");
            return false;
        }
        if (ctid.h(this.i)) {
            g.p("VSMS is not supported for secondary users.");
            return false;
        }
        if (((Boolean) cful.ab.e()).booleanValue()) {
            return true;
        }
        g.p("VSMS is disabled via Phenotype flag.");
        return false;
    }
}
