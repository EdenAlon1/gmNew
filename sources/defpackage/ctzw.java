package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctzw {
    public static final cfup a = cfvl.e(cfvl.b, "rcs_service_connection_timeout_seconds", 60);
    public static final entd b = entd.c("ConnectedRcsService");
    private final Context c;
    private final errm d;
    private final errl e;

    public ctzw(Context context, errm errmVar, errl errlVar) {
        this.c = context;
        this.d = errmVar;
        this.e = errlVar;
    }

    public final elfl a(BiFunction biFunction, final Class cls) {
        elfl d;
        Object apply;
        long intValue = ((Integer) a.e()).intValue();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        final ctzv ctzvVar = new ctzv();
        try {
            apply = biFunction.apply(this.c, ctzvVar);
            final ehxc ehxcVar = (ehxc) apply;
            ((ensz) b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 127, "ConnectedRcsServiceFactory.java")).t("connectToInstance() start for rcsService %s", ehxcVar);
            d = elfo.h(new erog() { // from class: ctzu
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    cfup cfupVar = ctzw.a;
                    final ehxc ehxcVar2 = ehxc.this;
                    final ctzv ctzvVar2 = ctzvVar;
                    final Class cls2 = cls;
                    return elfl.g(kfg.a(new kfd() { // from class: ctzt
                        @Override // defpackage.kfd
                        public final Object a(kfb kfbVar) {
                            cfup cfupVar2 = ctzw.a;
                            ctzv ctzvVar3 = ctzvVar2;
                            ehxc ehxcVar3 = ehxc.this;
                            Class cls3 = cls2;
                            try {
                                ((ensz) ctzw.b.n().h("com/google/android/apps/messaging/shared/util/rcs/ConnectedRcsServiceFactory", "connectToInstance", 134, "ConnectedRcsServiceFactory.java")).t("connectToInstance() try serviceListener.init for rcsService %s and completer", ehxcVar3);
                                ctzvVar3.b = ehxcVar3;
                                ctzvVar3.a = kfbVar;
                                if (ehxcVar3.connect()) {
                                    return "Connected RCS Service";
                                }
                                ctzvVar3.a.c(new cual(cls3.getName(), ehxh.UNKNOWN));
                                return "Connected RCS Service";
                            } catch (SecurityException e) {
                                csjy.p("Bugle", e, "ConnectedRcsService: Can't connect to rcsService");
                                ctzvVar3.a.c(e);
                                return "Connected RCS Service";
                            }
                        }
                    }));
                }
            }, this.e);
        } catch (Exception e) {
            csjy.p("Bugle", e, "ConnectedRcsService: Unsupported service class ".concat(cls.toString()));
            d = elfo.d(new IllegalArgumentException("Unsupported service class ".concat(cls.toString())));
        }
        return d.j(intValue, timeUnit, this.d);
    }
}
