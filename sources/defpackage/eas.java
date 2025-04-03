package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eas extends hvh implements ixi {
    public float a;
    public boolean b;

    public eas(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    @Override // defpackage.ixi
    public final /* bridge */ /* synthetic */ Object eb(Object obj) {
        ebl eblVar = obj instanceof ebl ? (ebl) obj : null;
        if (eblVar == null) {
            eblVar = new ebl(null);
        }
        eblVar.a = this.a;
        eblVar.b = this.b;
        return eblVar;
    }
}
