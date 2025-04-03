package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvvg implements dvva {
    public static final entd a = entd.c("GnpSdk");
    public final fazb b;
    public final String c;
    public final fazb d;
    private final errl e;
    private final ffbr f;

    public dvvg(errl errlVar, ffbr ffbrVar, fazb fazbVar, String str, fazb fazbVar2) {
        this.e = errlVar;
        this.f = ffbrVar;
        this.b = fazbVar;
        this.c = str;
        this.d = fazbVar2;
    }

    @Override // defpackage.dvva
    public final ListenableFuture a() {
        final ffbr ffbrVar = this.f;
        ffbrVar.getClass();
        ListenableFuture g = erny.g(this.e.submit(eldl.m(new Callable() { // from class: dvve
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) ffbr.this.b();
            }
        })), eldl.d(new eroh() { // from class: dvvf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ListenableFuture b;
                ListenableFuture b2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                dvvg dvvgVar = dvvg.this;
                if (booleanValue) {
                    dvfx dvfxVar = (dvfx) dvvgVar.d.b();
                    b = fgfz.b(dvfxVar.b, ffhe.a, ffsm.a, new dvfw(dvfxVar, null));
                    return b;
                }
                ((ensz) ((ensz) dvvg.a.h()).h("com/google/android/libraries/internal/growth/growthkit/lifecycle/impl/GrowthKitStartupImpl", "schedulePeriodicJobs", 83, "GrowthKitStartupImpl.java")).q("GrowthKit is disabled by Phenotype flag, cancelling jobs.");
                dvfx dvfxVar2 = (dvfx) dvvgVar.d.b();
                b2 = fgfz.b(dvfxVar2.b, ffhe.a, ffsm.a, new dvfv(dvfxVar2, null));
                return b2;
            }
        }), this.e);
        eakf.a(g, new emxs() { // from class: dvvc
            @Override // defpackage.emxs
            public final void a(Object obj) {
                dvvg dvvgVar = dvvg.this;
                ((ears) dvvgVar.b.b()).g(dvvgVar.c, "OK");
            }
        }, new emxs() { // from class: dvvd
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ((ensz) ((ensz) ((ensz) dvvg.a.i()).g((Throwable) obj)).h("com/google/android/libraries/internal/growth/growthkit/lifecycle/impl/GrowthKitStartupImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 66, "GrowthKitStartupImpl.java")).q("GrowthKit failed to start.");
                dvvg dvvgVar = dvvg.this;
                ((ears) dvvgVar.b.b()).g(dvvgVar.c, "ERROR");
            }
        });
        return g;
    }
}
