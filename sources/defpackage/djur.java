package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djur extends djuw {
    public String a;
    public String b;
    public String c;
    public String d;
    public Optional e = Optional.empty();
    private String f;
    private String g;
    private String h;

    @Override // defpackage.djuw
    public final djux a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = this.f;
        if (str7 != null && (str = this.g) != null && (str2 = this.a) != null && (str3 = this.b) != null && (str4 = this.h) != null && (str5 = this.c) != null && (str6 = this.d) != null) {
            return new djus(str7, str, str2, str3, str4, str5, str6, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" imsi");
        }
        if (this.g == null) {
            sb.append(" msisdn");
        }
        if (this.a == null) {
            sb.append(" msisdnToken");
        }
        if (this.b == null) {
            sb.append(" gmsCoreIidToken");
        }
        if (this.h == null) {
            sb.append(" cookie");
        }
        if (this.c == null) {
            sb.append(" salt");
        }
        if (this.d == null) {
            sb.append(" imei");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.djuw
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null cookie");
        }
        this.h = str;
    }

    @Override // defpackage.djuw
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null imsi");
        }
        this.f = str;
    }

    @Override // defpackage.djuw
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null msisdn");
        }
        this.g = str;
    }
}
