package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.reportissue.ReportIssueReceiver;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajvm implements cnmx {
    private static final cskc a = cskc.g("Bugle", "ReportIssueIntentsImpl");
    private final Context b;
    private final ffbr c;
    private final ffbr d;

    public ajvm(Context context, ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    private static adtm g(ephv ephvVar, Throwable th, enhk enhkVar) {
        adtt adttVar = new adtt();
        adttVar.a = Optional.ofNullable(th);
        adttVar.b = Optional.ofNullable(enhkVar);
        adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC);
        adttVar.c = Optional.of(ephvVar);
        return adttVar.a();
    }

    private static boolean h(ephv ephvVar) {
        return ((Boolean) adwg.a.e()).booleanValue() && !ephvVar.equals(ephv.SILENT_CRASH);
    }

    private final PendingIntent i(String str, int i, ephv ephvVar, Throwable th, enhk enhkVar) {
        if (h(ephvVar) && ((Boolean) adwg.d.e()).booleanValue()) {
            Intent a2 = ((adtn) this.d.b()).a(this.b, g(ephvVar, th, enhkVar));
            a2.setAction(str);
            ProtoParsers.j(a2, "report_issue_event_type", (ephx) j(i, ephvVar).build());
            return PendingIntent.getActivity(this.b, 0, a2, 201326592);
        }
        Context context = this.b;
        akuv c = akuv.c(context, ReportIssueReceiver.class, "android.intent.action.VIEW");
        c.f(context.getPackageName());
        c.e(str);
        Intent a3 = c.a();
        if (th != null) {
            a3.putExtra("throwable", th);
        }
        if (enhkVar != null) {
            final Bundle bundle = new Bundle();
            Map.EL.forEach(enhkVar, new BiConsumer() { // from class: ajvl
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    bundle.putString((String) obj, (String) obj2);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            a3.putExtra("psd_map", bundle);
        }
        ProtoParsers.j(a3, "report_issue_event_type", (ephx) j(i, ephvVar).build());
        return PendingIntent.getBroadcast(this.b, 0, a3, 201326592);
    }

    private static ephs j(int i, ephv ephvVar) {
        ephs ephsVar = (ephs) ephx.a.createBuilder();
        ephsVar.copyOnWrite();
        ephx ephxVar = (ephx) ephsVar.instance;
        ephxVar.c = 2;
        ephxVar.b |= 1;
        ephsVar.copyOnWrite();
        ephx ephxVar2 = (ephx) ephsVar.instance;
        ephxVar2.e = i - 1;
        ephxVar2.b |= 4;
        ephsVar.copyOnWrite();
        ephx ephxVar3 = (ephx) ephsVar.instance;
        ephxVar3.d = ephvVar.o;
        ephxVar3.b |= 2;
        return ephsVar;
    }

    @Override // defpackage.cnmx
    public final PendingIntent a(ephv ephvVar) {
        Context context = this.b;
        akuv c = akuv.c(context, ReportIssueReceiver.class, "android.intent.action.VIEW");
        c.f(context.getPackageName());
        Intent a2 = c.a();
        a2.setAction("com.google.android.apps.messaging.shared.reportissue.DISMISS_NOTIFICATION");
        ephs ephsVar = (ephs) ephx.a.createBuilder();
        ephsVar.copyOnWrite();
        ephx ephxVar = (ephx) ephsVar.instance;
        ephxVar.c = 4;
        ephxVar.b |= 1;
        ephsVar.copyOnWrite();
        ephx ephxVar2 = (ephx) ephsVar.instance;
        ephxVar2.d = ephvVar.o;
        ephxVar2.b |= 2;
        ProtoParsers.j(a2, "report_issue_event_type", (ephx) ephsVar.build());
        return PendingIntent.getBroadcast(this.b, 0, a2, 201326592);
    }

    @Override // defpackage.cnmx
    public final PendingIntent b(ciqc ciqcVar) {
        ephv ephvVar;
        Object obj;
        cina cinaVar = (cina) ciqcVar;
        boolean isPresent = cinaVar.c.isPresent();
        ephv ephvVar2 = cinaVar.a;
        if (isPresent) {
            Object obj2 = cinaVar.c.get();
            if (ephvVar2 == ephv.UNKNOWN_ISSUE_TYPE) {
                ephvVar2 = ephv.SILENT_CRASH;
            }
            ephvVar = ephvVar2;
            obj = obj2;
        } else {
            ephvVar = ephvVar2;
            obj = null;
        }
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, ephvVar, (Throwable) obj, (enhk) (cinaVar.d.isPresent() ? cinaVar.d.get() : null));
    }

    @Override // defpackage.cnmx
    public final PendingIntent c(ephv ephvVar, enhk enhkVar) {
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION", 2, ephvVar, null, enhkVar);
    }

    @Override // defpackage.cnmx
    public final PendingIntent d(ephv ephvVar) {
        return i("com.google.android.apps.messaging.shared.reportissue.LAUNCH_FEEDBACK_FROM_NOTIFICATION_ACTION", 3, ephvVar, null, null);
    }

    @Override // defpackage.cnmx
    public final elfl e(ephv ephvVar, Throwable th, enhk enhkVar) {
        if (!h(ephvVar)) {
            return elfl.g(((adyz) this.c.b()).a(ephvVar, th, enhkVar));
        }
        emxf.l(!((Boolean) adwg.d.e()).booleanValue());
        ((adtn) this.d.b()).b(this.b, g(ephvVar, th, enhkVar));
        return elfo.e(null);
    }

    @Override // defpackage.cnmx
    public final ephx f(Intent intent, String str, int i) {
        try {
            return (ephx) ProtoParsers.c(intent, str, ephx.a, eyfc.a());
        } catch (eygu e) {
            a.s("Failed to parse ReportIssueEvent", e);
            ephs ephsVar = (ephs) ephx.a.createBuilder();
            ephsVar.copyOnWrite();
            ephx ephxVar = (ephx) ephsVar.instance;
            ephxVar.c = i - 1;
            ephxVar.b |= 1;
            return (ephx) ephsVar.build();
        }
    }
}
