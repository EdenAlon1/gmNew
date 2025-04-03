package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pzc extends otr {
    public pzc(otb otbVar) {
        super(otbVar);
    }

    @Override // defpackage.otr
    public final String c() {
        return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
    }
}
