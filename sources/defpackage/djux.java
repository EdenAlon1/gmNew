package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class djux {
    public static djuw i() {
        djur djurVar = new djur();
        djurVar.d = "";
        djurVar.c("");
        djurVar.d("");
        djurVar.a = "";
        djurVar.b = "";
        djurVar.b("");
        djurVar.e = Optional.empty();
        String uuid = UUID.randomUUID().toString();
        if (uuid == null) {
            throw new NullPointerException("Null salt");
        }
        djurVar.c = uuid;
        return djurVar;
    }

    public static String j(String str, String str2) {
        return esge.a.c(String.valueOf(str).concat(str2), StandardCharsets.UTF_8).toString();
    }

    public abstract Optional a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();
}
