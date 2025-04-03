package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.apps.tycho.psd.api.IFiProductSpecificDataService;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhf implements cfzm {
    private final detf c;
    private final dkpp d;
    private final errl e;
    private static final enru b = enru.c("com/google/android/apps/messaging/fi/FiFeedbackDataProvider");
    public static final cfva a = cfvl.f(cfvl.b, "fi_psd_client_timeout_ms", 5000);

    public adhf(Context context, dkpp dkppVar, errl errlVar, errl errlVar2) {
        this.c = new detf(context, errlVar);
        this.d = dkppVar;
        this.e = errlVar2;
    }

    public final /* synthetic */ List a() {
        try {
            final detf detfVar = this.c;
            return (List) detfVar.a(new detd() { // from class: desv
                @Override // defpackage.detd
                public final void a(IBinder iBinder, Consumer consumer, Consumer consumer2) {
                    IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificBinaryData(detf.this.a.getPackageName(), new desy(consumer, consumer2));
                }
            }, Duration.ofMillis(((Long) a.e()).longValue()));
        } catch (dete e) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 'q', "FiFeedbackDataProvider.java")).q("Failed to load Fi PSBD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 'u', "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSBD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsbdData", 's', "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSBD");
            return new ArrayList();
        }
    }

    @Override // defpackage.cfzm
    public final /* synthetic */ elfl b() {
        return cfzj.b();
    }

    @Override // defpackage.cfzm
    public final elfl c() {
        if (this.d.t()) {
            return elfo.g(new Callable() { // from class: adhd
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return adhf.this.a();
                }
            }, this.e);
        }
        int i = engw.d;
        return elfo.e(enou.a);
    }

    @Override // defpackage.cfzm
    public final elfl d() {
        if (this.d.t()) {
            return elfo.g(new Callable() { // from class: adhe
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return adhf.this.e();
                }
            }, this.e);
        }
        int i = engw.d;
        return elfo.e(enou.a);
    }

    public final /* synthetic */ List e() {
        try {
            final detf detfVar = this.c;
            return (List) Collection.EL.stream((List) detfVar.a(new detd() { // from class: desw
                @Override // defpackage.detd
                public final void a(IBinder iBinder, Consumer consumer, Consumer consumer2) {
                    IFiProductSpecificDataService.Stub.asInterface(iBinder).getFiProductSpecificData(detf.this.a.getPackageName(), new desx(consumer, consumer2));
                }
            }, Duration.ofMillis(((Long) a.e()).longValue()))).map(new Function() { // from class: adhb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Pair pair = (Pair) obj;
                    cfva cfvaVar = adhf.a;
                    cfzc cfzcVar = new cfzc();
                    cfzcVar.b("Fi_".concat(String.valueOf((String) pair.first)));
                    cfzcVar.c((String) pair.second);
                    return cfzcVar.a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: adhc
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
        } catch (dete e) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'J', "FiFeedbackDataProvider.java")).q("Failed to load Fi PSD");
            return new ArrayList();
        } catch (InterruptedException e2) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e2)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'N', "FiFeedbackDataProvider.java")).q("Interrupted while loading Fi PSD");
            return new ArrayList();
        } catch (TimeoutException e3) {
            ((enrr) ((enrr) ((enrr) b.j()).g(e3)).h("com/google/android/apps/messaging/fi/FiFeedbackDataProvider", "providePsdData", 'L', "FiFeedbackDataProvider.java")).q("Timeout while loading Fi PSD");
            return new ArrayList();
        }
    }
}
