package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctbs {
    public static final cskc a = cskc.g("Bugle", "CallbackTrackerUtil");
    private final errl b;

    public ctbs(errl errlVar) {
        this.b = errlVar;
    }

    public final elfl a(final Object obj, final String str, final ctbr ctbrVar) {
        csjb d = a.d();
        d.I("Waiting for value on a CallbackTracker");
        d.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, obj);
        d.A("traceString", str);
        d.r();
        final Function function = new Function() { // from class: ctbm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((actl) ctbr.this).a.c(str, (ctbf) obj2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        return elfl.g(kfg.a(new kfd() { // from class: ctbo
            @Override // defpackage.kfd
            public final Object a(final kfb kfbVar) {
                Object apply;
                final Object obj2 = new Object();
                final eoel eoelVar = new eoel();
                final Runnable l = eldl.l(new Runnable() { // from class: ctbp
                    @Override // java.lang.Runnable
                    public final void run() {
                        Object obj3 = obj2;
                        eoel eoelVar2 = eoelVar;
                        try {
                            synchronized (obj3) {
                                eoelVar2.close();
                            }
                        } catch (IOException e) {
                            ctbs.a.s("Could not close SubscriptionTokens", e);
                        }
                    }
                });
                final Object obj3 = obj;
                apply = Function.this.apply(new ctbf() { // from class: ctbq
                    @Override // defpackage.ctbf
                    public final elfl a(Object obj4) {
                        if (Objects.equals(obj3, obj4)) {
                            Runnable runnable = l;
                            kfbVar.b(null);
                            runnable.run();
                        }
                        return elfo.e(null);
                    }
                });
                eoelVar.a((ctbx) apply);
                kfbVar.a(l, erpp.a);
                return null;
            }
        })).h(new emwl() { // from class: ctbn
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                Void r4 = (Void) obj2;
                csjb d2 = ctbs.a.d();
                d2.I("Received the awaited value on a CallbackTracker");
                d2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.VALUE, obj);
                d2.A("traceString", str);
                d2.r();
                return r4;
            }
        }, this.b);
    }
}
