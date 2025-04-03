package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_Message;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eieo extends eigi {
    public engr a;
    public engw b;
    private String c;
    private RcsDestinationId d;
    private engr e;
    private engw f;
    private Optional g = Optional.empty();
    private Optional h = Optional.empty();
    private Optional i = Optional.empty();
    private Optional j = Optional.empty();

    @Override // defpackage.eigi
    public final Message a() {
        RcsDestinationId rcsDestinationId;
        engr engrVar = this.e;
        if (engrVar != null) {
            this.f = engrVar.g();
        } else if (this.f == null) {
            int i = engw.d;
            this.f = enou.a;
        }
        engr engrVar2 = this.a;
        if (engrVar2 != null) {
            this.b = engrVar2.g();
        } else if (this.b == null) {
            int i2 = engw.d;
            this.b = enou.a;
        }
        String str = this.c;
        if (str != null && (rcsDestinationId = this.d) != null) {
            return new AutoValue_Message(str, rcsDestinationId, this.f, this.g, this.h, this.b, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" id");
        }
        if (this.d == null) {
            sb.append(" sender");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eigi
    public final engr b() {
        if (this.e == null) {
            if (this.f == null) {
                int i = engw.d;
                this.e = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.e = engrVar;
                engrVar.j(this.f);
                this.f = null;
            }
        }
        return this.e;
    }

    @Override // defpackage.eigi
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null contents");
        }
        if (this.e != null) {
            throw new IllegalStateException("Cannot set contents after calling contentsBuilder()");
        }
        this.f = engwVar;
    }

    @Override // defpackage.eigi
    public final void d(enip enipVar) {
        this.j = Optional.of(enipVar);
    }

    @Override // defpackage.eigi
    public final void e(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null extensionHeaders");
        }
        if (this.a != null) {
            throw new IllegalStateException("Cannot set extensionHeaders after calling extensionHeadersBuilder()");
        }
        this.b = engwVar;
    }

    @Override // defpackage.eigi
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.c = str;
    }

    @Override // defpackage.eigi
    public final void g(boolean z) {
        this.i = Optional.of(Boolean.valueOf(z));
    }

    @Override // defpackage.eigi
    public final void h(RcsDestinationId rcsDestinationId) {
        this.h = Optional.of(rcsDestinationId);
    }

    @Override // defpackage.eigi
    public final void i(RcsDestinationId rcsDestinationId) {
        if (rcsDestinationId == null) {
            throw new NullPointerException("Null sender");
        }
        this.d = rcsDestinationId;
    }

    @Override // defpackage.eigi
    public final void j(Instant instant) {
        this.g = Optional.of(instant);
    }
}
