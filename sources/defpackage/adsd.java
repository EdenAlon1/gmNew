package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsd {
    public static final enru a = enru.c("com/google/android/apps/messaging/growthkit/GrowthKitLogger");
    private final dvbm b;

    public adsd(dvbm dvbmVar) {
        this.b = dvbmVar;
    }

    public final void a(int i) {
        ekzz f = eleg.f("GrowthKitLogger#logEventAsync");
        try {
            dvbm dvbmVar = this.b;
            evwi evwiVar = (evwi) evwj.a.createBuilder();
            evwiVar.copyOnWrite();
            evwj evwjVar = (evwj) evwiVar.instance;
            evwjVar.b |= 1;
            evwjVar.c = 46;
            evwiVar.copyOnWrite();
            evwj evwjVar2 = (evwj) evwiVar.instance;
            evwjVar2.b |= 2;
            evwjVar2.d = i - 1;
            String a2 = evuq.a(dvbmVar.a);
            evwiVar.copyOnWrite();
            evwj evwjVar3 = (evwj) evwiVar.instance;
            a2.getClass();
            evwjVar3.b |= 4;
            evwjVar3.e = a2;
            ListenableFuture a3 = ((dvfm) dvbmVar.b.b()).a((evwj) evwiVar.build());
            f.b(a3);
            erqt.r(a3, new adsc(), erpp.a);
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
