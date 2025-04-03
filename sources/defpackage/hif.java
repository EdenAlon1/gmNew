package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hif extends ffkk implements ffix {
    final /* synthetic */ hig a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hif(hig higVar) {
        super(0);
        this.a = higVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        cop copVar = new cop(this.a.a.size());
        hig higVar = this.a;
        int size = higVar.a.size();
        for (int i = 0; i < size; i++) {
            hha hhaVar = (hha) higVar.a.get(i);
            hna.b(copVar, hhaVar.b != null ? new hgz(Integer.valueOf(hhaVar.a), hhaVar.b) : Integer.valueOf(hhaVar.a), hhaVar);
        }
        return new hna(copVar);
    }
}
