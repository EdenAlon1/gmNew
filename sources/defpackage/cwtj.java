package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwtj implements ejxk {
    final /* synthetic */ cwto a;

    public cwtj(cwto cwtoVar) {
        this.a = cwtoVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        this.a.aj.ifPresent(new Consumer() { // from class: cwti
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cwtj.this.a.f.b().af((SwitchPreferenceCompat) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ensz) ((ensz) cwto.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$3", "onLoadError", 654, "ApplicationSettingsFragmentPeer.java")).q("Failed to load fast image sending setting");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final ctau ctauVar = (ctau) obj;
        this.a.aj.ifPresent(new Consumer() { // from class: cwth
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                switchPreferenceCompat.k(ctau.this.e);
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
