package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pri extends ovj {
    public static final pri c = new pri();

    private pri() {
        super(11, 12);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
