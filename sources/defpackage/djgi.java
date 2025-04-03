package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djgi {
    public final errm a;
    public final dlpw b;
    public final ffbr c;
    private final Map d = new ConcurrentHashMap();

    public djgi(errm errmVar, ffbr ffbrVar, dlpw dlpwVar) {
        this.a = errmVar;
        this.c = ffbrVar;
        this.b = dlpwVar;
    }

    public static void b(djgh djghVar, clqg clqgVar) {
        clqe clqeVar = djghVar.b;
        clns clnsVar = clqeVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        eyja eyjaVar = clqeVar.f;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        Instant d = eykj.d(eyjaVar);
        eyja eyjaVar2 = clqgVar.f;
        if (eyjaVar2 == null) {
            eyjaVar2 = eyja.a;
        }
        long millis = Duration.between(d, eykj.d(eyjaVar2)).toMillis();
        int i = clqeVar.c;
        if (i != 2) {
            if (i == 3) {
                clrh b = clrh.b((clqgVar.c == 3 ? (clqk) clqgVar.d : clqk.a).c);
                if (b == null) {
                    b = clrh.RESPONSE_STATUS_UNKNOWN;
                }
                dkty.k("[conversationId:%s]: Notification for group failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, b, Integer.valueOf(clqeVar.h), Long.valueOf(millis));
                return;
            }
            return;
        }
        clqe clqeVar2 = djghVar.b;
        clpc clpcVar = (clqeVar2.c == 2 ? (clqm) clqeVar2.d : clqm.a).e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        clqx clqxVar = clpcVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str2 = clqxVar.c;
        clrh b2 = clrh.b((clqgVar.c == 2 ? (clqo) clqgVar.d : clqo.a).c);
        if (b2 == null) {
            b2 = clrh.RESPONSE_STATUS_UNKNOWN;
        }
        dkty.k("[conversationId:%s, messageId:%s]: Notification for message failed permanently with result: %s, tries: %d, after: %d ms. Notification is removed from the queue.", str, str2, b2, Integer.valueOf(clqeVar.h), Long.valueOf(millis));
    }

    public static void c(djgh djghVar, clqg clqgVar) {
        clqe clqeVar = djghVar.b;
        clns clnsVar = clqeVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        String str = clqsVar.c;
        eyja eyjaVar = clqeVar.f;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        Instant d = eykj.d(eyjaVar);
        eyja eyjaVar2 = clqgVar.f;
        if (eyjaVar2 == null) {
            eyjaVar2 = eyja.a;
        }
        long millis = Duration.between(d, eykj.d(eyjaVar2)).toMillis();
        int i = clqeVar.c;
        if (i != 2) {
            if (i == 3) {
                clrh b = clrh.b((clqgVar.c == 3 ? (clqk) clqgVar.d : clqk.a).c);
                if (b == null) {
                    b = clrh.RESPONSE_STATUS_UNKNOWN;
                }
                dkty.k("[conversationId:%s]: Notification for group succeeded with result:  %s, tries: %d, after: %d ms", str, b, Integer.valueOf(clqeVar.h), Long.valueOf(millis));
                return;
            }
            return;
        }
        clqe clqeVar2 = djghVar.b;
        clpc clpcVar = (clqeVar2.c == 2 ? (clqm) clqeVar2.d : clqm.a).e;
        if (clpcVar == null) {
            clpcVar = clpc.b;
        }
        clqx clqxVar = clpcVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str2 = clqxVar.c;
        clrh b2 = clrh.b((clqgVar.c == 2 ? (clqo) clqgVar.d : clqo.a).c);
        if (b2 == null) {
            b2 = clrh.RESPONSE_STATUS_UNKNOWN;
        }
        dkty.k("[conversationId:%s, messageId:%s]: Notification for message succeeded with result:  %s, tries: %d, after: %d ms", str, str2, b2, Integer.valueOf(clqeVar.h), Long.valueOf(millis));
    }

    public final ListenableFuture a(clqe clqeVar) {
        clns clnsVar = clqeVar.e;
        if (clnsVar == null) {
            clnsVar = clns.a;
        }
        clqs clqsVar = clnsVar.e;
        if (clqsVar == null) {
            clqsVar = clqs.a;
        }
        djge djgeVar = (djge) Map.EL.computeIfAbsent(this.d, clqsVar.c, new Function() { // from class: djgc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                djgi djgiVar = djgi.this;
                return new djge(djgiVar, djgiVar.b);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        djgh djghVar = new djgh(clqeVar);
        djgeVar.a.add(djghVar);
        djgeVar.b();
        return djghVar.a;
    }
}
