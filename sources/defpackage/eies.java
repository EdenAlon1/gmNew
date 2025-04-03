package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_MessageReceipt;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eies extends eigw {
    private eigx a;
    private String b;
    private Instant c;
    private String d;
    private Optional e = Optional.empty();

    @Override // defpackage.eigw
    public final eigx a() {
        eigx eigxVar = this.a;
        if (eigxVar != null) {
            return eigxVar;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.eigw
    public final MessageReceipt b() {
        String str;
        Instant instant;
        String str2;
        eigx eigxVar = this.a;
        if (eigxVar != null && (str = this.b) != null && (instant = this.c) != null && (str2 = this.d) != null) {
            return new AutoValue_MessageReceipt(eigxVar, str, instant, str2, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" messageId");
        }
        if (this.c == null) {
            sb.append(" timestamp");
        }
        if (this.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eigw
    public final Optional c() {
        return this.e;
    }

    @Override // defpackage.eigw
    public final Optional d() {
        String str = this.d;
        return str == null ? Optional.empty() : Optional.of(str);
    }

    @Override // defpackage.eigw
    public final void e(eyee eyeeVar) {
        this.e = Optional.of(eyeeVar);
    }

    @Override // defpackage.eigw
    public final void f(Optional optional) {
        this.e = optional;
    }

    @Override // defpackage.eigw
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.b = str;
    }

    @Override // defpackage.eigw
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null status");
        }
        this.d = str;
    }

    @Override // defpackage.eigw
    public final void i(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null timestamp");
        }
        this.c = instant;
    }

    @Override // defpackage.eigw
    public final void j(eigx eigxVar) {
        if (eigxVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = eigxVar;
    }
}
