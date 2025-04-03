package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrj extends esrl {
    public esqd a;
    public byte b;
    private String c;
    private fcek d;
    private fcek e;
    private engr f;
    private engw g;
    private fcek h;
    private int i;
    private int j;

    @Override // defpackage.esrl
    public final engr a() {
        if (this.f == null) {
            if (this.g == null) {
                int i = engw.d;
                this.f = new engr();
                this.b = (byte) (this.b | 32);
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.f = engrVar;
                engrVar.j(this.g);
                this.g = null;
            }
        }
        return this.f;
    }

    @Override // defpackage.esrl
    public final esro b() {
        engr engrVar = this.f;
        if (engrVar != null) {
            this.g = engrVar.g();
        } else if (this.g == null) {
            int i = engw.d;
            this.g = enou.a;
        }
        int i2 = ~this.b;
        if ((i2 & 31) != 0) {
            StringBuilder sb = new StringBuilder();
            if ((this.b & 1) == 0) {
                sb.append(" messageId");
            }
            if ((this.b & 2) == 0) {
                sb.append(" senderId");
            }
            if ((this.b & 4) == 0) {
                sb.append(" recipientId");
            }
            if ((this.b & 8) == 0) {
                sb.append(" messageType");
            }
            if ((this.b & 16) == 0) {
                sb.append(" messagePriority");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        String str = this.c;
        fcek fcekVar = this.d;
        fcek fcekVar2 = this.e;
        int i3 = this.i;
        int i4 = this.j;
        engw engwVar = this.g;
        fcek fcekVar3 = this.h;
        esqd esqdVar = this.a;
        fcek fcekVar4 = fcekVar3;
        if ((i2 & 32) != 0) {
            int i5 = engw.d;
            engwVar = enou.a;
        }
        if ((i2 & 64) != 0) {
            fcekVar4 = null;
        }
        return new esro(str, fcekVar, fcekVar2, i3, i4, engwVar, fcekVar4, (i2 & 128) != 0 ? null : esqdVar);
    }

    @Override // defpackage.esrl
    public final void c(fcek fcekVar) {
        this.h = fcekVar;
        this.b = (byte) (this.b | 64);
    }

    @Override // defpackage.esrl
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null messageId");
        }
        this.c = str;
        this.b = (byte) (this.b | 1);
    }

    @Override // defpackage.esrl
    public final void e(fcek fcekVar) {
        if (fcekVar == null) {
            throw new NullPointerException("Null recipientId");
        }
        this.e = fcekVar;
        this.b = (byte) (this.b | 4);
    }

    @Override // defpackage.esrl
    public final void f(fcek fcekVar) {
        if (fcekVar == null) {
            throw new NullPointerException("Null senderId");
        }
        this.d = fcekVar;
        this.b = (byte) (this.b | 2);
    }

    @Override // defpackage.esrl
    public final void g(int i) {
        this.j = i;
        this.b = (byte) (this.b | 16);
    }

    @Override // defpackage.esrl
    public final void h(int i) {
        this.i = i;
        this.b = (byte) (this.b | 8);
    }
}
