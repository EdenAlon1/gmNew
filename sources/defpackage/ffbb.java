package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbb implements fecv {
    public final ffaz a;

    public ffbb(ffaz ffazVar) {
        this.a = ffazVar;
    }

    @Override // defpackage.fecv
    public final fect a(fecu fecuVar, febo feboVar) {
        emxf.b(fecuVar.d().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        ffay ffayVar = new ffay(fecuVar);
        fecuVar.g(2);
        return new ffba(this, ffayVar, fecuVar);
    }
}
