package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cipm {
    public static final entd a = entd.c("BugleNotifications");
    public final ffbr b;
    public final emyl c;
    private final Context d;

    public cipm(Context context, ffbr ffbrVar, final ffbr ffbrVar2) {
        this.d = context;
        this.b = ffbrVar;
        this.c = new emyl() { // from class: cipl
            @Override // defpackage.emyl
            public final Object get() {
                entd entdVar = cipm.a;
                comy comyVar = (comy) ffbr.this.b();
                comu c = comv.c();
                c.d(comb.NOTIFICATION_METRICS_COUNTERS);
                c.f(eqvd.a);
                return comyVar.a(c.a());
            }
        };
    }

    public static equw a(equw equwVar, MessageCoreData messageCoreData) {
        boolean z = messageCoreData.cX() || messageCoreData.cY();
        boolean z2 = messageCoreData.cP() || messageCoreData.cR();
        boolean z3 = messageCoreData.df() || messageCoreData.dh();
        equw equwVar2 = equw.MESSAGE_TYPE_UNKNOWN;
        equw equwVar3 = z ? equw.MESSAGE_TYPE_RCS : equwVar2;
        if (z2) {
            equwVar3 = equw.MESSAGE_TYPE_MMS;
        }
        if (z3) {
            equwVar3 = equw.MESSAGE_TYPE_SMS;
        }
        return (equwVar == equwVar2 || equwVar == equwVar3) ? equwVar3 : equw.MESSAGE_TYPE_HYBRID;
    }

    public static int c(Throwable th) {
        if (th instanceof NullPointerException) {
            return 2;
        }
        if (th instanceof SecurityException) {
            return 3;
        }
        if (th instanceof IllegalArgumentException) {
            return 5;
        }
        if (th instanceof IllegalStateException) {
            return 6;
        }
        return th instanceof RuntimeException ? 4 : 1;
    }

    public final boolean b() {
        int bubblePreference;
        NotificationManager notificationManager = (NotificationManager) this.d.getSystemService("notification");
        if (notificationManager != null && ctid.e) {
            bubblePreference = notificationManager.getBubblePreference();
            if (bubblePreference != 0) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        eqvk eqvkVar = (eqvk) eqvm.a.createBuilder();
        eqvf eqvfVar = eqvf.a;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar = (eqvm) eqvkVar.instance;
        eqvfVar.getClass();
        eqvmVar.d = eqvfVar;
        eqvmVar.c = 3;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar2 = (eqvm) eqvkVar.instance;
        eqvmVar2.g = i - 1;
        eqvmVar2.b |= 4;
        eqvm eqvmVar3 = (eqvm) eqvkVar.build();
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.NOTIFICATION_METRICS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvmVar3.getClass();
        eolvVar2.bn = eqvmVar3;
        eolvVar2.f |= 2048;
        akxlVar.j(eoluVar);
    }

    public final void e(int i, Duration duration) {
        f(Optional.empty(), i, duration);
    }

    public final void f(Optional optional, int i, Duration duration) {
        equx equxVar = (equx) equz.a.createBuilder();
        equxVar.copyOnWrite();
        equz equzVar = (equz) equxVar.instance;
        equzVar.c = i - 1;
        equzVar.b |= 1;
        long millis = duration.toMillis();
        equxVar.copyOnWrite();
        equz equzVar2 = (equz) equxVar.instance;
        equzVar2.b |= 2;
        equzVar2.d = millis;
        final eqvk eqvkVar = (eqvk) eqvm.a.createBuilder();
        boolean b = b();
        eqvkVar.copyOnWrite();
        eqvm eqvmVar = (eqvm) eqvkVar.instance;
        eqvmVar.b |= 2;
        eqvmVar.f = b;
        equz equzVar3 = (equz) equxVar.build();
        eqvkVar.copyOnWrite();
        eqvm eqvmVar2 = (eqvm) eqvkVar.instance;
        equzVar3.getClass();
        eqvmVar2.d = equzVar3;
        eqvmVar2.c = 5;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar3 = (eqvm) eqvkVar.instance;
        eqvmVar3.g = 1;
        eqvmVar3.b |= 4;
        optional.ifPresent(new Consumer() { // from class: cipk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eqvk eqvkVar2 = eqvk.this;
                eqvkVar2.copyOnWrite();
                eqvm eqvmVar4 = (eqvm) eqvkVar2.instance;
                eqvm eqvmVar5 = eqvm.a;
                eqvmVar4.e = ((equw) obj).g;
                eqvmVar4.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.NOTIFICATION_METRICS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvm eqvmVar4 = (eqvm) eqvkVar.build();
        eqvmVar4.getClass();
        eolvVar2.bn = eqvmVar4;
        eolvVar2.f |= 2048;
        akxlVar.j(eoluVar);
    }

    public final void g(equw equwVar, int i, int i2, Optional optional) {
        eqvg eqvgVar = (eqvg) eqvj.a.createBuilder();
        eqvgVar.copyOnWrite();
        eqvj eqvjVar = (eqvj) eqvgVar.instance;
        eqvjVar.c = i - 1;
        eqvjVar.b |= 1;
        eqvgVar.copyOnWrite();
        eqvj eqvjVar2 = (eqvj) eqvgVar.instance;
        eqvjVar2.d = i2 - 1;
        eqvjVar2.b |= 2;
        optional.isPresent();
        boolean booleanValue = ((Boolean) optional.get()).booleanValue();
        eqvgVar.copyOnWrite();
        eqvj eqvjVar3 = (eqvj) eqvgVar.instance;
        eqvjVar3.b |= 4;
        eqvjVar3.e = booleanValue;
        eqvk eqvkVar = (eqvk) eqvm.a.createBuilder();
        eqvkVar.copyOnWrite();
        eqvm eqvmVar = (eqvm) eqvkVar.instance;
        eqvmVar.e = equwVar.g;
        eqvmVar.b |= 1;
        boolean b = b();
        eqvkVar.copyOnWrite();
        eqvm eqvmVar2 = (eqvm) eqvkVar.instance;
        eqvmVar2.b |= 2;
        eqvmVar2.f = b;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar3 = (eqvm) eqvkVar.instance;
        eqvj eqvjVar4 = (eqvj) eqvgVar.build();
        eqvjVar4.getClass();
        eqvmVar3.d = eqvjVar4;
        eqvmVar3.c = 4;
        eqvkVar.copyOnWrite();
        eqvm eqvmVar4 = (eqvm) eqvkVar.instance;
        eqvmVar4.g = 1;
        eqvmVar4.b |= 4;
        eqvm eqvmVar5 = (eqvm) eqvkVar.build();
        akxl akxlVar = (akxl) this.b.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.NOTIFICATION_METRICS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eqvmVar5.getClass();
        eolvVar2.bn = eqvmVar5;
        eolvVar2.f |= 2048;
        akxlVar.j(eoluVar);
    }
}
