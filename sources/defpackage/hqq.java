package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hqq extends ffkk implements ffix {
    final /* synthetic */ hqt a;
    final /* synthetic */ hrh b;
    final /* synthetic */ hrc c;
    final /* synthetic */ String d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqq(hqt hqtVar, hrh hrhVar, hrc hrcVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.a = hqtVar;
        this.b = hrhVar;
        this.c = hrcVar;
        this.d = str;
        this.e = obj;
        this.f = objArr;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean z;
        hqt hqtVar = this.a;
        hrc hrcVar = hqtVar.b;
        hrc hrcVar2 = this.c;
        boolean z2 = true;
        if (hrcVar != hrcVar2) {
            hqtVar.b = hrcVar2;
            z = true;
        } else {
            z = false;
        }
        String str = this.d;
        if (ffkj.e(hqtVar.c, str)) {
            z2 = z;
        } else {
            hqtVar.c = str;
        }
        Object[] objArr = this.f;
        Object obj = this.e;
        hqtVar.a = this.b;
        hqtVar.d = obj;
        hqtVar.e = objArr;
        hrd hrdVar = hqtVar.f;
        if (hrdVar != null && z2) {
            hrdVar.a();
            hqtVar.f = null;
            hqtVar.a();
        }
        return ffcu.a;
    }
}
