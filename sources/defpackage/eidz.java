package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_ContentType;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidz extends eifc {
    private String a;
    private String b;
    private enhd c;
    private enhk d;

    public eidz() {
    }

    @Override // defpackage.eifc
    public final ContentType a() {
        enhd enhdVar = this.c;
        if (enhdVar != null) {
            this.d = enhdVar.c();
        } else if (this.d == null) {
            this.d = enoz.a;
        }
        if (this.a != null && this.b != null) {
            return new AutoValue_ContentType(this.a, this.b, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" type");
        }
        if (this.b == null) {
            sb.append(" subType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eifc
    public final enhd b() {
        if (this.c == null) {
            if (this.d == null) {
                this.c = new enhd();
            } else {
                enhd enhdVar = new enhd();
                this.c = enhdVar;
                enhdVar.g(this.d);
                this.d = null;
            }
        }
        return this.c;
    }

    @Override // defpackage.eifc
    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"subType\" has not been set");
    }

    @Override // defpackage.eifc
    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    @Override // defpackage.eifc
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null subType");
        }
        this.b = str;
    }

    @Override // defpackage.eifc
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        this.a = str;
    }

    public eidz(ContentType contentType) {
        AutoValue_ContentType autoValue_ContentType = (AutoValue_ContentType) contentType;
        this.a = autoValue_ContentType.a;
        this.b = autoValue_ContentType.b;
        this.d = autoValue_ContentType.c;
    }
}
