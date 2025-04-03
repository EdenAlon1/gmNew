package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eide extends eidn {
    public eidr a;
    private engd b;
    private engf c;
    private engr d;
    private engw e;

    public eide() {
    }

    @Override // defpackage.eidn
    public final eido a() {
        engd engdVar = this.b;
        if (engdVar != null) {
            this.c = engdVar.c();
        } else if (this.c == null) {
            this.c = enot.a;
        }
        engr engrVar = this.d;
        if (engrVar != null) {
            this.e = engrVar.g();
        } else if (this.e == null) {
            int i = engw.d;
            this.e = enou.a;
        }
        eidr eidrVar = this.a;
        if (eidrVar != null) {
            return new eidf(this.c, this.e, eidrVar);
        }
        throw new IllegalStateException("Missing required properties: content");
    }

    @Override // defpackage.eidn
    public final engd b() {
        if (this.b == null) {
            if (this.c == null) {
                this.b = new engd();
            } else {
                engd engdVar = new engd();
                this.b = engdVar;
                engdVar.f(this.c);
                this.c = null;
            }
        }
        return this.b;
    }

    @Override // defpackage.eidn
    public final engr c() {
        if (this.d == null) {
            if (this.e == null) {
                int i = engw.d;
                this.d = new engr();
            } else {
                int i2 = engw.d;
                engr engrVar = new engr();
                this.d = engrVar;
                engrVar.j(this.e);
                this.e = null;
            }
        }
        return this.d;
    }

    public eide(eido eidoVar) {
        eidf eidfVar = (eidf) eidoVar;
        this.c = eidfVar.a;
        this.e = eidfVar.b;
        this.a = eidfVar.c;
    }
}
