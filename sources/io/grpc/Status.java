package io.grpc;

import defpackage.a;
import defpackage.emwz;
import defpackage.emxa;
import defpackage.emxb;
import defpackage.emyt;
import defpackage.febj;
import defpackage.febm;
import defpackage.febn;
import defpackage.febo;
import defpackage.fedk;
import defpackage.fedl;
import defpackage.fedn;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class Status {
    public static final List a;
    public static final Status b;
    public static final Status c;
    public static final Status d;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public static final Status j;
    public static final Status k;
    public static final Status l;
    public static final Status m;
    public static final Status n;
    public static final Status o;
    public static final Status p;
    public static final Status q;
    public static final febj r;
    public static final febj s;
    private static final febn u;
    public final Throwable t;
    private final Code v;
    private final String w;

    /* compiled from: PG */
    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);

        public final byte[] r;
        private final int t;

        Code(int i) {
            this.t = i;
            this.r = Integer.toString(i).getBytes(StandardCharsets.US_ASCII);
        }

        public final Status a() {
            return (Status) Status.a.get(this.t);
        }

        public int value() {
            return this.t;
        }
    }

    static {
        TreeMap treeMap = new TreeMap();
        for (Code code : Code.values()) {
            Status status = (Status) treeMap.put(Integer.valueOf(code.value()), new Status(code, null, null));
            if (status != null) {
                throw new IllegalStateException("Code value duplication between " + status.getCode().name() + " & " + code.name());
            }
        }
        a = DesugarCollections.unmodifiableList(new ArrayList(treeMap.values()));
        b = Code.OK.a();
        c = Code.CANCELLED.a();
        d = Code.UNKNOWN.a();
        e = Code.INVALID_ARGUMENT.a();
        f = Code.DEADLINE_EXCEEDED.a();
        g = Code.NOT_FOUND.a();
        h = Code.ALREADY_EXISTS.a();
        i = Code.PERMISSION_DENIED.a();
        j = Code.UNAUTHENTICATED.a();
        k = Code.RESOURCE_EXHAUSTED.a();
        l = Code.FAILED_PRECONDITION.a();
        m = Code.ABORTED.a();
        Code.OUT_OF_RANGE.a();
        n = Code.UNIMPLEMENTED.a();
        o = Code.INTERNAL.a();
        p = Code.UNAVAILABLE.a();
        q = Code.DATA_LOSS.a();
        fedk fedkVar = new fedk();
        int i2 = febj.d;
        r = new febm("grpc-status", false, fedkVar);
        fedl fedlVar = new fedl();
        u = fedlVar;
        s = new febm("grpc-message", false, fedlVar);
    }

    private Status(Code code, String str, Throwable th) {
        code.getClass();
        this.v = code;
        this.w = str;
        this.t = th;
    }

    public static febo a(Throwable th) {
        th.getClass();
        while (th != null) {
            if (th instanceof StatusException) {
                return ((StatusException) th).b;
            }
            if (th instanceof fedn) {
                return ((fedn) th).b;
            }
            th = th.getCause();
        }
        return null;
    }

    public static Status c(Throwable th) {
        th.getClass();
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            if (th2 instanceof StatusException) {
                return ((StatusException) th2).a;
            }
            if (th2 instanceof fedn) {
                return ((fedn) th2).a;
            }
        }
        return d.d(th);
    }

    public static String e(Status status) {
        if (status.w == null) {
            return status.v.toString();
        }
        return status.v.toString() + ": " + status.w;
    }

    public static Status fromCodeValue(int i2) {
        if (i2 >= 0) {
            List list = a;
            if (i2 < list.size()) {
                return (Status) list.get(i2);
            }
        }
        return d.withDescription(a.h(i2, "Unknown code "));
    }

    public StatusException asException() {
        return new StatusException(this);
    }

    public final Status b(String str) {
        if (str == null) {
            return this;
        }
        String str2 = this.w;
        return str2 == null ? new Status(this.v, str, this.t) : new Status(this.v, a.w(str, str2, "\n"), this.t);
    }

    public final Status d(Throwable th) {
        return emxb.a(this.t, th) ? this : new Status(this.v, this.w, th);
    }

    public final boolean f() {
        return Code.OK == this.v;
    }

    public Code getCode() {
        return this.v;
    }

    public String getDescription() {
        return this.w;
    }

    public final String toString() {
        emwz b2 = emxa.b(this);
        b2.b("code", this.v.name());
        b2.b("description", this.w);
        Throwable th = this.t;
        Object obj = th;
        if (th != null) {
            obj = emyt.a(th);
        }
        b2.b("cause", obj);
        return b2.toString();
    }

    public Status withDescription(String str) {
        return emxb.a(this.w, str) ? this : new Status(this.v, str, this.t);
    }
}
