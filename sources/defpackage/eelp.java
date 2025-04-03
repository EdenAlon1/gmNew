package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eelp extends eekv {
    public eelp() {
        super("Via");
    }

    @Override // defpackage.eekv, defpackage.eeku, defpackage.eeiw
    public final Object clone() {
        eelp eelpVar = new eelp();
        for (int i = 0; i < this.a.size(); i++) {
            eelpVar.g((eeku) ((eelo) this.a.get(i)).clone());
        }
        return eelpVar;
    }

    public eelp(eelo... eeloVarArr) {
        super(eeloVarArr);
    }
}
