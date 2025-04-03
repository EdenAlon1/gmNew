package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzod extends dziw {
    private volatile transient boolean b;
    private volatile transient boolean c;

    public dzod(int i, int i2, engw engwVar) {
        super(i, i2, engwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dzrj
    public final boolean d() {
        if (!this.c) {
            synchronized (this) {
                if (!this.c) {
                    engw engwVar = this.a;
                    int i = ((enou) engwVar).c;
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= i) {
                            break;
                        }
                        boolean equals = ((dzrr) engwVar.get(i2)).b().equals(dzrt.UNKNOWN);
                        i2++;
                        if (equals) {
                            z = true;
                            break;
                        }
                    }
                    this.b = z;
                    this.c = true;
                }
            }
        }
        return this.b;
    }
}
