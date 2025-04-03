package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjm extends ffkk implements ffix {
    final /* synthetic */ fjn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fjm(fjn fjnVar) {
        super(0);
        this.a = fjnVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        if (((fml) isv.a(this.a, fmn.a)) == null) {
            fjn fjnVar = this.a;
            isw iswVar = fjnVar.d;
            if (iswVar != null) {
                fjnVar.L(iswVar);
            }
            fjnVar.d = null;
        } else {
            fjn fjnVar2 = this.a;
            if (fjnVar2.d == null) {
                fjk fjkVar = new fjk(fjnVar2);
                fjl fjlVar = new fjl(fjnVar2);
                dwn dwnVar = fjnVar2.e;
                boolean z = fjnVar2.a;
                float f = fjnVar2.b;
                dbu dbuVar = frx.a;
                isw a = fsd.a(dwnVar, z, f, fjkVar, fjlVar);
                fjnVar2.M(a);
                fjnVar2.d = a;
            }
        }
        return ffcu.a;
    }
}
