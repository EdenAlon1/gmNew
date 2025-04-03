package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akxf implements aliv {
    static final cfva a = cfvl.f(cfvl.b, "MessageStatusMaxRows", 300);
    public static final /* synthetic */ int b = 0;
    private final cqoh c;
    private buxm d;
    private final ctyx e;

    public akxf(cqoh cqohVar, ctyx ctyxVar) {
        this.c = cqohVar;
        this.e = ctyxVar;
    }

    public static boolean i(String str) {
        return dktk.a(str, MessagesTable.c.a.toString());
    }

    @Override // defpackage.aliv
    public final int a() {
        if (!((Boolean) cful.ah.e()).booleanValue()) {
            return 0;
        }
        final long epochMilli = this.c.f().toEpochMilli();
        final long millis = TimeUnit.DAYS.toMillis(((Integer) cful.ai.e()).intValue());
        final long millis2 = TimeUnit.DAYS.toMillis(((Integer) cful.aj.e()).intValue());
        String[] strArr = buoc.a;
        bunz bunzVar = new bunz(buoc.a);
        bunzVar.z("MessageStatusLoggerImpl#cleanup1");
        final long max = Math.max(bunzVar.b().k(buoc.c.a) - ((Long) a.e()).longValue(), 0L);
        bunv bunvVar = new bunv();
        bunvVar.f("MessageStatusLoggerImpl#cleanup#messagestatus1");
        bunvVar.a(new Function() { // from class: akxa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buob buobVar = (buob) obj;
                int i = akxf.b;
                buobVar.aq(new dtwe("message_status._id", 10, Long.valueOf(max)));
                return buobVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d = bunvVar.d();
        buxo d2 = MessagesTable.d();
        d2.z("MessageStatusLoggerImpl#cleanup2");
        d2.f(new Function() { // from class: akxb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = akxf.b;
                return ((buum) obj).k;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d2.h(new Function() { // from class: akxc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                int i = akxf.b;
                buxzVar.r(buoc.c.b);
                buxzVar.aj(1, 2, 11, 15, 14, 100);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final buxm b2 = d2.b();
        bunv bunvVar2 = new bunv();
        bunvVar2.f("MessageStatusLoggerImpl#cleanup#messagestatus2");
        bunvVar2.a(new Function() { // from class: akxd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                buob buobVar = (buob) obj;
                int i = akxf.b;
                final long j = epochMilli;
                final long j2 = millis2;
                final long j3 = millis;
                final buxm buxmVar = b2;
                Function[] functionArr = {new Function() { // from class: akwv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buob buobVar2 = (buob) obj2;
                        int i2 = akxf.b;
                        buobVar2.aq(new dtrx("message_status.message_id", 5));
                        return buobVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: akww
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buob buobVar2 = (buob) obj2;
                        int i2 = akxf.b;
                        buobVar2.c(j - j2);
                        return buobVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: akwx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buob buobVar2 = (buob) obj2;
                        int i2 = akxf.b;
                        buobVar2.c(j - j3);
                        buobVar2.as(new dtym(buxmVar));
                        return buobVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                buob[] buobVarArr = new buob[3];
                for (int i2 = 0; i2 < 3; i2++) {
                    Function function = functionArr[i2];
                    String[] strArr2 = buoc.a;
                    apply = function.apply(new buob());
                    buobVarArr[i2] = (buob) apply;
                }
                buobVar.ar(buobVarArr);
                return buobVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int d3 = d + bunvVar2.d();
        this.e.j("message_status_cleaup_rows_deleted", d3);
        this.e.k("message_status_cleaup_time_millis", this.c.f().toEpochMilli());
        return d3;
    }

    @Override // defpackage.aliv
    public final aliw b() {
        aliw aliwVar = new aliw();
        String[] strArr = buoc.a;
        bunz bunzVar = new bunz(buoc.a);
        bunzVar.z("MessageStatusLoggerImpl#getRowCount");
        aliwVar.a = bunzVar.b().i();
        bunz bunzVar2 = new bunz(buoc.a);
        bunzVar2.z("MessageStatusLoggerImpl#getSizeEstimate");
        bunm bunmVar = (bunm) bunzVar2.b().o();
        int i = 0;
        while (true) {
            try {
                bums bumsVar = (bums) bunmVar.cQ();
                if (bumsVar == null) {
                    bunmVar.close();
                    aliwVar.b = i;
                    bunz bunzVar3 = new bunz(buoc.a);
                    bunzVar3.z("getEarliestTimestamp");
                    aliwVar.c = bunzVar3.b().l(buoc.c.c);
                    aliwVar.d = this.e.e("message_status_cleaup_time_millis", 0L);
                    aliwVar.e = this.e.d("message_status_cleaup_rows_deleted", 0);
                    return aliwVar;
                }
                i += bumsVar.a().length();
            } catch (Throwable th) {
                try {
                    bunmVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.aliv
    public final String c(aliu aliuVar) {
        return aliuVar.d;
    }

    @Override // defpackage.aliv
    public final String d(int i, String str) {
        String a2 = axuh.a(i);
        if (i == 4) {
            if (str != null) {
                Scanner scanner = new Scanner(str);
                String str2 = a2 + " creator: " + eooi.b(scanner.nextInt()).name();
                scanner.useDelimiter("\\z");
                if (scanner.hasNext()) {
                    String next = scanner.next();
                    if (!TextUtils.isEmpty(next)) {
                        return a.w(next, str2, "-");
                    }
                }
                return str2;
            }
        } else if (i == 0) {
            return str;
        }
        return a2;
    }

    @Override // defpackage.aliv
    public final void e() {
        buxo d = MessagesTable.d();
        d.z("MessageStatusLoggerImpl#init");
        d.e(new Function() { // from class: akwz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                int i = akxf.b;
                return new buun[]{buumVar.a, buumVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buxm b2 = d.b();
        this.d = b2;
        b2.L(new akxe(this));
    }

    @Override // defpackage.aliv
    public final void f(MessageIdType messageIdType, axui axuiVar) {
        String str;
        aliu aliuVar = aliu.SEND_UPDATE;
        switch (axuiVar.a) {
            case -1:
                str = "PENDING";
                break;
            case 0:
                str = "SUCCEEDED";
                break;
            case 1:
                str = "AUTO_RETRY";
                break;
            case 2:
                str = "MANUAL_RETRY";
                break;
            case 3:
                str = "NO_RETRY";
                break;
            case 4:
                str = "FALLBACK_TO_XMS";
                break;
            case 5:
                str = "NO_RETRY_NO_FALLBACK";
                break;
            case 6:
                str = "SEND_AGAIN";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        h(messageIdType, aliuVar, Optional.of(str + ", error: " + axuiVar.b));
    }

    public final void g(MessageIdType messageIdType, int i, Optional optional) {
        if (((Boolean) cful.ah.e()).booleanValue()) {
            csix.h();
            long epochMilli = this.c.f().toEpochMilli();
            String[] strArr = buoc.a;
            bumx bumxVar = new bumx();
            bumxVar.e(messageIdType.c() ? null : messageIdType.b());
            bumxVar.g(epochMilli);
            bumxVar.f(i);
            if (optional.isPresent()) {
                bumxVar.d((String) optional.get());
            }
            bumxVar.b();
        }
    }

    public final void h(MessageIdType messageIdType, aliu aliuVar, Optional optional) {
        if (((Boolean) cful.ah.e()).booleanValue()) {
            csix.h();
            long epochMilli = this.c.f().toEpochMilli();
            String[] strArr = buoc.a;
            bumx bumxVar = new bumx();
            bumxVar.e(messageIdType.c() ? null : messageIdType.b());
            bumxVar.g(epochMilli);
            bumxVar.c(aliuVar);
            if (optional.isPresent()) {
                bumxVar.d((String) optional.get());
            }
            bumxVar.b();
        }
    }

    @Override // defpackage.aliv
    public final byte[] j() {
        eyee eyeeVar = eyee.b;
        eyed eyedVar = new eyed();
        PrintWriter printWriter = new PrintWriter((OutputStream) eyedVar, true);
        String[] strArr = buoc.a;
        bunz bunzVar = new bunz(buoc.a);
        bunzVar.z("MessageStatusLogger#dump-message_status");
        bunzVar.c(new Function() { // from class: akwy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bunk bunkVar = (bunk) obj;
                int i = akxf.b;
                return new bunl[]{bunkVar.c, bunkVar.b, bunkVar.d, bunkVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bunm bunmVar = (bunm) bunzVar.b().o();
        while (bunmVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(bunmVar.e())).append('\t');
                if (bunmVar.h() != null) {
                    printWriter.append((CharSequence) bunmVar.h());
                }
                printWriter.append('\t').append((CharSequence) Integer.toString(bunmVar.c())).append('\t');
                if (bunmVar.g() != null) {
                    printWriter.append((CharSequence) bunmVar.g());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    bunmVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bunmVar.close();
        printWriter.flush();
        byte[] I = eyedVar.b().I();
        printWriter.close();
        return dkty.x(I, 524288);
    }
}
