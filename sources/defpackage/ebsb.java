package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsb extends ebsi {
    public emxc a;
    public emxc b;
    public ebss c;
    public boolean d;
    public byte e;
    public ebsh f;
    private emxc g;
    private emxc h;
    private emxc i;
    private emxc j;

    public ebsb() {
        emux emuxVar = emux.a;
        this.g = emuxVar;
        this.h = emuxVar;
        this.a = emuxVar;
        this.b = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
    }

    @Override // defpackage.ebsi
    public final ebsj a() {
        ebss ebssVar;
        ebsh ebshVar;
        if (this.e == 1 && (ebssVar = this.c) != null && (ebshVar = this.f) != null) {
            return new ebsc(this.g, this.h, this.a, this.b, this.i, this.j, ebssVar, this.d, ebshVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" secondaryButtonStyleFeature");
        }
        if (this.e == 0) {
            sb.append(" supportAccountSwitching");
        }
        if (this.f == null) {
            sb.append(" customContinueButtonTextsFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ebsi
    public final void b(ebse ebseVar) {
        this.i = emxc.j(ebseVar);
    }

    @Override // defpackage.ebsi
    public final void c(ebsp ebspVar) {
        this.j = emxc.j(ebspVar);
    }

    @Override // defpackage.ebsi
    public final void d(ebst ebstVar) {
        this.g = emxc.j(ebstVar);
    }

    public ebsb(ebsj ebsjVar) {
        emux emuxVar = emux.a;
        this.g = emuxVar;
        this.h = emuxVar;
        this.a = emuxVar;
        this.b = emuxVar;
        this.i = emuxVar;
        this.j = emuxVar;
        ebsc ebscVar = (ebsc) ebsjVar;
        this.g = ebscVar.a;
        this.h = ebscVar.b;
        this.a = ebscVar.c;
        this.b = ebscVar.d;
        this.i = ebscVar.e;
        this.j = ebscVar.f;
        this.c = ebscVar.g;
        this.d = ebscVar.h;
        this.f = ebscVar.i;
        this.e = (byte) 1;
    }
}
