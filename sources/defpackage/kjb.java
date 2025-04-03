package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjb extends kiz {
    public int aN = 0;
    public int aO = 0;
    public int aP = 0;
    public int aQ = 0;
    public int aR = 0;
    public int aS = 0;
    public boolean aT = false;
    public int aU = 0;
    public int aV = 0;
    protected final kje aW = new kje();
    kjf aX = null;

    @Override // defpackage.kiz
    public final void ah() {
        for (int i = 0; i < this.aM; i++) {
            kiu kiuVar = this.aL[i];
            if (kiuVar != null) {
                kiuVar.Q = true;
            }
        }
    }

    public final void ai(int i, int i2) {
        this.aU = i;
        this.aV = i2;
    }

    public final void aj(int i) {
        this.aP = i;
        this.aR = i;
        this.aS = i;
    }

    protected final void ak(kiu kiuVar, int i, int i2, int i3, int i4) {
        kjf kjfVar;
        kiu kiuVar2;
        while (true) {
            kjfVar = this.aX;
            if (kjfVar != null || (kiuVar2 = this.ae) == null) {
                break;
            } else {
                this.aX = ((kiv) kiuVar2).d;
            }
        }
        kje kjeVar = this.aW;
        kjeVar.i = i;
        kjeVar.j = i3;
        kjeVar.a = i2;
        kjeVar.b = i4;
        kjfVar.b(kiuVar, kjeVar);
        kiuVar.N(this.aW.c);
        kiuVar.C(this.aW.d);
        kje kjeVar2 = this.aW;
        kiuVar.P = kjeVar2.f;
        kiuVar.y(kjeVar2.e);
    }

    public void b(int i, int i2, int i3, int i4) {
    }
}
