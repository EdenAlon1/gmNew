package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pyt extends otr {
    public pyt(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
