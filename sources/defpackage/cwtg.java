package defpackage;

import androidx.preference.SwitchPreferenceCompat;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwtg implements ejxk {
    final /* synthetic */ cwto a;

    public cwtg(cwto cwtoVar) {
        this.a = cwtoVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        this.a.ak.ifPresent(new Consumer() { // from class: cwte
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                cwtg.this.a.f.b().af((SwitchPreferenceCompat) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ensz) ((ensz) cwto.c.j()).h("com/google/android/apps/messaging/ui/appsettings/ApplicationSettingsFragmentPeer$2", "onLoadError", 604, "ApplicationSettingsFragmentPeer.java")).q("Failed to load expressive animations settings");
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final cwrg cwrgVar = (cwrg) obj;
        this.a.ak.ifPresent(new Consumer() { // from class: cwtf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj2;
                switchPreferenceCompat.k(cwrg.this.c);
                switchPreferenceCompat.G(true);
                switchPreferenceCompat.N(true);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
