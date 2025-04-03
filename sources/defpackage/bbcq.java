package defpackage;

import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.action.common.ActionParameters;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbcq implements bbcg {
    private final PersistableBundle a;
    private final Bundle b;

    public bbcq() {
        this.a = new PersistableBundle();
        this.b = new Bundle();
    }

    @Override // defpackage.bbcg
    public final byte[] A(String str) {
        return this.b.getByteArray(str);
    }

    @Override // defpackage.bbcg
    public final String[] B(String str) {
        return this.a.getStringArray(str);
    }

    @Override // defpackage.bbcg
    public final Duration C() {
        return Duration.ofNanos(d("retry_delay"));
    }

    @Override // defpackage.bbcg
    public final Parcelable[] D() {
        return this.b.getParcelableArray("messages");
    }

    @Override // defpackage.bbcg
    public final ArrayList E(ArrayList arrayList) {
        ArrayList m = m("rcs.intent.extra.conversationClassifications");
        return m == null ? arrayList : m;
    }

    @Override // defpackage.bbcg
    public final ArrayList F() {
        return this.b.getStringArrayList("message_ids");
    }

    @Override // defpackage.bbcg
    public final void G(Duration duration) {
        k("retry_delay");
        s("retry_delay", duration.toNanos());
    }

    @Override // defpackage.bbcg
    public final void H(Parcelable[] parcelableArr) {
        k("messages");
        this.b.putParcelableArray("messages", parcelableArr);
    }

    @Override // defpackage.bbcg
    public final void I(ArrayList arrayList) {
        k("message_ids");
        this.b.putStringArrayList("message_ids", arrayList);
    }

    @Override // defpackage.bbcg
    public final int a(String str) {
        return this.a.getInt(str);
    }

    @Override // defpackage.bbcg
    public final int b(String str, int i) {
        return this.a.getInt(str, i);
    }

    public final enip c() {
        enin eninVar = new enin();
        eninVar.j(this.b.keySet());
        eninVar.j(this.a.keySet());
        return eninVar.g();
    }

    @Override // defpackage.bbcg
    public final long d(String str) {
        return this.a.getLong(str);
    }

    @Override // defpackage.bbcg
    public final long e(String str, long j) {
        return this.a.getLong(str, j);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbcq)) {
            return false;
        }
        final bbcq bbcqVar = (bbcq) obj;
        enip c = c();
        if (c.equals(bbcqVar.c())) {
            return Collection.EL.stream(c).allMatch(new Predicate() { // from class: bbcl
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
                    String str = (String) obj2;
                    return Objects.equals(bbcq.this.g(str), bbcqVar.g(str));
                }
            });
        }
        return false;
    }

    @Override // defpackage.bbcg
    public final BaseBundle f() {
        return this.a;
    }

    public final Object g(String str) {
        return Optional.ofNullable(this.a.get(str)).orElse(this.b.get(str));
    }

    @Override // defpackage.bbcg
    public final Parcelable h(String str) {
        return this.b.getParcelable(str);
    }

    public final int hashCode() {
        return c().hashCode();
    }

    @Override // defpackage.bbcg
    public final ActionParameters i() {
        Bundle bundle = new Bundle(this.b);
        bundle.putAll(this.a);
        return new ActionParameters(bundle);
    }

    @Override // defpackage.bbcg
    public final Optional j() {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putPersistableBundle("PERSISTABLE_ACTION_PARAMETERS_PERSISTABLE_BUNDLE", this.a);
        if (this.b.size() > 0) {
            persistableBundle.putString("PERSISTABLE_ACTION_PARAMETERS_SERIALIZED_LEGACY_ACTION_PARAMETERS", bbej.b(new ActionParameters(this.b)));
        }
        return Optional.of(persistableBundle);
    }

    public final void k(String str) {
        this.a.remove(str);
        this.b.remove(str);
    }

    @Override // defpackage.bbcg
    public final String l(String str) {
        return this.a.getString(str);
    }

    @Override // defpackage.bbcg
    public final ArrayList m(String str) {
        return this.b.getParcelableArrayList(str);
    }

    @Override // defpackage.bbcg
    public final ArrayList n(String str, Class cls) {
        ArrayList parcelableArrayList;
        if (!ctid.h) {
            return this.b.getParcelableArrayList(str);
        }
        parcelableArrayList = this.b.getParcelableArrayList(str, cls);
        return parcelableArrayList;
    }

    @Override // defpackage.bbcg
    public final void p(String str, boolean z) {
        k(str);
        this.a.putBoolean(str, z);
    }

    @Override // defpackage.bbcg
    public final void q(String str, byte[] bArr) {
        k(str);
        this.b.putByteArray(str, bArr);
    }

    @Override // defpackage.bbcg
    public final void r(String str, int i) {
        k(str);
        this.a.putInt(str, i);
    }

    @Override // defpackage.bbcg
    public final void s(String str, long j) {
        k(str);
        this.a.putLong(str, j);
    }

    @Override // defpackage.bbcg
    public final void t(String str, Parcelable parcelable) {
        k(str);
        this.b.putParcelable(str, parcelable);
    }

    @Override // defpackage.bbcg
    public final void u(String str, ArrayList arrayList) {
        k(str);
        this.b.putParcelableArrayList(str, arrayList);
    }

    @Override // defpackage.bbcg
    public final void v(String str, String str2) {
        k(str);
        this.a.putString(str, str2);
    }

    @Override // defpackage.bbcg
    public final void w(String str, String[] strArr) {
        k(str);
        this.a.putStringArray(str, strArr);
    }

    @Override // defpackage.bbcg
    public final boolean x(String str) {
        return this.b.containsKey(str) || this.a.containsKey(str);
    }

    @Override // defpackage.bbcg
    public final boolean y(String str) {
        return this.a.getBoolean(str);
    }

    @Override // defpackage.bbcg
    public final boolean z(String str, boolean z) {
        return this.a.getBoolean(str, z);
    }

    public bbcq(PersistableBundle persistableBundle) {
        this.a = (PersistableBundle) Optional.ofNullable(persistableBundle.getPersistableBundle("PERSISTABLE_ACTION_PARAMETERS_PERSISTABLE_BUNDLE")).map(new Function() { // from class: bbcm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new PersistableBundle((PersistableBundle) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new PersistableBundle());
        this.b = (Bundle) Optional.ofNullable(persistableBundle.getString("PERSISTABLE_ACTION_PARAMETERS_SERIALIZED_LEGACY_ACTION_PARAMETERS")).map(new Function() { // from class: bbcn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ActionParameters) bbej.a((String) obj, ActionParameters.class, ActionParameters.class.getName());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: bbco
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((ActionParameters) obj).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: bbcp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new Bundle((Bundle) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new Bundle());
    }
}
