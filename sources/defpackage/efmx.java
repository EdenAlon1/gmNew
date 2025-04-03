package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import j$.time.Instant;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efmx {
    public static final efmx a;
    public static final AtomicBoolean b;
    public efmh d;
    public efnl e;
    public String f;
    public engw g;
    public long h;
    public String j;
    public long k;
    public final dlpw i = new dlqb();
    public final String l = "com.google.android.libraries.surveys.internal.view.SurveyActivity";
    public final efmy c = efmy.a;

    static {
        Arrays.asList("com.google.android.surveys.testapp", "com.google.android.maps", "com.google.android.apps.tv.launcherx", "com.google.android.tvrecommendations");
        a = new efmx();
        b = new AtomicBoolean(false);
    }

    private efmx() {
        efnd.a = new efmv(this);
        this.h = 0L;
        this.k = Instant.now().toEpochMilli();
    }

    static void b() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                Log.e("SurveyController", "Notified that survey was destroyed when it wasn't marked as running.");
            }
            atomicBoolean.set(false);
        }
    }

    public static void c() {
        AtomicBoolean atomicBoolean = b;
        synchronized (atomicBoolean) {
            atomicBoolean.set(true);
        }
    }

    public final efog a(efmp efmpVar, String str) {
        efoa efoaVar = efmu.a.d;
        Account account = efmpVar.e;
        efog a2 = efoaVar.a(efmpVar.a, efmpVar.b, account == null ? "" : account.name, str);
        ((efnz) a2).e = efmpVar.c;
        return a2;
    }

    public final void d(ezzi ezziVar, efou efouVar, Context context) {
        String str = TextUtils.isEmpty(this.f) ? null : this.f;
        efpb efpbVar = efor.c;
        if (efor.c(fdul.b(efor.b))) {
            efos a2 = efos.a();
            ezza ezzaVar = (ezza) ezzn.a.createBuilder();
            ezzaVar.copyOnWrite();
            ezzn ezznVar = (ezzn) ezzaVar.instance;
            ezziVar.getClass();
            ezznVar.c = ezziVar;
            ezznVar.b = 4;
            a2.c((ezzn) ezzaVar.build(), efouVar.b(), efouVar.a(), context, str);
        }
    }

    public final void e(int i, efnl efnlVar) {
        String str;
        int i2;
        efmh efmhVar = this.d;
        if (efmhVar != null) {
            efmm a2 = efnlVar.a();
            if (((Boolean) ((cfup) csze.b.get()).e()).booleanValue()) {
                akxl akxlVar = (akxl) ((cszc) efmhVar).d.c.c.b();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                epca epcaVar = (epca) epcn.a.createBuilder();
                epcb epcbVar = (epcb) epcd.a.createBuilder();
                switch (i - 1) {
                    case 0:
                        i2 = 2;
                        break;
                    case 1:
                        i2 = 3;
                        break;
                    case 2:
                        i2 = 4;
                        break;
                    case 3:
                        i2 = 5;
                        break;
                    case 4:
                        i2 = 6;
                        break;
                    case 5:
                        i2 = 7;
                        break;
                    case 6:
                        i2 = 8;
                        break;
                    case 7:
                        i2 = 9;
                        break;
                    default:
                        i2 = 10;
                        break;
                }
                epcbVar.copyOnWrite();
                epcd epcdVar = (epcd) epcbVar.instance;
                epcdVar.d = i2 - 1;
                epcdVar.b |= 2;
                String str2 = a2.a;
                epcbVar.copyOnWrite();
                epcd epcdVar2 = (epcd) epcbVar.instance;
                epcdVar2.b |= 1;
                epcdVar2.c = emxe.b(str2);
                epcaVar.copyOnWrite();
                epcn epcnVar = (epcn) epcaVar.instance;
                epcd epcdVar3 = (epcd) epcbVar.build();
                epcdVar3.getClass();
                epcnVar.g = epcdVar3;
                epcnVar.b |= 16;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                epcn epcnVar2 = (epcn) epcaVar.build();
                epcnVar2.getClass();
                eolvVar.aU = epcnVar2;
                eolvVar.e |= 262144;
                eolt eoltVar = eolt.BUGLE_HATS_NEXT_CLIENT_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eolvVar2.j = eoltVar.dk;
                eolvVar2.b |= 1;
                akxlVar.j(eoluVar);
            }
            cszc cszcVar = (cszc) efmhVar;
            cszcVar.b.setBackground(cszcVar.c);
            switch (i) {
                case 1:
                    str = "CLIENT_ACTIVITY_WAS_DESTROYED";
                    break;
                case 2:
                    str = "CLIENT_ACTIVITY_WAS_FINISHING";
                    break;
                case 3:
                    str = "CLIENT_ACTIVITY_WAS_NULL";
                    break;
                case 4:
                    str = "INVALID_COMPLETION_STYLE";
                    break;
                case 5:
                    str = "INVALID_PROMPT_STYLE";
                    break;
                case 6:
                    str = "INVALID_SURVEY_DATA_TYPE";
                    break;
                case 7:
                    str = "INVALID_SURVEY_PAYLOAD";
                    break;
                case 8:
                    str = "SURVEY_ALREADY_RUNNING";
                    break;
                default:
                    str = "SURVEY_EXPIRED";
                    break;
            }
            csze.a.n(String.format("Failed to present survey (metadata: %s, error: %s.)", 0, str));
        }
    }
}
