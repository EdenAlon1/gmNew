package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eunc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    private final String e;
    private final String f;
    private final String g;

    public eunc(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        dfwv.j(!dfyz.a(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.e = str3;
        this.f = str4;
        this.c = str5;
        this.g = str6;
        this.d = str7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eunc)) {
            return false;
        }
        eunc euncVar = (eunc) obj;
        return dfwq.a(this.b, euncVar.b) && dfwq.a(this.a, euncVar.a) && dfwq.a(this.e, euncVar.e) && dfwq.a(this.f, euncVar.f) && dfwq.a(this.c, euncVar.c) && dfwq.a(this.g, euncVar.g) && dfwq.a(this.d, euncVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.e, this.f, this.c, this.g, this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        dfwp.b("applicationId", this.b, arrayList);
        dfwp.b("apiKey", this.a, arrayList);
        dfwp.b("databaseUrl", this.e, arrayList);
        dfwp.b("gcmSenderId", this.c, arrayList);
        dfwp.b("storageBucket", this.g, arrayList);
        dfwp.b("projectId", this.d, arrayList);
        return dfwp.a(arrayList, this);
    }
}
