package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eohe {
    public final eond a;

    public eohe(eond eondVar) {
        this.a = eondVar;
    }

    public final void a(int i) {
        eond eondVar = this.a;
        eondVar.copyOnWrite();
        eong eongVar = (eong) eondVar.instance;
        eong eongVar2 = eong.a;
        eongVar.d = i - 1;
        eongVar.b |= 2;
    }

    public final void b(int i) {
        eond eondVar = this.a;
        eondVar.copyOnWrite();
        eong eongVar = (eong) eondVar.instance;
        eong eongVar2 = eong.a;
        eongVar.c = i - 1;
        eongVar.b |= 1;
    }
}
