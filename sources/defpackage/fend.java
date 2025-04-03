package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fend {
    public static final febj b;
    public static final febj c;
    public static final febj d;
    public static final febj e;
    public static final febj f;
    static final febj g;
    public static final febj h;
    public static final febj i;
    public static final febj j;
    public static final emye k;
    public static final long l;
    public static final fecp m;
    public static final fdxi n;
    public static final fevl o;
    public static final fevl p;
    public static final emyl q;
    private static final fdxt t;
    private static final Logger r = Logger.getLogger(fend.class.getName());
    private static final Set s = DesugarCollections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        fenc fencVar = new fenc();
        int i2 = febj.d;
        b = new febe("grpc-timeout", fencVar);
        c = new febe("grpc-encoding", febo.c);
        d = fdzx.a("grpc-accept-encoding", new fena());
        e = new febe("content-encoding", febo.c);
        f = fdzx.a("accept-encoding", new fena());
        g = new febe("content-length", febo.c);
        h = new febe("content-type", febo.c);
        i = new febe("te", febo.c);
        j = new febe("user-agent", febo.c);
        k = emye.b(',').f();
        l = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        m = new fesb();
        n = new fdxi("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new femw();
        o = new femx();
        p = new femy();
        q = new femz();
    }

    private fend() {
    }

    public static Status a(int i2) {
        Status.Code code;
        if (i2 < 100 || i2 >= 200) {
            if (i2 != 400) {
                if (i2 == 401) {
                    code = Status.Code.UNAUTHENTICATED;
                } else if (i2 == 403) {
                    code = Status.Code.PERMISSION_DENIED;
                } else if (i2 != 404) {
                    if (i2 != 429) {
                        if (i2 != 431) {
                            switch (i2) {
                                case 502:
                                case 503:
                                case 504:
                                    break;
                                default:
                                    code = Status.Code.UNKNOWN;
                                    break;
                            }
                        }
                    }
                    code = Status.Code.UNAVAILABLE;
                } else {
                    code = Status.Code.UNIMPLEMENTED;
                }
            }
            code = Status.Code.INTERNAL;
        } else {
            code = Status.Code.INTERNAL;
        }
        return code.a().withDescription(a.h(i2, "HTTP status code "));
    }

    public static Status b(Status status) {
        emxf.a(status != null);
        if (!s.contains(status.getCode())) {
            return status;
        }
        return Status.o.withDescription("Inappropriate status code from control plane: " + status.getCode().toString() + " " + status.getDescription()).d(status.t);
    }

    static fejv c(feak feakVar, boolean z) {
        fejv fejvVar;
        fean feanVar = feakVar.b;
        if (feanVar != null) {
            feqa feqaVar = (feqa) feanVar;
            emxf.m(feqaVar.g, "Subchannel is not started");
            fejvVar = feqaVar.f.a();
        } else {
            fejvVar = null;
        }
        if (fejvVar != null) {
            return fejvVar;
        }
        Status status = feakVar.c;
        if (!status.f()) {
            if (feakVar.d) {
                return new femn(b(status), fejt.DROPPED);
            }
            if (!z) {
                return new femn(b(status), fejt.PROCESSED);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException(a.z(i3, str2, "Invalid host or port: ", " "), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.71.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI f(String str) {
        String str2;
        str.getClass();
        try {
            str2 = str;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
        }
    }

    static void g(fevq fevqVar) {
        while (true) {
            InputStream g2 = fevqVar.g();
            if (g2 == null) {
                return;
            } else {
                h(g2);
            }
        }
    }

    public static void h(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean i(String str, boolean z) {
        String str2 = System.getenv(str);
        if (str2 == null) {
            str2 = System.getProperty(str);
        }
        if (str2 != null) {
            str2 = str2.trim();
        }
        return z ? emxe.c(str2) || Boolean.parseBoolean(str2) : !emxe.c(str2) && Boolean.parseBoolean(str2);
    }

    public static boolean j(fdxj fdxjVar) {
        return !Boolean.TRUE.equals(fdxjVar.h(n));
    }

    public static ThreadFactory k(String str) {
        ersf ersfVar = new ersf();
        ersfVar.c(true);
        ersfVar.d(str);
        return ersf.b(ersfVar);
    }

    public static fdxt[] l(fdxj fdxjVar) {
        List list = fdxjVar.g;
        int size = list.size();
        fdxt[] fdxtVarArr = new fdxt[size + 1];
        fdxjVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            fdxtVarArr[i2] = ((fdxs) list.get(i2)).a();
        }
        fdxtVarArr[size] = t;
        return fdxtVarArr;
    }
}
