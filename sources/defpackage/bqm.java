package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bqm extends brc {
    public bqe a;
    private but b;
    private Integer c;

    public bqm() {
    }

    @Override // defpackage.brc
    public final brd a() {
        but butVar = this.b;
        bqe bqeVar = this.a;
        String str = butVar == null ? " videoSpec" : "";
        if (bqeVar == null) {
            str = str.concat(" audioSpec");
        }
        if (this.c == null) {
            str = str.concat(" outputFormat");
        }
        if (str.isEmpty()) {
            return new bqn(this.b, this.a, this.c.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.brc
    public final but b() {
        but butVar = this.b;
        if (butVar != null) {
            return butVar;
        }
        throw new IllegalStateException("Property \"videoSpec\" has not been set");
    }

    @Override // defpackage.brc
    public final void c() {
        this.c = -1;
    }

    @Override // defpackage.brc
    public final void d(but butVar) {
        if (butVar == null) {
            throw new NullPointerException("Null videoSpec");
        }
        this.b = butVar;
    }

    public bqm(brd brdVar) {
        bqn bqnVar = (bqn) brdVar;
        this.b = bqnVar.a;
        this.a = bqnVar.b;
        this.c = Integer.valueOf(bqnVar.c);
    }
}
