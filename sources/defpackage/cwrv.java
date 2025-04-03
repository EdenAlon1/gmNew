package defpackage;

import com.google.android.apps.messaging.ui.appsettings.ApplicationSettingsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwrv {
    public final akzt a;
    public final ApplicationSettingsActivity b;
    private final ffbr c;

    public cwrv(ApplicationSettingsActivity applicationSettingsActivity, akzt akztVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional) {
        this.b = applicationSettingsActivity;
        this.a = akztVar;
        this.c = ffbrVar3;
        if (!adhu.a()) {
            eito eitoVar = (eito) ffbrVar.b();
            eiwy e = eiwz.e(applicationSettingsActivity);
            e.d(seu.class);
            eitoVar.e(a());
            eitoVar.g(e.a());
            optional.ifPresent(new Consumer() { // from class: cwrt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ((ses) obj).a();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return;
        }
        eito eitoVar2 = (eito) ffbrVar.b();
        eiwy e2 = eiwz.e(applicationSettingsActivity);
        e2.d(ejgc.class);
        eitoVar2.e(new ejgb((ejgc) ffbrVar2.b()));
        e2.d(ejed.class);
        eitoVar2.g(e2.a());
        eitoVar2.e(a());
    }

    private final eivv a() {
        return new cwru(this, this.c);
    }
}
