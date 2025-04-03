package defpackage;

import com.google.android.apps.messaging.ui.appsettings.SettingsActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxel extends cxem {
    public final SettingsActivity a;
    public final akvg b;
    public final ctwb c;
    private final ffbr e;

    public cxel(SettingsActivity settingsActivity, akvg akvgVar, ctwb ctwbVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, Optional optional) {
        this.a = settingsActivity;
        this.b = akvgVar;
        this.c = ctwbVar;
        this.e = ffbrVar3;
        if (!adhu.a()) {
            eito eitoVar = (eito) ffbrVar.b();
            eiwy e = eiwz.e(settingsActivity);
            e.d(seu.class);
            eitoVar.e(a());
            eitoVar.g(e.a());
            optional.ifPresent(new Consumer() { // from class: cxej
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
        eiwy e2 = eiwz.e(settingsActivity);
        e2.d(ejgc.class);
        eitoVar2.e(new ejgb((ejgc) ffbrVar2.b()));
        e2.d(ejed.class);
        eitoVar2.g(e2.a());
        eitoVar2.e(a());
    }

    private final eivv a() {
        return new cxek(this, this.e);
    }
}
