package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.wearable.ChannelClient;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deew implements cbbt {
    final /* synthetic */ bcpt a;
    final /* synthetic */ ChannelClient.Channel b;
    final /* synthetic */ Uri c;
    final /* synthetic */ WearableBindService d;

    public deew(WearableBindService wearableBindService, bcpt bcptVar, ChannelClient.Channel channel, Uri uri) {
        this.a = bcptVar;
        this.b = channel;
        this.c = uri;
        this.d = wearableBindService;
    }

    @Override // defpackage.cbbt
    public final void fW(cbbn cbbnVar) {
        ensz enszVar = (ensz) WearableBindService.a.j();
        enszVar.Y(csux.O, "WearableBindService");
        ((ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService$1", "onMediaResourceLoadError", 700, "WearableBindService.java")).t("onChannelOpened couldn't load media part: %s", this.c);
        if (this.a.g()) {
            this.a.f();
            WearableBindService wearableBindService = this.d;
            wearableBindService.b.remove(this.b);
        }
    }

    @Override // defpackage.cbbt
    public final /* bridge */ /* synthetic */ void fX(cbbn cbbnVar, cbcc cbccVar, boolean z) {
        final cbbk cbbkVar = (cbbk) cbccVar;
        ensz enszVar = (ensz) WearableBindService.a.h();
        enszVar.Y(csux.O, "WearableBindService");
        ensz enszVar2 = (ensz) enszVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 747, "WearableBindService.java");
        final bcpt bcptVar = this.a;
        final ChannelClient.Channel channel = this.b;
        enszVar2.E("#sendMediaViaChannelAsync path: %s, isBound: %s", channel.a(), bcptVar.g());
        if (bcptVar.g()) {
            final WearableBindService wearableBindService = this.d;
            wearableBindService.f(channel).k(axnw.c(new Consumer() { // from class: deel
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ensk j;
                    WearableBindService wearableBindService2 = WearableBindService.this;
                    bcpt bcptVar2 = bcptVar;
                    ChannelClient.Channel channel2 = channel;
                    cbbk cbbkVar2 = cbbkVar;
                    OutputStream outputStream = (OutputStream) obj;
                    try {
                        try {
                            try {
                                if (bcptVar2.g()) {
                                    byte[] j2 = cbbkVar2.j();
                                    if (!((avcn) wearableBindService2.E.b()).a()) {
                                        j2.getClass();
                                        outputStream.write(j2, 0, j2.length);
                                    } else if (j2 != null) {
                                        outputStream.write(j2, 0, j2.length);
                                    } else {
                                        ensz enszVar3 = (ensz) WearableBindService.a.j();
                                        enszVar3.Y(csux.O, "WearableBindService");
                                        ((ensz) enszVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 774, "WearableBindService.java")).q("sendMediaViaChannelAsync: ImageResource returned null bytes.");
                                    }
                                    outputStream.close();
                                    bcptVar2.f();
                                    wearableBindService2.b.remove(channel2);
                                    return;
                                }
                                ensz enszVar4 = (ensz) WearableBindService.a.j();
                                enszVar4.Y(csux.O, "WearableBindService");
                                ((ensz) enszVar4.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 760, "WearableBindService.java")).t("sendMediaViaChannelAsync channel callback: obsolete request obsolete request is no longer bound, path: %s", channel2.a());
                                try {
                                    outputStream.close();
                                    bcptVar2.f();
                                    wearableBindService2.b.remove(channel2);
                                } catch (Exception e) {
                                    e = e;
                                    j = WearableBindService.a.j();
                                    ensz enszVar5 = (ensz) j;
                                    enszVar5.Y(csux.O, "WearableBindService");
                                    ((ensz) ((ensz) enszVar5.g(e)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 803, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                                }
                            } catch (Exception e2) {
                                e = e2;
                                j = WearableBindService.a.j();
                            }
                        } catch (cbbj e3) {
                            ensz enszVar6 = (ensz) WearableBindService.a.j();
                            enszVar6.Y(csux.O, "WearableBindService");
                            ((ensz) ((ensz) enszVar6.g(e3)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 790, "WearableBindService.java")).q("sendMediaViaChannelAsync: Could not get bytes from image type to write to channel.");
                            outputStream.close();
                            bcptVar2.f();
                            wearableBindService2.b.remove(channel2);
                        } catch (IOException e4) {
                            ensz enszVar7 = (ensz) WearableBindService.a.j();
                            enszVar7.Y(csux.O, "WearableBindService");
                            ((ensz) ((ensz) enszVar7.g(e4)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 784, "WearableBindService.java")).q("sendMediaViaChannelAsync: Channel failed to write.");
                            outputStream.close();
                            bcptVar2.f();
                            wearableBindService2.b.remove(channel2);
                        }
                    } catch (Throwable th) {
                        try {
                            outputStream.close();
                            bcptVar2.f();
                            wearableBindService2.b.remove(channel2);
                        } catch (Exception e5) {
                            ensz enszVar8 = (ensz) WearableBindService.a.j();
                            enszVar8.Y(csux.O, "WearableBindService");
                            ((ensz) ((ensz) enszVar8.g(e5)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 803, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) wearableBindService.v.b());
        }
    }
}
