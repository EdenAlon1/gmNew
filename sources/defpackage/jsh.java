package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jsh extends ffkk implements ffji {
    final /* synthetic */ jsj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsh(jsj jsjVar) {
        super(1);
        this.a = jsjVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jtp jtpVar = (jtp) obj;
        jsy jsyVar = jtpVar.b;
        int i = jtpVar.c;
        int i2 = jtpVar.d;
        Object obj2 = jtpVar.e;
        return this.a.b(new jtp(null, jsyVar, i, i2)).a();
    }
}
