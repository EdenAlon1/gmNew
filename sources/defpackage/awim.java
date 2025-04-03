package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awim implements awli {
    private final cqoh a;

    public awim(cqoh cqohVar) {
        this.a = cqohVar;
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String str = ((awvy) obj).d;
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        str.getClass();
        awxcVar.b |= 1;
        awxcVar.c = str;
        awwg awwgVar = (awwg) awwh.a.createBuilder();
        eyja d = eykm.d(this.a.f().toEpochMilli());
        awwgVar.copyOnWrite();
        awwh awwhVar = (awwh) awwgVar.instance;
        d.getClass();
        awwhVar.c = d;
        awwhVar.b |= 1;
        awxbVar.copyOnWrite();
        awxc awxcVar2 = (awxc) awxbVar.instance;
        awwh awwhVar2 = (awwh) awwgVar.build();
        awwhVar2.getClass();
        awxcVar2.k = awwhVar2;
        awxcVar2.b |= 256;
        return (awxc) awxbVar.build();
    }
}
