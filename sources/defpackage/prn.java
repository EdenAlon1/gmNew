package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prn extends ovj {
    public static final prn c = new prn();

    private prn() {
        super(3, 4);
    }

    @Override // defpackage.ovj
    public final void a(oxi oxiVar) {
        oxiVar.g("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
