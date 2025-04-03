package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmn implements ffbz {
    private final ffmo a;
    private final ffix b;
    private final ffix c;
    private final ffix d;
    private lml e;

    public lmn(ffmo ffmoVar, ffix ffixVar, ffix ffixVar2, ffix ffixVar3) {
        this.a = ffmoVar;
        this.b = ffixVar;
        this.c = ffixVar2;
        this.d = ffixVar3;
    }

    @Override // defpackage.ffbz
    public final /* bridge */ /* synthetic */ Object a() {
        lml lmlVar = this.e;
        if (lmlVar != null) {
            return lmlVar;
        }
        lml b = lmq.a((lmx) this.b.invoke(), (lms) this.c.invoke(), (lnx) this.d.invoke()).b(this.a);
        this.e = b;
        return b;
    }

    @Override // defpackage.ffbz
    public final boolean b() {
        return this.e != null;
    }
}
