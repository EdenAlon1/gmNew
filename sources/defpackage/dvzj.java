package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvzj implements dvza {
    final /* synthetic */ dvzk a;
    private int b = -1;

    public dvzj(dvzk dvzkVar) {
        this.a = dvzkVar;
    }

    @Override // defpackage.dvza
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void b(dvxe dvxeVar) {
        emxf.l(dvxeVar.e());
        dvxq dvxqVar = dvxeVar.c;
        erhk erhkVar = ((dvxr) dvxqVar.instance).d;
        if (erhkVar == null) {
            erhkVar = erhk.a;
        }
        emxf.l((erhkVar.b & 2048) != 0);
        int b = epnz.b(((dvxr) dvxqVar.instance).e);
        if (b == 0 || b == 1) {
            dvzk dvzkVar = this.a;
            int size = dvzkVar.e.size();
            dvzkVar.e.add(dvxeVar.a());
            this.a.f.put(size, this.b);
            int i = this.b;
            this.b = size;
            dvxeVar.f.n(this);
            this.b = i;
        }
    }
}
