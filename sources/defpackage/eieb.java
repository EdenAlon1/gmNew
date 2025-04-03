package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieb extends eifi {
    public Optional a;
    private Optional b;
    private int c;
    private ContentType d;
    private String e;
    private Instant f;
    private Optional g;
    private Optional h;
    private byte i;

    public eieb() {
        this.b = Optional.empty();
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.a = Optional.empty();
    }

    @Override // defpackage.eifi
    public final FileInformation a() {
        ContentType contentType;
        String str;
        Instant instant;
        if (this.i == 1 && (contentType = this.d) != null && (str = this.e) != null && (instant = this.f) != null) {
            return new AutoValue_FileInformation(this.b, this.c, contentType, str, instant, this.g, this.h, this.a);
        }
        StringBuilder sb = new StringBuilder();
        if (this.i == 0) {
            sb.append(" sizeBytes");
        }
        if (this.d == null) {
            sb.append(" contentType");
        }
        if (this.e == null) {
            sb.append(" url");
        }
        if (this.f == null) {
            sb.append(" validUntil");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eifi
    public final void b(Duration duration) {
        this.h = Optional.of(duration);
    }

    @Override // defpackage.eifi
    public final void c(ContentType contentType) {
        if (contentType == null) {
            throw new NullPointerException("Null contentType");
        }
        this.d = contentType;
    }

    @Override // defpackage.eifi
    public final void d(eifj eifjVar) {
        this.g = Optional.of(eifjVar);
    }

    @Override // defpackage.eifi
    public final void e(String str) {
        this.b = Optional.ofNullable(str);
    }

    @Override // defpackage.eifi
    public final void f(int i) {
        this.c = i;
        this.i = (byte) 1;
    }

    @Override // defpackage.eifi
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.e = str;
    }

    @Override // defpackage.eifi
    public final void h(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null validUntil");
        }
        this.f = instant;
    }

    public eieb(FileInformation fileInformation) {
        this.b = Optional.empty();
        this.g = Optional.empty();
        this.h = Optional.empty();
        this.a = Optional.empty();
        AutoValue_FileInformation autoValue_FileInformation = (AutoValue_FileInformation) fileInformation;
        this.b = autoValue_FileInformation.a;
        this.c = autoValue_FileInformation.b;
        this.d = autoValue_FileInformation.c;
        this.e = autoValue_FileInformation.d;
        this.f = autoValue_FileInformation.e;
        this.g = autoValue_FileInformation.f;
        this.h = autoValue_FileInformation.g;
        this.a = autoValue_FileInformation.h;
        this.i = (byte) 1;
    }
}
