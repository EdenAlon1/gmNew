package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeff implements eeew {
    private static final engw a;
    private final List b;
    private final eeet c;
    private final eeeu d;

    static {
        int i = engw.d;
        a = enou.a;
    }

    public eeff(List list, eeet eeetVar, eeeu eeeuVar) {
        list.getClass();
        this.b = (List) Collection.EL.stream(list).map(new Function() { // from class: eefe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InetAddress) obj).getHostAddress();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        eeetVar.getClass();
        this.c = eeetVar;
        eeeuVar.getClass();
        this.d = eeeuVar;
    }

    static final String[] e() {
        ResolverConfig b = ResolverConfig.b();
        return b == null ? new String[0] : b.servers;
    }

    private final ListenableFuture f(String str, Class cls) {
        ListenableFuture h;
        List list = this.b;
        int a2 = eeey.a(cls);
        if (list.isEmpty()) {
            return erqt.i(a);
        }
        if (TextUtils.isEmpty(str)) {
            dkty.q("Unable to lookup records for null target!", new Object[0]);
            return erqt.i(a);
        }
        try {
            eefi eefiVar = new eefi(new fixz(str, a2));
            eeer b = eeey.b(str, cls, e());
            this.c.a(b);
            List list2 = null;
            try {
                try {
                    list2 = eefiVar.b(cls);
                    h = erqt.i(list2);
                } catch (ClassCastException e) {
                    dkty.i(e, "classcastexception - this should never happen", new Object[0]);
                    h = erqt.h(e);
                }
                return h;
            } finally {
                this.d.a(eeey.d(eefiVar, b, list2));
            }
        } catch (fjad e2) {
            dkty.s(e2, "Invalid %s lookup target: %s", fjaf.a(a2), str);
            return erqt.i(a);
        }
    }

    @Override // defpackage.eeew
    public final synchronized ListenableFuture a(String str) {
        int i;
        ListenableFuture h;
        if (this.b.isEmpty()) {
            return erqt.i(a);
        }
        eeer b = eeey.b(str, fiwh.class, e());
        this.c.a(b);
        try {
            h = erqt.i(Arrays.asList(fiwi.f(str)));
            i = 0;
        } catch (UnknownHostException e) {
            i = 3;
            try {
                h = erqt.h(e);
            } catch (Throwable th) {
                th = th;
                this.d.a(eeey.d(new eefi(i), b, null));
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = 1;
            this.d.a(eeey.d(new eefi(i), b, null));
            throw th;
        }
        this.d.a(eeey.d(new eefi(i), b, null));
        return h;
    }

    @Override // defpackage.eeew
    public final synchronized ListenableFuture b(String str) {
        return f(str, fiyj.class);
    }

    @Override // defpackage.eeew
    public final synchronized ListenableFuture c(String str) {
        return f(str, fizp.class);
    }

    public final void d() {
        try {
            List list = this.b;
            Field declaredField = ResolverConfig.b().getClass().getDeclaredField("servers");
            declaredField.setAccessible(true);
            if (!list.isEmpty()) {
                declaredField.set(ResolverConfig.b(), list.toArray(new String[0]));
            }
            fixz.c();
            fixz.f().e();
            dkty.k("Using name servers: %s", Arrays.toString(ResolverConfig.b().servers));
        } catch (IllegalAccessException | LinkageError | NoSuchFieldException e) {
            dkty.e(e, "Exception setting name servers", new Object[0]);
        }
    }
}
