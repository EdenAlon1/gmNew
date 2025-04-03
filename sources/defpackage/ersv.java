package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Map;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ersv {
    public final enip a;
    private final Map b = new ConcurrentHashMap();
    private final Map c = new ConcurrentHashMap();
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final Map e;
    private final Optional f;
    private final Optional g;

    public ersv(Optional optional, Optional optional2, Map map) {
        this.f = optional2;
        this.e = map;
        this.g = optional;
        optional2.isPresent();
        this.a = enpd.a;
    }

    public static final Optional f(String str) {
        String a = efbb.a("debug.".concat(String.valueOf(str)), null);
        return (TextUtils.isEmpty(a) ? Optional.empty() : Optional.of(a)).map(new Function() { // from class: ersu
            public final /* synthetic */ String a = "true";

            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(this.a.equals((String) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final synchronized ListenableFuture a() {
        if (!this.d.get()) {
            return erre.a;
        }
        enhk.j(this.b);
        this.d.set(false);
        return ((ersw) this.f.orElseThrow()).a();
    }

    public final Optional b(String str) {
        if (e()) {
            Optional optional = (Optional) Map.EL.computeIfAbsent(this.c, str, new Function() { // from class: erss
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ersv.f((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (optional.isPresent()) {
                return optional;
            }
        }
        g();
        return Optional.empty();
    }

    public final synchronized void c(String str, Optional optional) {
        g();
        emxf.a(false);
        emxf.a(this.a.contains(str));
        if (f(str).isPresent()) {
            return;
        }
        this.b.put(str, optional);
        this.d.set(true);
    }

    public final boolean d(String str) {
        g();
        emxf.a(false);
        return ((Boolean) ((ffbr) Map.EL.getOrDefault(this.e, str, new ffbr() { // from class: ersr
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                return false;
            }
        })).b()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) ((ffbr) this.g.orElse(new ffbr() { // from class: erst
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                ersv.this.g();
                return false;
            }
        })).b()).booleanValue();
    }

    public final void g() {
        this.f.isPresent();
    }
}
