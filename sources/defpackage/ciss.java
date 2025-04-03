package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciss extends civk {
    public ciwm b;
    private ciwt h;
    private boolean j;
    private boolean k;
    private boolean m;
    private byte n;
    public Optional a = Optional.empty();
    private Optional f = Optional.empty();
    private Optional g = Optional.empty();
    private Optional i = Optional.empty();
    public Optional c = Optional.empty();
    private Optional l = Optional.empty();
    public Optional d = Optional.empty();
    public Optional e = Optional.empty();

    @Override // defpackage.civk
    public final civl a() {
        ciwt ciwtVar;
        ciwm ciwmVar;
        if (this.n == 7 && (ciwtVar = this.h) != null && (ciwmVar = this.b) != null) {
            return new cist(this.a, this.f, this.g, ciwtVar, ciwmVar, this.i, this.c, this.j, this.k, this.l, this.d, this.m, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.h == null) {
            sb.append(" notificationStyleInfo");
        }
        if (this.b == null) {
            sb.append(" clickInteractionInfo");
        }
        if ((this.n & 1) == 0) {
            sb.append(" shouldBridgeNotificationToOtherDevices");
        }
        if ((this.n & 2) == 0) {
            sb.append(" allowSystemGeneratedActions");
        }
        if ((this.n & 4) == 0) {
            sb.append(" shouldAlert");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.civk
    public final void b(boolean z) {
        this.k = z;
        this.n = (byte) (this.n | 2);
    }

    @Override // defpackage.civk
    public final void c(ciwm ciwmVar) {
        this.b = ciwmVar;
    }

    @Override // defpackage.civk
    public final void d(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null conversationSpecificInfo");
        }
        this.g = optional;
    }

    @Override // defpackage.civk
    public final void e(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null notificationActions");
        }
        this.l = optional;
    }

    @Override // defpackage.civk
    public final void f(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null notificationExtras");
        }
        this.f = optional;
    }

    @Override // defpackage.civk
    public final void g(ciwt ciwtVar) {
        if (ciwtVar == null) {
            throw new NullPointerException("Null notificationStyleInfo");
        }
        this.h = ciwtVar;
    }

    @Override // defpackage.civk
    public final void h(Optional optional) {
        this.a = optional;
    }

    @Override // defpackage.civk
    public final void i(boolean z) {
        this.m = z;
        this.n = (byte) (this.n | 4);
    }

    @Override // defpackage.civk
    public final void j(boolean z) {
        this.j = z;
        this.n = (byte) (this.n | 1);
    }

    @Override // defpackage.civk
    public final void k(Optional optional) {
        if (optional == null) {
            throw new NullPointerException("Null swipeInteractionInfo");
        }
        this.i = optional;
    }

    @Override // defpackage.civk
    public final void l(Optional optional) {
        this.d = optional;
    }
}
