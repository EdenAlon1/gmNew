package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prr extends ovj {
    public static final prr c = new prr();

    private prr() {
        super(8, 9);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
