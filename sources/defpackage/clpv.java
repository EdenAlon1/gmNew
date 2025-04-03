package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clpv implements ffaz {
    private final clps a;
    private final int b;

    public clpv(clps clpsVar, int i) {
        this.a = clpsVar;
        this.b = i;
    }

    @Override // defpackage.ffaz
    public final void a(Object obj, ffbc ffbcVar) {
        switch (this.b) {
            case 0:
                this.a.f((clsh) obj, ffbcVar);
                break;
            case 1:
                this.a.e((clrz) obj, ffbcVar);
                break;
            case 2:
                this.a.i();
                break;
            case 3:
                this.a.c((clny) obj, ffbcVar);
                break;
            case 4:
                this.a.b((clni) obj, ffbcVar);
                break;
            case 5:
                this.a.d((clrd) obj, ffbcVar);
                break;
            case 6:
                this.a.h((cltb) obj, ffbcVar);
                break;
            default:
                this.a.g((clst) obj, ffbcVar);
                break;
        }
    }
}
