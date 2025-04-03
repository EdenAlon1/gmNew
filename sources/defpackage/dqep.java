package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class dqep extends ffkh implements ffji {
    public dqep(Object obj) {
        super(1, obj, dqfc.class, "onCameraVisibilityChanged", "onCameraVisibilityChanged(Z)V", 0);
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        dqfc dqfcVar = (dqfc) this.g;
        enru enruVar = dqfc.a;
        dqfcVar.ak = booleanValue;
        dqfcVar.bi();
        return ffcu.a;
    }
}
