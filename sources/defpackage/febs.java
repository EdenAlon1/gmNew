package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class febs {
    public final febr a;
    public final String b;
    public final String c;
    public final febq d;
    public final febq e;
    public final boolean f;

    public febs(febr febrVar, String str, febq febqVar, febq febqVar2, boolean z) {
        new AtomicReferenceArray(2);
        febrVar.getClass();
        this.a = febrVar;
        str.getClass();
        this.b = str;
        int lastIndexOf = str.lastIndexOf(47);
        this.c = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        febqVar.getClass();
        this.d = febqVar;
        febqVar2.getClass();
        this.e = febqVar2;
        this.f = z;
    }

    public static febp a() {
        febp febpVar = new febp();
        febpVar.a = null;
        febpVar.b = null;
        return febpVar;
    }

    public static String c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return str + "/" + str2;
    }

    public final InputStream b(Object obj) {
        return this.d.a(obj);
    }

    public final String toString() {
        emwz b = emxa.b(this);
        b.b("fullMethodName", this.b);
        b.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.a);
        b.h("idempotent", false);
        b.h("safe", false);
        b.h("sampledToLocalTracing", this.f);
        b.b("requestMarshaller", this.d);
        b.b("responseMarshaller", this.e);
        b.b("schemaDescriptor", null);
        b.c();
        return b.toString();
    }
}
