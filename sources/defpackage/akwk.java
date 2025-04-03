package defpackage;

import android.content.ContentValues;
import android.content.Intent;
import com.google.android.ims.rcsservice.events.Event;
import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akwk implements alir {
    static final cfva a = cfvl.f(cfvl.b, "AppEventMaxRows", 300);
    public static final /* synthetic */ int c = 0;
    public final Executor b;
    private final cqoh d;
    private final ffbr e;
    private bsnz f;

    public akwk(errl errlVar, cqoh cqohVar, ffbr ffbrVar) {
        this.b = new ersb(errlVar);
        this.d = cqohVar;
        this.e = ffbrVar;
    }

    @Override // defpackage.alir
    public final int a() {
        if (!((Boolean) cful.ah.e()).booleanValue()) {
            return 0;
        }
        String[] strArr = buoc.a;
        bunz bunzVar = new bunz(buoc.a);
        bunzVar.z("AppEventLoggerImpl#cleanup-messages");
        final long l = bunzVar.b().l(buoc.c.c);
        String[] strArr2 = btdw.a;
        btdt btdtVar = new btdt(btdw.a);
        btdtVar.z("AppEventLoggerImpl#cleanup-events");
        final long max = Math.max(btdtVar.b().k(btdw.c.a) - ((Long) a.e()).longValue(), 0L);
        btdn btdnVar = new btdn();
        btdnVar.f("AppEventLoggerImpl#cleanup#events1");
        btdnVar.a(new Function() { // from class: akwg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btdv btdvVar = (btdv) obj;
                int i = akwk.c;
                btdvVar.as(new dtzq("$V <= $V", new Object[]{btdw.c.a, Long.valueOf(max)}));
                return btdvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d = btdnVar.d();
        btdn btdnVar2 = new btdn();
        btdnVar2.f("AppEventLoggerImpl#cleanup#events2");
        btdnVar2.a(new Function() { // from class: akwh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btdv btdvVar = (btdv) obj;
                int i = akwk.c;
                btdvVar.aq(new dtwe("events.timestamp", 8, Long.valueOf(l)));
                return btdvVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d2 = d + btdnVar2.d();
        ((ctyx) this.e.b()).j("events_cleaup_rows_deleted", d2);
        ((ctyx) this.e.b()).k("message_status_cleaup_time_millis", this.d.f().toEpochMilli());
        return d2;
    }

    @Override // defpackage.alir
    public final aliw b() {
        aliw aliwVar = new aliw();
        String[] strArr = btdw.a;
        btdt btdtVar = new btdt(btdw.a);
        btdtVar.z("AppEventLoggerImpl#getRowCount");
        btdtVar.r();
        aliwVar.a = btdtVar.b().i();
        btdt btdtVar2 = new btdt(btdw.a);
        btdtVar2.z("AppEventLoggerImpl#getSizeEstimate");
        btdtVar2.r();
        btdg btdgVar = (btdg) btdtVar2.b().o();
        int i = 0;
        while (true) {
            try {
                btcq btcqVar = (btcq) btdgVar.cQ();
                if (btcqVar == null) {
                    btdgVar.close();
                    aliwVar.b = i;
                    btdt btdtVar3 = new btdt(btdw.a);
                    btdtVar3.z("AppEventLoggerImpl-getEarliestTimestamp");
                    aliwVar.c = btdtVar3.b().l(btdw.c.b);
                    aliwVar.d = ((ctyx) this.e.b()).e("message_status_cleaup_time_millis", 0L);
                    aliwVar.e = ((ctyx) this.e.b()).d("events_cleaup_rows_deleted", 0);
                    return aliwVar;
                }
                i += btcqVar.a().length();
            } catch (Throwable th) {
                try {
                    btdgVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.alir
    public final String c(aliq aliqVar, String str) {
        String sb;
        try {
            if (aliqVar == aliq.RCS_EVENT) {
                String[] split = str.split(" ", -1);
                if (split.length == 2) {
                    int parseInt = Integer.parseInt(split[0]);
                    long parseLong = Long.parseLong(split[1]);
                    int i = dkmz.a;
                    int i2 = parseInt / 10000;
                    if (i2 >= 0) {
                        if (i2 == 2) {
                            StringBuilder sb2 = new StringBuilder();
                            if (parseInt == 20001) {
                                sb2.append("FILE TRANSFER SESSION STARTING");
                            } else if (parseInt != 20002) {
                                switch (parseInt) {
                                    case 20010:
                                        sb2.append("FILE TRANSFER STARTED");
                                        break;
                                    case 20011:
                                        sb2.append("FILE TRANSFER FINISHED");
                                        break;
                                    case 20012:
                                        sb2.append("FILE TRANSFER PROGRESS: TRANSFERRED ");
                                        sb2.append(FileTransferEvent.h(parseLong));
                                        sb2.append(" of ");
                                        sb2.append((int) parseLong);
                                        break;
                                    case 20013:
                                        sb2.append("FILE TRANSFER INTERRUPTED");
                                        break;
                                    default:
                                        sb2.append("Unknown FileTransfer event: ");
                                        sb2.append(parseInt);
                                        break;
                                }
                            } else {
                                sb2.append("FILE TRANSFER SESSION STARTED");
                            }
                            sb = sb2.toString();
                        } else if (i2 == 3) {
                            StringBuilder sb3 = new StringBuilder();
                            if (parseInt == 30013) {
                                sb3.append("CAPABILITIES UPDATED");
                            } else if (parseInt != 30050) {
                                switch (parseInt) {
                                    case 30100:
                                        sb3.append("SIP REGISTRATION SUCCESSFUL");
                                        break;
                                    case 30101:
                                        sb3.append("SIP REGISTRATION FAILED");
                                        break;
                                    case 30102:
                                        sb3.append("SIP REGISTRATION TERMINATED");
                                        break;
                                    default:
                                        switch (parseInt) {
                                            case 30104:
                                                sb3.append("RCS PROVISIONING RESCHEDULED");
                                                break;
                                            case 30105:
                                                sb3.append("IMS MODULE INITIALIZED");
                                                break;
                                            case 30106:
                                                sb3.append("SIP REGISTRATION STATE CHANGED");
                                                break;
                                            default:
                                                sb3.append(a.h(parseInt, "Unknown IMS event: "));
                                                break;
                                        }
                                }
                            } else {
                                sb3.append("CONFIGURATION UPDATED SUCCESSFULLY");
                            }
                            int i3 = (int) parseLong;
                            if (i3 == 100) {
                                sb3.append(": SIP CONNECTION ESTABLISHED");
                            } else if (i3 == 101) {
                                sb3.append(": SIP CONNECTION LOST");
                            }
                            sb = sb3.toString();
                        } else if (i2 == 5) {
                            StringBuilder sb4 = new StringBuilder();
                            switch (parseInt) {
                                case 50002:
                                    sb4.append("CHAT SESSION STARTED");
                                    break;
                                case 50003:
                                    sb4.append("CHAT SESSION START FAILED");
                                    break;
                                case 50005:
                                    sb4.append("CHAT SESSION TERMINATED");
                                    break;
                                case 50020:
                                    sb4.append("USER HAS JOINED GROUP CHAT");
                                    break;
                                case 50021:
                                    sb4.append("USER HAS LEFT GROUP CHAT");
                                    break;
                                case 50030:
                                    sb4.append("MESSAGE SENT SUCCESSFULLY");
                                    break;
                                case 50031:
                                    sb4.append("UNABLE TO SEND MESSAGE");
                                    break;
                                case 50032:
                                    sb4.append("IMDN REPORT: MESSAGE DISPLAYED TO REMOTE USER");
                                    break;
                                case 50035:
                                    sb4.append("IMDN REPORT: MESSAGE DELIVERED TO REMOTE USER");
                                    break;
                                case 50038:
                                    sb4.append("MESSAGE NOT YET DELIVERED");
                                    break;
                                case 50039:
                                    sb4.append("MESSAGE REVOCATION SENT");
                                    break;
                                case 50040:
                                    sb4.append("MESSAGE REVOCATION SEND FAILED");
                                    break;
                                case 50044:
                                    sb4.append("MESSAGE INTERWORKING SMS");
                                    break;
                                case 50045:
                                    sb4.append("MESSAGE INTERWORKING MMS");
                                    break;
                                case 50050:
                                    sb4.append("REMOTE USER COMPOSING STATE CHANGED");
                                    break;
                                case 50070:
                                    sb4.append("IMDN REPORT: REPORT SENT SUCCESSFULLY");
                                    break;
                                case 50071:
                                    sb4.append("IMDN REPORT: UNABLE TO SEND REPORT");
                                    break;
                                default:
                                    sb4.append(a.h(parseInt, "Unknown ChatSession event: "));
                                    break;
                            }
                            int i4 = (int) parseLong;
                            if (i4 == 0) {
                                sb4.append(": IS NOT TYPING");
                            } else if (i4 == 1) {
                                sb4.append(": IS TYPING");
                            } else if (i4 == 2) {
                                sb4.append(": WAS OFFLINE");
                            }
                            sb = sb4.toString();
                        } else if (i2 == 6) {
                            sb = a.h(parseInt, "Location sharing event: ");
                        }
                        return a.t(sb, "RCS: ");
                    }
                    sb = a.h(parseInt, "Unknown RCS event: ");
                    return a.t(sb, "RCS: ");
                }
            } else {
                if (aliqVar == aliq.PHONE_STATE_CHANGED) {
                    int parseInt2 = Integer.parseInt(str);
                    return parseInt2 != 0 ? parseInt2 != 1 ? parseInt2 != 2 ? parseInt2 != 3 ? "Unknown phone state" : "Radio of telephony is explicitly powered off" : "Phone only allowed emergency service" : "Phone out of service" : "Phone in service";
                }
                if (aliqVar == aliq.TRIM_MEMORY) {
                    return "Trim memory";
                }
            }
        } catch (NumberFormatException unused) {
        }
        return str;
    }

    @Override // defpackage.alir
    public final void d() {
        bsob e = bsom.e();
        e.z("AppEventLoggerImpl#init");
        e.f(new Function() { // from class: akwi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bskp bskpVar = (bskp) obj;
                int i = akwk.c;
                return new bskq[]{bskpVar.a, bskpVar.q};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsnz b = e.b();
        this.f = b;
        b.L(new akwj(this));
    }

    @Override // defpackage.alir
    public final void e(Intent intent) {
        String uri;
        aliq aliqVar;
        if (intent.getBooleanExtra("noConnectivity", false)) {
            aliqVar = aliq.NO_CONNECTIVITY;
            uri = null;
        } else {
            uri = intent.toUri(0);
            aliqVar = aliq.CONNECTIVITY_CHANGED;
        }
        f(aliqVar, Optional.ofNullable(uri));
    }

    @Override // defpackage.alir
    public final void f(final aliq aliqVar, final Optional optional) {
        final long epochMilli = this.d.f().toEpochMilli();
        axnw.h(cful.ah.b().i(new eroh() { // from class: akwc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return elfo.e(null);
                }
                final Optional optional2 = optional;
                final long j = epochMilli;
                final aliq aliqVar2 = aliqVar;
                return elfo.f(new Runnable() { // from class: akwb
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = akwk.c;
                        String[] strArr = btdw.a;
                        final btcv btcvVar = new btcv();
                        btcvVar.c(aliq.this);
                        btcvVar.d(j);
                        optional2.ifPresent(new Consumer() { // from class: akwf
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                btcu.this.b((String) obj2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        final btcq a2 = btcvVar.a(new Supplier() { // from class: btcs
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return new btcr();
                            }
                        });
                        final dtve a3 = btdw.a();
                        dtub.b(btdw.a(), "events", a2, new Function() { // from class: btco
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return Long.valueOf(dtve.this.R("events", (ContentValues) obj2));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Consumer() { // from class: btcp
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                Long l = (Long) obj2;
                                if (l.longValue() >= 0) {
                                    btcq btcqVar = btcq.this;
                                    btcqVar.a = new btcn(l).a.longValue();
                                    btcqVar.fY(0);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }, akwk.this.b);
            }
        }, erpp.a));
    }

    @Override // defpackage.alir
    public final void g(Event event) {
        int i = event.h;
        if (i == 50050 || i == 50070) {
            return;
        }
        f(aliq.RCS_EVENT, Optional.of(i + " " + event.i));
    }

    @Override // defpackage.alir
    public final byte[] h() {
        eyee eyeeVar = eyee.b;
        eyed eyedVar = new eyed();
        PrintWriter printWriter = new PrintWriter((OutputStream) eyedVar, true);
        String[] strArr = btdw.a;
        btdt btdtVar = new btdt(btdw.a);
        btdtVar.z("AppEventLoggerImpl-dump");
        btdtVar.c(new Function() { // from class: akwd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                btde btdeVar = (btde) obj;
                int i = akwk.c;
                return new btdf[]{btdeVar.b, btdeVar.c, btdeVar.d};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        btdtVar.r();
        btdg btdgVar = (btdg) btdtVar.b().o();
        while (btdgVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(btdgVar.c())).append('\t').append((CharSequence) Integer.toString(btdgVar.e().p)).append('\t');
                if (btdgVar.f() != null) {
                    printWriter.append((CharSequence) btdgVar.f());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    btdgVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        btdgVar.close();
        printWriter.flush();
        byte[] I = eyedVar.b().I();
        printWriter.close();
        return dkty.x(I, 524288);
    }
}
